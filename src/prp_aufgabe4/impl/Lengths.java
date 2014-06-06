package prp_aufgabe4.impl;

import de.infinityblade.uni.cargame.Globals;
import prp_aufgabe4.Length;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public final class Lengths
{
	private Lengths() {}

	public static Length lengthInM(double inMeter)
	{
		return LengthImpl.valueOf(inMeter);
	}

	public static Length lengthInFeet(double inFeet)
	{
		return LengthImpl.valueOf(inFeet / Globals.METER_TO_FEET);
	}

	public static Length lengthInNauticMiles(double inMiles)
	{
		return LengthImpl.valueOf(inMiles / Globals.METER_TO_NAUTICM);
	}
}