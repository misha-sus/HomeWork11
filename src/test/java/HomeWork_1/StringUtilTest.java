package HomeWork_1;

import org.junit.jupiter.api.*;

import java.util.NoSuchElementException;


public class StringUtilTest {
    static StringUtil util = new StringUtil();

    @Test
    void testConversionMethodReturnsCorrectType() {
        String result = util.convertIntArray(new int[]{1, 4});
        Assertions.assertEquals(result.getClass(), String.class);
    }

    @Test
    @DisplayName("Проверяем что в String не пустой")
    void testResultNotNull() {
        String result = util.convertIntArray(new int[]{0, 2});
        Assertions.assertNotNull(result);
    }

    @Test
    @DisplayName("Проверяем что значения массива и строки одинаковые")
    void testCheckNumber() {
        String result = util.convertIntArray(new int[]{0, 2});
        String expected = "0 2";
        Assertions.assertEquals(result, expected);
    }
    @Test
    @DisplayName("Проверяем что значения массива и строки неодинаковые")
    void testNoCheckNumber() {
        String result = util.convertIntArray(new int[]{10,13,12});
        String expected = "0 10";
        Assertions.assertTrue(!result.equals(expected));
    }
    @Test
    @DisplayName("Проверяем совпадения с помощью регулярки")
    void testCheckNumberRegular () {
        String result = util.convertIntArray(new int[]{10,13,12});
        Assertions.assertTrue(result.matches("[?\\-\\d+\\s+]+"));
    }
    @Test
    void negativeTestExample(){
        Assertions.assertThrows(NoSuchElementException.class, ()->util.convertIntArray(new int[]{}));
    }
}
