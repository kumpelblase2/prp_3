package prp_aufgabe4;

public interface Acceleration extends PhysicalUnit<Acceleration> {

    public double toMeterPerSSquared();

    public Speed mul(TimeDiff inTime);

    public Force mul(Mass inMass);
}
