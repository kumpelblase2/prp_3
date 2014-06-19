package prp_aufgabe4.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import prp_aufgabe4.BoundingBox;
import prp_aufgabe4.Container;
import prp_aufgabe4.Length;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.PalletStowage;
import prp_aufgabe4.Stowage;
import prp_aufgabe4.StowageLocation;

public class PalletStowageImpl implements PalletStowage {

    Bounded3DimStackImpl<Pallet> palletStack;
    BoundingBox boundingBox;
    Mass emptyMass = Values.massInKG(0.0);
    Mass maxMass;
    Length palletLength = Values.lengthInFeet(4);
    Length palletWidth = Values.lengthInFeet(4);
    Length palletHight = Values.lengthInFeet(4);
    Container nullElement = Entities.nullContainer();

    private PalletStowageImpl(int bay, int row, int tier, Mass maxMass) {
	this.boundingBox = Values.boundingBoxWithDimensions(palletLength.mul(bay), palletWidth.mul(row), palletHight.mul(tier));
	this.palletStack = (Bounded3DimStackImpl<Pallet>) Values.boundedStack(bay, row, tier, nullElement);
	this.maxMass = maxMass;
    }

    public static Stowage valueOf(int bay, int row, int tier, Mass maxMass) {
	return new PalletStowageImpl(bay, row, tier, maxMass);
    }

    @Override
    public Mass mass() {
	Mass mass = Values.massInKG(0.0);
	Set<Pallet> pallets = this.getAll();
	for (Iterator i = pallets.iterator(); i.hasNext();) {
	    Pallet p = (Pallet) i.next();
	    mass.add(p.mass());
	}
	return mass;
    }

    @Override
    public BoundingBox boundingBox() {
	return boundingBox;
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
    public boolean isEmpty() {
	return palletStack.isEmpty();
    }

    @Override
    public boolean isFull() {
	return palletStack.isFull();
    }

    @Override
    public void load(int bayNo, int rowNo, Pallet elem) {
	palletStack.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Pallet elem) {
	palletStack.load(elem);
    }

    @Override
    public void loadAll(Collection<Pallet> colls) {
	palletStack.loadAll(colls);
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return palletStack.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return palletStack.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
	return palletStack.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Pallet> coll) {
	return containsAll(coll);
    }

    @Override
    public Pallet get(StowageLocation loc) {
	return palletStack.get(loc);
    }

    @Override
    public Set<Pallet> getAll() {
	return palletStack.getAll();
    }

    @Override
    public StowageLocation locationOf(Pallet elem) {
	return palletStack.locationOf(elem);
    }

}
