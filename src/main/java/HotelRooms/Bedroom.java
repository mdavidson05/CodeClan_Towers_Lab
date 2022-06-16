package HotelRooms;

public class Bedroom extends Room{

    public long getBedroomType;
    private int roomNumber;
    private BedroomTypes bedroomTypes;

    public Bedroom(int capacity, int roomNumber, BedroomTypes bedroomTypes) {
        super(capacity);
        this.roomNumber = roomNumber;
        this.bedroomTypes = bedroomTypes;
    }

    public int getBedroomCapacity() {
        return this.capacity;
    }

    public int getBedroomNumber() {
        return this.roomNumber;
    }

    public BedroomTypes getBedroomType() {
        return this.bedroomTypes;
    }




}
