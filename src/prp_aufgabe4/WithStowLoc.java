
package prp_aufgabe4;

public interface WithStowLoc <S> extends Mutable{
    
    StowageLocation loc();
    
    void setLocNull();
    void setLoc(Stowage stowage, StowageLocation loc);
}
