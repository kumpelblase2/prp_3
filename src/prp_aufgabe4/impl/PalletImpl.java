package prp_aufgabe4.impl;

import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.UniqueID;

public class PalletImpl extends AbstractPallet {

    private PalletImpl(UniqueID id, Mass mass) {
	this.id = id;
    }

    public static Pallet entityOf(UniqueID id, Mass mass) {
	return new PalletImpl(id, mass);
    }

    @Override
    public boolean isFree() {
	return false;
    }

    @Override
    public boolean isBlocked() {
	return false;
    }

    @Override
    public boolean isOccupied() {
	return true;
    }
}
