package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class ShipImpl implements Ship {

    private final UniqueID id;
    private final ShipHull hull;
    private final ShipEngine engine;
    private final Length pos;

    ShipImpl(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos) {
	this.id = inID;
	this.hull = inHull;
	this.engine = inEngine;
	this.pos = inPos;
    }

    @Override
    public int compareTo(Vehicle o) {
	return (int) (this.id.idNumber() - o.id().idNumber());
    }

    @Override
    public BoundingBox boundingBox() {
	return this.hull.boundingBox();
    }

    @Override
    public Mass mass() {
	return this.hull.mass().add(this.engine.mass());
    }

    @Override
    public Length pos() {
	return pos;
    }

    @Override
    public void moveStep(TimeDiff deltaTime) {

    }

    @Override
    public Power power() {
	return this.engine.power();
    }

    @Override
    public Power maxPower() {
	return this.engine.maxPower();
    }

    @Override
    public void setLevel(double inLevel) {
	this.engine.setLevel(inLevel);
    }

    @Override
    public UniqueID id() {
	return id;
    }

    static ShipImpl valueOf(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos) {
	return new ShipImpl(inID, inHull, inEngine, inPos);
    }
}
