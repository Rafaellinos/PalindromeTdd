package Palindrome;

import org.junit.jupiter.api.Test;

import static Palindrome.PalindromeFinder.isPalindrome;
import static Palindrome.PalindromeFinder.removeSpecialCharacters;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PalindromeFinderTest {

    @Test
    public void testRotatorIsPalindrome() {
        assertTrue(isPalindrome("Rotator"));
    }

    @Test
    public void testBobIsPalindrome() {
        assertTrue(isPalindrome("bob"));
    }

    @Test
    public void testMadamIsPalindrome() {
        assertTrue(isPalindrome("madam"));
    }

    @Test
    public void testMaiayalamIsPalindrome() {
        assertTrue(isPalindrome("mAlAyAlam"));
    }

    @Test
    public void test1IsPalindrome() {
        assertTrue(isPalindrome("1"));
    }

    @Test
    public void testAbleWasIereIsawElbaIsPalindrome() {
        assertTrue(isPalindrome("Able was I, ere I saw Elba"));
    }

    @Test
    public void testMadamImAdamIsPalindrome() {
        assertTrue(isPalindrome("Madam I’m Adam"));
    }

    @Test
    public void testSteponnoPetsIsPalindrome() {
        assertTrue(isPalindrome("Step on no pets."));
    }

    @Test
    public void testTopStopIsPalindrome() {
        assertTrue(isPalindrome("Top spot!"));
    }

    @Test
    public void testXyzIsNotPalindrome() {
        assertFalse(isPalindrome("xyz"));
    }

    @Test
    public void testElephantIsNotPalindrome() {
        assertFalse(isPalindrome("elephant"));
    }

    @Test
    public void testCountryIsNotPalindrome() {
        assertFalse(isPalindrome("Country"));
    }

    @Test
    public void testTopPostIsNotPalindrome() {
        assertFalse(isPalindrome("Top . post!"));
    }

    @Test
    public void testWonderfulFoolIsNotPalindrome() {
        assertFalse(isPalindrome("Wonderful-fool"));
    }

    @Test
    public void testWildImaginationIsNotPalindrome() {
        assertFalse(isPalindrome("Wild imagination!"));
    }

    @Test
    public void testRemoveSpecialCharacters() {
        String expected = "tdd";
        String toTest = "!tdd.$$#><^~?";
        assertEquals(removeSpecialCharacters(toTest), expected);
    }
}
