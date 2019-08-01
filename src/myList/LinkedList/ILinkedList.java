package myList.LinkedList;

public interface ILinkedList<E> {

    int size();

    boolean isEmpty();

    void add(int index, E data);

    boolean add(E data);

    void addFirst(E data);

    void addLast(E data);

    E removeFirst();

    E removeLast();

    boolean remove(E data);

    E remove(int index);

    E get(int index);

    E getFirst();

    E getLast();

    void set(int index, E data);

    boolean contains(E data);


}
