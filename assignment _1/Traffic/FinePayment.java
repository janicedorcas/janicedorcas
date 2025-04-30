class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }

    @Override public void recordViolation() {}
    @Override public void assessFine() {}

    @Override
    public void processPayment() {
        if (paymentStatus.equals("PAID")) {
            System.out.println("Error: Fine already paid.");
        } else {
            paymentStatus = "PAID";
            System.out.printf("Receipt - Driver: %s, Plate: %s, Amount: RWF %,d, Status: %s\n",
                    driverName, vehiclePlate, (int)fineAmount, paymentStatus);
        }
    }
}
