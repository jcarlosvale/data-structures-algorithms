package com.data.structure.array;

import com.data.structure.general.Element;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void queueBasicTest() {
        Queue queue = new Queue(3);
        queue.enqueue(new Element(1));
        assertEquals(1,queue.ofFront().getValue());
        assertEquals(1,queue.ofRear().getValue());
        queue.enqueue(new Element(2));
        assertEquals(1,queue.ofFront().getValue());
        assertEquals(2,queue.ofRear().getValue());
        queue.enqueue(new Element(3));
        assertEquals(1,queue.ofFront().getValue());
        assertEquals(3,queue.ofRear().getValue());
        assertEquals(1,queue.dequeue().getValue());
        assertEquals(2,queue.dequeue().getValue());
        assertEquals(3,queue.dequeue().getValue());
    }

    @Test(expected = RuntimeException.class)
    public void queueEmptyOfFrontTest(){
        Queue queue = new Queue(0);
        queue.ofFront();
    }

    @Test(expected = RuntimeException.class)
    public void queueEmptyOfRearTest(){
        Queue queue = new Queue(0);
        queue.ofRear();
    }

    @Test(expected = RuntimeException.class)
    public void queueEmptyDequeueTest(){
        Queue queue = new Queue(0);
        queue.dequeue();
    }

    @Test(expected = RuntimeException.class)
    public void queueEmptyEnqueueTest(){
        Queue queue = new Queue(0);
        queue.enqueue(new Element(1));
    }

    @Test(expected = RuntimeException.class)
    public void queueEmptyTest(){
        Queue queue = new Queue(1);
        queue.enqueue(new Element(1));
        queue.dequeue();
        queue.dequeue();
    }

    @Test(expected = RuntimeException.class)
    public void queueFullTest(){
        Queue queue = new Queue(1);
        queue.enqueue(new Element(1));
        queue.enqueue(new Element(2));
    }
}