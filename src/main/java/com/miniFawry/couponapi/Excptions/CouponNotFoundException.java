package com.miniFawry.couponapi.Excptions;

public class CouponNotFoundException extends RuntimeException {

    public CouponNotFoundException(String code) {
        super("Coupon not found with code " + code);
    }

}