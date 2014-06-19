package prp_aufgabe4.impl;

import prp_aufgabe4.StowageLocation;

public class StowageLocationImpl implements StowageLocation {

    int bay, row, tier;

    private StowageLocationImpl(int bay, int row, int tier) {
	this.bay = bay;
	this.row = row;
	this.tier = tier;
    }

    public static StowageLocation valueOf(int bay, int row, int tier) {
	return new StowageLocationImpl(bay, row, tier);
    }

    @Override
    public int bay() {
	return this.bay;
    }

    @Override
    public int row() {
	return this.row;
    }

    @Override
    public int tier() {
	return this.tier;
    }

    @Override
    public boolean isNull() {
	return false;
    }
}
