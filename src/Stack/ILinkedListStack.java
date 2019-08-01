package Stack;

public interface ILinkedListStack<E> {

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

//    void resize(int capacity);
    /**
     * 链表是动态的 无需进行resize
     */
}
