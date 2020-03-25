import java.util.ArrayList;
import java.util.Arrays;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }


    public int getGuests() {
        return this.guests.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean hasCapacity() {
        return this.capacity > this.guests.size();
    }

    public void addGuest(Guest guest) {
        if (hasCapacity()) {
            this.guests.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        if (this.guests.contains(guest)){
            this.guests.remove(guest);
        }
    }
}
