import enter.Alice;
import judge.excution.Judges;
import judge.excution.royal.King;
import trump.*;

import static enter.Alice.getAlice;

public class Main {
    public static void main(String[] args) {
        // judge();
        // throughDoor();
        // trump();
    }

    private static void trump() {
        Trump heartTrump = new HeartTrump();
        TrumpPeople gardener = new Gardener();
        TrumpPeople jack = new Jack();

        heartTrump.kneelDown();
        heartTrump.flipOver();
        gardener.flipOver();
        gardener.kneelDown();
        jack.flipOver();
        jack.kneelDown();
    }

    private static void throughDoor() {
        Alice alice = getAlice();
        alice.eatCake();

        for (int i = 0; i < 12; i++) {
            alice.shakeFan();
        }

        alice.GardenThroughDoor();
    }

    private static void judge() {
        Judges judges = new King();
        judges.enterWitness();
        judges.startTestimony();
    }
}