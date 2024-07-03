package com.project.marketplace.controller;

import com.project.marketplace.entities.Ads;
import com.project.marketplace.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdsController {
    @Autowired
    AdsService adsService;

    @PostMapping("/ads")
    public ResponseEntity<String> saveAds(@RequestBody Ads ads){
        adsService.saveAds(ads);
        return ResponseEntity.ok("Ad Saved Successfully");
    }

    @GetMapping("/ads{id}")
    public ResponseEntity<String> getAds(@PathVariable(name="id") Integer id){
        adsService.getAdsById(id);
        return ResponseEntity.ok("Ad Returned");
    }

    @GetMapping("/ads/title")
    public ResponseEntity<String> getAdsByTitle(@PathVariable(name="ad_Title") String title){
        adsService.getAdsByTitle(title);
        return ResponseEntity.ok("Ad Returned");
    }
}
