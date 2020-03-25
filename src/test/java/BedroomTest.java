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


    // remove guest


    //check capacity



}
