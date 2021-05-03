package com.blazedemo;

import org.openqa.selenium.WebElement;

public class BookTrip {

    public void init(String url) {
        Browser.goTo(url);
    }

    public void fromToCity(String fromCity, String toCity) {
        FromToCity fromToCity = new FromToCity();
        fromToCity.goTo(Browser.getDriver(), fromCity, toCity);
    }

    public WebElement findFlights(String fromCity, String toCity) {
        FromToCity fromToCity = new FromToCity();
        return fromToCity.findFlights(Browser.getDriver(), fromCity, toCity);
    }

    public void chooseFlight() {
        ChooseFlight chooseFlight = new ChooseFlight();
        chooseFlight.goTo(Browser.getDriver());
    }

    public void passenger(Passenger passenger) {
        SendPassengerData sendPassengerData = new SendPassengerData();
        sendPassengerData.goTo(Browser.getDriver(), passenger);
    }

    public String bookConfirm() {
        BookConfirm bookConfirm = new BookConfirm();
        return bookConfirm.goTo(Browser.getDriver());
    }
}
