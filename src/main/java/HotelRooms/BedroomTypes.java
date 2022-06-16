package HotelRooms;

public enum BedroomTypes {



    //constants should be in BLOCK CAPITALS (This is the convention in JAVA)
    SINGLE(1, 2),
    DOUBLE(2, 4),
    TRIPLE(3, 6),
    FAMILY(4, 8),
    ;

    private final int value;
    private final int capacity;

    BedroomTypes(int value, int capacity) {
        this.value = value;
        this.capacity = capacity;
    }


    public int getBedroomTypeValue() {
        return this.value;
    }

    public int getBedroomTypeCapacity() {
        return this.capacity;
    }
}
