package org.example;

import java.util.Arrays;

public class IntegerListImpl implements IntegerList {
    private final Integer[] list;
    private int size;

    public IntegerListImpl() {
        list = new Integer[15];
    }

    public IntegerListImpl(int listSize) {
        list = new Integer[listSize];
    }

    @Override
    public Integer add(Integer item) {
        validateItem(item);
        validateSize();
        list[size++] = item;
        return item;
    }

    @Override
    public Integer add(int index, Integer item) {
        validateSize();
        validateIndex(index);
        validateItem(item);
        if (index == size) {
            list[size++] = item;
            return item;
        }
        System.arraycopy(list, index, list, index + 1, size - index);
        list[index] = item;
        size++;
        return item;
    }

    @Override
    public Integer set(int index, Integer item) {
        validateIndex(index);
        validateItem(item);
        list[index] = item;
        return item;
    }

    @Override
    public Integer remove(Integer item) {
        validateItem(item);
        int index = indexOf(item);

        return remove(index);
    }

    @Override
    public Integer remove(int index) {
        validateIndex(index);
        Integer item = list[index];

        if (index != size) {
            System.arraycopy(list, index + 1, list, index, size - index);
        }

        size--;
        return item;
    }

    @Override
    public boolean contains(Integer item) {
        return indexOf(item) > -1;
    }

    @Override
    public int indexOf(Integer item) {
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Integer item) {
        for (int i = size - 1; i >= 0; i--) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Integer get(int index) {
        validateIndex(index);
        return list[index];
    }

    @Override
    public boolean equals(IntegerList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public Integer[] toArray() {
        return Arrays.copyOf(list, size);
    }

    private void validateItem(Integer item) {
        if (item == null) {
            throw new ListNullException("Ячейка пуста");
        }
    }

    private void validateIndex(int index) {
        if (index >= list.length) {
            throw new ListIndexNotFoundException("Индекс не найден");
        }
    }

    private void validateSize() {
        if (size == list.length) {
            throw new ListStorageIsFullException("Список переполнен");
        }
    }

    private void sort(int[] arr) {
        for (int i=1)
    }
}

