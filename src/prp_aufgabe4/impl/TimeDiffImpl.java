package prp_aufgabe4.impl;

import prp_aufgabe4.TimeDiff;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
class TimeDiffImpl implements TimeDiff
{
	private final double m_seconds;

	TimeDiffImpl(double inSeconds)
	{
		this.m_seconds = inSeconds;
	}

	@Override
	public double toS()
	{
		return this.m_seconds;
	}

	@Override
	public TimeDiff add(TimeDiff inToAdd)
	{
		return TimeDiffs.timeInSeconds(this.toS() + inToAdd.toS());
	}

	@Override
	public TimeDiff sub(TimeDiff inToSub)
	{
		return TimeDiffs.timeInSeconds(this.toS() - inToSub.toS());
	}

	@Override
	public TimeDiff mul(double inToMultiply)
	{
		return TimeDiffs.timeInSeconds(this.toS() * inToMultiply);
	}

	@Override
	public TimeDiff div(double inToDivide)
	{
		return TimeDiffs.timeInSeconds(this.toS() / inToDivide);
	}

	static TimeDiffImpl valueOf(double inSeconds)
	{
		return new TimeDiffImpl(inSeconds);
	}
}