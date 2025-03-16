package DataStructureCode.HashMapDemo;

import java.util.LinkedList;

public class HashNode< K,V> {

    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
class HashMap<K, V>{
    // Hashtable is an array of buckets. each buckets holds linkedlist.
    private LinkedList<HashNode<K, V>> [] bucketArray;
    private int numBuckets;
    private int size;

    public HashMap(){
        bucketArray = new LinkedList[10];
        numBuckets= 10;
        size=0;
        for(int i=0;i<numBuckets; i++){
            bucketArray[i] = new LinkedList<>();
        }

    }

    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }

    public void put(K key, V value){
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K,V>> bucket = bucketArray[bucketIndex];

        for(HashNode<K, V> node : bucket) {
            if(node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        bucket.add(newNode);
        size++;
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = bucketArray[bucketIndex];
        for(HashNode<K, V> node : bucket){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null;
    }

    public V remove(K key){
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = bucketArray[bucketIndex];

        for(HashNode<K, V> node : bucket){
            if(node.key.equals(key)){
                bucket.remove(node);
                size--;
                return node.value;
            }
        }
        return null;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<String, String>() ;
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value2");


        System.out.println(hashMap.get("key1"));  // Output: value1
        System.out.println(hashMap.get("key3"));  // Output: null

        hashMap.remove("key1");
        System.out.println(hashMap.get("key13"));  // Output: null
        System.out.println(hashMap.size());       // Output: 1
    }
}
