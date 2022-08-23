package DataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadTestData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\SWHIZZ TECHNOLOGIES\\eclipse-workspace1\\SeleniumProject\\src\\TestData_Files\\SwhizzPortlTestcases.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("TestData");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("NO of Rows are " + rowcount);
		System.out.println("NO of Cols are " + colcount);
		for (int i = 2; i <= rowcount; i++) {

			XSSFRow rowdata = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				XSSFCell celvalue = rowdata.getCell(j);
				System.out.print("    " + celvalue);
			}
			System.out.println();
		}

	}
}
