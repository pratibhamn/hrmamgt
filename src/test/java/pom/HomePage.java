package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;
import junit.framework.Assert;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="txtUsername")
	private WebElement userTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(id="menu_pim_viewPimModule")
	private WebElement pim_Menu;
	@FindBy(id="menu_pim_addEmployee")
	private WebElement addEmp_Menu;
	@FindBy(id="firstName")
	private WebElement fName;
	@FindBy(id="lastName")
	private WebElement lName;
	@FindBy(id="btnSave")
	private WebElement saveBtn;
	@FindBy(id="personal_txtEmpFirstName")
	private WebElement fName1;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_List;
	
	
	public void setUserName(String un) {
		
		userTxtBox.sendKeys(un);
	}
	
public void setPwd(String pwd) {
		
	pwdTxtBox.sendKeys(pwd);
	}
public void clickLoginBtn() {
	
	loginBtn.click();
	}
public void clickPimMenu() {
	
	pim_Menu.click();
	}
public void clickAddEmpMenu() {
	
	addEmp_Menu.click();
	}
public void setFName(String fn) {
	
	fName.sendKeys(fn);
	}
public void setlName(String ln) {
	
	lName.sendKeys(ln);
	}
public void clickSaveBtn() {
	
	saveBtn.click();
	}
public void verifyFirstname(String eFn) {
	String aFn = fName1.getAttribute("value");
	Assert.assertEquals(eFn, aFn);
}
public void clickEmp_List() {
	emp_List.click();
	
}
}
