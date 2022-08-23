package DataDrivenFrameWork;

import java.io.IOException;

public class Utilclass {

	public static String[][] getexceldata() throws IOException {

		XLUtility reader = new XLUtility(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\SeleniumProject\\src\\TestData_Files\\SwhizzPortlTestcases.xlsx");

		int rowcount = reader.getRowCount("TestData");
		int colcount = reader.getCellCount("TestData", 1);
		System.out.println("no fo Rows" + rowcount);// 6
		System.out.println("no fo cols" + colcount);// 5

		String exceldata[][] = new String[rowcount - 1][colcount];

		for (int i = 2; i <= rowcount; i++) {
			for (int j = 0; j < colcount; j++) {

				exceldata[i - 2][j] = reader.getCellData("TestData", i, j);

			}

		}
		return exceldata;
	}

	public String[][] set() throws IOException {
		XLUtility reader = new XLUtility("");
		int r = reader.getRowCount("TestData");
		int c = reader.getCellCount("TestData", 1);
		String[][] exceldata = new String[r][c];
		for (int i = 0; i < exceldata.length; i++) {
			for (int j = 0; j < exceldata.length; j++) {
				exceldata[i-2][j]=reader.getCellData("TestData", i, j);
			}
			
		}
return exceldata;
	}

}
