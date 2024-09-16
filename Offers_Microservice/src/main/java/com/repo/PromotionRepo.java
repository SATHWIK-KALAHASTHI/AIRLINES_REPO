package com.repo;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Promotion;

@Repository
public interface PromotionRepo extends JpaRepository<Promotion, Long> {
}







