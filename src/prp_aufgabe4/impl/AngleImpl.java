package prp_aufgabe4.impl;

import prp_aufgabe4.Angle;

public class AngleImpl implements Angle
{
	private final double m_angle;

	private AngleImpl(double inAngle)
	{
		this.m_angle = inAngle;
	}

	@Override
	public double angle()
	{
		return this.m_angle;
	}

	@Override
	public Angle add(Angle inToAdd)
	{
		return Values.angleWithDegree(this.angle() + inToAdd.angle());
	}

	@Override
	public Angle sub(Angle inToSub)
	{
		return Values.angleWithDegree(this.angle() - inToSub.angle());
	}

	@Override
	public Angle mul(double inToMultiply)
	{
		return Values.angleWithDegree(this.angle() * inToMultiply);
	}

	@Override
	public Angle div(double inToDivide)
	{
		return Values.angleWithDegree(this.angle() / inToDivide);
	}

	static AngleImpl valueOf(double inValue)
	{
		return new AngleImpl(inValue);
	}
}