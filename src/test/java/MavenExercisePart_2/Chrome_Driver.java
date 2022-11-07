package MavenExercisePart_2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome_Driver {
	@Test
	public void driver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome_webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//driver.manage().timeouts().implicitlyWait(10,Seconds);
		driver.manage().window().maximize();
		
	}
	
	
}
