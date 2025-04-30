class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override public void recordViolation() {}

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING": fineAmount = 50000; break;
            case "RED_LIGHT": fineAmount = 80000; break;
            case "NO_HELMET": fineAmount = 30000; break;
            case "DUI": fineAmount = 150000; break;
            default:
                System.out.println("Error: Unknown violation type.");
                return;
        }
        System.out.printf("Driver: %s | Violation: %s | Fine: RWF %,d\n", driverName, violationType, (int)fineAmount);
    }

    @Override public void processPayment() {}
}
