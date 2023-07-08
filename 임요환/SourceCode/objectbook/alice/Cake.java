package com.yohwan.study.objectbook.alice;

public class Cake {
    private int quantity;

    public Cake(int quantity) {
        this.quantity = quantity;
    }

    public void decrease(int eatenQuantity) {
        if(quantity - eatenQuantity < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.quantity -= eatenQuantity;
        System.out.println("케이크의 남은 양 : " + this.quantity);
    }
}
