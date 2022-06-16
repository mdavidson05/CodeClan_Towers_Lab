package HotelRooms;

import java.util.ArrayList;

public abstract class Room {

    int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

    public int guestListSize() {
        return this.guests.size();
    }

    public boolean isEmpty() {
        return this.guests.size() == 0;
    }

    public void checkInGuest(Guest guest) {
        if (this.guestListSize() < this.capacity) {
            this.guests.add(guest);
        }
    }

    public boolean isFull(){
        return this.guestListSize() > 0;
    }

    public void checkOutGuests() {
        if (this.isFull()){
            this.guests.clear();
        }
    }
}

