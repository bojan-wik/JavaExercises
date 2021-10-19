package various.upcasting;

public class Solution {

    public static void main(String[] args) {

        // Parent p = new Child();
        Animal a = new Fish();
        a.name = "Gold Fish";
        System.out.println(a.name);
        //a.color = "Orange";
        a.nature();

        // Child c = new Child();
        Fish f = new Fish();
        f.name = "śledzik";
        System.out.println(f.name);
        f.color = "szary";
        System.out.println(f.color);
        f.nature();
    }
}
