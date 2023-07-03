package com.yohwan.study.objectbook.alice;

public class Key {
    private final int heightLimit;

    public Key(int heightLimit) {
        this.heightLimit = heightLimit;
    }

    public Key get(int height) {
        if(height <= heightLimit) {
            throw new IllegalStateException("키가 30이하여서 열쇠를 얻을 수가 없습니다");
        }

        return this;
    };
}
