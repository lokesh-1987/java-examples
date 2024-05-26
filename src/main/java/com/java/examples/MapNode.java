package com.java.examples;


public class MapNode<k, v> {

    k key;
    v val;
    MapNode<k,v> next;

    public MapNode(k key, v val) {
        this.key = key;
        this.val = val;
    }
}
