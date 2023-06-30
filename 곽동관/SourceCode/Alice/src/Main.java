import DoorPackage.Alice;
import Trump.Gardener;
import Trump.Jack;
import judge.*;

public class Main {
    public static void main(String[] args) {
        doorPackage();
//        Trump();
//        judge();


    }

    private static void judge() {
        King king = new King();
        king.requestTrial();
        king.requestWitness();

    }

    public static void Trump() {
        Gardener gardener = new Gardener();
        Jack jack = new Jack();
        Queen queen = new Queen();

        gardener.납작엎드리다();
//        queen.걸을수있다();
        jack.걸을수있다();
    }
    public static void doorPackage() {
        Alice alice = new Alice();

        alice.drinkBeverage();
        alice.eatCake();
        alice.shakeFan(3);
        alice.shakeFan(10);
        alice.leftEatMushroom();
        alice.rightEatMushroom();
        alice.takeKey();
        alice.openDoor();
        alice.leftEatMushroom();
        alice.takeKey();
        alice.openDoor();
    }
}