package com.yohwan.study.objectbook.alice;

public class Mushroom {
    private int leftQuantity;
    private int rightQuantity;

    public Mushroom(int leftQuantity, int rightAmount) {
        this.leftQuantity = leftQuantity;
        this.rightQuantity = rightAmount;
    }

    public void decreaseLeft(int eatenQuantity) {
        if(leftQuantity - eatenQuantity < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.leftQuantity -= eatenQuantity;
        System.out.println("버섯 왼쪽의 남은 양 : " + this.leftQuantity);
    }

    public void decreaseRight(int eatenQuantity) {
        if(rightQuantity - eatenQuantity < 0) {
            throw new IllegalStateException("양이 모자랍니다.");
        }

        this.rightQuantity -= eatenQuantity;
        System.out.println("버섯 오른쪽의 남은 양 : " + this.rightQuantity);

    }
}
