package DoorPackage;

public class Mushroom {

    private boolean leftMushroom = false;
    private boolean rightMushroom = false;
    public int leftEatMushroom(int tall) {
        if(leftMushroom == false) {
            System.out.println("버섯의 왼쪽부분을 먹습니다.");
            return 40;
        } else {
            System.out.println("버섯의 왼쪽부분이 없어서 먹을 수 없습니다.");
            return tall;
        }
    }
    public int rightEatMushroom(int tall) {
        if(rightMushroom == false) {
            System.out.println("버섯의 오른쪽부분을 먹습니다.");
            return 130;
        } else {
            System.out.println("버섯의 왼쪽부분이 없어서 먹을 수 없습니다.");
            return tall;
        }
    }
}
