package DoorPackage;

public class Fan {

    private int shakeFanTallChange = 20;
    public int shakeFan(int tall , int shakeFanCount) {
        if(tall <= this.shakeFanTallChange) {
            System.out.println("키가 너무작아서 부채를 부칠수 없습니다.");
            return tall;
        } else {
            for(int i=0; i < shakeFanCount; i++) {
                if (tall > this.shakeFanTallChange) {
                    tall -= this.shakeFanTallChange;
                } else {
                    System.out.println("키가 너무작아서 부채를 부칠수 없습니다.");
                    break;
                }
            }
            return tall;
        }
    }
}
