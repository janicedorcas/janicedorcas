public class GuestCheckout extends HotelService {

    public GuestCheckout(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }


    @Override
    public double bookRoom() {
        return 0;
    }

    @Override
    public double checkoutGuest() {
        if(roomStatus.equals("OCCUPIED")){
            roomStatus="AVAILABLE";
            System.out.println("Check out succesfully. Room is now available");

        }else{
            System.out.println("room is already available");
        }
        return 0;
       
    }

    @Override
    public double generateBill() {
        return 0;
    }
    
}
