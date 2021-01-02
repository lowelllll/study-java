package functional;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticOperatorTest {

    @Test
    public void test() {
        ArithmeticOperator sumOperator = (x, y) -> x + y; // lambda 식은 functional interface의 인스턴스를 생성
        ArithmeticOperator subOperator = (x, y) -> x - y;

        int sumResult = sumOperator.operate(5, 10);
        int subResult = subOperator.operate(20, 10);

        assertEquals(sumResult, 15);
        assertEquals(subResult, 10);
    }
}