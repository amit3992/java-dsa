package com.amit3992.dsa.ds.LinkedList;

import com.amit3992.dsa.model.Node;

public class ListNode<String> implements Node<String> {

    private String data;
    ListNode<String> nextNode;

    public ListNode(String data) {
        this.data = data;
        nextNode = null;
    }

    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }
}
