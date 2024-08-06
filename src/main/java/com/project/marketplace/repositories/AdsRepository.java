package com.project.marketplace.repositories;

import com.project.marketplace.entities.Ads;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface AdsRepository extends JpaRepository<Ads,Integer> {
    List<Ads> findByAdTitle(@RequestParam("title") String adTitle);

    List<Ads> findByCategoryCategoryName(String categoryName);

    List<Ads> findByAdTitleContains(String adTitle);

}
