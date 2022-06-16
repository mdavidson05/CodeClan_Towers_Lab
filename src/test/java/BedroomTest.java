import HotelRooms.Bedroom;
import HotelRooms.BedroomTypes;
import HotelRooms.ConferenceRoom;
import HotelRooms.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2,1, BedroomTypes.SINGLE) {
        };

    }

    @Test
    public void checkBedroomCapacity() {
        assertEquals(2, bedroom.getBedroomCapacity());
    }

    @Test
    public void checkBedRoomHasNumber() {
        assertEquals(1, bedroom.getBedroomNumber());
    }

    @Test
    public void checkBedRoomHasType() {
        assertEquals(BedroomTypes.SINGLE, bedroom.getBedroomType());
    }

}