package com.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "promotions")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long promotionId;

    @Column(name = "promotion_code", nullable = false)
    private String promotionCode;

    @Column(name = "description")
    private String description;

    @Column(name = "discount_percentage")
    private Double discountPercentage;

    @Column(name = "valid_from")
    private LocalDateTime validFrom;

    @Column(name = "valid_until")
    private LocalDateTime validUntil;

    @Column(name = "is_active")
    private Boolean isActive;

    @OneToMany(mappedBy = "promotion", cascade = CascadeType.ALL)
    private List<PromotionApplied> promotionAppliedList;
}
