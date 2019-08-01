package Stack.Impl;

import Stack.ILinkedListStack;
import myList.LinkedList.ILinkedList;

import java.util.LinkedList;

public class LinkedListStackImpl<E> implements ILinkedListStack<E> {

    private LinkedList<E> linkedlist;

    public LinkedListStackImpl() {
        this.linkedlist = new LinkedList<>();
    }

    @Override
    public int size() {
        return linkedlist.size();
    }

    @Override
    public boolean isEmpty() {
        return linkedlist.isEmpty();
    }

    @Override
    public void push(E e) {
        linkedlist.addFirst(e);
    }

    @Override
    public E pop() {
        return linkedlist.removeLast();
    }

    @Override
    public E peek() {
        return linkedlist.getLast();
    }

    @Override
    public void print() {
        System.out.println("size: " + linkedlist.size());
        for (int i = 0; i < linkedlist.size(); i++) {
             System.out.print(linkedlist.get(i) + " ");
        }
    }
}
