package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

public class testQueue {

	@Test
	public void test() {
		Queue q = new Queue(3);
		q.enqueue(3);
		assertTrue(q.dequeue()==3);
		//assertFalse(q.dequeue()==2);
	}

}
