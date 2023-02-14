package com.utilities;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.IOException; 
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hpsf.Date; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.InvalidArgumentException; 
import org.openqa.selenium.TakesScreenshot; 
import org.openqa.selenium.WebDriver;
import com.mongodb.MapReduceCommand.OutputType; 
public class Utilities {
	static Workbook book; 
	static Sheet sheet;
	// Reading from excel sheet.
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null; 
		try { String inputData = "C:\\Users\\DELL"; 
		file = new FileInputStream(inputData ); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			} try { book = WorkbookFactory.create(file);
			}catch (InvalidArgumentException e) {
				e.printStackTrace(); 
				} catch (IOException e) { 
					e.printStackTrace();
					} sheet = book.getSheet(sheetName); 
					Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
					for (int i = 0; 
							i < sheet.getLastRowNum();
							i++) { for (int k = 0; k < sheet.getRow(0).getLastCellNum(); 
									k++) { data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
									}
							} 
					return data;
							}
	public String getScreenshot1(WebDriver driver, String screenshotName) throws IOException
							{ 
								String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); 
								TakesScreenshot ts = (TakesScreenshot) driver;
								File source = ts.getScreenshotAs(OutputType.FILE); 
								// after execution, you could see a folder "FailedTestsScreenshots"
								// under src folder String destination = System.getProperty("user.dir") + "/TestsScreenshots/" + screenshotName + dateName 
								+".png"; 
								String destination;
								File finalDestination = new File(destination);
								FileUtils.copyFile(source, finalDestination); 
								Object returndata;
								returndata;
								} 

}
