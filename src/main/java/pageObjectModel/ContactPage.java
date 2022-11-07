package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver;
	@FindBy(xpath="//input[@name='email_to[]' and @value='0']")
	WebElement email;
	@FindBy(xpath="//input[@name='email_to[]' and @value='2']")
	WebElement email2;
	@FindBy(xpath="//input[@name='subject']")
	WebElement subject;
	
	
	public ContactPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void firstPage(String Data1, String Data2) throws InterruptedException {
		Thread.sleep(3000);
		email.click();
		email2.click();
		Thread.sleep(5000);
		subject.sendKeys("reg defect");
	}
	

}
