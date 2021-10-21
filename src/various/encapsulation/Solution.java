package various.encapsulation;

public class Solution {

    public static void main(String[] args) {

        Pigeon pigeon = new Pigeon();

        /*pigeon.color = "gray";
        pigeon.legs = 4;*/
        pigeon.setLegs(4);

        /*System.out.println(pigeon.color);
        System.out.println(pigeon.legs);*/
        System.out.println(pigeon.getColor());
        System.out.println(pigeon.getLegs());

        pigeon.eat();
        pigeon.fly();
    }
}
