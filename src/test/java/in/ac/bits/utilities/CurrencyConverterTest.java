package in.ac.bits.utilities;

import in.ac.bits.model.Currency;
import org.junit.jupiter.api.Test;

/**
 * @author Piyush Shrivastava
 */
public class CurrencyConverterTest {

    @Test
    public void convertsCurrency() {
        double converted = CurrencyConverter.convertCurrency(100, Currency.USD, Currency.INR);
        assert(converted > 0);
    }
}
