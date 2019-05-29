package com.jd.arithmetic.collection;

import java.util.Arrays;

/**
 * Created by lichunran on 2018/2/5.
 */
public class SequenceList<T> {

    private static final int DEFAULT_SIZE = 16;

    private int capacity;

    private Object[] elementData;

    private int size = 0;

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
        while (capacity < initSize) {
            capacity <<= 1;
        }
        elementData = new Object[capacity];
        elementData[0] = element;
        size++;
    }

    public int length() {
        return size;
    }

    public T get(int i) {
        if(i < 0 || i > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
        return (T)elementData[i];
    }

    public int locate(T element) {
        if(element == null) {
            for (int i = 0; i < size; i++) {
                if (element == null) {
                    return i;
                }
            }
        } else {
            for(int i = 0; i < size; i++) {
                if(element.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    private void rangeCheck(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
    }

    public void insert(int index, T element) {
        rangeCheck(index);
        ensureCapacity(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    public void add(T element) {
        insert(size, element);
    }

    public void ensureCapacity(int minCapacity) {
        while(minCapacity > capacity) {
            capacity <<= 1;
        }
        elementData = Arrays.copyOf(elementData, capacity);
    }

    //1,2,3,4,5
    public T delete(int index) {
        rangeCheck(index);
        T oldValue = (T) elementData[index];
        int numMoved = size - index - 1;
        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
        elementData[--size] = null;
        return  oldValue;
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

    public String toString() {
        if(size == 0) {
            return "[]";
        } else {
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i < size; i++) {
                sb.append(elementData[i].toString() + ", ");
            }
            int len = sb.length();
            return sb.delete(len - 2, len).append("]").toString();
        }
    }
}
