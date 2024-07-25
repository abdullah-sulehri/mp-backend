package com.project.marketplace.controller;

import com.project.marketplace.dto.AdsPageResponse;
import com.project.marketplace.dto.PageParams;
import com.project.marketplace.entities.Ads;
import com.project.marketplace.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdsController {
    @Autowired
    AdsService adsService;

    @PostMapping("/ads")
    public ResponseEntity<String> saveAds(@RequestBody Ads ads){
        adsService.saveAds(ads);
        return ResponseEntity.ok("Ad Saved Successfully");
    }

    @GetMapping("/ads/{id}")
    public ResponseEntity<Ads> getAds(@PathVariable(name="id") int id){
        return  ResponseEntity.ok(adsService.getAdsById(id));
       // return ResponseEntity.ok("Ad Returned");
    }

    @GetMapping("/ads/title")
    public ResponseEntity<String> getAdsByTitle(@PathVariable(name="ad_Title") String title){
        List<Ads> ads = adsService.getAdsByTitle(title);
        System.out.println(ads);
        return ResponseEntity.ok("Ad Returned");
    }

    @GetMapping("/ads-dto/{id}")
    public ResponseEntity<com.project.marketplace.dto.AdsDto> getAdsDto(@PathVariable(name="id") int id){
        return  ResponseEntity.ok(adsService.getAdsDtoById(id));
        // return ResponseEntity.ok("Ad Returned");
    }

    @GetMapping("/ads-page")
    public ResponseEntity<AdsPageResponse> getAllAds(@RequestBody PageParams pageRequest){
        return  ResponseEntity.ok(adsService.findAll(pageRequest));
        // return ResponseEntity.ok("Ad Returned");
    }
}
