package junit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
       addition a1= new addition();
       int actual = a1.sum(10, 20);
       int expected = 30;
       assertEquals(expected,actual);
	}

}
