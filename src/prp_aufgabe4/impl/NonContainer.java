package prp_aufgabe4.impl;

public class NonContainer extends AbstractContainer {

    @Override
    public boolean isBlocked() {
	return true;
    }

    @Override
    public boolean isOccupied() {
	return false;
    }

    @Override
    public boolean isFree() {
	return false;
    }
}
