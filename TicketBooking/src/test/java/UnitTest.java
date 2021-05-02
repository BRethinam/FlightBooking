

import com.blazedemo.BookTrip;
import com.blazedemo.Browser;
import com.blazedemo.Passenger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class UnitTest {
    private String url;
    private String fromCity;
    private String toCity;
    private Passenger passenger;

    @Before // setup()
    public void before() throws Exception {
        url = "https://blazedemo.com";

        fromCity = "Boston";
        toCity = "London";

        String inputName = "Bala Rethinam";
        String address = "333 Sheepfold Lane";
        String city = "Amersham";
        String state = "Bucks";
        String zipCode = "12334";
        String cardType = "Visa";
        String creditCardNumber = "1234 1234 1234 1234";
        String creditCardYear = "2022";
        String nameOnCard = "B Rethinam";

        passenger = new Passenger();
        passenger.setInputName(inputName);
        passenger.setAddress(address);
        passenger.setCity(city);
        passenger.setState(state);
        passenger.setZipCode(zipCode);
        passenger.setCardType(cardType);
        passenger.setCreditCardNumber(creditCardNumber);
        passenger.setCreditCardYear(creditCardYear);
        passenger.setNameOnCard(nameOnCard);
    }

    @Test
    // Test case 1 : To test  on firefox
    public void bookATicket() {
        BookTrip bookTrip = new BookTrip();
        bookTrip.init(url);
        bookTrip.fromToCity(fromCity, toCity);
        bookTrip.chooseFlight();
        bookTrip.passenger(passenger);

        String confirmationId = bookTrip.bookConfirm();

        assertTrue(!confirmationId.isEmpty());
    }

    // Test case 2 : To test  on Chrome

    // Test case 3 : To test on IE

    // Test case 4 : To test on Safari

    // Test case 5: Validate input data

    // Test case 6: Validate navigation to the  rightful page.

    // Test case 7: Validate corporate identity on all pages.

    @After // tearDown()
    public void after() throws Exception {
        Browser.close();
    }


}
