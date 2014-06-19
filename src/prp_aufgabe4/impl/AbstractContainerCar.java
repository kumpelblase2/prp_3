package prp_aufgabe4.impl;

import java.util.Collection;
import java.util.Set;
import prp_aufgabe4.*;

public abstract class AbstractContainerCar implements Vehicle, WithCargo, ContainerStowage {

    private final UniqueID id;
    private final Bounded3DimStack<Container> contents;
    private final BoundingBox box;
    private final Mass mass;
    private final Mass emptyMass;
    private final Mass maxMass;
    private final Length pos;
    private final Power power;
    private final Power maxPower;
    private double level;

    AbstractContainerCar(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower) {
	id = inId;
	contents = inContents;
	box = inBox;
	mass = inMass;
	pos = inPos;
	power = inPower;
	maxPower = inMaxPower;
	emptyMass = inEmptyMass;
	maxMass = inMaxMass;
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
    public Length pos() {
	return pos;
    }

    @Override
    public void moveStep(TimeDiff deltaTime) {

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

    @Override
    public void load(int bayNo, int rowNo, Container elem) {
	contents.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Container elem) {
	contents.load(elem);
    }

    @Override
    public void loadAll(Collection<Container> colls) {
	contents.loadAll(colls);
    }

    @Override
    public boolean isEmpty() {
	return contents.isEmpty();
    }

    @Override
    public boolean isFull() {
	return contents.isFull();
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return contents.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return contents.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
	return contents.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Container> coll) {
	return contents.containsAll(coll);
    }

    @Override
    public Container get(StowageLocation loc) {
	return contents.get(loc);
    }

    @Override
    public Set<Container> getAll() {
	return contents.getAll();
    }

    @Override
    public StowageLocation locationOf(Container elem) {
	return contents.locationOf(elem);
    }

    @Override
    public Mass emptyMass() {
	return this.emptyMass;
    }

    @Override
    public Mass maxMass() {
	return this.maxMass;
    }

}
