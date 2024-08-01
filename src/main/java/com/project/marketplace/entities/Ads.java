//package com.project.marketplace.entities;
//
//import jakarta.persistence.*;
//
//import java.time.LocalDateTime;
//
//
//@Entity
//@Table(name="ads")
//public class Ads {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;
//
//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name="user_id",referencedColumnName = "user_id")  //user_id is from ads table
//    private User user;
//
//    @ManyToOne()
//    @JoinColumn(name="category_id",referencedColumnName = "id")  //category_id is from ads table
//    private Category category;
//
//    @Column(name="ad_title")
//    private String adTitle;
//
//    @Column(name="description")
//    private String description;
//
//    @Column(name="price")
//    private double price;
//
//    @Column(name="created_at")
//    private LocalDateTime created_at;
//
//    @Column(name="updated_at")
//    private LocalDateTime updated_at;
//
//
//    public Ads(long id, User user, Category category, String adTitle, String description, double price, LocalDateTime created_at, LocalDateTime updated_at) {
//        this.id = id;
//        this.user = user;
//        this.category = category;
//        this.adTitle = adTitle;
//        this.description = description;
//        this.price = price;
//        this.created_at = created_at;
//        this.updated_at = updated_at;
//    }
//
//    public Ads() {
//    }
//
//
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//
//
//    public String getAdTitle() {
//        return adTitle;
//    }
//
//    public void setAdTitle(String adTitle) {
//        this.adTitle = adTitle;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public LocalDateTime getCreated_at() {
//        return created_at;
//    }
//
//    public void setCreated_at(LocalDateTime created_at) {
//        this.created_at = created_at;
//    }
//
//    public LocalDateTime getUpdated_at() {
//        return updated_at;
//    }
//
//    public void setUpdated_at(LocalDateTime updated_at) {
//        this.updated_at = updated_at;
//    }
//}

package com.project.marketplace.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="ads")
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;


    @OneToMany(fetch = FetchType.LAZY,cascade =CascadeType.ALL)
    @JoinColumn(name="ad_id", referencedColumnName = "id")
    private List<AdsImages> images;
    @Column(name = "brand")
    private String brand;

    @Column(name = "ad_title")
    private String adTitle;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column (name="featured")
    private boolean featured;

    @Column(name = "created_at")
    private LocalDateTime created_at;

    @Column(name = "updated_at")
    private LocalDateTime updated_at;

    public Ads() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Ads(User user, Category category, List<AdsImages> images, String brand , String adTitle, String description, double price, boolean featured, LocalDateTime created_at, LocalDateTime updated_at) {
        this.user = user;
        this.category = category;
        this.images = images;
        this.brand=brand;
        this.adTitle = adTitle;
        this.description = description;
        this.price = price;
        this.featured = featured;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public boolean isFeatured() {
        return featured;
    }

    public void setFeatured(boolean featured) {
        this.featured = featured;
    }
    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
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

    public List<AdsImages> getImages() {
        return images;
    }

    public void setImages(List<AdsImages> adsImagesList) {
        this.images = adsImagesList;
    }
}
