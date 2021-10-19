package various.upcastingvsdowncasting;

public class Solution {

    public static void main(String[] args) {


        // Tu zachodzi upcasting implicitly - obiekt 'p' jest obiektem child-class, ale jest upcastowany to parent-class
        ParentClass p = new ChildClass();
        // obiekt 'p' ma dostęp do memberów parent-class (tutaj do zmiennej 'name')
        p.name = "GeeksforGeeks";
        System.out.println(p.name);
        // jednocześnie niemożliwy jest dostęp do wszystkich memberów child-class (tutaj do zmiennej 'id'),...
        // p.id = 1;
        // ...tylko do wyszczególnionych np. nadpisanych metod
        p.method();

        // Tutaj tworzę standardowo obiekt klasy child-class (bez upcastingu) żeby poznać różnice
        ChildClass childClass = new ChildClass();
        // tak samo: obiekt 'childClass' ma dostęp do memberów parent-class, z racji dziedziczenia
        childClass.name = "blabla";
        System.out.println(childClass.name);
        // różnica: obiekt ma też dostęp do wszystkich memberów child-class...
        childClass.id = 5;
        System.out.println(childClass.id);
        // ... łącznie z napisanymi metodami
        childClass.method();

        // Próbuję zrobić downcasting (implicitly), ale jest to niemożliwe -> error
        //ChildClass c = new ParentClass();
        // Jedyna możliwość to zrobić downcasting explicitly
        ChildClass c = (ChildClass)p;
        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
    }
}
