

public abstract class ConstructionMaterial {

    protected String constructorId;
    protected String constructorName;
    protected double materialQuantity;
   protected double materialBalance;

    public ConstructionMaterial(String constructorId, String constructorName, double materialBalance, double materialQuantity) {
        this.constructorId = constructorId;
        this.constructorName = constructorName;
        this.materialBalance = materialBalance;
        this.materialQuantity = materialQuantity;
    }

    abstract double receiveMaterial();
    abstract double useMaterial();
    abstract double estimateCost();

    public String getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(String constructorId) {
        this.constructorId = constructorId;
    }

    public String getConstructorName() {
        return constructorName;
    }

    public void setConstructorName(String constructorName) {
        this.constructorName = constructorName;
    }

    public double getMaterialQuantity() {
        return materialQuantity;
    }

    public void setMaterialQuantity(double materialQuantity) {
        this.materialQuantity = materialQuantity;
    }

    public double getMaterialBalance() {
        return materialBalance;
    }

    public void setMaterialBalance(double materialBalance) {
        this.materialBalance = materialBalance;
    }

 
}
