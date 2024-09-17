package com.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "promotions_applied")
public class PromotionApplied {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appliedId;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;
    
  
    @Column(name = "booking_id")
    private Long bookingId;


	

    
}
