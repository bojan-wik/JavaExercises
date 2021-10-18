package various.superkeyword;

public class ChildClass extends ParentClass
{
    public void methodOne()
    {
        super.methodOne();
        System.out.println("C");
    }

    public void methodTwo()
    {
        super.methodTwo();
        System.out.println("D");
    }
}
