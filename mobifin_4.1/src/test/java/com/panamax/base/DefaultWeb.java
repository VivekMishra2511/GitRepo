package com.panamax.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ReadXMLData;

/**
 * @author dishant.doshi Actions of Settings - User Management - Role
 * @creation date 31/12/2018
 */
public class DefaultWeb extends Common {
	HomeWeb homePage;
	DefaultWeb defaultWeb;

	By maker = By.xpath("//a[normalize-space(text())='Maker']");
	By readOnly = By.xpath("//a[normalize-space(text())='Readonly']");
	By body = By.cssSelector("body");
	By fcmAccountName = By.id("FCMAccountName");
	By fcmAccountStatus = By.id("IsActive");
	By signInWithNewAccount = By.xpath("//*[text()='Sign in with a different account']");
	By addNewAccount = By.xpath("//*[text()='Add account']");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 31/12/2018
	 */
	public DefaultWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnSignInWithNewAccount() {
		clickOnElement(signInWithNewAccount);
	}

	public void clickOnAddNewAccount() {
		clickOnElement(addNewAccount);
	}

	public void clickOnMakerLink() {
		clickOnElement(maker);
	}

	public void clickOnReadOnlyLink() {
		clickOnElement(readOnly);
	}

	public void selectTextInFCMAccountName(String fcmAccName) {
		selectFromDropdown(fcmAccountName, fcmAccName);
	}

	public void selectTextInStatus(String status) {
		selectFromDropdown(fcmAccountStatus, status);
	}

	public void sendTextInAppKey(By element, String appKey) {
		sendTextInTextBox(element, appKey);
	}

	public void addAccess(String department, String role, String status) {
		homePage = goToHome();
		defaultWeb = homePage.clickOnSettingsUserManagementRoleForDefault();
		configFileObj = new ReadXMLData(test_data_folder_path + configFileName);
		SettingsUserManagementRoleWeb settingsUserManagementRoleWeb = new SettingsUserManagementRoleWeb(driver);
		settingsUserManagementRoleWeb.filterSearch(department, role, status);
		if (verifyElement(By.xpath("(//td[text()='" + role + "'])[1]"), false)) {
			clickOnInfoBtn(role);
			String[] moduleNames;
			if (role.equals("All Access"))
				moduleNames = configFileObj.get("ModuleAceesForAllAccess", "Modules").split(",");
			else
				moduleNames = configFileObj.get("ModuleAceesForOtherUser", "Modules").split(",");
			for (int i = 0; i < moduleNames.length; i++) {
				if (verifyElement(
						By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + moduleNames[i] + "']"),
						false)) {
					settingsUserManagementRoleWeb
							.clickOnModuleAccessEdit(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"
									+ moduleNames[i] + "']//preceding-sibling::ul//i[contains(@class,'edit')]"));
				} else {
					settingsUserManagementRoleWeb.clickOnAddModuleBtn();
					settingsUserManagementRoleWeb.clickOnAddModule(
							By.xpath("//*[@id='navwrap']//li/a[contains(text(),'" + moduleNames[i] + "')]"));
				}
				if (!moduleNames[i].equals("Support"))
					clickOnReadOnlyLink();
				clickOnMakerLink();
				clickOnSaveBtn();
				log("<h3><b style='color:#02563d'>" + moduleNames[i] + " Access Given Sucessfully.</b><h3>");
			}
			log("<h3><b style='color:#004d00'>All Access Given Sucessfully.</b><h3>");
		}
	}

	public void addAndActivateUser() {
		homePage = goToHome();
		defaultWeb = homePage.clickOnSettingsUserManagementUserForDefault();
		SettingsUserManagementUserWeb settingsUserManagementUserWeb = new SettingsUserManagementUserWeb(driver);
		clickOnAddBtn();
		settingsUserManagementUserWeb.selectTextInDepartment("All Access");
		settingsUserManagementUserWeb.selectTextInRole("QA Admin");
		settingsUserManagementUserWeb.sendTextInLoginID("qaadmin");
		settingsUserManagementUserWeb.selectTextInTimeZone("Asia/Calcutta");
		settingsUserManagementUserWeb.sendTextInEmail("qaadmin@yopmail.com");
		settingsUserManagementUserWeb.sendTextInPhone("1111111100");
		settingsUserManagementUserWeb.sendTextInSessionTime("60");
		settingsUserManagementUserWeb.selectTextInPrecision("2");
		settingsUserManagementUserWeb.sendTextInFirstName("QA");
		settingsUserManagementUserWeb.sendTextInLastName("Admin");
		settingsUserManagementUserWeb.selectTextInCountry("India");
		settingsUserManagementUserWeb.selectTextInState("Gujarat");
		clickOnSaveBtn();
		log("<h3><b style='color:#02563d'>User Addedd Sucessfully.</b><h3>");
		// activateUser();
		// log("<h3><b style='color:#02563d'>User Activated
		// Sucessfully.</b><h3>");
		// homePage.clickOnSettingsMenu();
	}

//	private void activateUser() {
//		String activationLink = getActivationLinkFromDB();
//		activationLink = activationLink.split(": ")[1];
//		openNewTabInBrowser();
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs.get(1));
//		driver.get(activationLink);
//		// set password code
//		driver.close();
//		driver.switchTo().window(tabs.get(0));
//	}

	/**
	 * @author dishant.doshi
	 * @param role
	 * @param department
	 * @param description
	 * @param status
	 * @creation date 02/01/2018
	 */
	public void addRole(String role, String department, String description, String status) {
		homePage = goToHome();
		defaultWeb = homePage.clickOnSettingsUserManagementRoleForDefault();
		SettingsUserManagementRoleWeb settingsUserManagementRoleWeb = new SettingsUserManagementRoleWeb(driver);
		clickOnAddBtn();
		settingsUserManagementRoleWeb.sendTextInRole(role);
		settingsUserManagementRoleWeb.selectTextInDepartment(department);
		settingsUserManagementRoleWeb.sendTextInDescription(description);
		settingsUserManagementRoleWeb.selectTextInStatus(status);
		clickOnSaveBtn();
		log("<h3><b style='color:#02563d'>Role Added Sucessfully.</b><h3>");
	}

	public void addEmailTemplate(String templateName, String fromEmail, String subject, String dynamicVariable,
			String body, String status) {
		homePage = goToHome();
		SettingsAlertEmailTemplateWeb settingsAlertEmailTemplateWeb = new SettingsAlertEmailTemplateWeb(driver);
		defaultWeb = homePage.clickOnSettingsAlertEmailTemplateForDefault();
		clickOnAddBtn();
		settingsAlertEmailTemplateWeb.selectTextInTemplateName(templateName);
		settingsAlertEmailTemplateWeb.selectTextInFromEmailAccount(fromEmail);
		settingsAlertEmailTemplateWeb.sendTextInSubject(subject);
		if (!dynamicVariable.equals(" ")) {
			String[] dynamic = dynamicVariable.split(",");
			for (int i = 0; i < dynamic.length; i++) {
				settingsAlertEmailTemplateWeb.selectTextInDynamicVariable(dynamic[i]);
				settingsAlertEmailTemplateWeb.clickOnAddDynamicVariableButton();
			}
		}
		settingsAlertEmailTemplateWeb.sendTextInEmailTemplateBody(body);
		settingsAlertEmailTemplateWeb.selectTextInStatus(status);
		clickOnSaveBtn();
		log("<h3><b style='color:#02563d'>Email Template Added Sucessfully.</b><h3>");
	}

	public void addFCMAccount() {
		configFileObj = new ReadXMLData(test_data_folder_path + configFileName);
		homePage = goToHome();
		defaultWeb = homePage.clickOnSettingsAlertFCMAccount();
		selectTextInFCMAccountName("Google");
		selectTextInStatus("Active");
		String[] appKey = configFileObj.get("FCMAccount", "AppKey").split("/");
		for (int i = 0; i < appKey.length; i++) {
			By appKeys = By.xpath("(//input[contains(@id,'AppKey')])[" + (i + 1) + "]");
			sendTextInAppKey(appKeys, appKey[i]);
		}
		clickOnSaveBtn();
	}

	public void login() {
		LoginWeb loginPage = new LoginWeb(this.driver);
		loginPage.login("admin", "123456");
	}

	/**
	 * @author dishant.doshi to add default role
	 * @creation date 31/12/2018
	 */
	public void addDefaultData() {
		//login();
		addAccess("All Access", "All Access", "Active");
		addRole("QA Admin", "All Access", "QA Admin Role In All Access Department", "Active");
		addAccess("All Access", "QA Admin", "Active");
		logout();
		clickOnSignInWithNewAccount();
		clickOnAddNewAccount();
		login();
		addEmailTemplate("User Activation", "b2calert@panamaxil.com", "Admin Activation Link", " ",
				"Activation Link : {-USER_ACTIVATION_LINK-}", "Active");
		addFCMAccount();
		addAndActivateUser();
	}
}
