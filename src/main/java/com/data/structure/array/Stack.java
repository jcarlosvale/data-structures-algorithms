package com.data.structure.array;

import com.data.structure.general.Element;

public class Stack {
    private Element [] stack;
    private int topIndex;

    public Stack(int size) {
        topIndex = -1;
        if (size > 0) {
            stack = new Element[size];
        }
    }

    public void push(Element element) {
        if (!isFull()) {
            topIndex++;
            stack[topIndex] = element;
        } else {
            throw new RuntimeException("Stack is full");
        }
    }

    public Element pop() {
        Element element = peek();
        topIndex--;
        return  element;
    }

    public Element peek(){
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        } else {
            return stack[topIndex];
        }
    }

    private boolean isEmpty() {
        return topIndex < 0;
    }

    private boolean isFull() {
        return topIndex == stack.length-1;
    }
}
