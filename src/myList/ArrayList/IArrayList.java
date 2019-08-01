package myList.ArrayList;

public interface IArrayList<E> {

    /**
     * 容量大小
     * @return
     */
    int capacity();

    /**
     * 实际大小
     * @return
     */
    int size();

    /**
     * 是否为空
     * @return
     */
    boolean isEmpty();

    void add(E element);

    void add(int index, E element);

    boolean contains(E element);

    E get(int index);

    void set(int index, E element);

    /**
     * 要返回删除的元素
     * @param index
     * @return
     */
    E remove(int index);

    void remove(E element);

    void print();

    void resize(int capacity);
}
