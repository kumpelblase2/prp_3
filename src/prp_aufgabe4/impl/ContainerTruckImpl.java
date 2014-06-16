package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class ContainerTruckImpl extends AbstractContainerCar implements ContainerTruck
{
	ContainerTruckImpl(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower)
	{
		super(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
	}

	@Override
	public int compareTo(Vehicle o)
	{
		return (int)(this.id().idNumber() - o.id().idNumber());
	}

	static ContainerTruckImpl valueOf(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower)
	{
		return new ContainerTruckImpl(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
	}
}