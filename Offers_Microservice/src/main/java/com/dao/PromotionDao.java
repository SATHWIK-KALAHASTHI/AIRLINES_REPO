package com.dao;

import java.util.List;
import java.util.Optional;

import com.entity.Promotion;

public interface PromotionDao {
    List<Promotion> getAllPromotions();
    Optional<Promotion> getPromotionById(Long id);
    Promotion savePromotion(Promotion promotion);
    void deletePromotion(Long id);
}
