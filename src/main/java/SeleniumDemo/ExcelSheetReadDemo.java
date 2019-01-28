package SeleniumDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetReadDemo {

	public static void main(String[] args) throws Exception {

		String path = System.getProperty("user.dir") + "\\src\\main\\java\\SeleniumDemo\\excel_sheet_read_demo.xlsx";

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		
		System.out.println("row is "+row+" and col is "+col);
		
		for(int r=0;r<row+1;r++){
			for(int c=0;c<col;c++)
				System.out.print(sheet.getRow(r).getCell(c).getStringCellValue()+" ");
				System.out.println("");
		}

	}

}
