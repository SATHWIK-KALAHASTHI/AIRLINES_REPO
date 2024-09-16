package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PromotionAppliedDao;
import com.entity.PromotionApplied;

import java.util.List;
import java.util.Optional;

@Service
public class PromotionAppliedService {

    @Autowired
    private PromotionAppliedDao promotionAppliedDAO;

    public List<PromotionApplied> getAllPromotionsApplied() {
        return promotionAppliedDAO.getAllPromotionsApplied();
    }

    public Optional<PromotionApplied> getPromotionAppliedById(Long id) {
        return promotionAppliedDAO.getPromotionAppliedById(id);
    }

    public PromotionApplied savePromotionApplied(PromotionApplied promotionApplied) {
        return promotionAppliedDAO.savePromotionApplied(promotionApplied);
    }

    public void deletePromotionApplied(Long id) {
        promotionAppliedDAO.deletePromotionApplied(id);
    }
}
