package trump;

public abstract class TrumpPeople extends Trump{
    private int hands = 2;
    private int foots = 2;
    private String name = "";

    protected void setName(String name){
        this.name = name;
    };

    @Override
    public void kneelDown() {
        System.out.println(name + " 몸을 납작엎드립니다.");
    }

    @Override
    public void flipOver() {
        System.out.println(name + " 몸이 뒤집어졌습니다.");
    }


    public void walking() {
        System.out.println(name + " 길을 걷습니다.");
    }
}
