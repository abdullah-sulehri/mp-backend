package com.project.marketplace.repositories;

import com.project.marketplace.entities.Ads;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdsRepository extends CrudRepository<Ads,Integer> {
    List<Ads> findByAdTitle(String adTitle);
}
