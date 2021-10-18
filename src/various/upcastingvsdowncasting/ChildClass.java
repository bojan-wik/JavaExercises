package various.upcastingvsdowncasting;

public class ChildClass extends ParentClass {

    int id;

    @Override
    void method() {
        System.out.println("Method from child-class");
    }
}
