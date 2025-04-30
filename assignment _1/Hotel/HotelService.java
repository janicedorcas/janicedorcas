public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomStatus = roomStatus;
        this.roomType = roomType;
        this.stayDays = stayDays;
    }

public abstract double bookRoom();
public abstract double checkoutGuest();
public abstract double generateBill();

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        this.stayDays = stayDays;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }



    
}

