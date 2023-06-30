package judge;

public class Judge {
    protected String JudgeName = "";

    private Rabbit rabbit;
    private Witness witness;
    public  Judge() {
        rabbit = new Rabbit();
        witness = new Witness();
    }

    public void requestTrial() {
        System.out.println(JudgeName + "이(가) 재판을 시작합니다.");
        rabbit.witnessEntrance();
    }

    public void requestWitness() {
        System.out.println(JudgeName + "이(가) 증인에게 증언을 하라 명령합니다.");
        witness.requestWitness();
    }
}
