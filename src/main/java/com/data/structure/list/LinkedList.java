package com.data.structure.list;

import com.data.structure.general.Element;
import com.data.structure.general.Node;

public class LinkedList {
    private Node head;

    public LinkedList(Element element) {
        head = new Node(element);
        head.next = null;
    }

    public void insertBegin(Element element) {
        Node node = new Node(element);
        node.next = head;
        head = node;
    }

    public void insertEnd(Element element) {
        Node node = new Node(element);
        if (null == head) {
            head = node;
        } else {
            Node reference = head;
            while (reference.next != null) {
                reference = reference.next;
            }
            reference.next = node;
        }
    }

    public Node search(Element element) {
        Node reference = head;
        while (reference != null) {
            if(reference.element.isEqualTo(element.getValue())) {
                return reference;
            }
            reference = reference.next;
        }
        return null;
    }

    public boolean delete(Element element) {
        if (head == null) return false;  //empty list
        if (head.element.isEqualTo(element.getValue())) { //is the first element
            head = head.next;
            return true;
        } else {
            Node reference = head;
            while (reference.next != null) {
                if(reference.next.element.isEqualTo(element.getValue())) {
                    reference.next = reference.next.next;
                    return true;
                }
                reference = reference.next;
            }
        }
        return false;
    }

    public Node removeHead() {
        if (null == head) {
            return null;
        } else {
            Node node = head;
            head = head.next;
            return node;
        }
    }
}
