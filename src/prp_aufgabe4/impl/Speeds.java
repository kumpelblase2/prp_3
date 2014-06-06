package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public final class Speeds
{
	private Speeds() {}

	public static Speed speedWithDistanceAndTime(Length inDistance, TimeDiff inTime)
	{
		return SpeedImpl.valueOf(inDistance, inTime);
	}

	public static Speed speedWithMetersPerS(double inSpeed)
	{
		return SpeedImpl.valueOf(inSpeed);
	}
}