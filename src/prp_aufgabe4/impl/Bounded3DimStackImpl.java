
package prp_aufgabe4.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import prp_aufgabe4.Bounded3DimStack;
import prp_aufgabe4.StowageLocation;

public class Bounded3DimStackImpl<E> implements Bounded3DimStack<E> {

    ArrayList<ArrayList<ArrayList<E>>> stack;
    int bay, row, tier;
    E nullElement;

    private Bounded3DimStackImpl(int bay, int row, int tier, Object nullElement) {
        this.bay = bay;
        this.row = row;
        this.tier = tier;
        this.nullElement = (E) nullElement;

        stack = new ArrayList<ArrayList<ArrayList<E>>>(bay);
        for (ArrayList<ArrayList<E>> rowList : stack) {
            stack.add(new ArrayList<ArrayList<E>>(row));
            for (ArrayList<E> tierList : rowList) {
                rowList.add(new ArrayList<E>(tier));
                for (E elem : tierList) {
                    elem = this.nullElement;
                }
            }
        }
    }

    public static Bounded3DimStack valueOf(int bay, int row, int tier, Object nullElement) {
        return new Bounded3DimStackImpl(bay, row, tier, nullElement);
    }

    @Override
    public void load(int bayNo, int rowNo, E elem) {
        if(this.tierIsFull(bay, row)) { 
            System.out.println("Connot load this element. Tier is full");
        }else{
            this.stack.get(bayNo).get(rowNo).add(elem);
        }
    }

    @Override
    public void load(E elem) {
        if (this.isFull()) {
            System.out.println("Cannot load this element. Stack is full");
        } else {
            for (int bayNo = 0; bayNo < bay; bayNo++) {
                for (int rowNo = 0; rowNo < row; rowNo++) {
                    for (int tierNo = 0; tierNo < tier; tierNo++) {
                        if (!this.tierIsFull(bay, row)) {
                            this.load(bayNo, rowNo, elem);
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void loadAll(Collection<E> colls) {
        for (E elem : colls) {
            this.load(elem);
        }
    }

    @Override
    public boolean isEmpty() {
        for (int bayNo = 0; bayNo < bay; bayNo++) {
            for (int rowNo = 0; rowNo < row; rowNo++) {
                if (!this.stack.get(bay).get(row).isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isFull() {
        for (int bayNo = 0; bayNo < bay; bayNo++) {
            for (int rowNo = 0; rowNo < row; rowNo++) {
                if (this.stack.get(bay).get(row).equals(nullElement)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
        for(E elem : stack.get(bay).get(row)) {
            if(!elem.equals(nullElement)) {return false;}
        }
        return true;
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
        for(E elem : stack.get(bay).get(row)) {
            if(elem.equals(nullElement)) {return false;}
        }
        return true;
    }

    @Override
    public boolean contains(Object elem) {
       return this.getAll().contains((E) elem);
    }

    @Override
    public boolean containsAll(Collection<E> coll) {
        return this.getAll().containsAll(coll);
    }

    @Override
    public E get(StowageLocation loc) {
        return stack.get(loc.bay()).get(loc.row()).get(loc.tier());
    }

    @Override
    public Set<E> getAll() {
        HashSet set = new HashSet();
        for(int bayNo = 0; bayNo < bay; bayNo++) {
            for(int rowNo = 0; rowNo < row; rowNo++) {
                set.addAll(stack.get(bay).get(row));
            }
        }
        return set;
    }

    @Override
    public StowageLocation locationOf(E elem) {
        for(int bayNo = 0; bayNo < bay; bayNo++) {
            for(int rowNo = 0; rowNo < row; rowNo++) {
                for(int tierNo = 0; tierNo < tier; tierNo++) {
                    if(stack.get(bayNo).get(rowNo).get(tierNo) == elem) {
                        return Values.stowageLocation(bay, row, tier);
                    }
                }
            }
        }
        return Values.nullLocation();
    }
}
