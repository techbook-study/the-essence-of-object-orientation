package enter;

public class Juice {

    public Juice(){

    }

    public void NotDrinkJuiceException(int height){
        if(height <= 24){
            throw new RuntimeException("키카 너무 작아 음료수를 마실 수 없습니다.");
        }
    }

    public int drinkingJuiceMakesShorter(int height){
        NotDrinkJuiceException(height);
        return 24;
    }
}
