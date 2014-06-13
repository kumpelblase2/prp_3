package prp_aufgabe4;

public interface Vehicle<T extends Vehicle> extends Mutable, Body, WithUniqueID<T>, WithPosition, WithPower, WithPropulsion, Comparable<T>
{
}