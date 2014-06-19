/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prp_aufgabe4.impl;

import prp_aufgabe4.Acceleration;
import prp_aufgabe4.Force;
import prp_aufgabe4.Length;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Work;

/**
 *
 * @author abq264
 */
public class ForceImpl implements Force {

    private final double m_value;

    protected ForceImpl(double inValue) {
	this.m_value = inValue;
    }

    @Override
    public double toN() {
	return this.m_value;
    }

    @Override
    public Acceleration div(Mass inMass) {
	return Values.accelerationWithMetersPerSSquared(this.toN() / inMass.toKG());
    }

    @Override
    public Work mul(Length inLength) {
	return Values.workInJoule(this.toN() * inLength.toM());
    }

    @Override
    public Force add(Force inToAdd) {
	return Values.forceInN(this.toN() + inToAdd.toN());
    }

    @Override
    public Force sub(Force inToSub) {
	return Values.forceInN(this.toN() - inToSub.toN());
    }

    @Override
    public Force mul(double inToMultiply) {
	return Values.forceInN(this.toN() * inToMultiply);
    }

    @Override
    public Force div(double inToDivide) {
	return Values.forceInN(this.toN() / inToDivide);
    }

    static ForceImpl valueOf(double inValue) {
	return new ForceImpl(inValue);
    }
}
