package com.jd.arithmetic.collection;

/**
 * Created by lichunran on 2018/2/5.
 */
public class LinkedList<T> {

    private class Node<T> {

        private T data;

        private Node next;

        public Node() {}

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> header;

    private Node<T> tail;

    private int size;

    public LinkedList() {
        header = null;
        tail = null;
    }

    public LinkedList(T element) {
        header = new Node(element, null);
        tail = header;
        size++;
    }

    public int length() {
        return size;
    }

    public T get(int index) {
        return getNodeByIndex(index).data;
    }

    private Node<T> getNodeByIndex(int index) {
        rangeCheck(index);
        Node x = header;
        for (int i = 0; i < index; i++)
            x = x.next;
        return x;
    }

    private void rangeCheck(int index) {
        if(index < 0 || index > size - 1) {
            throw new IndexOutOfBoundsException("线性表索引越界");
        }
    }

    public int locate(T element) {
        int index = 0;
        if(element == null) {
            for (Node x = header; x !=null; x = x.next) {
                if(element == null)
                    return index;
                index++;
            }
        } else {
            for(Node x = header; x != null; x = x.next) {
                if(element.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    //向链式线性表的指定位置插入一个元素
    public void insert(T element, int index) {
        rangeCheck(index);
        if(header == null) {

        }
    }

    //采用尾插法为链表添加节点
    public void add(T element) {
        Node l = header;
        Node newNode = new Node(element, null);
        tail = newNode;
        if(header == null) {
            header = newNode;
        } else {
            tail.next = newNode;
        }
        size++;
    }

    //采用头插法为链表添加节点
    public void addAtHead(T element) {
        header = new Node<T>(element, header);
        if(tail == null) {
            tail = header;
        }
        size++;
    }

    public T delete(int index) {
        rangeCheck(index);
        Node del = null;
        if(index == 0) {
            header = header.next;
        }
        return null;
    }

}
