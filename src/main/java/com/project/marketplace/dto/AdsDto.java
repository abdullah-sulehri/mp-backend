package com.project.marketplace.dto;

import com.project.marketplace.entities.Ads;
import com.project.marketplace.entities.AdsImages;

import java.time.LocalDateTime;
import java.util.List;

public class AdsDto {

    private long id;

    private UserDto user;


    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }

    private boolean featured;

    private List<AdsImages> adsImagesList;

    private String brand;

    private String adTitle;


    private String description;


    private double price;


    private LocalDateTime created_at;

    private LocalDateTime updated_at;



    public AdsDto(Ads ads){
        this.id = ads.getId();
        this.user = new UserDto(ads.getUser());

        this.adTitle = ads.getAdTitle();
        this.brand=ads.getBrand();

        this.description = ads.getDescription();
        this.price = ads.getPrice();
        this.created_at = ads.getCreated_at();
        this.updated_at = ads.getUpdated_at();
        this.adsImagesList =  ads.getImages();
        this.featured=ads.isFeatured();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public List<AdsImages> getAdsImagesList() {
        return adsImagesList;
    }

    public void setAdsImagesList(List<AdsImages> adsImagesList) {
        this.adsImagesList = adsImagesList;
    }
}
