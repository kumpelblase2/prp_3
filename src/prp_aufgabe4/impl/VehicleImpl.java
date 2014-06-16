package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class VehicleImpl implements Vehicle
{
	private final UniqueID id;
	private final BoundingBox boundingBox;
	private final Mass mass;
	private final Length pos;
	private final Power power;
	private final Power maxPower;
	private double steering;

	VehicleImpl(UniqueID inID, BoundingBox inBox, Mass inMass, Length inPos, Power inPower, Power inMaxPower)
	{
		this.id = inID;
		this.boundingBox = inBox;
		this.mass = inMass;
		this.pos = inPos;
		this.power = inPower;
		this.maxPower = inMaxPower;
	}

	@Override
	public int compareTo(Vehicle o)
	{
		return (int)(this.id.idNumber() - o.id().idNumber());
	}

	@Override
	public BoundingBox boundingBox()
	{
		return this.boundingBox;
	}

	@Override
	public Mass mass()
	{
		return this.mass;
	}

	@Override
	public Length pos()
	{
		return this.pos;
	}

	@Override
	public void moveStep(TimeDiff deltaTime)
	{

	}

	@Override
	public Power power()
	{
		return this.power;
	}

	@Override
	public Power maxPower()
	{
		return this.maxPower;
	}

	@Override
	public void setLevel(double inLevel)
	{
		this.steering = inLevel;
	}

	@Override
	public UniqueID id()
	{
		return this.id;
	}

	static VehicleImpl valueOf(UniqueID inID, BoundingBox inBox, Mass inMass, Length inPos, Power inPower, Power inMaxPower)
	{
		return new VehicleImpl(inID, inBox, inMass, inPos, inPower, inMaxPower);
	}
}