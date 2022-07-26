package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();
        int result = service.calcSqr(100, 300);
        int expected = 8;

        assertEquals(expected, result);


    }
}
