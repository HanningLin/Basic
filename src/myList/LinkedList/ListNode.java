package myList.LinkedList;

/**
 * 因为是以节点的形式 因此需要开辟一个class空间来定义这个数据结构
 * 数据域 +  指针域
 * 指针指向当前node的value
 * 然后value指针指向next
 *
 */
public class ListNode {

    public int data;

    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;

    }

}
