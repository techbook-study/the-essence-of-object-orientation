package com.yohwan.study.objectbook.trump;

public class TrumpPerson extends Trump {
    public TrumpPerson(TrumpKind kind, TrumpShape shape) {
        super(kind, shape);
    }

    public void walk() {
        System.out.println("person can walk");
    }

    public static void main(String[] args) {
        TrumpPerson trumpPerson = new TrumpPerson(TrumpKind.ACE, TrumpShape.CLOVER);
        trumpPerson.walk();
        trumpPerson.LieDown();
        trumpPerson.turnOver();
    }
}
