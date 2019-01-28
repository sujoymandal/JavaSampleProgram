package SeleniumDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotationDemo {
	
	@Test
	@Parameters({"param1","param2"})
	public void getParameter(String val1, String val2){
		System.out.println("parameter value from testng xml is  "+val1);
		System.out.println("parameter value from testng xml is  "+val2);
	}
	
	@Test
	public void test1(){
		System.out.println("first test..");
	}
	
	@Test(enabled=false)
	public void test2(){
		System.out.println("second tesst..");
	}
	
	@Test(enabled=true)
	public void test3(){
		System.out.println("Third test..");
	}

}
