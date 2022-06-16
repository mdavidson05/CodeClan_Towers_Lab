package HotelRooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(int capacity, String name) {
        super(capacity);
        this.name = name;
    }

    public int getConferenceRoomCapacity() {
        return this.capacity;
    }

    public String getConferenceRoomName() {
        return this.name;
    }
}
