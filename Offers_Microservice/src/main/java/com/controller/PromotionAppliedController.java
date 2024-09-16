package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.PromotionApplied;
import com.service.PromotionAppliedService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/promotions-applied")
public class PromotionAppliedController {

    @Autowired
    private PromotionAppliedService promotionAppliedService;

    @GetMapping("/list")
    public List<PromotionApplied> getAllPromotionsApplied() {
        return promotionAppliedService.getAllPromotionsApplied();
    }

    @GetMapping("/getpromotionappliedbyid/{id}")
    public Optional<PromotionApplied> getPromotionAppliedById(@PathVariable Long id) {
        return promotionAppliedService.getPromotionAppliedById(id);
    }

    @PostMapping("/createpromotionapplied")
    public PromotionApplied createPromotionApplied(@RequestBody PromotionApplied promotionApplied) {
        return promotionAppliedService.savePromotionApplied(promotionApplied);
    }

    @PutMapping("/updatepromotionapplied/{id}")
    public PromotionApplied updatePromotionApplied(@PathVariable Long id, @RequestBody PromotionApplied promotionApplied) {
        promotionApplied.setAppliedId(id);
        return promotionAppliedService.savePromotionApplied(promotionApplied);
    }

    @DeleteMapping("/deletepromotionapplied/{id}")
    public void deletePromotionApplied(@PathVariable Long id) {
        promotionAppliedService.deletePromotionApplied(id);
    }
}

