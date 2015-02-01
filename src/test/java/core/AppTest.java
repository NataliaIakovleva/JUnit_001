package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed first method starts");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method completed");
				
	}

	@Before
	public void Before() throws Exception {
		System.out.println("Before method will be executed before every test methods");
	
	
	}

	@After
	public void After() throws Exception {
		System.out.println("After method will be executed after every test methods");
	}

	@Test
	public void Test_01_assertEquals_Positive(){
		String s = "ok";
		assertEquals("failure - strings are not equal", "ok", s);
		System.out.println("Test_01_assertEquals_Positive");
	}
	
	@Test
	public void Test_02_assertEquals_Negeative() {
		Boolean f = false;
		assertEquals("failure - should be false", f);
		System.out.println("Test_02_assertEquals_Negative");
		
	}
	
	@Ignore
	public void Test_03_assertEquals_Ignore() {
		System.out.println("Test_03_assertEquals_Ignore - not ready yet");
		
	}

	@Test
	public void Test_04_assertSame_Positive(){
		Integer i = 5;
		assertSame("should be same", 5, i);
		System.out.println("Test_04_assertEquals_Positive");
	}
	

	@Test
	public void Test_05_assertSame_Negeative() {
		Integer i = 5;
		assertSame("should be same", 7, i);
		System.out.println("Test_05_assertSame_Negative");
		
	}
	
	@Ignore
	public void Test_06_assertEquals_Ignore() {
		Integer i = 5;
		assertNotSame("should be ignore", 6, i);
		System.out.println("Test_06_assertSame_Ignore");
		
	}

	@Test
	public void Test_07_assertFalse_Positive(){
		Boolean f = false;
		assertNotEquals("Pass - should be false", f);
		System.out.println("Test_07_assertFalse_Positive");
	}
	
	@Test
	public void Test_08_assertFalse_Negeative() {
		Boolean f = true;
		assertFalse("failure - should be false", f);
		System.out.println("Test_08_assertFalse_Negeative");
		
	}

	@Test
	public void Test_09_assertTrue_Positive(){
		Boolean t = true;
		assertTrue("failure - should be true", t);
		System.out.println("Test_09_assertTrue_Positive");
	}
	
	@Test
	public void Test_10_assertTrue_Negeative() {
		Boolean t = false;
		assertTrue("failure - should be true", t);
		System.out.println("Test_10_assertTrue_Negeative");


		
	}
}
	


