package com.miniFawry.couponapi.model;

import com.miniFawry.couponapi.entity.Coupon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConsumptionHistoryModel implements Serializable {
    Long id;
    String orderCode;
    double priceBefore;
    double priceAfter;
    Coupon usedCoupon;

    Date consumedAt;
}
