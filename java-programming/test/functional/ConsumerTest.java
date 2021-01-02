package functional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ConsumerTest {

    @Test
    public void test() {
        List<Integer> numbers = new ArrayList();

        Consumer<List<Integer>> addConsumer = (list) -> list.add(0, 1);
        Consumer<List<Integer>> clearConsumer = (list) -> list.clear();

        addConsumer.accept(numbers);
        assertEquals(numbers.size(), 1);

        addConsumer.andThen(clearConsumer).accept(numbers);
        // consumer interface는 결과를 리턴하지 않음. andThen은 functional interface의 호출 순서만 정함
        assertTrue(numbers.isEmpty());
    }
}
