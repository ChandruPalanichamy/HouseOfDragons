package SamplePackage;

import org.testng.annotations.Test;

import mainPackage.MainClass;
import pageObjectModel.KaplanController;
import pageObjectModel.KaplanFirstPage;
import pageObjectModel.KaplanSecondPage;
import pageObjectModel.KaplanThirdPage;

public class KaplanTest extends MainClass {

	@Test(priority = 1,description = "First Page")
	public void firstPage() throws InterruptedException {
		KaplanFirstPage first = new KaplanFirstPage(driver);

		first.urlLaunch();
		first.page();

	}
	@Test(priority = 2,description = "Second Page")
	public void secondPage() throws InterruptedException {
		KaplanSecondPage second = new KaplanSecondPage(driver);
		second.page();
	}
	@Test(priority = 3,description = "Third Page")
	public void thirdPage() throws InterruptedException {
		KaplanThirdPage third = new KaplanThirdPage(driver);
		third.page();
	}
	
	
	
	
	

}
