package various.upcastingvsdowncasting;

public class Solution {

    public static void main(String[] args) {

        // upcasting
        ParentClass p = new ChildClass();
        p.name = "GeeksforGeeks";
        System.out.println(p.name);
        p.method();
    }
}
