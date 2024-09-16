package com.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.PromotionAppliedDao;
import com.entity.PromotionApplied;
import com.repo.PromotionAppliedRepo;

import java.util.List;
import java.util.Optional;

@Component
public class PromotionAppliedDaoImpl implements PromotionAppliedDao {

    @Autowired
    private PromotionAppliedRepo promotionAppliedRepository;

    @Override
    public List<PromotionApplied> getAllPromotionsApplied() {
        return promotionAppliedRepository.findAll();
    }

    @Override
    public Optional<PromotionApplied> getPromotionAppliedById(Long id) {
        return promotionAppliedRepository.findById(id);
    }

    @Override
    public PromotionApplied savePromotionApplied(PromotionApplied promotionApplied) {
        return promotionAppliedRepository.save(promotionApplied);
    }

    @Override
    public void deletePromotionApplied(Long id) {
        promotionAppliedRepository.deleteById(id);
    }
}
