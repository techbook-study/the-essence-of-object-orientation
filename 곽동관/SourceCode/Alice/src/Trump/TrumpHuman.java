package Trump;

public class TrumpHuman implements Trump{

    protected String name;

    @Override
    public void 납작엎드리다() {
        System.out.println(name + " 납작 엎드립니다.");
    }

    @Override
    public void 뒤짚어질수있다() {
        System.out.println(name + " 뒤짚어 졌다.");
    }

    public void 걸을수있다() {
        System.out.println(name + " 걸을 수 있다.");
    }
}
