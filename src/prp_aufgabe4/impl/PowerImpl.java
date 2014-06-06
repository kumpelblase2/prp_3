/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prp_aufgabe4.impl;

import prp_aufgabe4.Force;
import prp_aufgabe4.Power;
import prp_aufgabe4.Speed;
import prp_aufgabe4.TimeDiff;
import prp_aufgabe4.Work;

/**
 *
 * @author abq264
 */
public class PowerImpl implements Power {

    private final double m_value;
    
    protected PowerImpl(double inValue)
    {
	this.m_value = inValue;
    }
    
    @Override
    public double toWatt() {
	return this.m_value;
    }

    @Override
    public Work mul(TimeDiff inLength) {
	return Works.workInJoule(this.toWatt() * inLength.toS());
    }

    @Override
    public Power add(Power inToAdd) {
	return Powers.powerInWatt(this.toWatt() + inToAdd.toWatt());
    }

    @Override
    public Power sub(Power inToSub) {
	return Powers.powerInWatt(this.toWatt() - inToSub.toWatt());
    }

    @Override
    public Power mul(double inToMultiply) {
	return Powers.powerInWatt(this.toWatt() * inToMultiply);
    }

    @Override
    public Power div(double inToDivide) {
	return Powers.powerInWatt(this.toWatt() / inToDivide);
    }
    
    @Override
    public Force div(Speed inSpeed) {
	return Forces.forceInN(this.toWatt() / inSpeed.toMPerSeconds());
    }
	
    
    static PowerImpl valueOf(double inValue)
    {
	return new PowerImpl(inValue);
    }
}