package prp_aufgabe4.impl;

public class NullContainer extends AbstractContainer {

    @Override
    public boolean isFree() {
	return true;
    }

    @Override
    public boolean isBlocked() {
	return false;
    }

    @Override
    public boolean isOccupied() {
	return false;
    }
}
