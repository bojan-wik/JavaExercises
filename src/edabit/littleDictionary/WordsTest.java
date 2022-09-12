package edabit.littleDictionary;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class WordsTest {

    @Test(expected = IllegalArgumentException.class)
    public void test00() {
        Words.dictionary("bu", new String[]{});
    }

    @Test
    public void test01() {
        assertArrayEquals(new String[] {"button"}, Words.dictionary("bu", new String[] {"button", "breakfast", "border"}));
    }

    @Test
    public void test02() {
        assertArrayEquals(new String[] {}, Words.dictionary("beau", new String[] {"pastry", "delicious", "name", "boring"}));
    }

    @Test
    public void test03() {
        assertArrayEquals(new String[] {"there"}, Words.dictionary("there", new String[] {"there", "here", "everywhere"}));
    }

    @Test
    public void test04() {
        assertArrayEquals(new String[] {"snow"}, Words.dictionary("sno", new String[] {"snow", "paper", "ghost"}));
    }

    @Test
    public void test05() {
        assertArrayEquals(new String[] {"marriage", "married", "many"}, Words.dictionary("ma", new String[] {"marriage", "married", "many", "delight"}));
    }

    @Test
    public void test06() {
        assertArrayEquals(new String[] {"notion", "nominate", "note"}, Words.dictionary("no", new String[] {"inferno", "notion", "nominate", "note", "fairy"}));
    }

    @Test
    public void test07() {
        assertArrayEquals(new String[] {"creating", "creature", "creed"}, Words.dictionary("cre", new String[] {"creating", "creature", "creed", "increasing"}));
    }
}
