package in.ac.bits.utilities;

import in.ac.bits.model.Currency;
import jdk.internal.org.xml.sax.InputSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author Piyush Shrivastava
 */
public class CurrencyConverter {
    static String API_URL = "https://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml";
    static Document doc;

    private static void init() {
        try {
            URL url = new URL(API_URL);
            URLConnection conn = url.openConnection();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(conn.getInputStream());

        } catch (Exception e) {
            System.out.println("Cannot get exchange rates from the server");
        }
    }

    public static double convertCurrency(double amount, Currency from, Currency to) {
        init();
        Element element = doc.getDocumentElement();
        NodeList elements = element.getChildNodes();
        NodeList cubes = elements.item(5).getChildNodes();
        double exchangeRateFrom = 0;
        double exchangeRateTo = 0;

        for(int i = 0; i < cubes.getLength(); i++) {
            Node cube = cubes.item(i);
            if(cube.getAttributes().getNamedItem("currency").getNodeValue().equals(from)) {
                String rate = cube.getAttributes().getNamedItem("rate").getNodeValue();
                exchangeRateFrom = Double.parseDouble(rate);
            }
        }

        for(int i = 0; i < cubes.getLength(); i++) {
            Node cube = cubes.item(i);
            if(cube.getAttributes().getNamedItem("currency").getNodeValue().equals(to)) {
                String rate = cube.getAttributes().getNamedItem("rate").getNodeValue();
                exchangeRateTo = Double.parseDouble(rate);
            }
        }

        double usdValue = amount / exchangeRateFrom;
        double convertedValue = usdValue * exchangeRateTo;

        return convertedValue;
    }
}
