import HotelRooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    Room room;

    @Before
    public void before() {
        room = new Room(2) {
        };

    }

    @Test
    public void checkRoomHasCapacity() {
        assertEquals(2, room.getRoomCapacity());
    }

}