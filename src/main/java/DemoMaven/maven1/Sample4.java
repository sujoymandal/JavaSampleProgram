package DemoMaven.maven1;

import org.testng.annotations.Test;

import com.excelRead.ExcelRead;

public class Sample4 {
	
	@Test
	public void test1(){
		String path="C:\\Users\\sujoym\\workspace\\maven1\\src\\main\\java\\com\\data\\data.xlsx";
		String sheet="Sheet1";
		System.out.println("sample");
		//ExcelRead.setCellValue(path, sheet, "Test");
		//ExcelRead.readExcel(path, sheet);
		//System.out.println("return value is "+rt);
		try {
			ExcelRead.setCellData(path, sheet, "Test", 1, 2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
