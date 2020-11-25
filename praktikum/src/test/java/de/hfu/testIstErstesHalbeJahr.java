package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

public class testIstErstesHalbeJahr {

	@Test
	public void test() {
		Util u = new Util();
		assertTrue(Util.istErstesHalbjahr(2)==true);
		assertFalse(Util.istErstesHalbjahr(10)==true);
	
	}

}
