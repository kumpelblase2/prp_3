
package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class ContainerImpl extends AbstractContainer {

    private ContainerImpl(UniqueID id) {
        this.id = id;
        emptyMass = Values.massInKG(2280);
        maxMass = Values.massInKG(24000);
        palletStowage = Entities.palletStowage(1, 9, 3, maxMass);
    }
    
    public static Container entityOf(UniqueID id) {
        return new ContainerImpl(id);
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
