package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import generic.GenericUtils;
import pom.HomePage;

public class TestScripts extends BaseTest {
	@Test(enabled=false)
	public void testcreateEmployee() throws EncryptedDocumentException, IOException {
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		pi.clickLoginBtn();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickAddEmpMenu();
		pi.setFName("Kevin1");
		pi.setlName("Fernanades");
		pi.clickSaveBtn();
		pi.verifyFirstname("Kevin1");
		
	}
	@Test(enabled=true)
	public void testSortListBox() throws EncryptedDocumentException, IOException {
		HomePage pi=new HomePage(driver);
		pi.setUserName(Excel.readData("Sheet1", 0, 1));
		pi.setPwd(Excel.readData("Sheet1", 1, 1));
		pi.clickLoginBtn();
		BasePage.verifyTitle("OrangeHRM");
		pi.clickPimMenu();
		pi.clickEmp_List();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		Reporter.log("Hello",true);
	}

}
