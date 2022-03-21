package various.InheritanceCompositionAggregation;

public class Solution {

    public static void main(String[] args) {

        Truck truck = new Truck("Star", 80, 1990);
        System.out.println(truck.getModel());
        truck.brake();

        Sedan sedan = new Sedan("Opel Astra", 110, 1998);
        System.out.println(sedan.getMaxSpeed());
        sedan.gas();

        F1Car f1Car = new F1Car("BMW Sauber", 350, 2022);
        System.out.println(f1Car.getYearOfManufacture());
        f1Car.pitStop();
    }
}
