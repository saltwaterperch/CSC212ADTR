package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(0, empty.size());
	}
	
	@Test
	public void testSize1() {
		SetADT<String> single = new JavaSet<>();
		single.insert("A");
		assertEquals(1, single.size());
	} 
	@Test
	public void testRepeatedInserts() {
		SetADT<String> letters = new JavaSet<>();
		letters.insert("A");
		letters.insert("B");
		letters.insert("C");
		// inserting 100 times should not change the set
		for (int i=0; i<100; i++) {
			letters.insert("B");
		}
		assertEquals(3, letters.size());
		assertEquals(true, letters.contains("A"));
		assertEquals(true, letters.contains("B"));
		assertEquals(true, letters.contains("C"));
		letters.remove("C");
		assertEquals(false, letters.contains("C"));
  
	} 
	
}
