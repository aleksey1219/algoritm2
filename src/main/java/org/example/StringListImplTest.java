package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {

    private final StringListImpl stringList = new StringListImpl();

    @Test
    void add_success() {

//        Входные данные.
        String item = "Planeptune";

//        Ожидаемый результат.
        String expected = item;

//        Тест.
        String actual = stringList.add(item);
        assertEquals(expected, actual);
    }

    @Test
    void add_withListIndexNotFoundException() {

//        Входные данные.
        String item = "Planeptune";


//        Тест.
        assertDoesNotThrow(() -> stringList.add(item));
    }

    @Test
    void testAdd_success() {

//        Входные данные.
        String item = "Planeptune";
        int index = 0;

//        Ожидаемый результат.
        String expected = "Planeptune";

//        Тест.
        String actual = stringList.add(index, item);
        assertEquals(expected, actual);
    }

    @Test
    void testAdd_withListIndexNotFoundException() {

//        Входные данные.
        String item = "Planeptune";
        int index = 1;

//        Тест.
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> stringList.add(index, item));
    }

    @Test
    void set_success() {

//        Входные данные.
        String item = "Planeptune";
        int index = 0;

//        Ожидаемый результат.
        String expected = "Planeptune";

//        Тест.
        String actual = stringList.set(index, item);
        assertEquals(expected, actual);
    }

    @Test
    void set_withListIndexNotFoundException() {

//        Входные данные.
        String item = "Planeptune";
        int index = 1;

//        Тест.
        assertDoesNotThrow(() -> stringList.set(index, item));
    }

    @Test
    void remove_withListNullException() {

//        Входные данные.
        String item = "Planeptune";

//        Тест.
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> stringList.remove(item));
    }

    @Test
    void testRemove_withListNullException() {

//        Входные данные.
        int index = 0;

//        Тест.
        assertDoesNotThrow(() -> stringList.remove(index));
    }

    @Test
    void contains_success() {

//        Входные данные.
        String item = "Planeptune";

//        Ожидаемый результат.
        Boolean expected = false;

//        Тест.
        Boolean actual = stringList.contains(item);
        assertEquals(expected, actual);
    }

    @Test
    void indexOf_success() {

//        Входные данные.
        String item = "Planeptune";

//        Ожидаемый результат.
        int expected = -1;

//        Тест.
        int actual = stringList.indexOf(item);
        assertEquals(expected, actual);
    }

    @Test
    void lastIndexOf_success() {

//        Входные данные.
        String item = "Planeptune";

//        Ожидаемый результат.
        int expected = -1;

//        Тест.
        int actual = stringList.lastIndexOf(item);
        assertEquals(expected, actual);
    }

    @Test
    void get_success() {

//        Входные данные.
        int index = 1;

//        Ожидаемый результат.
        String expected = null;

//        Тест.
        String actual = stringList.get(index);
        assertEquals(expected, actual);
    }

    @Test
    void get_withListIndexNotFoundException() {

//        Входные данные.
        int index = 1;

//        Тест.
        assertDoesNotThrow(() -> stringList.get(index));
    }

    @Test
    void testEquals_success() {

//        Входные данные.
        StringList stringList1 = new StringListImpl();

//        Ожидаемый результат.
        boolean expected = true;

//        Тест.
        Boolean actual = stringList.equals(stringList1);
        assertEquals(expected, actual);
    }

    @Test
    void size() {

//        Входные данные.
        int size = 0;

//        Ожидаемый результат.
        int expected = size;

//        Тест.
        int actual = stringList.size();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {

//        Ожидаемый результат.
        boolean expected = true;

//        Тест.
        Boolean actual = stringList.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void clear() {

//        Входные данные.
        int size = 0;

//        Ожидаемый результат.
        int expected = size;

//        Тест.
        stringList.clear();
        assertEquals(expected, size);
    }

    @Test
    void toArray() {

//        Входные данные.
        String[] list = new String[2];

//        Ожидаемый результат.
        String[] expected = list;

//        Тест.
        String[] actual = list;
        assertEquals(expected, actual);
    }
}