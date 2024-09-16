package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.PromotionApplied;

@Repository
public interface PromotionAppliedRepo extends JpaRepository<PromotionApplied, Long> {
}
