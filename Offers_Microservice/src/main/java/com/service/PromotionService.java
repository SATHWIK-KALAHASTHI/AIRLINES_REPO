package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PromotionDao;
import com.entity.Promotion;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionService {

    @Autowired
    private PromotionDao promotionDAO;

    public List<Promotion> getAllPromotions() {
        return promotionDAO.getAllPromotions();
    }

    public Optional<Promotion> getPromotionById(Long id) {
        return promotionDAO.getPromotionById(id);
    }

    public Promotion savePromotion(Promotion promotion) {
        return promotionDAO.savePromotion(promotion);
    }

    public void deletePromotion(Long id) {
        promotionDAO.deletePromotion(id);
    }
}
