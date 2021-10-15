package hackerrank.methodoverriding;

public class Soccer extends Sports {

    @Override
     String getName() {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }

    /**
     * Wcześniej, jak uczyłem się o function overriding, nie było mówione nic o dodawaniu adnotacji @Override.
     * Jak zauważyłem, mechanizm overridingu zachodzi automatycznie i niezależnie od tego, czy doda się taką adnotację, czy nie.
     * Niemniej, jak doczytałem, dodawanie tej adnotacji jest polecane i uważane za dobrą praktykę bo:
     *   a) w przypadku, gdy chcemy żeby jakaś metoda nadpisywała inną, ale popełnimy błąd i nadpisująca metoda
     *      będzie miała inną nazwę/return type/parametr type - wtedy otrzymamy błąd i będziemy wiedzieli, że coś jest nie tak.
     *      Bez adnotacji nie będziemy wiedzieli.
     *   b) poprawia czytelność kodu
     *
     * https://beginnersbook.com/2014/07/override-annotation-in-java/
     */
}
