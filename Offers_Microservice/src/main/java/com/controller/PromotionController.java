package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Promotion;
import com.service.PromotionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @GetMapping("/list")
    public List<Promotion> getAllPromotions() {
        return promotionService.getAllPromotions();
    }

    @GetMapping("/getpromotionbyid/{id}")
    public Optional<Promotion> getPromotionById(@PathVariable Long id) {
        return promotionService.getPromotionById(id);
    }

    @PostMapping("/createpromotion")
    public Promotion createPromotion(@RequestBody Promotion promotion) {
        return promotionService.savePromotion(promotion);
    }

    @PutMapping("/updatepromotion/{id}")
    public Promotion updatePromotion(@PathVariable Long id, @RequestBody Promotion promotion) {
        promotion.setPromotionId(id);
        return promotionService.savePromotion(promotion);
    }

    @DeleteMapping("/deletepromotion/{id}")
    public void deletePromotion(@PathVariable Long id) {
        promotionService.deletePromotion(id);
    }
}

