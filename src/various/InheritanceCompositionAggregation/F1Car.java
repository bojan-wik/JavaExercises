package various.InheritanceCompositionAggregation;

public class F1Car extends Car {

    public F1Car(String model, int maxSpeed, int yearOfManufacture) {
        super(model, maxSpeed, yearOfManufacture);
    }

    // method/behaviour unique for F1Car
    public void pitStop() {
        System.out.println("pit stop");
    }
}
