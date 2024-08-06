package com.project.marketplace.dto;

import com.project.marketplace.entities.AdsImages;
import com.project.marketplace.entities.Ads;

public class AdsImagesDto {

    private int id;

    private String images_path;
    private Ads ads;


    public AdsImagesDto(AdsImages adsImages,Ads ads){
        this.id= adsImages.getId();
        this.images_path = adsImages.getImagesPath();
        this.ads=ads;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImages_path() {
        return images_path;
    }

    public void setImages_path(String images_path) {
        this.images_path = images_path;
    }
}
