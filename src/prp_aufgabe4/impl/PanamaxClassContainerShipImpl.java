package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class PanamaxClassContainerShipImpl extends ContainerShipImpl implements PanamaxClassContainerShip {

    PanamaxClassContainerShipImpl(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass) {
	super(inID, inHull, inEngine, inPos, Values.boundedStack(20, 15, 10, Values.nullContainer()), inMaxMass);
    }

    static PanamaxClassContainerShipImpl valueOf(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass) {
	return new PanamaxClassContainerShipImpl(inID, inHull, inEngine, inPos, inMaxMass);
    }
}
