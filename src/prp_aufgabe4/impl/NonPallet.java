
package prp_aufgabe4.impl;

public class NonPallet extends AbstractPallet{

    @Override
    public boolean isFree() {
        return false;
    }

    @Override
    public boolean isBlocked() {
        return true;
    }

    @Override
    public boolean isOccupied() {
        return false;
    }
}
