package myList.LinkedList.Impl;

import myList.LinkedList.ILinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListImpl<E> implements ILinkedList<E> {

    private int size;

    /**
     * 有头结点的方式 dummy
     */
    private ListNode dummy;

    public LinkedListImpl() {
        this.dummy = new ListNode(0);
        this.size = 0;
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
    public void add(int index, E data) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index Out Of Range");
        }
        ListNode prev = dummy;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        ListNode node = new ListNode(data);
        node.next = prev.next;
        prev.next = node;
        size++;

    }

    /**
     * 加入最后一个元素
     * @param data
     * @return
     */
    @Override
    public boolean add(E data) {
        add(size, data);
        return true;
    }


    @Override
    public void addFirst(E data) {
        add(0, data);
    }

    @Override
    public void addLast(E data) {
        add(size, data);
    }



    @Override
    public E removeFirst() {
        return remove(0);
    }

    @Override
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * 需要用while循环 去找元素
     * @param data
     * @return
     */
    @Override
    public boolean remove(E data) {
        ListNode prev = dummy;

        while (prev.next != null) {
            if (prev.next.data.equals(data)) {
                break;
            }
            prev = prev.next;
        }

        if (prev.next != null) {
            ListNode delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
            size--;
            return true;
        }

        return false;
    }


    /**
     * >= size 删除最后一个元素 size - 1
     * @param index
     * @return
     */
    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index Out Of Range");
        }
        ListNode prev  = dummy;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        ListNode delNode = prev.next;
        prev.next = delNode.next;
        delNode.next = null;
        size--;

        return (E) delNode.data;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index Out Of Range");
        }
        ListNode cur = dummy.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return (E) cur.data;
    }

    @Override
    public E getFirst() {
        return get(0);
    }

    @Override
    public E getLast() {
        return get(size - 1);
    }

    @Override
    public void set(int index, E data) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index Out Of Range");
        }
        ListNode cur = dummy.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.data = data;
    }

    @Override
    public boolean contains(E data) {
        ListNode cur = dummy.next;
        while (cur.next != null) {
            if (cur.data.equals(data)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    private class ListNode<E> {

        public E data;

        public ListNode next;

        public ListNode(E data) {
            this.data = data;
            this.next = null;

        }

    }
}
