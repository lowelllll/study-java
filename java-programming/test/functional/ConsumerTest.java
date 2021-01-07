package functional;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ConsumerTest {

    @Test
    public void test1() {
        List<Integer> numbers = new ArrayList();

        Consumer<List<Integer>> addConsumer = (list) -> list.add(0, 1);
        Consumer<List<Integer>> clearConsumer = (list) -> list.clear();

        addConsumer.accept(numbers);
        assertEquals(numbers.size(), 1);

        addConsumer.andThen(clearConsumer).accept(numbers);
        // consumer interface는 결과를 리턴하지 않음. andThen은 functional interface의 호출 순서만 정함
        assertTrue(numbers.isEmpty());
    }

    @Test
    public void test2() {
        andThen();
        accept();
    }

    private void accept() {
        // lambda식은 functional interface의 인스턴스를 생성함.
        final Consumer<String> greetings = value -> System.out.println("hello" + value);
        greetings.accept("lowell");
    }

    private void andThen() {
        final Consumer<String> consumer1 = value -> System.out.println("consumer 1 " + value);
        final Consumer<String> consumer2 = value -> System.out.println("consumer 2 " + value);

        consumer1.andThen(consumer2).accept("is Consume");

    }
}
