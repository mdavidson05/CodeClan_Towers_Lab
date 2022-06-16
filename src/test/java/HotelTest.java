import HotelRooms.Bedroom;
import HotelRooms.BedroomTypes;
import HotelRooms.ConferenceRoom;
import HotelRooms.Guest;
import com.beust.ah.A;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom singleRoom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Guest guest2;


    @Before
    public void before() {
        hotel = new Hotel();

        singleRoom = new Bedroom(2,1, BedroomTypes.SINGLE) {
        };
        hotel.addBedroom(singleRoom);
        conferenceRoom = new ConferenceRoom(2, "Hopper") {
        };
        guest = new Guest("Max");
        guest2 = new Guest("Mark");

    };



    @Test
    public void checkHotelCanAddRoom() {
        Bedroom foundBedroom = hotel.findBedroom(1);
        assertEquals(singleRoom, foundBedroom);
    }

    @Test
    public void checkHotelCanAddGuest() {
        String foundGuest = guest.getGuestName();
        assertEquals("Max", foundGuest);
    }

    @Test
    public void canCheckGuestsIntoRoom() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        hotel.checkGuestIn(1, guests);
        assertEquals(1, singleRoom.guestListSize());
    }

    @Test
    public void canRefuseGuestsIfFull() {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(guest);
        guests.add(guest2);
        hotel.checkGuestIn(1, guests);
        hotel.checkGuestOut(1);
        assertEquals(0, singleRoom.guestListSize());

    }

}