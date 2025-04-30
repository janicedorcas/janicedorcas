

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String constructorId, String constructorName, double materialBalance, double materialQuantity) {
        super(constructorId, constructorName, materialBalance, materialQuantity);
    }


    @Override
    double receiveMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double useMaterial() {
        if(materialBalance - materialQuantity>=2){
            materialBalance -= materialQuantity;
            System.out.println("Material used successfully Remaining balance:" +materialBalance);
        }else{
            System.out.println("insuffiency balance");
        }
        return 0;
        
    }

    @Override
    double estimateCost() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
