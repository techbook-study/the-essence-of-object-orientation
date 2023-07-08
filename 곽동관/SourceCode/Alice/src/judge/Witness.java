package judge;

public class Witness {

    Cooker cooker = new Cooker();
    Hater hater = new Hater();

    public void getWitness() {
        System.out.println(cooker.getName() + "이(가) 입장합니다.");
    }

    public void requestWitness() {
        System.out.println(cooker.getName() + "이(가) 증언합니다.");
    }
}
