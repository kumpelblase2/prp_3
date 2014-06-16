package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class PanamaxClassContainerShipImpl extends ContainerShipImpl implements PanamaxClassContainerShip
{
	PanamaxClassContainerShipImpl(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Bounded3DimStack<Container> inContent, Mass inMaxMass)
	{
		super(inID, inHull, inEngine, inPos, inContent, inMaxMass);
	}

	static PanamaxClassContainerShipImpl valueOf(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Bounded3DimStack<Container> inContent, Mass inMaxMass)
	{
		return new PanamaxClassContainerShipImpl(inID, inHull, inEngine, inPos, inContent, inMaxMass);
	}
}