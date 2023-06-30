package DoorPackage;

public class Beverage {
    private int milliliter = 500;

    public int drinkBeverage(int tall) {
        if (this.milliliter != 0) {
            this.milliliter -= 100;
            System.out.println("음료수가 " + this.milliliter + "mm 남았습니다.");
            return 24;
        }else {
            System.out.println("음료수가 없습니다.");
            return tall;
        }

    }

}