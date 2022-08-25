package edabit.shuffleTheName;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChallengeTests {

    @Test
    public void test1() {
        assertEquals("Trump Donald", Challenge.nameShuffle("Donald Trump"));
    }

    @Test
    public void test2() {
        assertEquals("O'Donnel Rosie", Challenge.nameShuffle("Rosie O'Donnel"));
    }

    @Test
    public void test3() {
        assertEquals("Butts Seymour", Challenge.nameShuffle("Seymour Butts"));
    }

    @Test
    public void test4() {
        assertEquals("Greene Ebony", Challenge.nameShuffle("Ebony Greene"));
    }

    @Test
    public void test5() {
        assertEquals("Kennedy Ken", Challenge.nameShuffle("Ken Kennedy"));
    }

    @Test
    public void test6() {
        assertEquals("Gonzalez Allison", Challenge.nameShuffle("Allison Gonzalez"));
    }

    @Test
    public void test7() {
        assertEquals("Frazier Albert", Challenge.nameShuffle("Albert Frazier"));
    }

    @Test
    public void test8() {
        assertEquals("Hopkins Eloise", Challenge.nameShuffle("Eloise Hopkins"));
    }

    @Test
    public void test9() {
        assertEquals("Welch Donnie", Challenge.nameShuffle("Donnie Welch"));
    }

    @Test
    public void test10() {
        assertEquals("Thomas Vernon", Challenge.nameShuffle("Vernon Thomas"));
    }
}
