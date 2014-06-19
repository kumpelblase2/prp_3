package prp_aufgabe4.impl;

import java.util.*;
import prp_aufgabe4.*;

public class ContainerShipImpl extends ShipImpl implements ContainerShip {

    private final Bounded3DimStack<Container> storage;
    private final Mass maxMass;

    ContainerShipImpl(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Bounded3DimStack<Container> inContent, Mass inMaxMass) {
	super(inID, inHull, inEngine, inPos);
	this.storage = inContent;
	this.maxMass = inMaxMass;
    }

    @Override
    public void load(int bayNo, int rowNo, Container elem) {
	this.storage.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Container elem) {
	this.storage.load(elem);
    }

    @Override
    public void loadAll(Collection<Container> colls) {
	this.storage.loadAll(colls);
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return this.storage.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return this.storage.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
	return this.storage.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Container> coll) {
	return this.storage.containsAll(coll);
    }

    @Override
    public Container get(StowageLocation loc) {
	return this.storage.get(loc);
    }

    @Override
    public Set<Container> getAll() {
	return this.storage.getAll();
    }

    @Override
    public StowageLocation locationOf(Container elem) {
	return this.storage.locationOf(elem);
    }

    @Override
    public Mass emptyMass() {
	return this.mass();
    }

    @Override
    public Mass maxMass() {
	return this.maxMass;
    }

    @Override
    public boolean isEmpty() {
	return this.storage.isEmpty();
    }

    @Override
    public boolean isFull() {
	return this.storage.isFull();
    }

    static ContainerShipImpl valueOf(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Bounded3DimStack<Container> inContent, Mass inMaxMass) {
	return new ContainerShipImpl(inID, inHull, inEngine, inPos, inContent, inMaxMass);
    }
}
