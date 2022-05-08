/*
 * Author Prateek Mittal
 */

package in.ac.bits.utilities;

import in.ac.bits.utilities.AreaUtil;
import org.junit.jupiter.api.Test;


public class AreaConverterTest {

    @Test
    public void sqkToAcres() {
        double Acre = new AreaUtil.Area().fromSquareMeters(1.25).toAcres();;
        assert(Acre);
    }
    
    @Test
    public void frmSqMetertoSqKilometer() {
        AreaUtil.Area sqm = new AreaUtil.Area().fromSquareMeters(1.25);
        double sqkm = sqm.toSquareKilometers();
        assert(sqkm);

    }

      public void frmSqMetertoAcre() {
        AreaUtil.Area sqm = new AreaUtil.Area().fromSquareMeters(1.25);
        double Acer = sqm.toAcres();
        assert(Acer);

    }
}



