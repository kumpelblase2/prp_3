package prp_aufgabe4;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public interface Speed extends PhysicalUnit<Speed> {

    public double toMPerSeconds();

    public Length mul(TimeDiff inTime);

    public Acceleration div(TimeDiff inTime);
}
