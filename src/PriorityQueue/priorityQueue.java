package PriorityQueue;
import java.util.Comparator;
import  java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {

    public static void compare1() {

        int[] nums = new int[]{1,2,3,4};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.offer(num);
        }

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

    }

    /**
     * 将comparator进行重写
     * maximum heap
     * descending order
     */
    public static void compare2() {
        int[] nums = new int[]{1,2,3,4};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : nums) {
            priorityQueue.offer(num);
        }

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }


    /**
     * 可以自己定义新的class来进行重写
     */
    public static void compare3() {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.a - o2.a;
            }
        });
    }
    

    public static void compare4() {
        int[] nums = new int[]{1, 2, 3, 4};
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(5, (a, b) -> (a.a - b.a));
        PriorityQueue<int[]> priorityQueue1 = new PriorityQueue<>((a, b) -> (a[0] + a[1] - b[0] - b[1]));

    }

    public class Node {
        int a;
        int b;
    }

    public static void main(String[] args) {
        compare1();
        System.out.println();
        compare2();
    }
}
