package prp_aufgabe4.impl;

import prp_aufgabe4.TimeDiff;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public final class TimeDiffs
{
	private TimeDiffs()
	{
	}

	public static TimeDiff timeInSeconds(double inSeconds)
	{
		return TimeDiffImpl.valueOf(inSeconds);
	}

	public static TimeDiff timeInMilliseconds(double inMilliSeconds)
	{
		return TimeDiffImpl.valueOf(inMilliSeconds / 1000);
	}
}
