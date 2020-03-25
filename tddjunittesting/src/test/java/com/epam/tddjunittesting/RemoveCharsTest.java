package com.epam.tddjunittesting;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
/*
 * 
 *TO-DO-LIST
 * 
 *1."ABCD"->"BCD"
 * 2."AACD"->"CD"
 * 3."BACD"->"BCD"
 * 4."BBAA"->"BBAA"
 * 5."AABAA"->"BAA"
 * 6.""->""
 * 7." "->" "
 * 8." A"->" "
 * 9."A A"->" A"
 * 10."Aabaa"->"baa"
 * 11."AaaAaA"->"aAaA"
 */
 
public class RemoveCharsTest {

	
	static RemoveChars removeChars;
	
	
	@BeforeClass
	public static void init()
	{
		removeChars=new RemoveChars();
	}
	
	@Test
	public void removeCharstest1() 
	{
	assertEquals("BCD",removeChars.remove("ABCD"));
	}
	
	@Test
	public void removeCharstest2()
	{
	assertEquals("CD",removeChars.remove("AACD"));
	}
	@Test
	public void removeCharstest3()
	{
	assertEquals("BCD",removeChars.remove("BACD"));
	}
	@Test
	public void removeCharstest4()
	{
	assertEquals("BBAA",removeChars.remove("BBAA"));
	}
	@Test
	public void removeCharstest5()
	{
	assertEquals("BAA",removeChars.remove("AABAA"));
	}
	@Test
	public void removeCharstest6()
	{
	assertEquals("CD",removeChars.remove("AACD"));
	}
	@Test
	public void removeCharstest7()
	{
	assertEquals("",removeChars.remove(""));
	}
	@Test
	public void removeCharstest8()
	{
	assertEquals(" ",removeChars.remove(" A"));
	}
	@Test
	public void removeCharstest9()
	{
	assertEquals(" A",removeChars.remove("A A"));
	}
	@Test
	public void removeCharstest10()
	{
	assertEquals("baa",removeChars.remove("Aabaa"));
	}
	@Test
	public void removeCharstest11()
	{
	assertEquals("aAaA",removeChars.remove("AaaAaA"));
	}


}
