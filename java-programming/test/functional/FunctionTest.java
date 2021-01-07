package functional;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.Function;

public class FunctionTest {

    @Test
    public void test() {
        compose();
        andThen();
        identity();
    }

    private void compose() {
        Function<Integer, String> intToString = Objects::toString;
        Function<String, String> quote = str -> "'" + str + "'";

        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        System.out.println(quoteIntToString.apply(10)); // '10'
    }

    private void andThen() {
        Function<String, String> upperCase = String::toUpperCase;

        String result = upperCase.andThen(s -> s + "owell").apply("l");
        System.out.println(result); // Lowell
    }

    private void identity() {
        final Function<Integer, Integer> identity = Function.identity();
        identity.apply(100); // 100
    }
}
