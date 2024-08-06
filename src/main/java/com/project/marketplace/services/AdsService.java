package com.project.marketplace.services;

import com.project.marketplace.dto.AdsDto;
import com.project.marketplace.dto.AdsPageResponse;
import com.project.marketplace.dto.PageParams;
import com.project.marketplace.entities.Ads;
import com.project.marketplace.repositories.AdsPaginationRepository;
import com.project.marketplace.repositories.AdsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdsService {
    @Autowired
    AdsRepository adsRepository;

    @Autowired
    AdsPaginationRepository adsPaginationRepository;

    public long  saveAds(Ads ads){
        ads.setCreated_at(LocalDateTime.now());
        ads.setUpdated_at(LocalDateTime.now());
        adsRepository.save(ads);
        System.out.println(ads.getId());
        return ads.getId();
    }

    public Ads getAdsById(int id){
       return adsRepository.findById(id).get();
    }
    public List<Ads> getAdsByTitle(String title){
        return adsRepository.findByAdTitle(title);
    }

    public com.project.marketplace.dto.AdsDto getAdsDtoById(int id){
        // ad logic to store unique view
        return  new com.project.marketplace.dto.AdsDto(adsRepository.findById(id).get());
    }


    public AdsPageResponse findAll(PageParams pageRequest){

        Page<Ads> adsPage=adsPaginationRepository.findAll(
                PageRequest.of(pageRequest.getPageOffset(), pageRequest.getPageSize()));

        AdsPageResponse adsPageResponse = new AdsPageResponse();
        adsPageResponse.setPageSize(adsPage.getSize());
        adsPageResponse.setTotalPages(adsPage.getTotalPages());
        adsPageResponse.setTotalElements(adsPage.getTotalElements());
        adsPageResponse.setContent(adsPage.getContent().stream().map(AdsDto::new).collect(Collectors.toList()));
        return adsPageResponse;
    }

    public List<AdsDto> getAdsByCategoryName(String categoryName){
        return adsRepository.findByCategoryCategoryName(categoryName).stream().map(AdsDto::new).collect(Collectors.toList());

    }
}
