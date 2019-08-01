package HashTable.seperateChaining.Impl;

import HashTable.IHashTable;
import HashTable.seperateChaining.HashNode;

public class HashTableSeperateChainingImpl<K, V> implements IHashTable<K, V> {

    private HashNode[] hashNodes;

    private int capacity;

    private int size;

    public HashTableSeperateChainingImpl() {
        this.capacity = 5;
        hashNodes = new HashNode[capacity];
    }

    public HashTableSeperateChainingImpl(HashNode[] hashNodes) {
        this.capacity = capacity;
        hashNodes = new HashNode[capacity];
    }

    // hash function
    private int hash(K key) {
        return key.hashCode() % capacity;
    }


    //设置成ListNode类型
    @Override
    public void put(K key, V value) {
        HashNode<K, V> hashNode = new HashNode<>(key, value);
        int index = hash(key);

        HashNode curNode = hashNodes[index];
        HashNode preNode = null;
        if (curNode == null) {
            hashNodes[index] = hashNode;
        } else {
            while (curNode != null) {
                if (curNode.key.equals(key)) {
                    curNode.value = value;
                    return;
                }
                preNode = curNode;
                curNode = curNode.next;
            }
            preNode.next = hashNode;
        }
        size++;
    }

    @Override
    public V get(K key) {
        int index = hash(key);
        HashNode curNode = hashNodes[index];
        while (curNode != null) {
            if (curNode.key.equals(key)) {
                return (V) curNode.value;
            }
            curNode = curNode.next;
        }
        return null;
    }

    @Override
    public V delete(K key) {
        int index = hash(key);
        HashNode curNode = hashNodes[index];
        HashNode preNode = null;

        while (curNode != null) {
            if (curNode.key.equals(key)) {
                break;
            }
            preNode = curNode;
            curNode = curNode.next;
        }

        if (curNode == null) {
            return null;
        } else if (preNode == null) {           // 当当前ListNode仅有一个元素
            hashNodes[index] = curNode.next;
        } else {
            preNode.next = curNode.next;
        }
        size--;
        return (V) curNode.value;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void print() {
        for (HashNode<K, V> hashNode : hashNodes) {
            if (hashNode != null) {
                System.out.print("key: " + hashNode.key + " value: " + hashNode.value + " -> ");
                hashNode = hashNode.next;
            }
            System.out.println(" null");
        }
        System.out.println("size: " + size);
    }

}
