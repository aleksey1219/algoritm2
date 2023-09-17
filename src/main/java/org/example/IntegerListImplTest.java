package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {

    IntegerListImplTest integerList = new IntegerListImplTest();
    @Test
    void add_success() {

//        Входные данные.
        Integer item = 5;

//        Ожидаемый результат.
        Integer expected = item;

//        Тест.
        Integer actual = integerList.add(item, item);
        assertEquals(expected, actual);
    }

    private Integer add(Integer item, Integer integer) {
        return item;
    }

    @Test
    void add_withListIndexNotFoundException() {

//        Входные данные.
        Integer item = 5;


//        Тест.
        assertDoesNotThrow(() -> integerList.add(item, item));
    }

    @Test
    void testAdd_success() {

//        Входные данные.
        Integer item = 5;
        int index = 0;

//        Ожидаемый результат.
        Integer expected = 5;

//        Тест.
        Integer actual = integerList.add(index, item);
        assertEquals(expected, actual);
    }

    private Integer add(int index, Integer item) {
        return item;
    }

    @Test
    void testAdd_withListIndexNotFoundException() {

//        Входные данные.
        Integer item = 5;
        int index = 1;

//        Тест.
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> integerList.add(index, item));
    }

    @Test
    void set_success() {

//        Входные данные.
        Integer item = 5;
        int index = 0;

//        Ожидаемый результат.
        Integer expected = 5;

//        Тест.
        Integer actual = integerList.set(index, item);
        assertEquals(expected, actual);
    }

    private Integer set(int index, Integer item) {
        return item;
    }

    @Test
    void set_withListIndexNotFoundException() {

//        Входные данные.
        Integer item = 5;
        int index = 1;

//        Тест.
        assertDoesNotThrow(() -> integerList.set(index, item));
    }

    @Test
    void remove_withListNullException() {

//        Входные данные.
        Integer item = 5;

//        Тест.
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> integerList.remove(item));
    }

    private void remove(Integer item) {
    }

    @Test
    void testRemove_withListNullException() {

//        Входные данные.
        int index = 0;

//        Тест.
        assertDoesNotThrow(() -> integerList.remove(index));
    }

    @Test
    void contains_success() {

//        Входные данные.
        Integer item = 5;

//        Ожидаемый результат.
        Boolean expected = false;

//        Тест.
        Boolean actual = integerList.contains(item);
        assertEquals(expected, actual);
    }

    private Boolean contains(Integer item) {
        return null;
    }

    @Test
    void indexOf_success() {

//        Входные данные.
        Integer item = 5;

//        Ожидаемый результат.
        int expected = -1;

//        Тест.
        int actual = integerList.indexOf(item);
        assertEquals(expected, actual);
    }

    private int indexOf(Integer item) {
        return 0;
    }

    @Test
    void lastIndexOf_success() {

//        Входные данные.
        Integer item = 5;

//        Ожидаемый результат.
        int expected = -1;

//        Тест.
        int actual = integerList.lastIndexOf(item);
        assertEquals(expected, actual);
    }

    private int lastIndexOf(Integer item) {
        return 0;
    }

    @Test
    void get_success() {

//        Входные данные.
        int index = 1;

//        Ожидаемый результат.
        Integer expected = null;

//        Тест.
        Integer actual = integerList.get(index);
        assertEquals(expected, actual);
    }

    private Integer get(int index) {
        return null;
    }

    @Test
    void get_withListIndexNotFoundException() {

//        Входные данные.
        int index = 1;

//        Тест.
        assertDoesNotThrow(() -> integerList.get(index));
    }

    @Test
    void testEquals_success() {

//        Входные данные.
        IntegerList IntegerList1 = (IntegerList) new IntegerListImplTest();

//        Ожидаемый результат.
        boolean expected = true;

//        Тест.
        Boolean actual = integerList.equals(IntegerList1);
        assertEquals(expected, actual);
    }

    @Test
    int size() {

//        Входные данные.
        int size = 0;

//        Ожидаемый результат.
        int expected = size;

//        Тест.
        int actual = integerList.size();
        assertEquals(expected, actual);
        return size;
    }

    @Test
    Boolean isEmpty() {

//        Ожидаемый результат.
        boolean expected = true;

//        Тест.
        Boolean actual = integerList.isEmpty();
        assertEquals(expected, actual);
        return actual;
    }

    @Test
    void clear() {

//        Входные данные.
        int size = 0;

//        Ожидаемый результат.
        int expected = size;

//        Тест.
        integerList.clear();
        assertEquals(expected, size);
    }

    @Test
    void toArray() {

//        Входные данные.
        Integer[] list = new Integer[2];

//        Ожидаемый результат.
        Integer[] expected = list;

//        Тест.
        Integer[] actual = list;
        assertEquals(expected, actual);
    }
}
