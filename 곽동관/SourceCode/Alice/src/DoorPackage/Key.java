package DoorPackage;

public class Key {

    private boolean key = false;
    public boolean takeKey(int tall) {
        if(tall > 40) {
            System.out.println("키를 들 수 없습니다.");
            return key;
        } else {
            System.out.println("키를 들었습니다.");
            return key = true;
        }
    }
}
