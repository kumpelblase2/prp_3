
package prp_aufgabe4.impl;

public class NullPallet extends AbstractPallet{

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
