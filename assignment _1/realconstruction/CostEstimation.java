
public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String constructorId, String constructorName, double materialBalance, double materialQuantity) {
        super(constructorId, constructorName, materialBalance, materialQuantity);
    }



    @Override
    double receiveMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double useMaterial() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    double estimateCost() {
        double costPerTon;

        if(materialQuantity >=5 && materialQuantity <=15){
            costPerTon=200000;
        }else if(materialQuantity >15){
            costPerTon=180000;
        }else{
            System.out.println("invalid materialQuantity");
            return 0;
        }

        double TotalCost= materialQuantity * costPerTon;
        System.out.printf("Contractor ID: %s\nContractor Name: %s\nQuantity Used: %.2f tons\nTotal Cost: RWF %, .2f\n",
                constructorId, constructorName, materialQuantity, TotalCost);

    
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
