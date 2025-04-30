
public class MaterialDelivery extends ConstructionMaterial {

    public MaterialDelivery(String constructorId, String constructorName, double materialBalance, double materialQuantity) {
        super(constructorId, constructorName, materialBalance, materialQuantity);
    }



    @Override
    double receiveMaterial() {
        if (materialQuantity >= 1 && materialQuantity <= 10) {
            materialBalance += materialQuantity;
            System.out.println("Material delivered successfully. New balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Material delivery must be between 1 and 10 tons.");
        }
        return 0;
        
    }

    @Override
    double useMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double estimateCost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
