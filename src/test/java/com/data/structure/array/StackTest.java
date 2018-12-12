package com.data.structure.array;

import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    @Test
    public void stackBasicTest() {
        Stack stack = new Stack(3);
        stack.push(new Element(1));
        assertEquals(1,stack.peek().getValue());
        stack.push(new Element(2));
        assertEquals(2,stack.peek().getValue());
        stack.push(new Element(3));
        assertEquals(3,stack.peek().getValue());
        assertEquals(3,stack.pop().getValue());
        assertEquals(2,stack.pop().getValue());
        assertEquals(1,stack.pop().getValue());
    }

    @Test(expected = RuntimeException.class)
    public void stackEmptyPeekTest(){
        Stack stack = new Stack(0);
        stack.peek();
    }

    @Test(expected = RuntimeException.class)
    public void stackEmptyPopTest(){
        Stack stack = new Stack(0);
        stack.peek();
    }

    @Test(expected = RuntimeException.class)
    public void stackEmptyTest(){
        Stack stack = new Stack(1);
        stack.push(new Element(1));
        stack.pop();
        stack.pop();
    }

    @Test(expected = RuntimeException.class)
    public void stackFullTest(){
        Stack stack = new Stack(1);
        stack.push(new Element(1));
        stack.push(new Element(2));
    }
}