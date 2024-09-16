package com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.PromotionDao;
import com.entity.Promotion;
import com.repo.PromotionRepo;

import java.util.List;
import java.util.Optional;

@Component
public class PromotionDaoImpl implements PromotionDao {

    @Autowired
    private PromotionRepo promotionRepository;

    @Override
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public Optional<Promotion> getPromotionById(Long id) {
        return promotionRepository.findById(id);
    }

    @Override
    public Promotion savePromotion(Promotion promotion) {
        return promotionRepository.save(promotion);
    }

    @Override
    public void deletePromotion(Long id) {
        promotionRepository.deleteById(id);
    }
}
