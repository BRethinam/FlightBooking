

import com.blazedemo.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

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
    public void testBookATicket() {
        BookTrip bookTrip = new BookTrip();
        bookTrip.init(url);
        bookTrip.fromToCity(fromCity, toCity);
        bookTrip.chooseFlight();
        bookTrip.passenger(passenger);

        String confirmationId = bookTrip.bookConfirm();

        assertTrue(!confirmationId.isEmpty());
    }

    // Test case 2 : Check page for find flights
    @Test
    public void testFindFlightPage() {
        BookTrip bookTrip = new BookTrip();
        bookTrip.init(url);
        WebElement findFlights = bookTrip.findFlights(fromCity, toCity);
        String text =  findFlights.getTagName();
        assertEquals("input", text);
    }

    // Test case 3 : Check page  for check flights
    @Test
    public void testChooseFlightPage() {
        BookTrip bookTrip = new BookTrip();
        bookTrip.init(url);
        bookTrip.fromToCity(fromCity, toCity);
        ChooseFlight chooseFlight = new ChooseFlight();
        WebElement flightElement = chooseFlight.chooseFlight(Browser.getDriver());
        String text = flightElement.getTagName();
        assertEquals("input", text);
    }

    // Test case 4 : Check page for passenger data
    @Test

    public void testPassengerPage() {
        BookTrip bookTrip = new BookTrip();
        bookTrip.init(url);
        bookTrip.fromToCity(fromCity, toCity);
        bookTrip.chooseFlight();
        SendPassengerData sndPassenger = new SendPassengerData();
        WebElement passengerChk = sndPassenger.sndPassengerChk(Browser.getDriver());
        String text = passengerChk.getTagName();
        assertEquals("input", text);

    }

    // Test case 5 : To test  on Chrome

    // Test case 6 : To test on IE

    // Test case 7 : To test on Safari

    // Test case 8: Validate input data

    // Test case 7: Validate corporate identity on all pages.

    @After // tearDown()
    public void after() throws Exception {
        Browser.close();
    }


}
