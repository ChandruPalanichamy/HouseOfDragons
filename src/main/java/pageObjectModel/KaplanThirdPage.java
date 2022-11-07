package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KaplanThirdPage implements KaplanController {
	WebDriver driver;
	@FindBy(xpath = "//label[@for='subjects-chk-0']")
	WebElement strategicBusinessLeader;
	@FindBy(xpath = "//button[@id='choose-study-options-btn']")
	WebElement chooseStudyOptions;
	@FindBy(xpath = "a[class='accordion-toggle']")
	WebElement toggle;
	@FindBy(css = "button[id='study-Method-btn-1']")
	WebElement chooseStudyMethod;
	@FindBy(xpath = "//a[@id='studymethod-acc-4']")
	WebElement distanceLearning;

	public KaplanThirdPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	
	


	public void page() throws InterruptedException {
		strategicBusinessLeader.click();
		Thread.sleep(2000);
		chooseStudyOptions.click();
		toggle.click();
		Thread.sleep(2000);
		chooseStudyMethod.click();
		Thread.sleep(3000);
		distanceLearning.click();

	}

}
