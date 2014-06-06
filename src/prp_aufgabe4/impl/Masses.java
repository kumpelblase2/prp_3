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
public final class Masses {
    private Masses(){}
    
    public static Mass massInKG(double inValue)
    {
	return MassImpl.valueOf(inValue);
    }
}
