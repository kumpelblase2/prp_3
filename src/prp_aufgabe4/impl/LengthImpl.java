package prp_aufgabe4.impl;

import prp_aufgabe4.Globals;
;
import prp_aufgabe4.*;

/**
 * Created by tim_hagemann on 12.05.2014.
 */


class LengthImpl implements Length {

    private final double m_meter;

    protected LengthImpl(double inMeter) {
	this.m_meter = inMeter;
    }

    @Override
    public double toM() {
	return this.m_meter;
    }

    @Override
    public double toFeet() {
	return this.m_meter * Globals.METER_TO_FEET;
    }

    @Override
    public double toNM() {
	return this.m_meter * Globals.METER_TO_NAUTICM;
    }

    @Override
    public Speed div(TimeDiff inTime) {
	return Values.speedWithDistanceAndTime(this, inTime);
    }

    @Override
    public Length add(Length inToAdd) {
	return Values.lengthInM(this.m_meter + inToAdd.toM());
    }

    @Override
    public Length sub(Length inToSub) {
	return Values.lengthInM(this.m_meter - inToSub.toM());
    }

    @Override
    public Length mul(double inToMultiply) {
	return Values.lengthInM(this.m_meter * inToMultiply);
    }

    @Override
    public Length div(double inToDivide) {
	return Values.lengthInM(this.m_meter / inToDivide);
    }

    static LengthImpl valueOf(double inMeter) {
	return new LengthImpl(inMeter);
    }
}
