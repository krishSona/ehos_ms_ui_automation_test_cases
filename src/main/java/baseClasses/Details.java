package baseClasses;

import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class Details extends BaseTestClass {
	
	public Details() {
		PageFactory.initElements(driver, this);
	}

//	public Details(WebDriver driver, ExtentTest logger, Properties prop) {
//		this.logger = logger;
//		this.driver = driver;
//		this.prop = prop;
//	}
	
	// Track On Board Request Page
	
	public String mobileTextBox;
	public String ninTextBox;
	public String firstNameTextBox;
	public String lastNameTextBox;
	public String mobileNumberTextBox;
	public String emailTextBox;

	public String getMobileTextBox() {
		return mobileTextBox;
	}
	
	public void setMobileTextBox(String mobileTextBox) {
		this.mobileTextBox = mobileTextBox;
	}
	
	public String getNinTextBox() {
		return ninTextBox;
	}
	
	public void setNinTextBox(String ninTextBox) {
		this.ninTextBox = ninTextBox;
	}
	
	public String getFirstNameTextBox() {
		return firstNameTextBox;
	}
	
	public void setFirstNameTextBox(String firstNameTextBox) {
		this.firstNameTextBox = firstNameTextBox;
	}
	
	public String getLastNameTextBox() {
		return lastNameTextBox;
	}
	
	public void setLastNameTextBox(String lastNameTextBox) {
		this.lastNameTextBox = lastNameTextBox;
	}

	public String getMobileNumberTextBox() {
		return mobileNumberTextBox;
	}
	
	public void setMobileNumberTextBox(String mobileNumberTextBox) {
		this.mobileNumberTextBox = mobileNumberTextBox;
	}

	public String getEmailTextBox() {
		return emailTextBox;
	}
	
	public void setEmailTextBox(String emailTextBox) {
		this.emailTextBox = emailTextBox;
	}

	// Login Page Variables

	public String userName_txtBox;
	public String password_txtBox;

	public String getUserName_txtBox() {
		return userName_txtBox;
	}

	public void setUserName_txtBox(String userName_txtBox) {
		this.userName_txtBox = userName_txtBox;
	}

	public String getPassword_txtBox() {
		return password_txtBox;
	}

	public void setPassword_txtBox(String password_txtBox) {
		this.password_txtBox = password_txtBox;
	}

	// Health Facility Configuration Page Variables

	private String cardiology_Test;
	private String registrationCharTextBox;
	private String unitNameTextBox;

	public String getUnitNameTextBox() {
		return unitNameTextBox;
	}
	
	public void setUnitNameTextBox(String unitNameTextBox) {
		this.unitNameTextBox = unitNameTextBox;
	}

	public String getCardiology_Test() {
		return cardiology_Test;
	}

	public void setCardiology_Test(String cardiology_Test) {
		this.cardiology_Test = cardiology_Test;
	}

	public String getRegistrationCharTextBox() {
		return registrationCharTextBox;
	}

	public void setRegistrationCharTextBox(String registrationCharTextBox) {
		this.registrationCharTextBox = registrationCharTextBox;
	}

	// Manage User Page Variables

	private String manageUserPage_mobile_number;
	private String fNameTextBox;
	private String dobTxtBox;
	private String searchInputTextBox;
	
	public String getSearchInputTextBox() {
		return searchInputTextBox;
	}
	
	public void setSearchInputTextBox(String searchInputTextBox) {
		this.searchInputTextBox = searchInputTextBox;
	}

	public String getManageUserPage_mobile_number() {
		return manageUserPage_mobile_number;
	}

	public void setManageUserPage_mobile_number(String manageUserPage_mobile_number) {
		this.manageUserPage_mobile_number = manageUserPage_mobile_number;
	}

	public String getfNameTextBox() {
		return fNameTextBox;
	}

	public void setfNameTextBox(String fNameTextBox) {
		this.fNameTextBox = fNameTextBox;
	}

	public String getDobTxtBox() {
		return dobTxtBox;
	}

	public void setDobTxtBox(String dobTxtBox) {
		this.dobTxtBox = dobTxtBox;
	}

	// Building Configuration Page Variables

	private String buildingNameTxtBox;
	private String blockNameTextBox;
	private String prefixRoomName;
	private String sufixRoomName;
	private String startRoomNo;
	private String endRoomNo;
	private String secondBlock;

	public String getSecondBlock() {
		return secondBlock;
	}

	public void setSecondBlock(String secondBlock) {
		this.secondBlock = secondBlock;
	}

	public String getBuildingNameTextBox() {
		return buildingNameTxtBox;
	}

	public void setBuildingNameTextBox(String buildingNameTextBox) {
		this.buildingNameTxtBox = buildingNameTextBox;
	}

	public String getBlockNameTextBox() {
		return blockNameTextBox;
	}

	public void setBlockNameTextBox(String blockNameTextBox) {
		this.blockNameTextBox = blockNameTextBox;
	}

	public String getPrefixRoomName() {
		return prefixRoomName;
	}

	public void setPrefixRoomName(String prefixRoomName) {
		this.prefixRoomName = prefixRoomName;
	}

	public String getSufixRoomName() {
		return sufixRoomName;
	}

	public void setSufixRoomName(String sufixRoomName) {
		this.sufixRoomName = sufixRoomName;
	}

	public String getStartRoomNo() {
		return startRoomNo;
	}

	public void setStartRoomNo(String startRoomNo) {
		this.startRoomNo = startRoomNo;
	}

	public String getEndRoomNo() {
		return endRoomNo;
	}

	public void setEndRoomNo(String endRoomNo) {
		this.endRoomNo = endRoomNo;
	}
	
	// OPD Clinic Page Variables
	
	private String clinicNameTxtBox;
	private String clinicTagLineTxtBox;	

	public String getClinicNameTxtBox() {
		return clinicNameTxtBox;
	}

	public void setClinicNameTxtBox(String clinicNameTxtBox) {
		this.clinicNameTxtBox = clinicNameTxtBox;
	}

	public String getClinicTagLineTxtBox() {
		return clinicTagLineTxtBox;
	}

	public void setClinicTagLineTxtBox(String clinicTagLineTxtBox) {
		this.clinicTagLineTxtBox = clinicTagLineTxtBox;
	}
	
	// OPD Roster Config Page Variables
	
	private Date rosterStartDate;
	private Date rosterEndDate;

	public Date getRosterEndDate() {
		return rosterEndDate;
	}

	public void setRosterEndDate(Date rosterEndDate) {
		this.rosterEndDate = rosterEndDate;
	}

	public Date getRosterStartDate() {
		return rosterStartDate;
	}

	public void setRosterStartDate(Date rosterStartDate) {
		this.rosterStartDate = rosterStartDate;
	}
	
	// OPD Registration : Patient Registration Page Variables
	
	private String patSearchByMobile;
	private String patSearchByName;
	private String patSearchByUhid;
	private String patSearchByHealthId;
	private String patMobileInputTextBox;
	private String patientFirstName;
	private String patAddress;

	public String getPatAddress() {
		return patAddress;
	}

	public void setPatAddress(String patAddress) {
		this.patAddress = patAddress;
	}

	public String getPatMobileInputTextBox() {
		return patMobileInputTextBox;
	}

	public void setPatMobileInputTextBox(String patMobileInputTextBox) {
		this.patMobileInputTextBox = patMobileInputTextBox;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatSearchByHealthId() {
		return patSearchByHealthId;
	}

	public void setPatSearchByHealthId(String patSearchByHealthId) {
		this.patSearchByHealthId = patSearchByHealthId;
	}

	public String getPatSearchByMobile() {
		return patSearchByMobile;
	}

	public void setPatSearchByMobile(String patSearchByMobile) {
		this.patSearchByMobile = patSearchByMobile;
	}

	public String getPatSearchByName() {
		return patSearchByName;
	}

	public void setPatSearchByName(String patSearchByName) {
		this.patSearchByName = patSearchByName;
	}

	public String getPatSearchByUhid() {
		return patSearchByUhid;
	}

	public void setPatSearchByUhid(String patSearchByUhid) {
		this.patSearchByUhid = patSearchByUhid;
	}
	
	// Casualty Patient Registration Page Variable
	
	private String cPmobileTextBox;
	private String casualtyPatientFirstName;
	private String casualtyPatientAddress;

	/**
	 * @return the casualtyPatientAddress
	 */
	public String getCasualtyPatientAddress() {
		return casualtyPatientAddress;
	}

	/**
	 * @param casualtyPatientAddress the casualtyPatientAddress to set
	 */
	public void setCasualtyPatientAddress(String casualtyPatientAddress) {
		this.casualtyPatientAddress = casualtyPatientAddress;
	}

	public String getCpMobileTextBox() {
		return cPmobileTextBox;
	}

	public void setCpMobileTextBox(String cPmobileTextBox) {
		this.cPmobileTextBox = cPmobileTextBox;
	}

	public String getCasualtyPatientFirstName() {
		return casualtyPatientFirstName;
	}

	public void setCasualtyPatientFirstName(String casualtyPatientFirstName) {
		this.casualtyPatientFirstName = casualtyPatientFirstName;
	}
	
	// Update Registration Page Variables
	
	private String uhidTextBox;
	private String changeMobile;
	private String selectFn;

	public String getSelectFn() {
		return selectFn;
	}

	public void setSelectFn(String selectFn) {
		this.selectFn = selectFn;
	}

	public String getChangeMobile() {
		return changeMobile;
	}

	public void setChangeMobile(String changeMobile) {
		this.changeMobile = changeMobile;
	}

	public String getUhidTextBox() {
		return uhidTextBox;
	}

	public void setUhidTextBox(String uhidTextBox) {
		this.uhidTextBox = uhidTextBox;
	}
	
	// Daily Summary Report Page Variables
	
	private String dailySummaryStartDateTextBox;
	private String dailySummaryEndDateTextBox;

	public String getDailySummaryStartDateTextBox() {
		return dailySummaryStartDateTextBox;
	}

	public void setDailySummaryStartDateTextBox(String dailySummaryStartDateTextBox) {
		this.dailySummaryStartDateTextBox = dailySummaryStartDateTextBox;
	}

	public String getDailySummaryEndDateTextBox() {
		return dailySummaryEndDateTextBox;
	}

	public void setDailySummaryEndDateTextBox(String dailySummaryEndDateTextBox) {
		this.dailySummaryEndDateTextBox = dailySummaryEndDateTextBox;
	}
	
	// PatientVisitSummaryReport Page Variables
	
	private String patientVisitStartDate;
	private String patientVisitEndDate;

	public String getPatientVisitStartDate() {
		return patientVisitStartDate;
	}

	public void setPatientVisitStartDate(String patientVisitStartDate) {
		this.patientVisitStartDate = patientVisitStartDate;
	}

	public String getPatientVisitEndDate() {
		return patientVisitEndDate;
	}

	public void setPatientVisitEndDate(String patientVisitEndDate) {
		this.patientVisitEndDate = patientVisitEndDate;
	}
	
	// OPD Clinic Page Variables
	
	private String opdClinicPageSearchTextBox;
	private String opdClinicPageHeightTextBox;
	private String opdClinicPageWeightTextBox;
	private String opdClinicPageBodyTempTextBox;
	private String opdClinicPageBpSystolicTextBox;
	private String opdClinicPageBpDiastolicTextBox;
	private String opdClinicPageRespirationRateTextBox;
	private String opdClinicPagePulseTextBox;

	public String getOpdClinicPageBpSystolicTextBox() {
		return opdClinicPageBpSystolicTextBox;
	}

	public void setOpdClinicPageBpSystolicTextBox(String opdClinicPageBpSystolicTextBox) {
		this.opdClinicPageBpSystolicTextBox = opdClinicPageBpSystolicTextBox;
	}

	public String getOpdClinicPageBpDiastolicTextBox() {
		return opdClinicPageBpDiastolicTextBox;
	}

	public void setOpdClinicPageBpDiastolicTextBox(String opdClinicPageBpDiastolicTextBox) {
		this.opdClinicPageBpDiastolicTextBox = opdClinicPageBpDiastolicTextBox;
	}

	public String getOpdClinicPageRespirationRateTextBox() {
		return opdClinicPageRespirationRateTextBox;
	}

	public void setOpdClinicPageRespirationRateTextBox(String opdClinicPageRespirationRateTextBox) {
		this.opdClinicPageRespirationRateTextBox = opdClinicPageRespirationRateTextBox;
	}

	public String getOpdClinicPagePulseTextBox() {
		return opdClinicPagePulseTextBox;
	}

	public void setOpdClinicPagePulseTextBox(String opdClinicPagePulseTextBox) {
		this.opdClinicPagePulseTextBox = opdClinicPagePulseTextBox;
	}

	public String getOpdClinicPageSearchTextBox() {
		return opdClinicPageSearchTextBox;
	}

	public void setOpdClinicPageSearchTextBox(String opdClinicPageSearchTextBox) {
		this.opdClinicPageSearchTextBox = opdClinicPageSearchTextBox;
	}

	public String getOpdClinicPageHeightTextBox() {
		return opdClinicPageHeightTextBox;
	}

	public void setOpdClinicPageHeightTextBox(String opdClinicPageHeightTextBox) {
		this.opdClinicPageHeightTextBox = opdClinicPageHeightTextBox;
	}

	public String getOpdClinicPageWeightTextBox() {
		return opdClinicPageWeightTextBox;
	}

	public void setOpdClinicPageWeightTextBox(String opdClinicPageWeightTextBox) {
		this.opdClinicPageWeightTextBox = opdClinicPageWeightTextBox;
	}

	public String getOpdClinicPageBodyTempTextBox() {
		return opdClinicPageBodyTempTextBox;
	}

	public void setOpdClinicPageBodyTempTextBox(String opdClinicPageBodyTempTextBox) {
		this.opdClinicPageBodyTempTextBox = opdClinicPageBodyTempTextBox;
	}
	
	// OnBoarding Page Details 
	
	public String ndFirstName;
	public String ndLastName;
	public String ndMobileNumber;
	public String ndEmail;

	public String getNdFirstName() {
		return ndFirstName;
	}

	public void setNdFirstName(String ndFirstName) {
		this.ndFirstName = ndFirstName;
	}

	public String getNdLastName() {
		return ndLastName;
	}

	public void setNdLastName(String ndLastName) {
		this.ndLastName = ndLastName;
	}

	public String getNdMobileNumber() {
		return ndMobileNumber;
	}

	public void setNdMobileNumber(String ndMobileNumber) {
		this.ndMobileNumber = ndMobileNumber;
	}

	public String getNdEmail() {
		return ndEmail;
	}
	
	public void setNdEmail(String ndEmail) {
		this.ndEmail = ndEmail;
	}

}
