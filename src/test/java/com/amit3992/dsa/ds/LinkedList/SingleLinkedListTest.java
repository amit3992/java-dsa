package com.amit3992.dsa.ds.LinkedList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class SingleLinkedListTest {

    private LinkedList singleLinkedList;
    private ListNode headNode;

    @Before
    public void init() {
        headNode = new ListNode("A");

        singleLinkedList = new LinkedList(headNode);
    }

    @Test
    public void appendListTest() {
        ListNode bNode = new ListNode("B");
        singleLinkedList.appendNode(bNode);

        ListNode node = singleLinkedList.getHeadNode();
        while(node.nextNode != null) {
            node = node.nextNode;
        }
        Assert.assertEquals(node.getData().toString(), "B");
    }

    @Test
    public void printListTest() {
        ListNode bNode = new ListNode("B");
        ListNode cNode = new ListNode("C");
        ListNode dNode = new ListNode("D");

        singleLinkedList.appendNode(bNode);
        singleLinkedList.appendNode(cNode);
        singleLinkedList.appendNode(dNode);

        singleLinkedList.printList();

    }
}
