package com.amit3992.dsa.ds.LinkedList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LinkedList {

    private static final Logger LOGGER = LoggerFactory.getLogger(LinkedList.class);

    ListNode head;

    public LinkedList () {
        this.head = null;
    }

    public LinkedList (ListNode node) {
        this.head = node;
    }

    public void appendNode(ListNode node) {
        LOGGER.info("Appending node to the list: {}", node.getData().toString());
        if(head == null) {
            LOGGER.info("List is empty. Adding node to head of the list");
            setHeadNode(node);
        } else {
            ListNode listNode = head;
            while(listNode.nextNode != null) {
                listNode = listNode.nextNode;
            }
            listNode.nextNode = node;
        }
        LOGGER.info("Node appended successfully!");

    }

    public void printList() {
        LOGGER.info("Printing list.");
        ListNode node = head;
        while(node != null) {
            System.out.print(node.getData().toString() + " ");
            node = node.nextNode;
        }

    }

    private void setHeadNode(ListNode node) {
        this.head = node;
    }

    public ListNode getHeadNode() {
        return this.head;
    }
}
