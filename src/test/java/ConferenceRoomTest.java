import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("Hopper", 50);
        guest1 = new Guest("Graham");
    }

    @Test
    public void checkRoomEmpty() {
        assertEquals(0, conferenceRoom.getGuests());
    }

    // add guest
    @Test
    public void checkAddGuestToRoom() {
        conferenceRoom.addGuest(guest1);
        assertEquals(1, conferenceRoom.getGuests());
    }

    // remove guest
    @Test
    public void checkRemoveGuestFromRoom(){
        conferenceRoom.addGuest(guest1);
        conferenceRoom.removeGuest(guest1);
        assertEquals(0, conferenceRoom.getGuests());
    }

    @Test
    public void checkCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }
}
