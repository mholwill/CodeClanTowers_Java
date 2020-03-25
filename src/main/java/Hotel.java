import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }


//    public boolean checkAllGuestsFireAlarm() {
//        if (this.bedrooms.guest.size() && this.conferenceRooms.contains(0)) {
//            return true;
//        }
//        return false;
//    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }


    public int getBedrooms() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int getConferenceRooms() {
        return this.conferenceRooms.size();
    }


    public int guestsInBedroom(Bedroom bedroom) {
        return bedroom.getGuests();
    }

    public void checkInGuestToBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }


    public void checkOutGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public int guestsInConferenceRoom(ConferenceRoom conferenceRoom){
        return conferenceRoom.getGuests();
    }

    public void checkInGuestToConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }
}
