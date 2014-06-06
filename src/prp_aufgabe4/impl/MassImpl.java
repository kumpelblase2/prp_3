/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prp_aufgabe4.impl;

import prp_aufgabe4.Mass;

/**
 *
 * @author abq264
 */
public class MassImpl implements Mass
{
    private final double m_value;
    
    protected MassImpl(double inValue)
    {
	this.m_value = inValue;
    }
    
    @Override
    public Mass add(Mass inToAdd) {
	return Values.massInKG(this.toKG() + inToAdd.toKG());
    }

    @Override
    public Mass sub(Mass inToSub) {
	return Values.massInKG(this.toKG() - inToSub.toKG());
    }

    @Override
    public Mass mul(double inToMultiply) {
	return Values.massInKG(this.toKG() * inToMultiply);
    }

    @Override
    public Mass div(double inToDivide) {
	return Values.massInKG(this.toKG() / inToDivide);
    }

    @Override
    public double toKG() {
	return this.m_value;
    }
    
    protected static MassImpl valueOf(double inValue)
    {
	return new MassImpl(inValue);
    }
}