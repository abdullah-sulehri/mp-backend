package com.project.marketplace.dto;

import com.project.marketplace.entities.AdsImages;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class AdsImagesDto {

    private int id;

    private String images_path;

    public AdsImagesDto(AdsImages adsImages){
        this.id= adsImages.getId();
        this.images_path = adsImages.getImages_path();
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
