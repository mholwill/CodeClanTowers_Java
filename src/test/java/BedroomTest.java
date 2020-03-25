import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void setUp() {
        bedroom = new Bedroom(3, 2, "double");
        guest1 = new Guest("Malcolm");
    }

    //check room empty
    @Test
    public void checkRoomEmpty() {
        assertEquals(0, bedroom.getGuests());
    }

    // add guest
    @Test
    public void checkAddGuestToRoom() {
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getGuests());
    }

    // remove guest
    @Test
    public void checkRemoveGuestFromRoom(){
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0, bedroom.getGuests());
    }

    @Test
    public void checkCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }
}
