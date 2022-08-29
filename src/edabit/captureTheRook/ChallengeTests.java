package edabit.captureTheRook;

import static org.hamcrest.core.Is.is;
import org.junit.Test;
import static org.junit.Assert.assertThat;

public class ChallengeTests {

    @Test
    public void test0() {
        assertThat(Challenge.canCapture(new String[]{"Z1", "X1"}), is(false));
    }

    @Test
    public void test00() {
        assertThat(Challenge.canCapture(new String[]{"A9", "B9"}), is(false));
    }

    @Test
    public void test1() {
        assertThat(Challenge.canCapture(new String[]{"A8", "E8"}), is(true));
    }

    @Test
    public void test2() {
        assertThat(Challenge.canCapture(new String[]{"a1", "b2"}), is(false));
    }

    @Test
    public void test3() {
        assertThat(Challenge.canCapture(new String[]{"H4", "H3"}), is(true));
    }

    @Test
    public void test4() {
        assertThat(Challenge.canCapture(new String[]{"F5", "C8"}), is(false));
    }

    @Test
    public void test5() {
        assertThat(Challenge.canCapture(new String[]{"G3", "G7"}), is(true));
    }

    @Test
    public void test6() {
        assertThat(Challenge.canCapture(new String[]{"B3", "B2"}), is(true));
    }

    @Test
    public void test7() {
        assertThat(Challenge.canCapture(new String[]{"F5", "B2"}), is(false));
    }

    @Test
    public void test8() {
        assertThat(Challenge.canCapture(new String[]{"H5", "C8"}), is(false));
    }
}
