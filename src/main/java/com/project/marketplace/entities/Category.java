//package com.project.marketplace.entities;
//
//
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//@Entity
//@Table(name = "categories")
//public class Category {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name="category_name")
//    private String categoryName;
//
//    @Column(name="description")
//    private String description;
//
//    @OneToMany()
//    @JoinColumn(name="category_id",referencedColumnName = "id")
//    private Set<Ads> ads;
//
//    public Set<Ads> getAds() {
//        return ads;
//    }
//
//    public void setAds(Set<Ads> ads) {
//        this.ads = ads;
//    }
//
//    public Category(Integer id, String categoryName, String description, Set<Ads> ads) {
//        this.id = id;
//        this.categoryName = categoryName;
//        this.description = description;
//        this.ads = ads;
//    }
//
//    public Category(Integer id, String categoryName, String description) {
//        this.id = id;
//        this.categoryName = categoryName;
//        this.description = description;
//    }
//
//    public Category(String categoryName, String description) {
//        this.categoryName = categoryName;
//        this.description = description;
//    }
//
//    public Category(){}
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//}

package com.project.marketplace.entities;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    private Set<Ads> ads;

    public Category() {}

    public Category(Integer id, String categoryName, String description) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
    }

    public Category(Integer id, String categoryName, String description, Set<Ads> ads) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.ads = ads;
    }

    // Getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Ads> getAds() {
        return ads;
    }

    public void setAds(Set<Ads> ads) {
        this.ads = ads;
    }
}
