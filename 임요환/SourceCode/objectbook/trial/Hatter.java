package com.yohwan.study.objectbook.trial;

public class Hatter implements Witness {
    @Override
    public Witness appear() {
        System.out.println("모자 장수 등장하겠습니다.");
        return this;
    }

    @Override
    public void testify() {
        System.out.println("저는 아무 잘못을 하지 않았습니다.");
    }
}
