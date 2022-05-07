package in.ac.bits.utilities;

import org.junit.jupiter.api.Test;

/**
 * @author Ravi Rai
 */
public class UnitConverterTest {
    @Test
    public void unitConverterCheck{
        UnitConverter unit = new UnitConverter("in", "ft");


        //convert to meter
        double meters = unit.toMeters(40);
        //convert meter to required unit
        double converted = unit.fromMeters(meters);
        assert(converted > 0);

    }
}
