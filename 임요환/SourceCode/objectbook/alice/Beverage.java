package com.yohwan.study.objectbook.alice;

public class Beverage {
    private int quantity;

    public Beverage(int quantity) {
        this.quantity = quantity;
    }

    public void decrease(int drunkenQuantity) {
        if(quantity - drunkenQuantity < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.quantity -= drunkenQuantity;
        System.out.println("음료의 남은 양 : " + this.quantity);
    }
}
