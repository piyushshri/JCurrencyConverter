
/*
Author Prateek Mittal


*/

package in.ac.bits.utilities;

import java.io.Serializable;
import in.ac.bits.model.A;
import in.ac.bits.model.B;

 //Area
 
public class AreaUtil implements Serializable{

    /**
     * AreaUtil.Area()
     * 
     * Ex: double foo = new AreaUtil.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
     */
    public static class Area extends B<F> implements Serializable{    
        
        /*
        Method to perform all conversions within Area class.
        All "to" methods within Area use this method.
        */
        private final double c(F t){
            return k(t.TO_M,me.t.TO_M);
        }
        
        /*
        "from" Methods
        
        Ex: AreaUtil.Area foo = new AreaUtil.Area().fromSquareMeters(1.25); //Variable "foo" will be able to convert 1.25 SquareMeters into any unit of Area
        */
        public final Area fromAcres(double v){return s(this,v, F.AC);}
        public final Area fromAres(double v){return s(this,v, F.A);}
        public final Area fromArpents(double v){return s(this,v, F.AR);}
        public final Area fromBarns(double v){return s(this,v, F.B);}
        public final Area fromCircularInches(double v){return s(this,v, F.CRIN);}
        public final Area fromCircularMils(double v){return s(this,v, F.CRMIL);}
        public final Area fromHectares(double v){return s(this,v, F.HA);}
        public final Area fromHomesteads(double v){return s(this,v, F.HS);}
        public final Area fromRoods(double v){return s(this,v, F.R);}
        public final Area fromSabins(double v){return s(this,v, F.S);}
        public final Area fromSquareCentimeters(double v){return s(this,v, F.C);}
        public final Area fromSquareChains(double v){return s(this,v, F.CH);}
        public final Area fromSquareDecimeters(double v){return s(this,v, F.D);}
        public final Area fromSquareDekameters(double v){return s(this,v, F.DA);}       
        public final Area fromSquareFeet(double v){return s(this,v, F.FT);}
        public final Area fromSquareHectometers(double v){return s(this,v, F.H);}
        public final Area fromSquareInches(double v){return s(this,v, F.IN);}
        public final Area fromSquareKilometers(double v){return s(this,v, F.K);}
        public final Area fromSquareMeters(double v){return s(this,v, F.M);}
        public final Area fromSquareMicrometers(double v){return s(this,v, F.MU);}
        public final Area fromSquareMiles(double v){return s(this,v, F.MI);}
        public final Area fromSquareMillimeters(double v){return s(this,v, F.MIL);}
        public final Area fromSquareNanometers(double v){return s(this,v, F.N);}
        public final Area fromSquarePerches(double v){return s(this,v, F.PE);}
        public final Area fromSquarePoles(double v){return s(this,v, F.PO);}
        public final Area fromSquareRods(double v){return s(this,v, F.ROD);}
        public final Area fromSquareYards(double v){return s(this,v, F.YD);}
        
        /*
        "to" Methods
        
        Ex 1: double bar = foo.toAcres(); //Variable "bar" being of type AreaUtil.Area with "from" value already assigned
        Ex 2: double foobar = new AreaUtil.Area().fromSquareMeters(1.25).toAcres(); //One line conversion from 1.25 SquareMeters to Acres
        */
        public final double toAcres(){return c(F.AC);}
        public final double toAres(){return c(F.A);}
        public final double toCircularInches(){return c(F.CRIN);}
        public final double toCircularMils(){return c(F.CRMIL);}
        public final double toHectares(){return c(F.HA);}
        public final double toHomesteads(){return c(F.HS);}
        public final double toRoods(){return c(F.R);}
        public final double toSabins(){return c(F.S);}
        public final double toSquareCentimeters(){return c(F.C);}
        public final double toSquareChains(){return c(F.CH);}
        public final double toSquareDecimeters(){return c(F.D);}
        public final double toSquareDekameters(){return c(F.DA);}
        public final double toSquareFeet(){return c(F.FT);}
        public final double toSquareHectometers(){return c(F.H);}
        public final double toSquareInches(){return c(F.IN);}
        public final double toSquareKilometers(){return c(F.K);}    
        public final double toSquareMeters(){return c(F.M);}
        public final double toSquareMicrometers(){return c(F.MU);}   
        public final double toSquareMiles(){return c(F.MI);}
        public final double toSquareMillimeters(){return c(F.MIL);}
        public final double toSquareNanometers(){return c(F.N);}   
        public final double toSquarePerches(){return c(F.PE);}
        public final double toSquarePoles(){return c(F.PO);}
        public final double toSquareRods(){return c(F.ROD);}
        public final double toSquareYards(){return c(F.YD);}
        public final double toArpents(){return c(F.AR);}
        public final double toBarns(){return c(F.B);}
    }
}