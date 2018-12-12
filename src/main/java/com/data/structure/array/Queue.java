package com.data.structure.array;

import com.data.structure.general.Element;

public class Queue {
    private Element[] queue;
    private int front, rear, size, capacity;

    public Queue(int capacity) {
        queue = new Element[capacity];
        this.capacity = capacity;
        size = 0;
        front = 0;
        rear = capacity-1;
    }

    public void enqueue(Element element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        } else {
            rear = (rear+1)%capacity;
            queue[rear] = element;
            size++;
        }
    }

    public Element dequeue() {
        Element element = ofFront();
        front = (front+1)%capacity;
        size--;
        return element;
    }

    public Element ofFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            return queue[front];
        }
    }

    public Element ofRear() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else {
            return queue[rear];
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private boolean isFull() {
        return size==capacity;
    }
}
