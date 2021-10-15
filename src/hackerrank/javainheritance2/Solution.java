package hackerrank.javainheritance2;

public class Solution {

    public static void main(String[] args) {

        Adder adder = new Adder();
        System.out.println(adder.add(22, 3));
        System.out.println(adder.getClass().getName());
        System.out.println(adder.getClass().getSuperclass().getName());
    }
}
