import HotelRooms.Guest;
import HotelRooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {
    Guest guest;

    @Before
    public void before() {
        guest = new Guest("Max") {
        };

    }

    @Test
    public void checkGuestHasName() {
        assertEquals("Max", guest.getGuestName());
    }

}