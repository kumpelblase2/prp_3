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
public interface Power extends PhysicalUnit<Power> {

    public double toWatt();

    public Work mul(TimeDiff inLength);

    public Force div(Speed inSpeed);
}
