package com.jd.arithmetic.collection.third;

/**
 * Created by lichunran on 2018/10/18.
 */
public class SequenceList<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private int capacity;

    private Object[] elementData;

    private int size;

    public SequenceList() {
        capacity = DEFAULT_CAPACITY;
        elementData = new Object[capacity];
    }

    public SequenceList(T element) {
        capacity = DEFAULT_CAPACITY;
        elementData = new Object[capacity];
        elementData[0] = element;
        size++;
    }

    public SequenceList(T element, int initSize) {
        capacity = DEFAULT_CAPACITY;
        while(initSize > capacity) {
            capacity = capacity + (capacity >> 1);
        }
        elementData = new Object[capacity];
        elementData[0] = element;
        size++;
    }

    public int length() {
        return size;
    }

    public T get(int index) {
        rangeCheck(index);

        return (T)elementData[index];
    }

    private void rangeCheck(int index) {
        if(index > size) {
            throw new IndexOutOfBoundsException("Size + " + size + ", Index + " + index);
        }
    }

    //为防止空指针，入参为null时单独判断
    public int locate(T element) {
        if(element == null) {
            for (int i = 0; i < size; i++) {
                if(elementData[i] == null)
                    return i;
            }
        } else {
            for(int i = 0; i < size; i++) {
                if(element.equals(elementData[i]))
                    return i;
            }
        }
        return -1;
    }

    public void insert(int index, T element) {
        rangeCheckForAdd(index);

        ensureCapacityInternal(size + 1);

    }

    private void ensureCapacityInternal(int minCapacity) {
        if(capacity < minCapacity) {
            grow(minCapacity);
        }
    }

    private void grow(int minCapacity) {
//        if()
    }


    private void rangeCheckForAdd(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Size + " + size + ", Index + " + index);
        }
    }

    public static void main(String[] args) {
        /*int capacity = 10;
        int initSize = 111;
        while(initSize > capacity) {
            capacity = capacity + (capacity >> 1);
            System.out.println(capacity);
        }*/
        System.out.println(15 >> 1);
    }

}
