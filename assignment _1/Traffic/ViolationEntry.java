class ViolationEntry extends TrafficRecord {
    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }
    

    @Override
    public void recordViolation() {
        if (violationType.equalsIgnoreCase("SPEEDING") ||
            violationType.equalsIgnoreCase("RED_LIGHT") ||
            violationType.equalsIgnoreCase("NO_HELMET") ||
            violationType.equalsIgnoreCase("DUI")) {
            System.out.println("Violation recorded successfully.");
            System.out.println("Driver: " + driverName + ", Plate: " + vehiclePlate + ", Type: " + violationType);
        } else {
            System.out.println("Error: Invalid violation type.");
        }
    }

    @Override public void assessFine() {}
    @Override public void processPayment() {}
}