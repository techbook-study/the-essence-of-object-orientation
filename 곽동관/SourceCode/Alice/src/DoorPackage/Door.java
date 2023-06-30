package DoorPackage;

public class Door {
    public void openDoor(boolean takeKey, String position) {
        if(takeKey == true){
            System.out.println("문이 열렸습니다.");
            position = "정원";
            System.out.println(position + " 오신걸 환영합니다." );
        } else {
            System.out.println("키를 가지고 있지 않습니다.");
            System.out.println("현재위치는 " + position + "입니다." );
        }

    }
}
