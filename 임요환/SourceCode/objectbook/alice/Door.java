package com.yohwan.study.objectbook.alice;

public class Door {
    private final int heightLimit;

    public Door(int heightLimit) {
        this.heightLimit = heightLimit;
    }

    public void pass(Key key, int height ) {
        if(height > heightLimit) {
            throw new IllegalStateException("키가 40보다 작아야합니다.");
        }

        if(key == null) {
            throw new IllegalStateException("문을 통과하기 위한 열쇠가 없습니다.");
        }

        System.out.println("아름다운 정원으로 이동할 수 있습니다.");
    }

    public void pass(Alice alice) {
        if(alice.getHeight() > heightLimit) {
            throw new IllegalStateException("키가 40보다 작아야합니다.");
        }

        if(alice.getKey() == null) {
            throw new IllegalStateException("문을 통과하기 위한 열쇠가 없습니다.");
        }

        System.out.println("아름다운 정원으로 이동할 수 있습니다.");
        alice.move(Place.BEAUTIFUL_GARDEN);
    }
}
