package Practise;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testcase1 {
@BeforeSuite
public void test1() {
	System.out.println("Before Suite");
}
@Test
public void test2() {
System.out.println("Test");
}
@AfterSuite
public void test3() {
	System.out.println("After Suite");
}
}
