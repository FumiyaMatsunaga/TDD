package money;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		
		product = five.times(3);
		assertEquals(15, product.amount);
	}
	
	@Test
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	@Test
	public void testFrancMultiplication() {
		Franc five = new Franc(5);
		asertEquals(new Franc(10), five.times(2));
		asertEquals(new Franc(15), five.times(3));
	}

}
