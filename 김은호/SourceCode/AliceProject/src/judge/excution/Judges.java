package judge.excution;

public abstract class Judges {
    private WitnessMangement WitnessManager = new Rabbit();

    public void enterWitness(){
        WitnessManager.enterWitness();
    }

    public void startTestimony(){
        WitnessManager.speakToRoyalHousehold();
    }
}
