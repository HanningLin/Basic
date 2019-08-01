package Stack;

public interface IArrayStack<E> {

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

    /**
     * 入栈
     * @param e
     */
    void push(E e);


    /**
     * 出栈
     * @param
     */
    E pop();


    E peek();


    void print();

    void resize(int capacity);

}
