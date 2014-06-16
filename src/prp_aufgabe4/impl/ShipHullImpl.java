package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class ShipHullImpl implements ShipHull
{
	private final UniqueID id;
	private final BoundingBox box;
	private final Mass mass;

	public ShipHullImpl(UniqueID inId, BoundingBox inBox, Mass inMass)
	{
		id = inId;
		box = inBox;
		mass = inMass;
	}

	@Override
	public int compareTo(ShipHull o)
	{
		return (int)(this.id().idNumber() - o.id().idNumber());
	}

	@Override
	public BoundingBox boundingBox()
	{
		return box;
	}

	@Override
	public Mass mass()
	{
		return mass;
	}

	@Override
	public UniqueID id()
	{
		return id;
	}

	static ShipHullImpl valueOf(UniqueID inId, BoundingBox inBox, Mass inMass)
	{
		return new ShipHullImpl(inId, inBox, inMass);
	}
}