package pageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaplanSecondPage implements KaplanController {
	WebDriver driver;
	@FindBy(xpath="//button[@aria-label='Dismiss Message']")
	WebElement messagebtn;
	@FindBy(css="a[class='btn btn-md-lg btn-alpha d-block mt-5 mb-4']")
	WebElement selectingSubjects ;
	

	public KaplanSecondPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	

	public void page() throws InterruptedException {
		
		//messagebtn.click();
		Thread.sleep(6000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600)"," ");
		Thread.sleep(4000);
		selectingSubjects.click();
		
		
		
	}

}
