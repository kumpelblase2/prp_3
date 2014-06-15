
package prp_aufgabe4.impl;

import prp_aufgabe4.Container;
import prp_aufgabe4.Mass;
import prp_aufgabe4.Pallet;
import prp_aufgabe4.Stowage;
import prp_aufgabe4.UniqueID;

public class Entities {
    
    
        
    
        public static Container container(UniqueID id)
        {
                return ContainerImpl.entityOf(id);
        }
        
        public static Container nullContainer()
        {
                return new NullContainer();
        }
        
        public static Container nonContainer()
        {
                return new NonContainer();
        }
        
        public static Stowage containerStowage(int bay, int row, int tier, Mass maxMass) 
        {
                return ContainerStowageImpl.valueOf(bay, row, tier, maxMass);
        }
        
        
        public static Pallet pallet(UniqueID id, Mass mass)
        {
                return PalletImpl.entityOf(id, mass);
        }
        
        public static Pallet nullPallet()
        {
                return new NullPallet();
        }
        
        public static Stowage palletStowage(int bay, int row, int tier, Mass maxMass) {
            return PalletStowageImpl.valueOf(bay, row, tier, maxMass);
        }

    
}
