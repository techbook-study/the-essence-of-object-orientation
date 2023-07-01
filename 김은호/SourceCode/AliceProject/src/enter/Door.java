package enter;

public class Door {

    private static Door door = new Door();

    private Door(){

    }

    public static Door getDoor(){
        return door;
    }

    public void notExistsKeyException(Object key){
        boolean isKey = key instanceof Key;
        if(!isKey){
            throw new RuntimeException("열쇠가 아닙니다!");
        }
    }

    private void overHeightFortyException(int height) {
        if(height > 40){
            throw new RuntimeException("키는 40CM를 초과할 수 없습니다.");
        }
    }

    public String GardenThroughDoor(Object doorKey, int height){
        notExistsKeyException(doorKey);
        overHeightFortyException(height);
        return "Beautiful Garden";
    }


}
