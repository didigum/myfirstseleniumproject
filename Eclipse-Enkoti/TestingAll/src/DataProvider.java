import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataProvider {

	//public static void main(String[] args) {
		
		
	
	public Object[][] setUp(String sheetName) throws Exception {

		File f = new File("/Users/ranjeethdidigum/Eclipse-Enkoti/TestingAll/src/com/TestData/FreeCrmTestData.xlsx");

		FileInputStream fis = new FileInputStream(f);

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(sheetName);

		int row = sheet.getLastRowNum();

		int col = sheet.getRow(0).getLastCellNum();

		System.out.println(row + " " + col);

		Object[][] data = new Object[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				System.out.println(data[i][j]);

			}
		}
		return data;

	}
}

