package prp_aufgabe4.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import prp_aufgabe4.Bounded3DimStack;
import prp_aufgabe4.StowageLocation;

public class Bounded3DimStackImpl<E> implements Bounded3DimStack<E> {

    List<List<List<E>>> stack;
    int bay, row, tier;
    E nullElement;

    private Bounded3DimStackImpl(int bay, int row, int tier, E nullElement) {
	this.bay = bay;
	this.row = row;
	this.tier = tier;
	this.nullElement = nullElement;

	stack = new ArrayList<List<List<E>>>(bay);
//	for (ArrayList<ArrayList<E>> rowList : stack) {
//	    stack.add(new ArrayList<ArrayList<E>>(row));
//	    for (ArrayList<E> tierList : rowList) {
//		rowList.add(new ArrayList<E>(tier));
//		for (E elem : tierList) {
//		    elem = this.nullElement;
//		}
//	    }
//	}
	
	for(int i = 0; i < bay; i++)
	{
	    List<List<E>> rows = new ArrayList<List<E>>(row);
	    for(int i2 = 0; i2 < row; i2++)
	    {
		List<E> tiers = new ArrayList<E>(tier);
		for(int i3 = 0; i3 < tier; i3++)
		{
		    tiers.add(nullElement);
		}
		rows.add(tiers);
	    }
	    stack.add(rows);
	}
    }

    public static <T> Bounded3DimStack<T> valueOf(int bay, int row, int tier, T nullElement) {
	return new Bounded3DimStackImpl<T>(bay, row, tier, nullElement);
    }

    @Override
    public void load(int bayNo, int rowNo, E elem) {
	if (this.tierIsFull(bayNo, rowNo)) {
	    System.out.println("Connot load this element. Tier is full");
	    throw new IllegalStateException("Tier is full already.");
	} else {
	    List<E> temp = this.stack.get(bayNo).get(rowNo);
	    int tier = getLastEmptyTier(bayNo, rowNo);
	    temp.remove(tier);
	    temp.add(tier, elem);
	}
    }
    
    private int getLastEmptyTier(int bay, int row)
    {
	List<E> temp = this.stack.get(bay).get(row);
	for(int i = 0; i < temp.size(); i++)
	{
	    if(temp.get(i).equals(nullElement))
		return i;
	}
	
	return -1;
    }

    @Override
    public void load(E elem) {
	if (this.isFull()) {
	    System.out.println("Cannot load this element. Stack is full");
	    throw new IllegalStateException("Stowage is full already.");
	} else {
	    for (int bayNo = 0; bayNo < bay; bayNo++) {
		for (int rowNo = 0; rowNo < row; rowNo++) {
		    if (!this.tierIsFull(bay, row)) {
			this.load(bayNo, rowNo, elem);
			return;
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
		if (!this.stack.get(bayNo).get(rowNo).isEmpty()) {
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
		if (this.stack.get(bayNo).get(rowNo).equals(nullElement)) {
		    return false;
		}
	    }
	}
	return true;
    }

    @Override
    public boolean tierIsEmpty(int bay, int row) {
	return getLastEmptyTier(bay, row) > -1;
    }

    @Override
    public boolean tierIsFull(int bay, int row) {
	return getLastEmptyTier(bay, row) == -1;
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
	for (int bayNo = 0; bayNo < bay; bayNo++) {
	    for (int rowNo = 0; rowNo < row; rowNo++) {
		set.addAll(stack.get(bayNo).get(rowNo));
	    }
	}
	return set;
    }

    @Override
    public StowageLocation locationOf(E elem) {
	for (int bayNo = 0; bayNo < bay; bayNo++) {
	    for (int rowNo = 0; rowNo < row; rowNo++) {
		for (int tierNo = 0; tierNo < tier; tierNo++) {
		    if (stack.get(bayNo).get(rowNo).get(tierNo) == elem) {
			return Values.stowageLocation(bay, row, tier);
		    }
		}
	    }
	}
	return Values.nullLocation();
    }
}
