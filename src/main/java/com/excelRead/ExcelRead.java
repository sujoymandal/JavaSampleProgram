package com.excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static FileInputStream fis;
	public static FileOutputStream fio;
	public static XSSFWorkbook excelBook;
	public static XSSFSheet excelsheet;
	public static int row;
	public static int col;
	public static XSSFCell cell;
	public static XSSFRow Row;

	public static void readExcel(String fileName, String sheetName) {

		try {
			fis = new FileInputStream(fileName);
			excelBook = new XSSFWorkbook(fis);
			excelsheet = excelBook.getSheet(sheetName);
			//col = excelsheet.getRow(0).getLastCellNum();
			row = excelsheet.getLastRowNum();
			col=excelsheet.getRow(row).getLastCellNum();
			//XSSFCell cell=excelsheet.getRow(1).getCell(1);
			
			System.out.println("no. of rows " + row);
			System.out.println("no of columns " + col);
			
			for(int i=0;i<=row;i++){
				for(int j=0;j<=col-1;j++){
				XSSFCell cell=excelsheet.getRow(i).getCell(j);
			if(cell==null){
				System.out.println("No value present..");
			}
			else
				System.out.println("value is "+cell.getStringCellValue());
		}
				
			}
			excelBook.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	
	
	
	public static synchronized  void setCellData(String xlsFileName, String SheetName, String Result, int RowNum, int ColNum)
			throws Exception {
		FileInputStream ExcelFile = null;
		try {
			ExcelFile = new FileInputStream(xlsFileName);
			excelBook = new XSSFWorkbook(ExcelFile);
			excelsheet = excelBook.getSheet(SheetName);
			Row = excelsheet.getRow(RowNum);
			cell = Row.getCell(ColNum);
			if (cell == null) {
				cell = Row.createCell(ColNum);
				cell.setCellValue(Result);
			} else {
				cell.setCellValue(Result);
			}
			FileOutputStream fileOut = new FileOutputStream(xlsFileName);
			excelBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
			ExcelFile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			ExcelFile.close();
		} catch (IOException e) {
			e.printStackTrace();
			ExcelFile.close();
		}
	}

	
	

	public static void setCellValue(String fileName, String sheetName, String val) {

		try {

			fis = new FileInputStream(fileName);
			excelBook = new XSSFWorkbook(fis);
			excelsheet = excelBook.getSheet(sheetName);
			XSSFRow r = excelsheet.createRow(1);
			cell = r.createCell(1);
			cell.setCellValue(val);
			fio = new FileOutputStream(fileName);
			excelBook.write(fio);
			fio.flush();
			fio.close();
			excelBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
