package edabit.censoredStrings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChallengeTests {

    @Test(expected = IllegalArgumentException.class)
    public void test0() {
        Challenge.uncensor("P*k*m*n", "oe");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test00() {
        Challenge.uncensor("P*k*mon", "oeo");
    }

    @Test
    public void test1() {
        assertEquals("Where did my vowels go?", Challenge.uncensor("Wh*r* d*d my v*w*ls g*?", "eeioeo"));
    }

    @Test
    public void test2() {
        assertEquals("abcd", Challenge.uncensor("abcd", ""));
        System.out.println("Works with no vowels.");
    }

    @Test
    public void test3() {
        assertEquals("UPPERCASE", Challenge.uncensor("*PP*RC*S*", "UEAE"));
        System.out.println("Works with uppercase.");
    }

    @Test
    public void test4() {
        assertEquals("Cheese, Grommit -- cheese", Challenge.uncensor("Ch**s*, Gr*mm*t -- ch**s*", "eeeoieee"));
        System.out.println("Works with * at the end");
    }

    @Test
    public void test5() {
        assertEquals("Elephant", Challenge.uncensor("*l*ph*nt", "Eea"));
        System.out.println("Works with * at the start");
    }
}
