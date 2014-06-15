
package prp_aufgabe4.impl;

import prp_aufgabe4.StowageLocation;

public class NullLocation implements StowageLocation{

    @Override
    public int bay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int row() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int tier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isNull() {
        return true;
    }
    
}
