import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;

    @Before
    public void setUp(){
        hotel = new Hotel("CodeClan Hotel");
        bedroom1 = new Bedroom(2, 1, "single");
        bedroom2 = new Bedroom(3, 2, "double");
        conferenceRoom1 = new ConferenceRoom("Hopper", 3);
        conferenceRoom2 = new ConferenceRoom("Corona", 6);
        guest1 = new Guest("Alan");
        guest2 = new Guest("Malcolm");
        guest3 = new Guest("Louise");
        guest4 = new Guest("Zsolt");
        guest5 = new Guest("Graham");
    }

    //checkAllGuestsInHotel
    @Test
    public void checkAllGuestsInHotel(){
        assertEquals(true, hotel.checkAllGuestsFireAlarm());
    }

    //checkGuestInToBedroom

    //checkGuestOutOfBedroom

    //checkGuestInToConferenceRoom

    //checkGuestOutOfConferenceRoom




}
