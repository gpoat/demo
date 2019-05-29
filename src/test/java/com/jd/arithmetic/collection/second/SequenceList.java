package com.jd.arithmetic.collection.second;

import java.util.Arrays;

/**
 * Created by lichunran on 2018/2/27.
 */
public class SequenceList<T> {

    private static final int DEFAULT_SIZE = 16;

    private int capacity;

    private int size;

    private Object[] elementData;

    public SequenceList() {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public SequenceList(T element) {
        this();
        elementData[0] = element;
        size++;
    }

    public SequenceList(T element, int initSize) {
        capacity = 1;
        while(capacity < initSize) {
            capacity <<= 1;
        }
        elementData = new Object[initSize];
        elementData[0] = element;
        size++;
    }

    public int length() {
        return size;
    }

    public T get(int i) {
        checkRange(i);
        return (T)elementData[i];
    }

    private void checkRange(int i) {
        if(i < 0 || i > size) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
    }

    public int locate(T element) {
        for(int i = 0; i < size; i++) {
            if(elementData[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity(int minCapacity) {
        if(minCapacity > capacity) {
            while (minCapacity > capacity) {
                capacity <<= 1;
            }
            Arrays.copyOf(elementData, capacity);
        }
    }

    public void insert(T element, int index) {
        checkRange(index);
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    public void add(T element) {
        insert(element, size);
    }

    public T delete(int index) {
        checkRange(index);
        T oldValue = (T)elementData[index];
        int moveNum = size - index -1;
        if(moveNum > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, moveNum);
        }
        elementData[--size] = null;
        return oldValue;
    }

    public T remove() {
        return delete(size - 1);
    }

    public boolean empty() {
        return size == 0;
    }

    public void clear() {
        Arrays.fill(elementData, null);
        size = 0;
    }

    //[1,2,3,4]
    public String toString() {
        if(size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
        }

        return null;
    }
}
