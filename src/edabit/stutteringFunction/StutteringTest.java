package edabit.stutteringFunction;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StutteringTest {

    @Test
    public void test00() {
        assertEquals("Input must be at least two-character long", Stuttering.stutter("x"));
    }

    @Test
    public void test01() {
        assertEquals("in... in... increasing?", Stuttering.stutter("Increasing"));
    }

    @Test
    public void test02() {
        assertEquals("ad... ad... adventures?", Stuttering.stutter("adventures"));
    }

    @Test
    public void test03() {
        assertEquals("en... en... enticing?", Stuttering.stutter("enticing"));
    }

    @Test
    public void test04() {
        assertEquals("un... un... unacceptable?", Stuttering.stutter("unacceptable"));
    }

    @Test
    public void test05() {
        assertEquals("ac... ac... accountable?", Stuttering.stutter("accountable"));
    }

    @Test
    public void test06() {
        assertEquals("in... in... incredible?", Stuttering.stutter("incredible"));
    }

    @Test
    public void test07() {
        assertEquals("ex... ex... exquisite?", Stuttering.stutter("exquisite"));
    }

    @Test
    public void test08() {
        assertEquals("am... am... am?", Stuttering.stutter("am"));
    }

    @Test
    public void test09() {
        assertEquals("en... en... enduring?", Stuttering.stutter("enduring"));
    }

    @Test
    public void test10() {
        assertEquals("ou... ou... outstanding?", Stuttering.stutter("outstanding"));
    }

    @Test
    public void test11() {
        assertEquals("as... as... astonishing?", Stuttering.stutter("astonishing"));
    }

    @Test
    public void test12() {
        assertEquals("as... as... astounding?", Stuttering.stutter("astounding"));
    }

    @Test
    public void test13() {
        assertEquals("im... im... impressive?", Stuttering.stutter("impressive"));
    }

    @Test
    public void test14() {
        assertEquals("re... re... revolutionize?", Stuttering.stutter("revolutionize"));
    }

    @Test
    public void test15() {
        assertEquals("re... re... recurring?", Stuttering.stutter("recurring"));
    }

    @Test
    public void test16() {
        assertEquals("re... re... recollection?", Stuttering.stutter("recollection"));
    }

    @Test
    public void test17() {
        assertEquals("so... so... so?", Stuttering.stutter("so"));
    }

    @Test
    public void test18() {
        assertEquals("go... go... gorgeous?", Stuttering.stutter("gorgeous"));
    }

    @Test
    public void test19() {
        assertEquals("ca... ca... captivating?", Stuttering.stutter("captivating"));
    }

}
