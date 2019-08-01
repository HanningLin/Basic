package myList.ArrayList.impl;

import myList.ArrayList.IArrayList;

public class ArrayListImpl<E> implements IArrayList<E> {

    /**
     * Initialization
     * Implement
     *
     */
    private E[] data;

    private int size;

    public ArrayListImpl() {
        this(10);
    }

    public ArrayListImpl(int capacity) {
        this.data = (E[]) new Object[capacity];           // 无需定义capacity data的长度就是capacity
        this.size = 0;
    }

    @Override
    public int capacity() {
        return data.length;
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
    /**
     * 判断临界条件 size是否和data的长度相同
     */
    public void add(E element) {
//        if (size == data.length)
//            throw new IllegalArgumentException("Array is full");
//        data[size] = element;
//        size++;
        add(size, element);
    }

    /**
     * 从最后一位倒着往前插入
     * time : O(n)
     *
     */
    @Override
    public void add(int index, E element) {
//        if (data.length == size)
//            throw new IllegalArgumentException("Array is full");                // 当数组满了的时候 需要进行扩容操作
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index Out Of Range");
        }

        if (data.length == size)  {
            resize(2 * data.length);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i] == element)
                return true;
        }
        return false;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index out of Range");
        return data[index];
    }

    @Override
    public void set(int index, E element) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index out of Range");
        data[index] = element;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index out of Range");           // 涉及到index要判断是否越界
        E res = data[index];

        for (int i = index; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;

        //lazy 思想
        // 判断数组长度 变成1/4之后 后面的可确定没有元素后舍弃

        if (data.length / 4 == size && data.length / 2 != 0) {
            resize(data.length / 2);
        }

        return res;
    }

    @Override
    public void remove(E element) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (data[i] == element)
                index = i;
        }
        if (index == -1)
            throw new IllegalArgumentException("No such element");

        remove(index);
    }

    @Override
    public void print() {
        System.out.println("size: " + size);
        System.out.println("capacity: " + data.length);
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }

    @Override
    public void resize(int capacity) {
        E[] temp = (E[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
}
