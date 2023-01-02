
/**
 * @author SeyedehTahereh Houlari
 ** @version 1.0
 * @see Class Lab2Houlari
 * @since 11
 */



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PurchasesTest {

	/**
	 * @param args
	 * this is test class file to testing the methods that considered in lab4.  
	 */
	
	private static final double EPSILON = 1E-12; 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
    }

	@After
	public void tearDown() throws Exception {
	}
// the following test is consider for the method CalculateChange that introduced in YourPerchases class. 
	//As by run this test we can see this test is right and it runs successfully. 
	
	@Test public void test2CalculateChange() {
		YourPurchases testPurchase = new YourPurchases();
		testPurchase.recordPurchase(1.5);
		testPurchase.recordPurchase(0.75);
		testPurchase.recordPurchase(1.25);
		testPurchase.receivePayment(3, 4, 10, 0, 0);
		double expected = 8.50;
	    Assert.assertEquals(expected, testPurchase.CalculateChange(), EPSILON);
	}
	// the following test is consider for the method giveChange that introduced in YourPerchases class. 
		//As by run this test we can see this test is fail because of the the wrong expected amount. 
	@Test public void test3giveChange() {
		YourPurchases newPurchase = new YourPurchases();
		newPurchase.recordPurchase(1.25);
		newPurchase.receivePayment(1, 0, 2, 2, 3);
		double expected = 2.5;
	    Assert.assertEquals(expected, newPurchase.giveChange(), EPSILON);
		assertTrue(true);
	}

}
