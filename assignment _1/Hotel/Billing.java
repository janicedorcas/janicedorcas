public class Billing extends HotelService {

    public Billing(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }


    @Override
    public double bookRoom() {
        return 0;
    }

    @Override
    public double checkoutGuest() {
        return 0;
    }

    @Override
public double generateBill() {
    int costPerNight;
    switch (roomType.toUpperCase()) {
        case "STANDARD":
            costPerNight = 50000;
            break;
        case "DELUXE":
            costPerNight = 80000;
            break;
        case "SUITE":
            costPerNight = 120000;
            break;
        default:
            System.out.println("Invalid room type.");
            return 0;
    }
    int totalCost = stayDays * costPerNight;
    System.out.printf("Guest ID: %s\nGuest Name: %s\nRoom Type: %s\nStay Days: %d\nTotal Bill: RWF %,d\n",
            guestId, guestName, roomType, stayDays, totalCost);
    return 0;
}

    
}
