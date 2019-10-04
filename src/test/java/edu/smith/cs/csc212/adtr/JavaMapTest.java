package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, String> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
		//Assert.assert
	}
	
	@Test
	public void testSize1() {
		MapADT < String, Integer> phone = new JavaMap<>();
		phone.put("Nora", 7);
		assertEquals(1, phone.size());
	}
	
	@Test
	public void testNumGet() {
		MapADT< Integer, Integer> squares = new JavaMap<>();
		squares.put(1,1);
		squares.put(2, 4);
		squares.put(3, 9);
		// ambiguous
		// assertEquals(int, int)
		// assertEquals(Object, Object)
		// assertEquals( squares.get(2), 4);
		
		// solutions:
		assertEquals((int) squares.get(2), 4);
		assertEquals(squares.get(2), (Integer) 4);
		assertIntEq(squares.get(2), 4);
	}
	
	@Test
	public void testRemove() {
		MapADT< String, Integer> data = new JavaMap<>();
		data.put("Dave", 30);
		data.put("Bertie", 20);
		assertEquals(2, data.size());
		data.remove("Dave");
		assertEquals(1, data.size());
	}
}
