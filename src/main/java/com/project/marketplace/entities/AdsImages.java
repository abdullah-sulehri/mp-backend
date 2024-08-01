package com.project.marketplace.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ads_images")
public class AdsImages {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="images_path")
    private String images_path;

   /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ad_id", referencedColumnName = "id")
    private  Ads ads;*/

    @Column(name = "ad_id")
    private Integer adId;


    public AdsImages(int id, String images_path, Ads ads) {
        this.id = id;
        this.images_path = images_path;
//        this.ads = ads;
    }

    public AdsImages(int id, String images_path) {
        this.id = id;
        this.images_path = images_path;
    }

    public AdsImages() {

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

/*    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }*/
}
