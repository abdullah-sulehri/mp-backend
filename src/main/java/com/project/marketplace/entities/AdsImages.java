package com.project.marketplace.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ads_images")
public class AdsImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="images_path")
    private String imagesPath;

   /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ad_id", referencedColumnName = "id")
    private  Ads ads;*/

    @Column(name = "ad_id")
    private Long adId;


    public AdsImages(int id, String imagesPath, Ads ads) {
        this.id = id;
        this.imagesPath = imagesPath;
//        this.ads = ads;
    }

    public AdsImages(String imagesPath, Long adId) {
        this.imagesPath = imagesPath;
        this.adId = adId;
    }

    public AdsImages(int id, String imagesPath) {
        this.id = id;
        this.imagesPath = imagesPath;
    }

    public AdsImages() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImagesPath() {
        return imagesPath;
    }

    public void setImagesPath(String images_path) {
        this.imagesPath = images_path;
    }

/*    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }*/
}
