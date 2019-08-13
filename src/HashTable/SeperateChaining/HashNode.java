package HashTable.SeperateChaining;


/**
 * 链表形式的HashNode
 *
 * @param <K>
 * @param <V>
 */
public class HashNode<K, V> {

    public K key;

    public V value;

    public HashNode next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
