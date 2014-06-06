package prp_aufgabe4.impl;

import prp_aufgabe4.*;

/**
 * Created by tim_hagemann on 12.05.2014.
 */
public class SpeedImpl implements Speed
{
	private final double m_speed;

	protected SpeedImpl(Length inDistance, TimeDiff inTime)
	{
		this(inDistance.toM() / inTime.toS());
	}

	protected SpeedImpl(double inSpeed)
	{
		this.m_speed = inSpeed;
	}

	@Override
	public double toMPerSeconds()
	{
		return this.m_speed;
	}

	@Override
	public Length mul(TimeDiff inTime)
	{
		return Values.lengthInM(this.toMPerSeconds() * inTime.toS());
	}

	@Override
	public Acceleration div(TimeDiff inTime)
	{
		return Values.accelerationWithMetersPerSSquared(this.toMPerSeconds() / inTime.toS());
	}

	@Override
	public Speed add(Speed inToAdd)
	{
		return  Values.speedWithMetersPerS(this.toMPerSeconds() + inToAdd.toMPerSeconds());
	}

	@Override
	public Speed sub(Speed inToSub)
	{
		return Values.speedWithMetersPerS(this.toMPerSeconds() - inToSub.toMPerSeconds());
	}

	@Override
	public Speed mul(double inToMultiply)
	{
		return Values.speedWithMetersPerS(this.toMPerSeconds() * inToMultiply);
	}

	@Override
	public Speed div(double inToDivide)
	{
		return Values.speedWithMetersPerS(this.toMPerSeconds() / inToDivide);
	}

	static SpeedImpl valueOf(Length inDistance, TimeDiff inTime)
	{
		return new SpeedImpl(inDistance, inTime);
	}

	static SpeedImpl valueOf(double inSpeed)
	{
		return new SpeedImpl(inSpeed);
	}
}