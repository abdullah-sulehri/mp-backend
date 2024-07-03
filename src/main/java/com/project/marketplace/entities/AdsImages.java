package com.project.marketplace.entities;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.PathVariable;

import java.nio.file.Path;

@Entity
@Table(name = "ad_images")
public class AdsImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="images_path")
    private String images_path;

    @ManyToOne
    @JoinColumn(name = "ad_id",referencedColumnName = "id")
    private  Ads ads;

    public AdsImages(int id, String images_path, Ads ads) {
        this.id = id;
        this.images_path = images_path;
        this.ads = ads;
    }

    public AdsImages() {

    }
}
