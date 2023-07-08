package judge.excution;

import judge.witness.Witness;

import java.util.ArrayList;
import java.util.List;

public interface WitnessMangement {
    List<Witness> Witnesses = new ArrayList<>();

    public void speakToRoyalHousehold();

    public void enterWitness();
}
