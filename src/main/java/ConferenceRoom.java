import java.util.ArrayList;

public class ConferenceRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
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
