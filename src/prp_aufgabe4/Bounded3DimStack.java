package prp_aufgabe4;

import java.util.Collection;
import java.util.Set;

public interface Bounded3DimStack<E> extends Mutable {

    void load(int bayNo, int rowNo, E elem);

    void load(E elem);

    void loadAll(Collection<E> colls);

    boolean isEmpty();

    boolean isFull();

    boolean tierIsEmpty(int bay, int row);

    boolean tierIsFull(int bay, int row);

    boolean contains(Object elem);

    boolean containsAll(Collection<E> coll);

    E get(StowageLocation loc);

    Set<E> getAll();

    StowageLocation locationOf(E elem);
}
