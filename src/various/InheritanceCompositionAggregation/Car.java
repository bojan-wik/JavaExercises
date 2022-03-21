package various.InheritanceCompositionAggregation;

public class Car {

    // common car fields (states)
    private String model;
    private int maxSpeed;
    private int yearOfManufacture;

    // constructor
    public Car(String model, int maxSpeed, int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    // common car methods (behaviours)
    public void gas() {
        System.out.printf("%s: gas\n", this.model);
    }

    public void brake() {
        System.out.printf("%s: brake\n", this.model);
    }

    // getters
    public String getModel(){
        return this.model;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }
}