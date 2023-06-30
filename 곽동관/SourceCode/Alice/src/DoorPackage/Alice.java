package DoorPackage;

public class Alice {

    private int tall = 130;
    private boolean takeKey;
    private String position = "통로";
    public void drinkBeverage() {
        Beverage beverage = new Beverage();
        this.tall = beverage.drinkBeverage(this.tall);
        System.out.println("앨리스 키가 음료수를 먹은 후 " + this.tall + "cm가 되었습니다.");
    }//음료에서는 음료의 양만 줄이고 앨리스의 키는 자기가 바꿀 수 있게끔 -- 요환

    public void eatCake() {
        Cake cake = new Cake();
        this.tall = cake.eatCake(this.tall);
        System.out.println("앨리스 키가 케이크를 먹은 후 " + this.tall + "cm가 되었습니다.");
    }

    public void shakeFan(int shakeFanCount) {
        Fan fan = new Fan();
        this.tall = fan.shakeFan(this.tall, shakeFanCount);
        System.out.println("앨리스 키가 부채를 부친 후 " + this.tall + "cm가 되었습니다.");
    }

    public void leftEatMushroom() {
        Mushroom mushroom = new Mushroom();
        this.tall = mushroom.leftEatMushroom(this.tall);
        System.out.println("앨리스 키가 버섯의 왼쪽부분을 먹은 후 " + this.tall + "cm가 되었습니다.");
    }
    public void rightEatMushroom() {
        Mushroom mushroom = new Mushroom();
        this.tall = mushroom.rightEatMushroom(this.tall);
        System.out.println("앨리스 키가 버섯의 오른쪽 부분을 먹은 후 " + this.tall + "cm가 되었습니다.");
    }
    public void takeKey() {
        Key key = new Key();
        this.takeKey = key.takeKey(this.tall);
    }
    public void openDoor() {
        Door door = new Door();
        door.openDoor(this.takeKey, position);
    }

}
