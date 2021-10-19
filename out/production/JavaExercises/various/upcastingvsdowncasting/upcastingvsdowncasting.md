**Typecasting** - polega na konwersji jednego data-type w drugi data-type, może zajść:
    a) domyślnie (implicitly),
    b) na wyraźne polecenie (explicitly).

Tak samo jak data-types, tak obiekty mogą podlegać typecastingowi. W przypadku obiektów mamy tylko ich dwa typy:
    a) parent-object
    b) child-object

Stąd też typecasting obiektów występuje tylko w dwóch wersjach:
    a) child-object -> parent-object (**upcasting**)
    b) parent-object -> child-object (**downcasting**)

**Upcasting**:
    a) może być zrobiony domyślnie (implicitly),
    b) daje możliwość dostępu do memberów parent-class
    c) jednocześnie niemożliwy jest dostęp do wszystkich memberów child-class, tylko do wyszczególnionych np. nadpisanych metod

**Downcasting**:
    a) nie może być zrobiony domyślnie (implicitly), tylko na wyraźne polecenie (explicitly)

-------
https://www.geeksforgeeks.org/upcasting-vs-downcasting-in-java/