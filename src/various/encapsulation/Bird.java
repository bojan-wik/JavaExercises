package various.encapsulation;

/**
 * Encapsulation
 * https://www.geeksforgeeks.org/understanding-encapsulation-inheritance-polymorphism-abstraction-in-oops/?ref=rp
 */

public class Bird {

    // access-modifier zmiennych ustawiam jako private
    private String color = "grey";
    private int legs;

    /**
     * W zależności od potrzeb tworzę metody setters, lub getters, w które 'opakowuję' zmienne, które wcześniej ustawiłem jako private.
     * The idea is to simply enclose the initialization and retrieval of the attributes in a method instead of directly referring the attribute directly.
     */

    /**
     * Setters - give us complete control in setting the value to the attribute and help us to restrict the unnecessary changes.
     * For example, if a pigeon is created(born) with a grey colour, it doesn’t change until the pigeon dies.
     * So, a user who is using simply shouldn’t be able to change the colour as per his wish.
     * W tym przypadku metoda setColor() jest zakomentowana - nie daję możliwości zmiany koloru.
     */
    /*public void setColor(String color) {
        this.color = color;
    }*/
    public void setLegs(int legs) {
        this.legs = legs;
    }

    /**
     * Getters
     */
    public String getColor() {
        return this.color;
    }
    public int getLegs() {
        return this.legs;
    }

    public void eat() {
        System.out.println("This bird is eating");
    }
    public void fly() {
        System.out.println("This bird is flying");
    }
}
