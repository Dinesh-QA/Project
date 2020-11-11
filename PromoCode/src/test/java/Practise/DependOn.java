package Practise;

import org.testng.annotations.Test;

public class DependOn {
@Test
public void test1() {
	System.out.println("Testing 1");
}
@Test
public void test2() {
	System.out.println("Testing 2");
}
@Test
public void test3() {
	System.out.println("Testing 3");
}
@Test
public void test4() {
	System.out.println("Testing 4");
}
}
