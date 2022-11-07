package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaplanFirstPage implements KaplanController{
	public WebDriver driver;
	@FindBy(xpath="//button[@data-cookiefirst-action='accept']")
	public WebElement cookies;
	@FindBy(xpath="//a[@title='Courses']")
	public WebElement courseMenu;
	@FindBy(xpath = "//a[@title='Association of Chartered Certified Accountants']")
	public WebElement courseTitle;
	@FindBy(xpath="//a[@title='ACCA Strategic Professional']")
	public WebElement courseSelected;
	public KaplanFirstPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void urlLaunch() {
		driver.get("https://kaplan.co.uk/");
	}
	public void page() throws InterruptedException {
		Thread.sleep(5000);
		cookies.click();
		Thread.sleep(5000);
		courseMenu.click();
		
		//courseMenu.click();
		//Thread.sleep(5000);
		courseTitle.click();
		//Thread.sleep(5000);
		courseSelected.click();
	}

}
