/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prp_aufgabe4.impl;

import prp_aufgabe4.Power;
import prp_aufgabe4.TimeDiff;
import prp_aufgabe4.Work;

/**
 *
 * @author abq264
 */
public class WorkImpl implements Work {

    private final double m_value;

    protected WorkImpl(double inValue) {
	this.m_value = inValue;
    }

    @Override
    public double toJ() {
	return this.m_value;
    }

    @Override
    public Power div(TimeDiff inTime) {
	return Values.powerInWatt(this.toJ() / inTime.toS());
    }

    @Override
    public Work add(Work inToAdd) {
	return Values.workInJoule(this.toJ() + inToAdd.toJ());
    }

    @Override
    public Work sub(Work inToSub) {
	return Values.workInJoule(this.toJ() - inToSub.toJ());
    }

    @Override
    public Work mul(double inToMultiply) {
	return Values.workInJoule(this.toJ() * inToMultiply);
    }

    @Override
    public Work div(double inToDivide) {
	return Values.workInJoule(this.toJ() * inToDivide);
    }

    static WorkImpl valueOf(double inValue) {
	return new WorkImpl(inValue);
    }
}
