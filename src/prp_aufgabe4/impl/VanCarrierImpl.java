package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class VanCarrierImpl extends AbstractContainerCar implements VanCarrier
{
	VanCarrierImpl(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower)
	{
		super(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
	}

	@Override
	public int compareTo(Vehicle o)
	{
		return (int)(this.id().idNumber() - o.id().idNumber());
	}

	static VanCarrierImpl valueOf(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower)
	{
		return new VanCarrierImpl(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
	}
}