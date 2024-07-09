package com.project.marketplace.services;

import com.project.marketplace.dto.AdsDto;
import com.project.marketplace.entities.Ads;
import com.project.marketplace.repositories.AdsRepository;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdsService {
    @Autowired
    AdsRepository adsRepository;

    public void saveAds(Ads ads){
        adsRepository.save(ads);
    }

    public Ads getAdsById(int id){
       return adsRepository.findById(id).get();
    }
    public List<Ads> getAdsByTitle(String title){
        return adsRepository.findByAdTitle(title);
    }

    public AdsDto getAdsDtoById(int id){
        return  new AdsDto(adsRepository.findById(id).get());
    }
}
