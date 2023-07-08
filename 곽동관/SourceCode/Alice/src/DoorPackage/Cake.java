package DoorPackage;

public class Cake {

    private int pieces = 4;

    public int eatCake(int tall) {
        if(this.pieces != 0) {
            this.pieces -= 1;
            System.out.println("케이크가" + this.pieces + "조각 남았습니다.");
            return tall + 150;
        } else {
            System.out.println("남은 케이크가 없습니다.");
            return tall;
        }
    }
}
