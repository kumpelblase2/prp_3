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
public interface Force extends PhysicalUnit<Force>
{
    public double toN();
    public Acceleration div(Mass inMass);
    public Work mul(Length inLength);
}