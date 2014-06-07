package prp_aufgabe4.impl;

import prp_aufgabe4.Name;

public class NameImpl implements Name
{
	private final String m_name;

	private NameImpl(String inName)
	{
		this.m_name = inName;
	}

	@Override
	public String nameString()
	{
		return this.m_name;
	}

	static NameImpl valueOf(String inName)
	{
		return new NameImpl(inName);
	}
}