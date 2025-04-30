public class RoomBooking extends HotelService {

    public RoomBooking(String guestId, String guestName, String roomStatus, String roomType, int stayDays) {
        super(guestId, guestName, roomStatus, roomType, stayDays);
    }


    @Override
    public double bookRoom() {

        if(stayDays >=1 && stayDays <=30){
            if(roomStatus.equals("AVAILABLE")){
                roomStatus="OCCUPIED";
                System.out.println("Booking is confirmed for" +guestName+ "Room is now occupied");
            }else {
                System.out.println("Rooms are already occupied");
            }
        }else {
                System.out.println("stay days must be between 1 and 30 days");
            }
        
        return 0;
    }

    @Override
    public double checkoutGuest() {
        return 0;
    }

    @Override
    public double generateBill() {
        return 0;
    }
    
}
