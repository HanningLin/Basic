package Heap;

import Heap.Impl.MaxHeapImpl;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        MaxHeapImpl<Integer> heap = new MaxHeapImpl<>();
        Integer[] nums = new Integer[]{2, 23, 30, 8, 32, 31, 41, 1, 15};

        for (Integer num : nums) {
            heap.offer(num);
        }

        heap.print();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
    }
}
