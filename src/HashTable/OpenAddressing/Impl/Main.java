package HashTable.OpenAddressing.Impl;

import HashTable.IHashTable;

public class Main {
    public static void main(String[] args) {
        IHashTable<Integer, Integer> hashTable = new HashTableOpenAddressingImpl<>();
        hashTable.put(1,5);
        hashTable.put(2,5);
        hashTable.put(3,5);
        hashTable.put(4,5);
        hashTable.put(5,6);
        hashTable.print();
        hashTable.put(7,6);
        hashTable.print();

        hashTable.delete(4);
        hashTable.print();
    }
}
