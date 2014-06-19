package prp_aufgabe4.impl;

import prp_aufgabe4.BangkokmaxClassContainerShip;
import prp_aufgabe4.Bounded3DimStack;
import prp_aufgabe4.BoundingBox;
import prp_aufgabe4.Container;
import prp_aufgabe4.ContainerShip;
import prp_aufgabe4.ContainerStowage;
import prp_aufgabe4.ContainerTruck;
import prp_aufgabe4.Length;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.PanamaxClassContainerShip;
import prp_aufgabe4.Power;
import prp_aufgabe4.Ship;
import prp_aufgabe4.ShipEngine;
import prp_aufgabe4.ShipHull;
import prp_aufgabe4.Stowage;
import prp_aufgabe4.TerminalStowage;
import prp_aufgabe4.UniqueID;
import prp_aufgabe4.VanCarrier;
import static prp_aufgabe4.impl.Values.massInKG;
import static prp_aufgabe4.impl.Values.powerInWatt;

public class Entities {

    public static Container container(UniqueID id) {
	return ContainerImpl.entityOf(id);
    }

    public static Container nullContainer() {
	return new NullContainer();
    }

    public static Container nonContainer() {
	return new NonContainer();
    }

    public static Stowage containerStowage(int bay, int row, int tier, Mass maxMass) {
	return ContainerStowageImpl.valueOf(bay, row, tier, maxMass);
    }

    public static Pallet pallet(UniqueID id, Mass mass) {
	return PalletImpl.entityOf(id, mass);
    }

    public static Pallet nullPallet() {
	return new NullPallet();
    }

    public static Stowage palletStowage(int bay, int row, int tier, Mass maxMass) {
	return PalletStowageImpl.valueOf(bay, row, tier, maxMass);
    }

    public static Ship shipWithData(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos) {
	return ShipImpl.valueOf(inID, inHull, inEngine, inPos);
    }

    public static ContainerShip containerShipWithData(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Bounded3DimStack<Container> inContent, Mass inMaxMass) {
	return ContainerShipImpl.valueOf(inID, inHull, inEngine, inPos, inContent, inMaxMass);
    }

    public static VanCarrier vanCarrierWithData(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower) {
	return VanCarrierImpl.valueOf(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
    }

    public static ContainerTruck containerTruckWithData(UniqueID inId, Bounded3DimStack<Container> inContents, BoundingBox inBox, Mass inMass, Mass inEmptyMass, Mass inMaxMass, Length inPos, Power inPower, Power inMaxPower) {
	return ContainerTruckImpl.valueOf(inId, inContents, inBox, inMass, inEmptyMass, inMaxMass, inPos, inPower, inMaxPower);
    }

    public static ContainerStowage containerStowage(int bays, int rows, int tiers) {
	return ContainerStowageImpl.valueOf(bays, rows, tiers, massInKG(0));
    }

    public static ShipHull shipHullWithData(UniqueID inId, BoundingBox inBox, Mass inMass) {
	return ShipHullImpl.valueOf(inId, inBox, inMass);
    }

    public static ShipHull shipHull(BoundingBox inBox, Mass inMass) {
	return shipHullWithData(UniqueIDImpl.newID(), inBox, inMass);
    }

    public static ShipEngine shipEngine(BoundingBox inBox, Power inMaxPower) {
	return shipEngineWithData(UniqueIDImpl.newID(), inBox, powerInWatt(0), inMaxPower, massInKG(0));
    }

    public static ShipEngine shipEngineWithData(UniqueID inId, BoundingBox inBox, Power inPower, Power inMaxPower, Mass inMass) {
	return ShipEngineImpl.valueOf(inId, inBox, inPower, inMaxPower, inMass);
    }

    public static TerminalStowage terminalStowageWithData(UniqueID inId, BoundingBox inBox, Bounded3DimStack<Container> inStorage, Mass inEmptyMass, Mass inMaxMass, Mass inMass) {
	return TerminalStowageImpl.valueOf(inId, inBox, inStorage, inEmptyMass, inMaxMass, inMass);
    }
    
    public static PanamaxClassContainerShip panamaxContainerShip(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass)
    {
	return PanamaxClassContainerShipImpl.valueOf(inID, inHull, inEngine, inPos, inMaxMass);
    }
    
    public static BangkokmaxClassContainerShip bankokmaxContainerShip(UniqueID inID, ShipHull inHull, ShipEngine inEngine, Length inPos, Mass inMaxMass)
    {
	return BangkokmaxClassContainerShipImpl.valueOf(inID, inHull, inEngine, inPos, inMaxMass);
    }
}
