
package prp_aufgabe4.impl;

import prp_aufgabe4.BoundingBox;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.Stowage;
import prp_aufgabe4.StowageLocation;
import prp_aufgabe4.UniqueID;

abstract class AbstractPallet implements Pallet{
    
    StowageLocation loc;
    UniqueID id;
    Mass mass;
    BoundingBox boundingBox;
    
    @Override
    public UniqueID id() {
        return id;
    }
    
        @Override
    public Mass mass() {
        return mass;
    }

    @Override
    public BoundingBox boundingBox() {
        return boundingBox;
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
    }

    @Override
    public int compareTo(Pallet p) {
        if (this.id.idNumber() == p.id().idNumber()) return 0;
        if (this.id.idNumber() > p.id().idNumber()) return 1;
        return -1;
    }
    
}
