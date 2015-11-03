package org.demo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCaseV4 {

	static {
		System.out.println("\nstatic { ... } ");
	}
	
	public TestCaseV4() {
		super();
		System.out.println("\nConstructor ");
	}

	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out.println("\n@BeforeClass / setUpBeforeClass");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out.println("\n@AfterClass / tearDownAfterClass");
	}

	@Before
	public void beforeTest() throws Exception {
		System.out.println("@Before / beforeTest");
	}

	@After
	public void afterTest() throws Exception {
		System.out.println("@After / afterTest");
	}

	@Test
	public void mytest1() {
		System.out.println("@Test / mytest1");
	}

	@Test
	public void mytest2() {
		System.out.println("@Test / mytest2");
		assertEquals(1, 1);
	}

	@Test(expected=RuntimeException.class)
	public void mytest3() {
		System.out.println("@Test / mytest3");
		throw new RuntimeException("My expected exception");
	}

	@Test @Ignore
	public void mytest4() {
		System.out.println("@Test / mytest4 (ignored)");
		assertEquals(1, 1);
	}

}
