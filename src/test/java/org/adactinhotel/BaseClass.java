package org.adactinhotel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass
{
	static WebDriver driver;

	public static void driver(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void quit() {
		driver.quit();
	}
	public static void implicitlywait()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		element.click();
	}
	
	public static String excelRead(String path, String sheetName, int rowindex, int cellindex) throws IOException {
		File f = new File(path);

		FileInputStream stream = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(stream);

		Sheet sheet = book.getSheet(sheetName);

		Row row = sheet.getRow(rowindex);

		Cell cell = row.getCell(cellindex);

		int cellType = cell.getCellType();
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
			return stringCellValue;
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
			String format = date.format(dateCellValue);
			return format;
		} else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long) numericCellValue;
			String valueOf = String.valueOf(l);
			return valueOf;
		}
	}

	public static void exelwrite(String path, String sheetName, int rowIndex, int cellIndex, String value)
			throws IOException {
		File excelwrite = new File(path);
		FileOutputStream outputstream = new FileOutputStream(excelwrite);
		Workbook createBook = new XSSFWorkbook();
		Sheet createSheet = createBook.createSheet(sheetName);
		Row createRow = createSheet.createRow(rowIndex);
		Cell createCell = createRow.createCell(cellIndex);
		createCell.setCellValue(value);
		createBook.write(outputstream);
	}

	public static void actionsClick(WebElement element) {
		Actions action = new Actions(driver);
		action.click(element).perform();
	}

	public static void thread(int num) throws InterruptedException {
		Thread.sleep(num);
	}

	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static String gettingAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
}
