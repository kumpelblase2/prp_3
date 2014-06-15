package prp_aufgabe4;

public interface WithUniqueID<T extends WithUniqueID> extends Comparable<T>
{
	public UniqueID uniqueID();
}