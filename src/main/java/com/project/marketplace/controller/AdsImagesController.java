package com.project.marketplace.controller;

import com.project.marketplace.entities.AdsImages;
import com.project.marketplace.services.AdsImagesService;
import com.project.marketplace.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdsImagesController {
    @Autowired
    private AdsImagesService adsImagesService;

    //post and get mapping

    public List<AdsImages> getAllAdsImages() {
        return adsImagesService.getAllAdsImages();
    }

    @GetMapping("/AdsImages/{id}")
    public ResponseEntity<AdsImages> getAdsImagesById(@PathVariable Integer id) {
        AdsImages adsImages = adsImagesService.getAdsImagesById(id);
        if (adsImages != null) {
            return ResponseEntity.ok(adsImages);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/AdsImages")
    public void saveAds(@RequestBody AdsImages adsImages) {
        adsImagesService.saveAdsImages(adsImages);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<String> updateAdsImages(@PathVariable Integer id, @RequestBody AdsImages adsImagesDetails) {
//        AdsImages adsImages = adsImagesService.getAdsImagesById(id);
//
//           // AdsImages updatedAdsImages = adsImagesService.saveAdsImages(adsImages);
//            return ResponseEntity.ok("saved");
//        }
}

//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteAdsImages(@PathVariable long id) {
//        AdsImages adsImages = adsImagesService.getAdsImagesById(id);
//        if (adsImages != null) {
//            adsImagesService.deleteAdsImages(id);
//            return ResponseEntity.noContent().build();
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

