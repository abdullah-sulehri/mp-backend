package com.project.marketplace.services;

import com.project.marketplace.entities.AdsImages;
import com.project.marketplace.repositories.AdsImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdsImagesService {
    @Autowired
    AdsImagesRepository adsImagesRepository;
    public void saveAdsImages(AdsImages adsImages){
        adsImagesRepository.save(adsImages);
    }

    public AdsImages getAdsImagesById(Integer id){
        return adsImagesRepository.findById(id).get();
    }
    public List<AdsImages> getAllAdsImages() {
        return adsImagesRepository.findAll();
    }
}
