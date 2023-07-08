package enter;

public class Alice {

    private static Alice alice = new Alice();
    private int height = 130;
    private String position = "통로";

    private Alice(){

    }

    public static Alice getAlice(){
        return alice;
    }

    public void eatCake(){
        Cake cake = new Cake();
        this.height = cake.eatingCakeMakesLongerHeight(this.height);
    }

    public void drinkJuice(){
        Juice juice = new Juice();
        this.height = juice.drinkingJuiceMakesShorter(this.height);
    }

    public void shakeFan(){
        Fan fan = Fan.getFan();
        this.height = fan.shakingFanMakesShorterHeight(this.height);
    }

    public void eatLeftMushroom(){
        Mushroom mushroom = new Mushroom();
        this.height = mushroom.eatingLeftMakesHeightForty();
    }

    public void eatRightMushroom(){
        Mushroom mushroom = new Mushroom();
        this.height = mushroom.eatingRightMakesHeightForty();
    }

    public void GardenThroughDoor(){
        Key doorKey = Key.getKey(height);
        Door door = Door.getDoor();
        position = door.GardenThroughDoor(doorKey, height);
        System.out.println(position + "도착");
    }
}
