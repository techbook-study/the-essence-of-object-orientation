package com.yohwan.study.objectbook.trial;

import java.util.LinkedList;

public class Rabbit implements Caller {
    private LinkedList<Witness> witnesses;

    public Rabbit(LinkedList<Witness> witnesses) {
        this.witnesses = witnesses;
    }

    @Override
    public Witness call() {
        if(witnesses.isEmpty()) {
            throw new IllegalStateException("남은 증인이 없습니다.");
        }

        Witness witness = witnesses.poll();
        System.out.println("증인 등장하시오");

        return witness.appear();
    }

    @Override
    public Witness call(Witness witness) {
        witnesses.remove(witness);

        System.out.println("증인 등장하시오");

        return witness.appear();
    }
}
