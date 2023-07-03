package com.yohwan.study.objectbook.trump;

public class Trump {
    private TrumpKind kind;
    private TrumpShape shape;

    public Trump(TrumpKind kind, TrumpShape shape) {
        this.kind = kind;
        this.shape = shape;
    }

    public void LieDown() {
        System.out.println("trump can lie down");
    }

    public void turnOver() {
        System.out.println("trump can turn over");
    }
}
