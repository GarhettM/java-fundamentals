package basicLibrary;

import org.junit.Test;

import static org.junit.Assert.*;

public class RollingDiceTest {
    @Test public void testDiceRoll() {
        RollingDice dice = new RollingDice();
        int[] test = {1, 2, 3, 4};
        assertEquals(test.getClass(), dice.roll(4).getClass());
    }

    @Test public void testDuplicates() {
        RollingDice dice = new RollingDice();
        int[] test = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};
        assertFalse(dice.containsDuplicates(test));
        assertTrue(dice.containsDuplicates(test2));
    }

    @Test public void testCalcAvg() {
        RollingDice dice = new RollingDice();
        double test1 = 2.0;
        double test2 = 3.5;
        int[] testArr = {1, 2, 3, 4};
        int[] testArr2 = {2, 3, 4, 5};
        assertEquals(test1, dice.calcAvg(testArr), 0.5);
        assertEquals(test2, dice.calcAvg(testArr2), 0.5);
    }

    @Test public void testArrOfArr() {
        RollingDice dice = new RollingDice();
        int[] test = {55, 54, 60, 53, 59, 57, 61};
        int[][] test1 = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        assertArrayEquals(test, dice.lowestAvgArr(test1));
    }
}
