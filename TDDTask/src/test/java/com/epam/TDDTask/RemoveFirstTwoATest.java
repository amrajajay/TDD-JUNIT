package com.epam.TDDTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class RemoveFirstTwoATest {
	RemoveFirstTwoA removeFirstTwoA;
	@BeforeEach
	void Setup()
	{
		removeFirstTwoA=new RemoveFirstTwoA();
	}
	

	@Test
	void  test1A() {
		assertEquals("",removeFirstTwoA.removeA("A"));
		
		
	}
	@Test
	void  test2A() {
		assertEquals("",removeFirstTwoA.removeA("AA"));
		
		
	}
	@Test
	void  test3A() {
		assertEquals("BCD",removeFirstTwoA.removeA("ABCD"));
		
		
	}
	@Test
	void  test4A() {
		assertEquals("CD",removeFirstTwoA.removeA("AACD"));
		
		
	}
	@Test
	void  test5A() {
		assertEquals("BCD",removeFirstTwoA.removeA("BACD"));
		
		
	}
	@Test
	void  test6A() {
		assertEquals("BBAA",removeFirstTwoA.removeA("BBAA"));
		
		
	}
	@Test
	void  test7A() {
		assertEquals("BAA",removeFirstTwoA.removeA("AABAA"));
		
		
	}

}
