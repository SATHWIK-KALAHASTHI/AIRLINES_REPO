package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PromotionAppliedDao;
import com.entity.Offer;
import com.entity.OfferApplied;
import com.entity.Promotion;
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

    public PromotionApplied savePromotionApplied(Long promotionId, Long BookingId) {
        PromotionApplied promotionApplied=new PromotionApplied();
        promotionApplied.setPromotion(new Promotion());
        promotionApplied.getPromotion().setPromotionId(promotionId);
        promotionApplied.setBookingId(BookingId);
        return promotionAppliedDAO.savePromotionApplied(promotionApplied);

    }

    public void deletePromotionApplied(Long id) {
        promotionAppliedDAO.deletePromotionApplied(id);
    }
}
