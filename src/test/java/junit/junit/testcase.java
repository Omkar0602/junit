package junit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcase {

	@Test
	public void test1() {
       addition a1= new addition();
       int actual = a1.sum(10, 20);
       int expected = 30;
       assertEquals(expected,actual);
	}

	@Test
	public void test2() {
       subtraction a1= new subtraction();
       int actual = a1.sub(20, 10);
       int expected = 10;
       assertEquals(expected,actual);
	}
}
