package Lab2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLab2_1 {
	public static final double EPS = 0.01;

	@Test
	void test1() {
		int[] arrTest = new int[] {1, 2, 3, 4, 5};
		int expResult = 6;
		int result = lab2_1.plusNum(arrTest);
		assertEquals(expResult, result, EPS);
	}
}
