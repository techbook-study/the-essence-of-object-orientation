package enter;

public class Key {

    private static Key key = new Key();

    private Key(){

    }

    public static Key getKey(int height){
        UnderHeightThirtyException(height);
        return key;
    }

    public static void UnderHeightThirtyException(int height){
        if(height <= 30){
            throw new RuntimeException("키카 작아 열쇠를 주울 수 없습니다.");
        }
    }

}
