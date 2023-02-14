package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utilities {
	static Workbook book;
	static Sheet sheet;

	// Reading from excel sheet.
	public static Object[][] getTestData(String Sheet1) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			// String inputData =
			// "C:\\Users\\DELL\\OneDrive\\Desktop\\ProjectFolder\\TestData.xlsx";
			String inputData = "C:\\Users\\Lenovo\\Desktop\\TestData1.xlsx";
			file = new FileInputStream(inputData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file); // book format <---- WorkbookFactory class
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(Sheet1);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) { // <-------- to get inside each rows and columns of the xl
															// sheet
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
	}
	/*
	 * //----Adding Screenshots----- public String getScreenshot(WebDriver driver,
	 * String screenshotName) throws IOException{ String dateName = new
	 * SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); TakesScreenshot ts =
	 * (TakesScreenshot) driver; File source = ts.getScreenshotAs(OutputType.FILE);
	 * // after execution, you could see a folder "FailedTestsScreenshots" // under
	 * src folder String destination = System.getProperty("user.dir") +
	 * "/TestsScreenshots/" + screenshotName + dateName + ".png"; File
	 * finalDestination = new File(destination); FileUtils.copyFile(source,
	 * finalDestination); return destination; }
	 */

}
