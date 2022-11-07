package mainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import dataProvidePackage.DataProviderClass;

public class MainClass {
	public WebDriver driver;
	@BeforeMethod
	public void chromeDriverLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chrome_webdriver\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php/");
		
	}
	
	@AfterMethod
	public void driverClose() {
		driver.close();
	}
	
	
	public Object[][] getExcelData(String excelName, String sheetName){
		String excelLocation =

		System.getProperty("user.dir")+"/src/test/resources/"+excelName;
		//log.info("excel location "+excelLocation);
		DataProviderClass excelHelper = new DataProviderClass();
		Object[][] data = excelHelper.getExcelData(excelLocation,

		sheetName);

		return data;
		}

}
