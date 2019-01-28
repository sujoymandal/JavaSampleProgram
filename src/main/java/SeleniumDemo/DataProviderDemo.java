package SeleniumDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="dataprovider")
	public void test1(String d1,String d2){

		
		System.out.println("First data comming from dataprovider is :"+d1);
		System.out.println("Second data comming from dataprovider is :"+d2);
	}
	
	@DataProvider
	public Object[][] dataprovider(){
		Object[][] data=new Object[2][2];
		data[0][0]="data1";
		data[0][1]="data2";
		data[1][0]="data3";
		data[1][1]="data4";
		return data;
	}
	
}
