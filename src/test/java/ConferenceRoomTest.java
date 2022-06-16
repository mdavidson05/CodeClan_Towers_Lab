import HotelRooms.ConferenceRoom;
import HotelRooms.Guest;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(2, "Hopper") {
        };

    }

    @Test
    public void checkConferenceRoomCapacity() {
        assertEquals(2, conferenceRoom.getConferenceRoomCapacity());
    }

    @Test
    public void checkConferenceRoomHasName() {
        assertEquals("Hopper", conferenceRoom.getConferenceRoomName());
    }

}