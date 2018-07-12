package _02_More_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {

	Mult m = new Mult();
	Prime p = new Prime();
	Square s = new Square();
	Cube c = new Cube();

	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", m.multiply(10, 0));
		assertEquals("10 x 10 = 100", m.multiply(10, 10));
		assertEquals("8 x 11 = 88", m.multiply(8, 11));
	}

	@Test
	public void PrimeTest() {

		assertTrue(p.isPrime(3));
		assertTrue(p.isPrime(5));
		assertTrue(p.isPrime(541));
		assertFalse(p.isPrime(4));
		assertFalse(p.isPrime(12));
		assertFalse(p.isPrime(527));

	}

	@Test
	public void SquareTest() {

		assertTrue(s.isSquare(4));
		assertTrue(s.isSquare(144));
		assertTrue(s.isSquare(64));
		assertTrue(s.isSquare(10201));
		assertTrue(s.isSquare(1));
		assertFalse(s.isSquare(3));
		assertFalse(s.isSquare(22));
		assertFalse(s.isSquare(143));

	}

	@Test
	public void CubeTest() {

		assertTrue(c.isCube(27));
		assertTrue(c.isCube(216));
		assertTrue(c.isCube(729));
		assertTrue(c.isCube(1));
		assertFalse(c.isCube(3));
		assertFalse(c.isCube(22));
		assertFalse(c.isCube(143));

	}

}
