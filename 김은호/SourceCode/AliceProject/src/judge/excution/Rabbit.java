package judge.excution;

import judge.witness.Alice;
import judge.witness.Hatter;
import judge.witness.Witness;

class Rabbit implements WitnessMangement{

    protected Rabbit(){

    }

    @Override
    public void enterWitness(){
        Witnesses.add(new Alice());
        Witnesses.add(new Hatter());
    }

    @Override
    public void speakToRoyalHousehold() {
        for (int i = 0; i < Witnesses.size(); i++) {
            Witness witness = Witnesses.get(i);
            System.out.println(witness.testimony());
        }
    }


}
