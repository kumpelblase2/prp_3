package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class ShipEngineImpl implements ShipEngine {

    private final UniqueID id;
    private final BoundingBox box;
    private final Power power;
    private final Power maxPower;
    private final Mass mass;
    private double level;

    ShipEngineImpl(UniqueID inId, BoundingBox inBox, Power inPower, Power inMaxPower, Mass inMass) {
	id = inId;
	box = inBox;
	power = inPower;
	maxPower = inMaxPower;
	mass = inMass;
    }

    @Override
    public int compareTo(ShipEngine o) {
	return (int) (this.id().idNumber() - o.id().idNumber());
    }

    @Override
    public BoundingBox boundingBox() {
	return box;
    }

    @Override
    public Mass mass() {
	return mass;
    }

    @Override
    public Power power() {
	return power;
    }

    @Override
    public Power maxPower() {
	return maxPower;
    }

    @Override
    public void setLevel(double inLevel) {
	level = inLevel;
    }

    @Override
    public UniqueID id() {
	return id;
    }

    static ShipEngineImpl valueOf(UniqueID inId, BoundingBox inBox, Power inPower, Power inMaxPower, Mass inMas) {
	return new ShipEngineImpl(inId, inBox, inPower, inMaxPower, inMas);
    }
}
