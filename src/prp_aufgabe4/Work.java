/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prp_aufgabe4;

/**
 *
 * @author abq264
 */
public interface Work extends PhysicalUnit<Work>
{
    public double toJ();
    public Power div(TimeDiff inTime);
}