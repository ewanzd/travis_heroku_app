package myapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyControllerTest {

	@Test
	public void test_ReturnValidJSON() {
		assertEquals("{\"id\":123}", new MyController().test(""));
	}

}
