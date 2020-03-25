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


    public boolean checkAllGuestsFireAlarm() {
        if (this.bedrooms.size() == 0 && this.conferenceRooms.size() == 0) {
            return true;
        }
        return false;
    }
}
