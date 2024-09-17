
package com.dao;

import java.util.List;
import java.util.Optional;

import com.entity.PromotionApplied;

public interface PromotionAppliedDao {
    List<PromotionApplied> getAllPromotionsApplied();
    Optional<PromotionApplied> getPromotionAppliedById(Long id);
    PromotionApplied savePromotionApplied(PromotionApplied promotionApplied);
    void deletePromotionApplied(Long id);
}
