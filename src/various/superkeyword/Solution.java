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
        //ChildClass c = new ChildClass();

        // 2)
        ParentClass p = new ChildClass();

        p.methodOne();
    }
}

/**
 * Natrafiłem tutaj na ciekawy koncept. Do tej pory, aby stworzyć obiekt ChildClass, robiłem tak, jak w przypadku 1.
 * Jednak na stronie z zadaniem przedstawiony jest przypadek 2 - używania ChildClass jako ParentClass, który, jak doczytałem,
 * nazywany jest 'object casting' i jest jednym z istotnych aspektów polimorphism. Tutaj konkretnie mam do czynienia z 'upcasting'.
 */
/**
 * Method-overriding nazywany jest także runtime-polymorphism i generalnie dotyka on runtime-objects.
 * Tak więc w Javie możemy przechować child-class-object wewnątrz parent-class-reference (to jest właśnie upcasting)
 * Tutaj ‘p’ przechowuje child-class-object.
 *
 *
 * I am explicitly instantiating a child class object (new ChildClass()) as a member of the parent class (ParentClass).
 * Dzięki temu mogę użyć obiektu 'p', jakby był obiektem klasy 'ParentClass' w każdej sytuacji, gdzie obiekt klasy 'ParentClass' byłby wymagany.
 */