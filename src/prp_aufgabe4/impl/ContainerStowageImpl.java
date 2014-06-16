
package prp_aufgabe4.impl;

import java.util.*;
import prp_aufgabe4.*;


public class ContainerStowageImpl implements ContainerStowage {

    Bounded3DimStackImpl<Container> containerStack;
    BoundingBox boundingBox;
    Mass emptyMass = Values.massInKG(0.0);
    Mass maxMass;
    Length containerLength = Values.lengthInFeet(20);
    Length containerWidth = Values.lengthInFeet(8);
    Length containerHight = Values.lengthInFeet(8);
    Container nullElement = Entities.nullContainer();
    
    private ContainerStowageImpl(int bay, int row, int tier, Mass maxMass) {
        this.boundingBox = Values.boundingBoxWithDimensions(containerLength.mul(bay), containerWidth.mul(row), containerHight.mul(tier));
        this.containerStack = (Bounded3DimStackImpl<Container>) Values.boundedStack(bay, row, tier, nullElement);
        this.maxMass = maxMass;
    }
    
    static ContainerStowage valueOf(int bay, int row, int tier, Mass maxMass) {
        return new ContainerStowageImpl(bay, row, tier, maxMass);
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
        return containerStack.isEmpty();
    }

    @Override
    public boolean isFull() {
        return containerStack.isFull();
    }

    @Override
    public void load(int bayNo, int rowNo, Container elem) {
        containerStack.load(bayNo, rowNo, elem);
    }

    @Override
    public void load(Container elem) {
        containerStack.load(elem);
    }

    @Override
    public void loadAll(Collection<Container> colls) {
        containerStack.loadAll(colls);
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
        return containerStack.tierIsEmpty(bay, row);
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
        return containerStack.tierIsFull(bay, row);
    }

    @Override
    public boolean contains(Object elem) {
        return containerStack.contains(elem);
    }

    @Override
    public boolean containsAll(Collection<Container> coll) {
        return containerStack.containsAll(coll);
    }

    @Override
    public Container get(StowageLocation loc) {
        return containerStack.get(loc);
    }

    @Override
    public Set<Container> getAll() {
        return containerStack.getAll();
    }

    @Override
    public StowageLocation locationOf(Container elem) {
        return containerStack.locationOf(elem);
    }

    @Override
    public Mass mass() {
         Mass mass = Values.massInKG(0.0);
        Set<Container> container = containerStack.getAll();
        for(Iterator i = container.iterator(); i.hasNext();) {
            Pallet p = (Pallet) i.next();
            mass.add(p.mass());
        }
        return mass;
    }

    @Override
    public BoundingBox boundingBox() {
        return boundingBox;
    }
    
}
