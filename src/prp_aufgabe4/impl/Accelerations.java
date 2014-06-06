package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public final class Accelerations
{
	private Accelerations() {}

	public static Acceleration accelerationWithSpeedAndTime(Speed inSpeed, TimeDiff inTimeDiff)
	{
		return AccelerationImpl.valueOf(inSpeed, inTimeDiff);
	}

	public static Acceleration accelerationWithMetersPerSSquared(double inAcceleration)
	{
		return AccelerationImpl.valueOf(inAcceleration);
	}
}