package PageClasses;

import java.util.Properties;


import org.openqa.selenium.WebDriver;

import baseClasses.BaseTestClass;
import baseClasses.Details;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import ActionDriver.Action;
import baseClasses.PageBaseClass;

public class BuildingConfiguration extends BaseTestClass {

//	public BuildingConfiguration(WebDriver driver, ExtentTest logger, Properties prop) {
//		super(driver, logger, prop);
//	}
	
	public BuildingConfiguration() {
		PageFactory.initElements(driver, this);
	}

	Details details =new Details();
	
	 @FindBy(xpath = "//input[@formcontrolname='building_name']")
	private WebElement buildingNameTxtBox;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement buildingNameTxtB;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement blockNameTextBox;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]")
	private WebElement floorNameList;

	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-hospitalinfrastructure[1]/div[1]/div[2]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]/option[5]")
	private WebElement floorNameSelect;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-hospitalinfrastructure[1]/div[1]/div[2]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/select[1]/option[6]")
	private WebElement secondFloorName;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]")
	private WebElement secondFloorList;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement prefixRoomName;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement sufixRoomName;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/input[1]")
	private WebElement startRoomNo;

	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/input[1]")
	private WebElement endRoomNo;

	@FindBy(xpath = "//i[contains(text(),'Rooms')]")
	private WebElement addRoomButton;

	@FindBy(xpath = "//button[contains(text(),'save')]")
	private WebElement buildingSaveButton;
	
	@FindBy(xpath = "//input[@id='mat-radio-8-input']")
	private WebElement multiBlock;
	
	@FindBy(xpath = "//app-header/app-admin[1]/div[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/app-hospitalinfrastructure[1]/div[1]/div[2]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/button[2]/i[1]")
	private WebElement deleteRoomButton;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]")
	private WebElement deleteFloorButton;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/button[2]/i[1]")
	private WebElement deteleBlockButton;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	private WebElement addBlockButton;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/i[1]")
	private WebElement addFloorButton;
	
	@FindBy(xpath = "//body/app-root[1]/section[1]/div[1]/app-hospitalinfrastructure[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/div[2]/app-multiblockconfig[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	private WebElement secondBlock;
	
	@FindBy(xpath = "//app-header/section[2]/div[1]/div[1]/div[1]/nav[1]/div[4]/ul[1]/li[1]/a[1]")
	private WebElement homeButton;
	
	public AdminHome clickHomeButton() {
		Action.click(driver, homeButton);
		homeButton.click();
		return new AdminHome();
	}
	
	public void addFloor() {
		addFloorButton.click();
	}
	
	public void addBlock() {
		addBlockButton.click();
	}
	public void deleteBlock() {
		deteleBlockButton.click();
	}
	
	public void deleteFloor() {
		deleteFloorButton.click();
	}
	
	public void deleteRoom() {
		deleteRoomButton.click();
	}
	
	public void multiBlockRadioButton() {
		multiBlock.click();
	}

	public void prefixRumName() {
		prefixRoomName.clear();
		details.setPrefixRoomName("A");
		prefixRoomName.sendKeys(details.getPrefixRoomName());
	}

	public void sufixRumName() {
		sufixRoomName.clear();
		details.setSufixRoomName("B");
		sufixRoomName.sendKeys(details.getSufixRoomName());
	}

	public void startRumNo() {
		startRoomNo.clear();
		details.setStartRoomNo("1");
		startRoomNo.sendKeys(details.getStartRoomNo());
	}

	public void endRumNo() {
		endRoomNo.clear();
		details.setEndRoomNo("2");
		endRoomNo.sendKeys(details.getEndRoomNo());
	}

	public void blockName() {
		blockNameTextBox.clear();
		details.setBlockNameTextBox("CGO Complex");
		blockNameTextBox.sendKeys(details.getBlockNameTextBox());
	}
	
	public void secondBlockName() {
		details.setSecondBlock("Checking");
		secondBlock.sendKeys(details.getSecondBlock());
	}

	public void buildingName() {
		buildingNameTxtBox.clear();
		details.setBuildingNameTextBox("NavJeevan Hospital");
		buildingNameTxtBox.sendKeys(details.getBuildingNameTextBox());
	}
	
	public void floorName() {
		Select floorList= new Select(floorNameList);
		floorList.selectByVisibleText("Ground Floor");
	}
	
	public void SecondflorName() {
		Select secondFlorList = new Select(secondFloorList);
		secondFlorList.selectByVisibleText("2nd");
	}
	
	public void addRoom() {
		addRoomButton.click();
	}
	
	public void saveBuilding() {
		buildingSaveButton.click();
	}
}
