package com.java.examples;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=_B4IDair6W0&t=1325s
public class MyHashMap<k, v> {

    List<MapNode<k, v>> buckets;
    int size;
    int noOfBuckets;

    public MyHashMap() {
        buckets = new ArrayList<>();
        this.noOfBuckets = 20;

        for (int i = 0; i <= noOfBuckets; i++) {
            buckets.add(null);
        }
    }

    public int hashFunction(k key) {
        int hashCode = key.hashCode();
        return hashCode % noOfBuckets;
    }

    public void put(k key, v val) {
        int bucketIndex = hashFunction(key);
        MapNode<k, v> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                head.val = val;
                return;
            }
            head = head.next;
        }

        size++;
        head = buckets.get(bucketIndex);
        MapNode<k, v> newNode = new MapNode<>(key, val);
        newNode.next = head;
        buckets.set(bucketIndex, newNode);
    }

    public int size() {
        return size;
    }

    public v get(k key) {
        int bucketIndex = hashFunction(key);
        MapNode<k, v> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.val;
            }
            head = head.next;
        }
        return null;
    }
}
