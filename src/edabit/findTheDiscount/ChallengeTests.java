package edabit.findTheDiscount;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ChallengeTests {
    @Test
    public void test01() {
        assertEquals(25, Challenge.findTheDiscount(100, 75), 5);
    }

    @Test
    public void test02() {
        assertEquals(105.5, Challenge.findTheDiscount(211, 50), 5);
    }

    @Test
    public void test03() {
        assertEquals(231.27, Challenge.findTheDiscount(593, 61), 5);
    }

    @Test
    public void test04() {
        assertEquals(338.6, Challenge.findTheDiscount(1693, 80), 5);
    }

    @Test
    public void test05() {
        assertEquals(630, Challenge.findTheDiscount(700, 10), 5);
    }
}