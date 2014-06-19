package prp_aufgabe4.impl;

import java.util.Collection;
import java.util.Set;
import prp_aufgabe4.*;

public class TerminalStowageImpl implements TerminalStowage {

    private final UniqueID id;
    private final BoundingBox box;
    private final Bounded3DimStack<Container> storage;
    private final Mass emptyMass;
    private final Mass maxMass;
    private final Mass mass;

    TerminalStowageImpl(UniqueID inId, BoundingBox inBox, Bounded3DimStack<Container> inStorage, Mass inEmptyMass, Mass inMaxMass, Mass inMass) {
	id = inId;
	box = inBox;
	storage = inStorage;
	emptyMass = inEmptyMass;
	maxMass = inMaxMass;
	mass = inMass;
    }

    @Override
    public BoundingBox boundingBox() {
	return box;
    }

    @Override
    public Mass emptyMass() {
	return emptyMass;
    }

    @Override
    public Mass maxMass() {
	return maxMass;
    }

    @Override
    public Mass mass() {
	return mass;
    }

    @Override
    public UniqueID id() {
	return id;
    }

    @Override
    public void load(int bayNo, int rowNo, Container elem) {
	storage.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Container elem) {
	storage.load(elem);
    }

    @Override
    public void loadAll(Collection<Container> colls) {
	storage.loadAll(colls);
    }

    @Override
    public boolean isEmpty() {
	return storage.isEmpty();
    }

    @Override
    public boolean isFull() {
	return storage.isFull();
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return storage.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return storage.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
	return storage.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Container> coll) {
	return storage.containsAll(coll);
    }

    @Override
    public Container get(StowageLocation loc) {
	return storage.get(loc);
    }

    @Override
    public Set<Container> getAll() {
	return storage.getAll();
    }

    @Override
    public StowageLocation locationOf(Container elem) {
	return storage.locationOf(elem);
    }

    static TerminalStowageImpl valueOf(UniqueID inId, BoundingBox inBox, Bounded3DimStack<Container> inStorage, Mass inEmptyMass, Mass inMaxMass, Mass inMass) {
	return new TerminalStowageImpl(inId, inBox, inStorage, inEmptyMass, inMaxMass, inMass);
    }
}
