package com.yohwan.study.objectbook.trump;

public interface Person {
    default void walk() {
        System.out.println("person can walk");
    }
}
