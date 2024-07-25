package com.project.marketplace.repositories;

import com.project.marketplace.entities.Ads;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdsPaginationRepository extends PagingAndSortingRepository<Ads, Integer> {

    Page<Ads> findByCategory(String category, Pageable pageable);


}
