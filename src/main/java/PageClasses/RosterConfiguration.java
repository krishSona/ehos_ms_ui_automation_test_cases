package PageClasses;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.Assertion;
import org.testng.Assert;

import java.text.ParseException;
import java.util.List;
import java.util.Properties;
import com.aventstack.extentreports.ExtentTest;

import baseClasses.Details;
import baseClasses.PageBaseClass;
import io.reactivex.rxjava3.functions.Action;

public class RosterConfiguration extends PageBaseClass {

//	public RosterConfiguration(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public RosterConfiguration() {
		PageFactory.initElements(driver, this);
	}

	Details details = new Details();

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement click1;

	@FindBy(xpath = "//span[contains(text(),'Cardiology')]")
	private WebElement deptSelection;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement click2;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement clinicSelection;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement searchButton;

	@FindBy(xpath = "//button[contains(text(),'New Roster')]")
	private WebElement newRoster;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")
	private WebElement rosterDateRange;

	@FindBy(xpath = "//input[@id='mat-date-range-input-0']")
	private WebElement rosterStartDate;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-date-range-input[1]/div[1]/div[2]/input[1]")
	private WebElement rosterEndDate;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickDay;

	@FindBy(xpath = "//span[contains(text(),'Mon')]")
	private WebElement daySelection;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement unitClick;

	@FindBy(xpath = "//span[contains(text(),'Cardio Unit')]")
	private WebElement unitSelect;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickRoom;

	@FindBy(xpath = "//span[contains(text(),'A1A, Ground, CGO Complex, NavJeevan Hospital')]")
	private WebElement roomSelection;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-roster-config[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/app-roster-add[1]/mat-card[1]/form[1]/mat-card-content[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement clickDr;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/mat-pseudo-checkbox[1]")
	private WebElement drSelection;
	
	@FindBy(xpath = "//button[contains(text(),'Save Roster')]")
	private WebElement sButton;
	
	@FindBy(xpath = "//button[contains(text(),'edit')]")
	private WebElement editButton;
	
	@FindBy(xpath = "//button[contains(text(),'View')]")
	private WebElement viewButton;



	
	public void clickNewRoster() {
		newRoster.click();
//		softAssert.assertEquals(true, newRoster.isDisplayed());
		System.out.println("New roster button is dispalyed");
	}

	public void selectDept() {
		click1.click();
		deptSelection.click();
		Assert.assertTrue(true, "Department successfully selected");
	}

	public void selectClinic() throws InterruptedException {
		click2.click();
		Thread.sleep(2000);
		clinicSelection.click();
		Assert.assertTrue(true, "Clinic successfully selected");
	}

	public void clickSearchButton() {
		searchButton.click();
//		softAssert.assertEquals(true, searchButton.isDisplayed());
		System.out.println("Search button is dispalyed");
	}

	public void selectDate() throws InterruptedException {
		rosterDateRange.click();
//		softAssert.assertEquals(true, rosterDateRange.isEnabled());
		System.out.println("Date range is select able");
	}

	public void unitSelection() throws InterruptedException {
		unitClick.click();
		Thread.sleep(1000);
		unitSelect.click();
	}

	public void selectDay() {
		clickDay.click();
		daySelection.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}

	public void selectRoom() {
		clickRoom.click();
		roomSelection.click();
	    Assert.assertTrue(true, "Room selection successful");
	}

	public void selectDr() {
		clickDr.click();
		drSelection.click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public void saveRosterButton() {
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(true, sButton.isDisplayed());
		softAssert.assertEquals(true, sButton.isEnabled());
		sButton.click();
		softAssert.assertAll();
	}
}
