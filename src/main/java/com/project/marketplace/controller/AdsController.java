package com.project.marketplace.controller;

import com.project.marketplace.dto.AdsImagesDto;
import com.project.marketplace.dto.AdsPageResponse;
import com.project.marketplace.dto.PageParams;
import com.project.marketplace.entities.Ads;
import com.project.marketplace.entities.AdsImages;
import com.project.marketplace.services.AdsImagesService;
import com.project.marketplace.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RestController
public class AdsController {
    @Autowired
    AdsService adsService;
    @Autowired
    AdsImagesService adsImagesService;
    @PostMapping("/ads")
    public long saveAds(@RequestBody Ads ads){
        System.out.println("service"+ads.getId());
        System.out.println(adsService.saveAds(ads));
       return  adsService.saveAds(ads);

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

    @GetMapping("/ads-by-category")
    public ResponseEntity<List<com.project.marketplace.dto.AdsDto>> getAdsDtoByCategory(
            @RequestParam(name = "categoryName") String categoryName){
        return  ResponseEntity.ok(adsService.getAdsByCategoryName(categoryName));
        // return ResponseEntity.ok("Ad Returned");
    }

    @PostMapping("/upload-image")
    public ResponseEntity<String> upload(@RequestParam("file") MultipartFile multipartfile,
                                         @RequestParam("adId") Long adId){
        System.out.println(multipartfile.getOriginalFilename()+"," + adId);

        String dirPath="d:/marketplace-images/"+adId;
        String imagePath=dirPath+"/"+ multipartfile.getOriginalFilename();

        File dir=new File(dirPath);
        if(!dir.exists())
            System.out.println("dir created : "+dir.mkdir());

        File file = new File(imagePath);
        try {
            file.createNewFile();
            multipartfile.transferTo(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //update add record with image path (imagePath)

        //ResponseEntity<String>()// from here i want to upload this imagepath and ad id t AdImages table,how will i do it?
        adsImagesService.saveAdsImages(new AdsImages(imagePath ,adId));
        return ResponseEntity.ok("file uploaded");
    }
}
