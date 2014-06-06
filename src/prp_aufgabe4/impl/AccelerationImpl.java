package prp_aufgabe4.impl;

import prp_aufgabe4.*;

public class AccelerationImpl implements Acceleration
{
	private final double m_acceleration;

	protected AccelerationImpl(Speed inSpeed, TimeDiff inTime)
	{
		this(inSpeed.toMPerSeconds() / inTime.toS());
	}

	protected AccelerationImpl(double inAcceleration)
	{
		this.m_acceleration = inAcceleration;
	}

	@Override
	public double toMeterPerSSquared()
	{
		return this.m_acceleration;
	}

	@Override
	public Speed mul(TimeDiff inTime)
	{
		return Values.speedWithMetersPerS(this.toMeterPerSSquared() * inTime.toS());
	}

	@Override
	public Acceleration add(Acceleration inToAdd)
	{
		return Values.accelerationWithMetersPerSSquared(this.toMeterPerSSquared() + inToAdd.toMeterPerSSquared());
	}

	@Override
	public Acceleration sub(Acceleration inToSub)
	{
		return Values.accelerationWithMetersPerSSquared(this.toMeterPerSSquared() - inToSub.toMeterPerSSquared());
	}

	@Override
	public Acceleration mul(double inToMultiply)
	{
		return Values.accelerationWithMetersPerSSquared(this.toMeterPerSSquared() * inToMultiply);
	}

	@Override
	public Acceleration div(double inToDivide)
	{
		return Values.accelerationWithMetersPerSSquared(this.toMeterPerSSquared() / inToDivide);
	}
	
	@Override
	public Force mul(Mass inMass) {
	    return Values.forceInN(this.toMeterPerSSquared() * inMass.toKG());
	}

	static AccelerationImpl valueOf(Speed inSpeed, TimeDiff inTimeDiff)
	{
		return new AccelerationImpl(inSpeed, inTimeDiff);
	}

	static AccelerationImpl valueOf(double inAcceleration)
	{
		return new AccelerationImpl(inAcceleration);
	}
}