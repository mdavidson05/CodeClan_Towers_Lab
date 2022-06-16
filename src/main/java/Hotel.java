import HotelRooms.Bedroom;
import HotelRooms.ConferenceRoom;
import HotelRooms.Guest;
import com.sun.org.apache.xpath.internal.operations.Gt;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Guest> guests;


    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.guests = new ArrayList<Guest>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public  Bedroom findBedroom(int roomNumber) {
        Bedroom foundBedroom = null;
        for (Bedroom bedroom : this.bedrooms) {
            if (bedroom.getBedroomNumber() == roomNumber) {
                foundBedroom = bedroom;
            }
        }
        return foundBedroom;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void checkGuestIn(int roomNumber, ArrayList<Guest> guests){
        Bedroom bedroom = findBedroom(roomNumber);
        if (bedroom !=null && bedroom.isEmpty()){
            for (Guest guest: guests){
                bedroom.checkInGuest(guest);
            }
        }
    }

    public void checkGuestOut(int roomNumber) {
        Bedroom bedroom = findBedroom(roomNumber);
        if (bedroom != null) {
            bedroom.checkOutGuests();
            }
        }

    }

