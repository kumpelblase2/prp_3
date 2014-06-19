package prp_aufgabe4;

public interface WithPropulsion extends WithPower, Mutable {

    public void moveStep(TimeDiff inDiff);
}
