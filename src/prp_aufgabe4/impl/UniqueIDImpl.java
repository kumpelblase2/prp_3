package prp_aufgabe4.impl;

import prp_aufgabe4.UniqueID;

public class UniqueIDImpl implements UniqueID
{
	private final long m_id;

	private UniqueIDImpl(long inID)
	{
		this.m_id = inID;
	}

	@Override
	public long idNumber()
	{
		return this.m_id;
	}

	static UniqueIDImpl valueOf(long inID)
	{
		return new UniqueIDImpl(inID);
	}
}