package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class BangkokmaxClassContainerShipImpl extends ContainerShipImpl implements BangkokmaxClassContainerShip {

    BangkokmaxClassContainerShipImpl(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass) {
	super(inID, inHull, inEngine, inPos, Values.boundedStack(20, 10, 10, Values.nullContainer()), inMaxMass);
    }

    static BangkokmaxClassContainerShipImpl valueOf(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass) {
	return new BangkokmaxClassContainerShipImpl(inID, inHull, inEngine, inPos, inMaxMass);
    }
}
