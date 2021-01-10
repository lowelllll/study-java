package functional;


import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PredicateTest {

    @Test
    public void test() {
        andOrNegate();
        tests();
    }

    private void andOrNegate() {
        Predicate<Integer> predicate1 = number -> number % 2 == 0;
        Predicate<Integer> predicate2 = number -> number % 3 == 0;

        assertFalse(predicate1.and(predicate2).test(9));
        assertTrue(predicate1.or(predicate2).test(9));
        assertTrue(predicate1.negate().test(9));
    }

    private void tests() {
        Predicate<Integer> isZero = number -> number == 0;
        assertTrue(isZero.test(0));
        assertFalse(isZero.test(1));
    }
}
