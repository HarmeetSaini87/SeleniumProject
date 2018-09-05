package Utils;

import java.io.IOException;

public class ExcelUtilDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String projectpath = System.getProperty("user.dir");
		Excelutils excel = new Excelutils(projectpath+"/Excel/Billc.xlsx", "Sheet1");

		excel.getrowcount();
		excel.getCelldatastring(0, 0);
		excel.getCelldatanumber(1, 1);
	}

}
