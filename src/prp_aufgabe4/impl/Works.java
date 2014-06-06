/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prp_aufgabe4.impl;

import prp_aufgabe4.Work;

/**
 *
 * @author abq264
 */
public final class Works {
    private Works() {}
    
    public static Work workInJoule(double inValue)
    {
	return WorkImpl.valueOf(inValue);
    }
}
