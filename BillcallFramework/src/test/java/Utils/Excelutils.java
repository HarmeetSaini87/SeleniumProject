package Utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	static String projectpath;
	static  XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Excelutils(String excelPath,String sheetName) throws IOException{
		
			
		workbook = new XSSFWorkbook(excelPath);
		sheet= workbook.getSheet(sheetName);
		
	}
	
	public static void main(String[] args) {
		//getrowcount();
		//getCelldatastring(0,0);
	//	getCelldatanumber(1,1);
		
	}

	public static void getrowcount()  {
		// TODO Auto-generated method stub
		try {
			
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("No of Rows :"+ rowcount);

		}catch(Exception exp){

			System.out.println(exp.getMessage());	
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void getCelldatastring(int rowNum, int colNum)  {
		// TODO Auto-generated method stub
		try {
			
			String  celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldata);


		}catch(Exception exp){

			System.out.println(exp.getMessage());	
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void getCelldatanumber(int rowNum, int colNum)  {
		// TODO Auto-generated method stub
		try {
			//DataFormatter formatter = new DataFormatter();
			double celldata1 = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata1);


		}catch(Exception exp){

			System.out.println(exp.getMessage());	
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	
}
