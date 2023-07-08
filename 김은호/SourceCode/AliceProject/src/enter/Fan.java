package enter;

public class Fan {
    private static Fan fan = new Fan();

    private Fan(){

    }

    public void NotShakeFanException(int height){
        if(height <= 20){
            throw new RuntimeException("키카 너무 작아 부채질을 할 수 없습니다.");
        }
    }

    public static Fan getFan(){
        return fan;
    }

    public int shakingFanMakesShorterHeight(int height){
        NotShakeFanException(height);
        return height - 20;
    }
}
