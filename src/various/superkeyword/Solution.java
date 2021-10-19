package various.superkeyword;

/**
 * https://runestone.academy/runestone/books/published/csjava/Unit9-Inheritance/topic-9-4-super.html
 * ------
 * Natrafiłem tutaj na ciekawy koncept. Do tej pory, aby stworzyć obiekt ChildClass, robiłem tak, jak w przypadku 1.
 * Jednak na stronie z zadaniem przedstawiony jest przypadek 2, który, jak doczytałem, jest przykładem upcastingu.
 */

public class Solution {

    public static void main(String[] args) {

        // 1)
        /*ChildClass c = new ChildClass();
        c.methodOne();*/

        // 2)
        ParentClass p = new ChildClass();
        p.methodOne();
    }
}

/**
 * W tym przypadku rozwiązanie jest takie samo w obu przypadkach (1 i 2): ABDC
 */