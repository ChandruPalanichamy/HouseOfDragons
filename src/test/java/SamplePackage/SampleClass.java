package SamplePackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mainPackage.MainClass;
import pageObjectModel.ContactPage;

public class SampleClass extends MainClass {
	@Test(dataProvider = "sampledata")
	void method1(String Data1, String Data2) throws InterruptedException {
		
		ContactPage page1 = new ContactPage(driver);
		page1.firstPage(Data1,Data2);
		System.out.println(Data1+ " "+ Data2);
		
	}
	@DataProvider(name="sampledata")
	public Object[][] sampledata(){Object[][] data = 
	getExcelData("TestData1.xlsx", "LOGIN");
	//workbookname,sheetname
	return data;
	}
}