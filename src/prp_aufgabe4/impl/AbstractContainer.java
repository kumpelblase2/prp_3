package prp_aufgabe4.impl;

import java.util.Collection;
import java.util.Set;
import prp_aufgabe4.BoundingBox;
import prp_aufgabe4.Container;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.Stowage;
import prp_aufgabe4.StowageLocation;
import prp_aufgabe4.UniqueID;

public abstract class AbstractContainer implements Container {

    UniqueID id;

    Mass emptyMass = Values.massInKG(2280);
    Mass maxMass = Values.massInKG(24000);
    Pallet nullPallet = Entities.nullPallet();

    int row = 2;
    int bay = 6;
    int tier = 3;

    StowageLocation loc;
    Stowage palletStowage;

    @Override
    public UniqueID id() {
	return id;
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
	return palletStowage.mass();
    }

    @Override
    public BoundingBox boundingBox() {
	return palletStowage.boundingBox();
    }

    @Override
    public boolean isEmpty() {
	return palletStowage.isEmpty();
    }

    @Override
    public boolean isFull() {
	return palletStowage.isFull();
    }

    @Override
    public void load(int bayNo, int rowNo, Pallet elem) {
	palletStowage.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Pallet elem) {
	palletStowage.load(elem);
    }

    @Override
    public void loadAll(Collection<Pallet> colls) {
	palletStowage.loadAll(colls);
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return palletStowage.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return palletStowage.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
	return palletStowage.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Pallet> coll) {
	return palletStowage.containsAll(coll);
    }

    @Override
    public Pallet get(StowageLocation loc) {
	return (Pallet) palletStowage.get(loc);
    }

    @Override
    public Set<Pallet> getAll() {
	return palletStowage.getAll();
    }

    @Override
    public StowageLocation locationOf(Pallet elem) {
	return palletStowage.locationOf(elem);
    }

    @Override
    public StowageLocation loc() {
	return loc;
    }

    @Override
    public void setLocNull() {
	this.loc = Values.nullLocation();
    }

    @Override
    public void setLoc(Stowage stowage, StowageLocation loc) {
	this.loc = loc;
	this.palletStowage = stowage;
    }

    @Override
    public int compareTo(Container c) {
	if (this.id.idNumber() == c.id().idNumber()) {
	    return 0;
	}
	if (this.id.idNumber() > c.id().idNumber()) {
	    return 1;
	}
	return -1;
    }

}
