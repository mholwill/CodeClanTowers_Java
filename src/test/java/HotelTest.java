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

        hotel.addBedroom(bedroom1);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);

        guest1 = new Guest("Alan");
        guest2 = new Guest("Malcolm");
        guest3 = new Guest("Louise");
        guest4 = new Guest("Zsolt");
        guest5 = new Guest("Graham");
    }

    //checkAllGuestsInHotel
//    @Test
//    public void checkAllGuestsInHotel(){
//        assertEquals(true, hotel.checkAllGuestsFireAlarm());
//    }

    @Test
    public void addBedroomToHotel(){
        assertEquals(2, hotel.getBedrooms());
    }

    @Test
    public void addConferenceRoomToHotel(){
        assertEquals(2, hotel.getConferenceRooms());
    }

    @Test
    public void checkInGuestToBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        assertEquals(1, hotel.guestsInBedroom(bedroom1));
    }

    @Test
    public void cantCheckGuestInToBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkInGuestToBedroom(guest2, bedroom1);
        assertEquals(1, hotel.guestsInBedroom(bedroom1));
    }

    //checkGuestOutOfBedroom
    @Test
    public void checkGuestOutOfBedroom(){
        hotel.checkInGuestToBedroom(guest1, bedroom1);
        hotel.checkOutGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, hotel.guestsInBedroom(bedroom1));
    }

    //checkGuestInToConferenceRoom
    @Test
    public void checkInGuestToConfrenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        assertEquals(1, hotel.guestsInConferenceRoom(conferenceRoom1));
    }

    //checkGuestOutOfConferenceRoom
    @Test
    public void checkGuestOutOfConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(guest1, conferenceRoom1);
        hotel.checkOutGuestFromConferenceRoom(guest1, conferenceRoom1);
        assertEquals(0, hotel.guestsInConferenceRoom(conferenceRoom1));
    }



}
