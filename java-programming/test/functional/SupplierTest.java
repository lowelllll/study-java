package functional;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class SupplierTest {

    @Test
    public void test() {
        Supplier<Integer> intSupplier = () -> {
            return (int) (Math.random() * 6) + 1;
        }; // 제네릭으로 전달받은 타입을 전달..

        int num = intSupplier.get();
        System.out.println("주사위 눈의 수 : " + num);

    }
}
