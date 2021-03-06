package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public final class Values {

    private Values() {
    }

    public static Work workInJoule(double inValue) {
	return WorkImpl.valueOf(inValue);
    }

    public static TimeDiff timeInSeconds(double inSeconds) {
	return TimeDiffImpl.valueOf(inSeconds);
    }

    public static TimeDiff timeInMilliseconds(double inMilliSeconds) {
	return TimeDiffImpl.valueOf(inMilliSeconds / 1000);
    }

    public static Length lengthInM(double inMeter) {
	return LengthImpl.valueOf(inMeter);
    }

    public static Length lengthInFeet(double inFeet) {
	return LengthImpl.valueOf(inFeet / Globals.METER_TO_FEET);
    }

    public static Length lengthInNauticMiles(double inMiles) {
	return LengthImpl.valueOf(inMiles / Globals.METER_TO_NAUTICM);
    }

    public static Acceleration accelerationWithSpeedAndTime(Speed inSpeed, TimeDiff inTimeDiff) {
	return AccelerationImpl.valueOf(inSpeed, inTimeDiff);
    }

    public static Acceleration accelerationWithMetersPerSSquared(double inAcceleration) {
	return AccelerationImpl.valueOf(inAcceleration);
    }

    public static Force forceInN(double inValue) {
	return ForceImpl.valueOf(inValue);
    }

    public static Mass massInKG(double inValue) {
	return MassImpl.valueOf(inValue);
    }

    public static Power powerInWatt(double inPower) {
	return PowerImpl.valueOf(inPower);
    }

    public static Speed speedWithMetersPerS(double inSpeed) {
	return SpeedImpl.valueOf(inSpeed);
    }

    public static Speed speedWithDistanceAndTime(Length inDistance, TimeDiff inTime) {
	return SpeedImpl.valueOf(inDistance, inTime);
    }

    public static Name nameWithString(String inName) {
	return NameImpl.valueOf(inName);
    }

    public static UniqueID uniqueIdWithLong(long inID) {
	return UniqueIDImpl.valueOf(inID);
    }

    public static StowageLocation stowageLocation(int bay, int row, int tier) {
	return StowageLocationImpl.valueOf(bay, row, tier);
    }

    public static StowageLocation nullLocation() {
	return new NullLocation();
    }

    public static Container nullContainer() {
	return new NullContainer();
    }

    public static BoundingBox boundingBoxWithDimensions(Length inWidth, Length inHeight, Length inDepth) {
	return BoundingBoxImpl.valueOf(inWidth, inHeight, inDepth);
    }

    public static Bounded3DimStack boundedStack(int bay, int row, int tier, Object nullElement) {
	return Bounded3DimStackImpl.valueOf(bay, row, tier, nullElement);
    }

    public static Angle angleWithDegree(double inAngle) {
	return AngleImpl.valueOf(inAngle);
    }
}
