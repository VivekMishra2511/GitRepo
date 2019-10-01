package com.panamax.base;

import org.openqa.selenium.By;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class BaseWeb extends Common {
	By verifyMenuClose = By.xpath("(//li[@class='tp-down clicked_cls']//a[@target='_self'])[1]");
	By settings = By.xpath("//ul[@class[normalize-space() = 'nav-menu']]//li[@id='settings']/a");
	By settings2 = By.xpath("(//*[@class='sidebar-menu main-menu no-search-bar']//li[@id='settings']/a)[last()]");
	By settingsGISMaster = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='GIS Master']");
	By settingsGISMasterCountry = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Country']");
	By settingsGISMasterState = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='State']");
	By settingsGISMasterMapcode = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Map Code']");
	By settingsDKYCMaster = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='DKYC Master']");
	By settingsDKYCMasterCategory = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='DKYC Category']");
	By settingsDKYCMasterField = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='DKYC Field']");
	By settingsUserManagement = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='User Management']");
	By settingsUserManagementDepartment = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Department']");
	By settingsUserManagementRole = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Role']");
	By settingsUserManagementDashboard = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Dashboard']");
	By settingsUserManagementUser = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='User']");
	By settingsAlert = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Alert']");
	By settingsAlertSMSAccount = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='SMS Account']");
	By settingsAlertEmailTemplate = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Alert User Email Template']");
	By settingsAlertSMSTemplate = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Alert User Sms Template']");
	By settingsSystemPreference = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='System Preference']");
	By settingsSystemPreferenceBlockPhone = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Block Phone']");
	By settingsSystemPreferenceBlockIDNumber = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Block ID Number']");
	By settingsSystemPreferenceOperationUser = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Operation User']");
	By settingsSystemPreferenceRetailSegment = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Retail Segment']");
	By settingsSystemPreferenceTag = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Tag']");
	By settingsSystemPreferenceThresholdManagement = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Threshold Management']");
	By settingsSystemPreferenceNonRegisterWalletThreshold = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Non Register Wallet Threshold']");
	By settingsTools = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Tools']");
	By settingsToolsImageUploader = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Image Uploader']");
	By settingsToolsExchangeRate = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Exchange Rate']");
	By settingsAlertEmailAccount = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Email Account']");
	By settingsAlertSMSAlert = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='SMS Alert']");
	By settingsAlertFCMAccount = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='FCM Account']");
	By product = By.xpath("//ul[@class[normalize-space() = 'nav-menu']]//li[@id='product']/a");
	By productExternalProducts = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Products']");
	By productExternalProductsOperator = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Operator']");
	By productTaxation = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Taxation']");
	By productVendorIntegration = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Vendor Integration']");
	By productVendorProductManager = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Vendor Product Manager']");
	By ProductManager = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Product Manager']");
	By ProductInternalProducts = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Products']");
	By ProductSubWallet = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='SubWallet']");
	By merchant = By.xpath("//li[@id='merchant']/a");
	By merchantTree = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Tree']");
	By merchantProfile = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Profile']");
	By merchantMatrix = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Matrix']");
	By agent = By.xpath("//li[@id='agent']/a");
	By agentTree = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Tree']");
	By agentOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Agent Onboarding']");
	By agentAssistantOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Assistant Onboarding']");
	By merchantOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding']");
	By customer = By.xpath("//ul[@class[normalize-space() = 'nav-menu']]//li[@id='customer']/a");
	By customerProfile = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Profile']");
	By customerProfileUpdate = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Profile Update']");
	By customerMatrix = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Matrix']");
	By customerThreshold = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Threshold']");
	By customerThreholdExternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Threshold']");
	By customerThreholdInternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Threshold']");
	By enterprise = By.xpath("//ul[@class[normalize-space() = 'nav-menu']]//li[@id='enterprise']/a");
	By enterpriseProfile = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Profile']");
	By enterpriseMatrix = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Matrix']");
	By enterpriseThreshold = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Threshold']");
	By enterpriseThreholdExternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Threshold']");
	By enterpriseThreholdInternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Threshold']");
	By agentProfile = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Profile']");
	By agentMatrix = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Matrix']");
	By agentBranchView = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Branch View']");
	By agentTransfer = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Agent Transfer']");
	By agentNodeTransfer = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Node Transfer']");
	By agentTreeTransfer = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Tree Transfer']");
	By agentThreshold = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Threshold']");
	By agentThreholdExternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Threshold']");
	By agentThreholdInternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Threshold']");
	By merchantThreshold = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Threshold']");
	By merchantThreholdInternal = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Threshold']");
	By trustAccount = By.xpath("//ul[@class[normalize-space() = 'nav-menu']]//li[@id='trustaccount']/a");
	By reports = By.xpath("//li[@id='reports']/a");
	By reportsTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By reportsTransactionDetailInternalServiceDetailReport = By
			.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Service Detail Report']");
	By enterpriseOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding']");
	By customerOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding']");
	By enterpriseOnboardingUser = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding User']");
	By trustAccountTABank = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='TA Bank']");
	By trustAccountTAUser = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='TA User']");
	By merchantTerminalOnboarding = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Terminal Onboarding']");
	By merchantReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Report']");
	By merchantReportTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By merchantReportTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By merchantReportTransactionPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Performance']");
	By merchantReportTransactionDrillDown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Drilldown']");
	By merchantReportOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Detail']");
	By merchantReportTerminalOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Terminal Onboarding Detail']");
	By merchantReportOnboardingSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Summary']");
	By merchantReportOnboardingPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Performance']");	
	By merchantReportOnboardingDrilldown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Drilldown']");
	By merchantReportActivityReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activity Report']");
	By agentReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Report']");
	By agentReportTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By agentReportTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By agentReportTransactionPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Performance']");
	By agentReportTransactionDrillDown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Drilldown']");
	By agentReportOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Detail']");
	By agentReportAssistantOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Assistant Onboarding Detail']");
	By agentReportOnboardingSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Summary']");
	By agentReportOnboardingPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Performance']");	
	By agentReportOnboardingDrilldown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Drilldown']");
	By agentReportActivityReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activity Report']");
	By customerReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Report']");
	By customerReportTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By customerReportTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By customerReportTransactionPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Performance']");
	By customerReportTransactionDrillDown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Drilldown']");
	By customerReportOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Detail']");
	By customerReportOnboardingSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Summary']");
	By customerReportOnboardingPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Performance']");	
	By customerReportOnboardingDrilldown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Drilldown']");
	By customerReportActivityReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activity Report']");
	By enterpriseReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Report']");
	By enterpriseReportTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By enterpriseReportTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By enterpriseReportTransactionPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Performance']");
	By enterpriseReportTransactionDrillDown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Drilldown']");
	By enterpriseReportOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Detail']");
	By enterpriseReportUserOnboardingDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='User Onboarding Detail']");
	By enterpriseReportOnboardingSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Summary']");
	By enterpriseReportOnboardingPerformance = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Performance']");	
	By enterpriseReportOnboardingDrilldown = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Onboarding Drilldown']");
	By enterpriseReportActivityReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activity Report']");
	By trustAccountReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Report']");
	By trustAccountReportTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Detail']");
	By trustAccountReportTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By trustAccountReportEmoneyDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Emoney Detail']");
	By trustAccountReportEmoneySummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Emoney Summary']");
	By trustAccountReportActivityReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activity Report']");
	By reportsTransactionDetailExternalServiceDetailReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Service Detail Report']");
	By reportsTransactionSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Transaction Summary']");
	By reportsTransactionSummaryInternalServiceSummaryReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Internal Service Summary Report']");
	By reportsTransactionSummaryExternalServiceSummaryReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='External Service Summary Report']");
	By reportsReversalDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Reversal Detail']");
	By reportsReversalDetailInternalServiceDetailReport = By.xpath("//*[contains(@class,'clicked_cls') and @id='reversaldetail']//*[text()='Internal Service Detail Report'] ");
	By reportsReversalDetailExternalServiceDetailReport = By.xpath("//*[contains(@class,'clicked_cls') and @id='reversaldetail']//*[text()='External Service Detail Report']");
	By reportsReversalSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Reversal Summary']");
	By reportsReversalSummaryInternalServiceSummaryReport = By.xpath("//*[contains(@class,'clicked_cls') and @id='reversalsummary']//*[text()='Internal Service Summary Report']");
	By reportsReversalSummaryExternalServiceSummaryReport = By.xpath("//*[contains(@class,'clicked_cls') and @id='reversalsummary']//*[text()='External Service Summary Report']");
	By reportsSystemWalletDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='System Wallet Detail']");
	By reportsSystemWalletDetailSurchargeDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Surcharge Detail']");
	By reportsSystemWalletDetailCommisionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Commission Detail']");
	By reportsSystemWalletDetailSuspenseAccountDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Suspense Account Detail']");
	By reportsSystemWalletDetailNonRegisterDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Non Register Detail']");
	By reportsNotificationDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Notification Detail']");
	By reportsNotificationDetailEmailDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Email Detail']");
	By reportsNotificationDetailFCMDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='FCM Detail']");
	By reportsNotificationDetailSMSDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='SMS Detail']");
	By reportsNotificationSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Notification Summary']");
	By reportsNotificationSummaryEmailSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Email Summary']");
	By reportsNotificationSummaryFCMSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='FCM Summary']");
	By reportsNotificationSummarySMSSummary = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='SMS Summary']");
	By reportsVendorTransactionDetail = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Vendor Transaction Detail']");
	By reportsUserBaseReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='User Base Report']");
	By reportsEmoneySummaryReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Emoney Summary Report']");
	By reportsActivationInfoReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Activation Info Report']");
	By reportsSupport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Support']");
	By reportsSupportActivityDetailReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Support Activity Detail Report']");
	By reportsSupportActivitySummaryReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Support Activity Summary Report']");
	By reportsSupportPhoneNumberEditReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Phone Number Edit Report']");
	By reportsPocket = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Pocket']");
	By reportsPocketCreation = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Pocket Creation']");
	By reportsPocketTransactionReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='Pocket Transaction Report']");
	By reportsPocketBalanceReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='pocket balance Report']");
	By reportsUDIDetailReport = By.xpath("//*[contains(@class,'clicked_cls')]//*[text()='udi detail report']");
	By moreMenuButton = By.xpath("//*[@class='btm-up']//*[normalize-space(text())='More']");
	By menuBar = By.xpath("//*[@class='sidebar-menu main-menu no-search-bar']");
	By support = By.xpath("//span[normalize-space(text())='"+ConstantsFile.SUPPORT+"']");
	
	public BaseWeb() {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi To click on Settings
	 * @creation date 28/09/2018
	 */
	public void clickOnSettingsMenu() {
		findVisibleElement(menuBar);
		if (verifyElement(moreMenuButton, false)) {
			clickOnElement(moreMenuButton);
			clickOnElement(settings2);
		}
		else
			clickOnElement(settings);
	}

	/**
	 * @author kutbuddin.compounder To click on Customer
	 * @creation date 06/11/2018
	 */
	public void clickOnCustomerMenu() {
		clickOnElement(customer);
	}

	/**
	 * @author kutbuddin.compounder To click on Enterprise
	 * @creation date 12/11/2018
	 */
	public void clickOnEnterpriseMenu() {
		clickOnElement(enterprise);
	}

	/**
	 * @author kutbuddin.compounder To click on trustAccount
	 * @creation date 12/11/2018
	 */
	public void clickOnTrustAccountMenu() {
		clickOnElement(trustAccount);
	}

	/**
	 * @author dishant.doshi To click on Settings -> GIS Master
	 * @creation date 28/09/2018
	 */
	public void clickOnSettingGISMaster() {
		clickOnSettingsMenu();
		clickOnElement(settingsGISMaster);
	}

	/**
	 * @author dishant.doshi To click on Settings -> GIS Master -> Country
	 *         directly
	 * @creation date 28/09/2018
	 */
	public SettingsGISMasterCountryWeb clickOnSettingsGISMasterCountry() {
		clickOnSettingGISMaster();
		clickOnElement(settingsGISMasterCountry);
		clickOnSettingsMenu();
		return new SettingsGISMasterCountryWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> GIS Master -> State
	 *         directly
	 * @creation date 11/10/2018
	 */
	public SettingsGISMasterStateWeb clickOnSettingsGISMasterState() {
		clickOnSettingGISMaster();
		clickOnElement(settingsGISMasterState);
		clickOnSettingsMenu();
		return new SettingsGISMasterStateWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> GIS Master -> State
	 *         directly
	 * @creation date 11/10/2018
	 */
	public SettingsGISMasterMapcodeWeb clickOnSettingsGISMasterMapcode() {
		clickOnSettingGISMaster();
		clickOnElement(settingsGISMasterMapcode);
		clickOnSettingsMenu();
		return new SettingsGISMasterMapcodeWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> DKYC Master
	 * @creation date 12/10/2018
	 */
	public void clickOnSettingDKYCMaster() {
		clickOnSettingsMenu();
		clickOnElement(settingsDKYCMaster);
	}

	/**
	 * @author dishant.doshi To click on Settings -> DKYC Master -> DKYC Field
	 *         directly
	 * @creation date 11/10/2018
	 */
	public SettingsDKYCMasterFieldWeb clickOnSettingsDKYCMasterDKYCFields() {
		clickOnSettingDKYCMaster();
		clickOnElement(settingsDKYCMasterField);
		clickOnSettingsMenu();
		return new SettingsDKYCMasterFieldWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> DKYC Master -> DKYC
	 *         Category directly
	 * @creation date 31/10/2018
	 */
	public SettingsDKYCMasterCategoryWeb clickOnSettingsDKYCMasterDKYCCategory() {
		clickOnSettingDKYCMaster();
		clickOnElement(settingsDKYCMasterCategory);
		//clickOnSettingsMenu();
		return new SettingsDKYCMasterCategoryWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> User Management
	 * @creation date 23/10/2018
	 */
	public void clickOnSettingUserManagement() {
		clickOnSettingsMenu();
		clickOnElement(settingsUserManagement);
	}

	/**
	 * @author dishant.doshi To click on Settings -> User Management ->
	 *         Department directly
	 * @creation date 23/10/2018
	 */
	public SettingsUserManagementDepartmentWeb clickOnSettingsUserManagementDepartment() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementDepartment);
		clickOnSettingsMenu();
		return new SettingsUserManagementDepartmentWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> User Management -> Role
	 *         directly
	 * @creation date 24/10/2018
	 */
	public SettingsUserManagementRoleWeb clickOnSettingsUserManagementRole() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementRole);
		clickOnSettingsMenu();
		return new SettingsUserManagementRoleWeb(driver);
	}
	
	/**
	 * @author dishant.doshi To click on Settings -> User Management -> Role
	 *         for default data
	 * @creation date 31/12/2018
	 */
	public DefaultWeb clickOnSettingsUserManagementRoleForDefault() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementRole);
		//clickOnSettingsMenu();
		return new DefaultWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> User Management ->
	 *         Dashboard directly
	 * @creation date 26/10/2018
	 */
	public SettingsUserManagementDashboardWeb clickOnSettingsUserManagementDashboard() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementDashboard);
		clickOnSettingsMenu();
		return new SettingsUserManagementDashboardWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> User Management -> User
	 *         directly
	 * @creation date 29/10/2018
	 */
	public SettingsUserManagementUserWeb clickOnSettingsUserManagementUser() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementUser);
		clickOnSettingsMenu();
		return new SettingsUserManagementUserWeb(driver);
	}
	
	/**
	 * @author dishant.doshi To click on Settings -> User Management -> User
	 *         directly
	 * @creation date 29/10/2018
	 */
	public DefaultWeb clickOnSettingsUserManagementUserForDefault() {
		clickOnSettingUserManagement();
		clickOnElement(settingsUserManagementUser);
		clickOnSettingsMenu();
		return new DefaultWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> Alert
	 * @creation date 29/10/2018
	 */
	public void clickOnSettingsAlert() {
		clickOnSettingsMenu();
		clickOnElement(settingsAlert);
	}

	/**
	 * @author dishant.doshi To click on Settings -> Alert -> SMS Account
	 *         directly
	 * @creation date 29/10/2018
	 */
	public SettingsAlertSMSAccountWeb clickOnSettingsAlertSMSAccount() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertSMSAccount);
		clickOnSettingsMenu();
		return new SettingsAlertSMSAccountWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> Alert -> Email Template
	 *         directly
	 * @creation date 29/10/2018
	 */
	public SettingsAlertEmailTemplateWeb clickOnSettingsAlertEmailTemplate() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertEmailTemplate);
		clickOnSettingsMenu();
		return new SettingsAlertEmailTemplateWeb(driver);
	}
	
	public DefaultWeb clickOnSettingsAlertEmailTemplateForDefault() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertEmailTemplate);
		clickOnSettingsMenu();
		return new DefaultWeb(driver);
	}
	
	public DefaultWeb clickOnSettingsAlertFCMAccount() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertFCMAccount);
		//clickOnSettingsMenu();
		return new DefaultWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Settings -> Alert -> SMS Template
	 *         directly
	 * @creation date 31/10/2018
	 */
	public SettingsAlertSMSTemplateWeb clickOnSettingsAlertSMSTemplate() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertSMSTemplate);
		clickOnSettingsMenu();
		return new SettingsAlertSMSTemplateWeb(driver);
	}

	/**
	 * @author shivani.patel To click on Merchant
	 * @creation date 03/10/2018
	 */
	public void clickOnMerchantMenu() {
		clickOnElement(merchant);
	}

	/**
	 * @author shivani.patel To click on Merchant -> Tree directly
	 * @creation date 03/10/2018
	 */
	public MerchantTreeWeb clickOnMerchantTree() {
		clickOnMerchantMenu();
		clickOnElement(merchantTree);
		//clickOnMerchantMenu();
		return new MerchantTreeWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Merchant -> Profile directly
	 * @creation date 15/11/2018
	 */
	public MerchantProfileWeb clickOnMerchantProfile() {
		clickOnMerchantMenu();
		clickOnElement(merchantProfile);
		clickOnMerchantMenu();
		return new MerchantProfileWeb(driver);
	}

	/**
	 * @author shivani.patel To click on Setting -> SystemPreference
	 * @creation date 12/10/2018
	 */
	public void clickOnSettingsSystemPreference() {
		clickOnSettingsMenu();
		clickOnElement(settingsSystemPreference);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference ->Block
	 *         Phone directly
	 * @creation date 12/10/2018
	 */
	public SettingsSystemPreferenceBlockPhoneWeb clickOnSettingsSystemPreferencesBlockPhone() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceBlockPhone);
		clickOnSettingsMenu();
		return new SettingsSystemPreferenceBlockPhoneWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference
	 *         ->BlockIDNumber directly
	 * @creation date 12/10/2018
	 */
	public SettingsSystemPreferenceBlockIDNumberWeb clickOnSettingsSystemPreferencesBlockIDNumberWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceBlockIDNumber);
		clickOnSettingsMenu();
		return new SettingsSystemPreferenceBlockIDNumberWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference
	 *         ->OperationUser directly
	 * @creation date 16/10/2018
	 */
	public SettingsSystemPreferenceOperationUserWeb clickOnSettingsSystemPreferencesOperationUserWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceOperationUser);
		clickOnSettingsMenu();
		return new SettingsSystemPreferenceOperationUserWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference
	 *         ->RetailSegment directly
	 * @creation date 17/10/2018
	 */
	public SettingsSystemPreferenceRetailSegmentWeb clickOnSettingsSystemPreferencesRetailSegmentWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceRetailSegment);
		clickOnSettingsMenu();
		return new SettingsSystemPreferenceRetailSegmentWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference ->Tag
	 *         directly
	 * @creation date 18/10/2018
	 */
	public SettingsSystemPreferenceTagWeb clickOnSettingsSystemPreferencesTagWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceTag);
		clickOnSettingsMenu();
		return new SettingsSystemPreferenceTagWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference
	 *         ->ThresholdManagement directly
	 * @creation date 22/10/2018
	 */
	public SettingSystempreferenceThresholdManagementWeb clickOnSettingsSystemPreferencesThresholdManagementWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceThresholdManagement);
		clickOnSettingsMenu();
		return new SettingSystempreferenceThresholdManagementWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> SystemPreference
	 *         ->NonRegisterWalletThreshold directly
	 * @creation date 22/10/2018
	 */
	public SettingsSystemPreferenceNonRegisterWalletThresholdWeb clickOnSettingsSystemPreferencesNonRegisterWalletThresholdWeb() {
		clickOnSettingsSystemPreference();
		clickOnElement(settingsSystemPreferenceNonRegisterWalletThreshold);
		//clickOnSettingsMenu();
		return new SettingsSystemPreferenceNonRegisterWalletThresholdWeb(driver);
	}

	/**
	 * @author shivani.patel To click on Setting -> Tools
	 * @creation date 25/10/2018
	 */
	public void clickOnSettingsTools() {
		clickOnSettingsMenu();
		clickOnElement(settingsTools);
	}

	/**
	 * @author shivani.patel To click on setting -> Tools ->ImageUploader
	 *         directly
	 * @creation date 25/10/2018
	 */
	public SettingsToolsImageUploaderWeb clickOnSettingsToolsImageUploaders() {
		clickOnSettingsTools();
		clickOnElement(settingsToolsImageUploader);
		clickOnSettingsMenu();
		return new SettingsToolsImageUploaderWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> Tools ->ExchangeRate
	 *         directly
	 * @creation date 29/10/2018
	 */
	public SettingsToolsExchangeRateWeb clickOnSettingsToolsExchangeRates() {
		clickOnSettingsTools();
		clickOnElement(settingsToolsExchangeRate);
		clickOnSettingsMenu();
		return new SettingsToolsExchangeRateWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> Alert ->EmailAccount
	 *         directly
	 * @creation date 30/10/2018
	 */
	public SettingsAlertEmailAccountWeb clickOnSettingsAlertEmailAccount() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertEmailAccount);
		return new SettingsAlertEmailAccountWeb(driver);
	}

	/**
	 * @author shivani.patel To click on setting -> Alert ->SMSAlert directly
	 * @creation date 31/10/2018
	 */
	public SettingsAlertSMSAlertWeb clickOnSettingsAlertsSMSAlert() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertSMSAlert);
		return new SettingsAlertSMSAlertWeb(driver);
	}
	/**
	 * @author shivani.patel To click on setting -> Alert ->FCMAccount directly
	 * @creation date 01/11/2018
	 */
	public SettingsAlertFCMAccountWeb clickOnSettingsAlertsFCMAccount() {
		clickOnSettingsAlert();
		clickOnElement(settingsAlertFCMAccount);
		return new SettingsAlertFCMAccountWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product -> External Products ->
	 *         VendorIntegration directly
	 * @creation date 28/09/2018
	 */
	public ProductExternalVendorIntegrationWeb clickOnProductsExternalVendorIntegration() {
		clickOnProductExternalProducts();
		clickOnElement(productVendorIntegration);
		clickOnProductMenu();
		return new ProductExternalVendorIntegrationWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product -> External Products ->
	 *         VendorProductManager directly
	 * @creation date 28/09/2018
	 */
	public ProductExternalVendorProductManagerWeb clickOnProductsExternalVendorProductManager() {
		clickOnProductExternalProducts();
		clickOnElement(productVendorProductManager);
		//clickOnProductMenu();
		return new ProductExternalVendorProductManagerWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product -> External Products ->
	 *         ProductManager directly
	 * @creation date 24/10/2018
	 */
	public ProductExternalProductManagerWeb clickOnProductsExternalProductManager() {
		clickOnProductExternalProducts();
		clickOnElement(ProductManager);
		clickOnProductMenu();
		return new ProductExternalProductManagerWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product->Internal
	 * @creation date 08/10/2018
	 */
	public void clickOnProductInternal() {
		clickOnProductMenu();
	}
	/**
	 * @author kutbuddin.compounder To click on Product->Internal directly
	 * @creation date 08/10/2018
	 */
	public ProductInternalProductsWeb clickOnProductInternalProducts() {
		clickOnProductInternal();
		clickOnElement(ProductInternalProducts);
		clickOnProductMenu();
		return new ProductInternalProductsWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product->Subwallet
	 * @return
	 * @creation date 08/10/2018
	 */
	public void clickOnProductSubwallet() {
		clickOnProductMenu();
	}
	/**
	 * @author kutbuddin.compounder To click on Product->Subwallet directly
	 * @creation date 08/10/2018
	 */
	public ProductSubwalletWeb clickOnProductSubwalletProducts() {
		clickOnProductSubwallet();
		clickOnElement(ProductSubWallet);
		clickOnProductMenu();
		return new ProductSubwalletWeb(driver);
	}
	/**
	 * @author dishant.doshi To click on Product
	 * @creation date 02/10/2018
	 */
	public void clickOnProductMenu() {
		clickOnElement(product);
	}
	/**
	 * @author dishant.doshi To click on Product -> External Products
	 * @creation date 02/10/2018
	 */
	public void clickOnProductExternalProducts() {
		clickOnProductMenu();
		clickOnElement(productExternalProducts);
	}
	/**
	 * @author dishant.doshi To click on Product -> External Products ->
	 *         Operators directly
	 * @creation date 28/09/2018
	 */
	public ProductExternalProductsOperatorWeb clickOnProductsExternalProductsOperator() {
		clickOnProductExternalProducts();
		clickOnElement(productExternalProductsOperator);
		 clickOnProductMenu();
		return new ProductExternalProductsOperatorWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Product->taxation directly
	 * @creation date 08/10/2018
	 */
	public ProductTaxationWeb clickOnProductsTaxation() {
		clickOnProductMenu();
		clickOnElement(productTaxation);
		 clickOnProductMenu();
		return new ProductTaxationWeb(driver);
	}
	/**
	 * @author shivani.patel To click on Agent
	 * @creation date 03/10/2018
	 */
	public void clickOnAgentMenu() {
		clickOnElement(agent);
	}

	/**
	 * @author shivani.patel To click on Agent -> Tree directly
	 * @creation date 03/10/2018
	 */
	public AgentTreeWeb clickOnAgentTree() {
		clickOnAgentMenu();
		clickOnElement(agentTree);
		return new AgentTreeWeb(driver);
	}
	/**
	 * @author shivani.patel To click on Merchant -> Onboarding directly
	 * @creation date 01/11/2018
	 */
	public MerchantOnboardingWeb clickOnMerchantOnboarding() {
		clickOnMerchantMenu();
		clickOnElement(merchantOnboarding);
		//clickOnMerchantMenu();
		return new MerchantOnboardingWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder 
	 * To click on Merchant -> Onboarding directly
	 * @creation date 01/11/2018
	 */
	public MerchantTerminalOnboardingWeb clickOnMerchantTerminalOnboarding() {
		clickOnMerchantMenu();
		clickOnElement(merchantTerminalOnboarding);
		//clickOnMerchantMenu();
		return new MerchantTerminalOnboardingWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder
	 * To click on Customer->Matrix directly
	 * @creation date 08/10/2018
	 */
	public CustomerMatrixWeb clickOnCustomerMatrix()
	{
		clickOnCustomerMenu();
		clickOnElement(customerMatrix);
		//clickOnCustomerMenu();
		return new CustomerMatrixWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Customer -> Matrix
	 * @creation date 02/10/2018
	 */
	public void clickOnCustomersThreshold() {
		clickOnCustomerMenu();
		clickOnElement(customerThreshold);
	}
	/**
	 * @author kutbuddin.compounder To click on Customer->External->Threshold
	 *         directly
	 * @creation date 08/10/2018
	 */
	public CustomerThresholdExternalWeb clickOnCustomerThresholdExternal()
	{
		clickOnCustomersThreshold();
		clickOnElement(customerThreholdExternal);
		//clickOnCustomerMenu();
		return new CustomerThresholdExternalWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Customer->Internal->Threshold
	 * @author kutbuddin.compounder To click on Customer->External->Threshold
	 * @author dishant.doshi To click on Customer -> Profile directly
	 * @creation date 19/11/2018
	 */
	public CustomerProfileWeb clickOnCustomerProfile() {
		clickOnCustomerMenu();
		clickOnElement(customerProfile);
		// clickOnCustomerMenu();
		return new CustomerProfileWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Customer -> Profile Update directly
	 * @creation date 23/11/2018
	 */
	public CustomerProfileUpdateWeb clickOnCustomerProfileUpdate() {
		clickOnCustomerMenu();
		clickOnElement(customerProfileUpdate);
		// clickOnCustomerMenu();
		return new CustomerProfileUpdateWeb(driver);
	}

	/**
	 * @author kutbuddin.compounder To click on Customer->External->Threshold
	 *         directly
	 * @creation date 08/10/2018
	 */
	public CustomerThresholdInternalWeb clickOnCustomerThresholdInternal()
	{
		clickOnCustomersThreshold();
		clickOnElement(customerThreholdInternal);
		//clickOnCustomerMenu();
		return new CustomerThresholdInternalWeb(driver);
	}
	/**
	 * @author dishant.doshi To click on Enterprise -> Profile directly
	 * @creation date 16/11/2018
	 */
	public EnterpriseProfileWeb clickOnEnterpriseProfile() {
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseProfile);
		//clickOnEnterpriseMenu();
		return new EnterpriseProfileWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Enterprise->Matrix directly
	 * @creation date 21/11/2018
	 */
	public EnterpriseMatrixWeb clickOnEnterpriseMatrix() {
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseMatrix);
		//clickOnEnterpriseMenu(); 
		return new EnterpriseMatrixWeb(driver); 
	}
	/**
	 * @author kutbuddin.compounder To click on Merchant->Matrix directly
	 * @creation date 21/11/2018
	 */
	/*public MerchantMatrixWeb clickOnMerchantMatrix() {
		clickOnMerchantMenu();
		clickOnElement(merchantMatrix);
		clickOnMerchantMenu(); 
		return new MerchantMatrixWeb(driver); 
	}*/
	/**
	 * @author kutbuddin.compounder To click on Enterprise -> Threshold
	 * @creation date 12/11/2018
	 */
	public void clickOnEnterprisesThreshold() {
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseThreshold);
	}
	/**
	 * @author kutbuddin.compounder To click on Enterprise->External->Threshold
	 *         directly
	 * @creation date 12/11/2018
	 */
	public EnterpriseThresholdExternalWeb clickOnEnterpriseThresholdExternal()
	{
		clickOnEnterprisesThreshold();
		clickOnElement(enterpriseThreholdExternal);
		//clickOnEnterpriseMenu();
		return new EnterpriseThresholdExternalWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Enterprise->Internal->Threshold
	 *         directly
	 * @creation date 12/11/2018
	 */
	public EnterpriseThresholdInternalWeb clickOnEnterpriseThresholdInternal()
	{
		clickOnEnterprisesThreshold();
		clickOnElement(enterpriseThreholdInternal);
		//clickOnEnterpriseMenu();
		return new EnterpriseThresholdInternalWeb(driver);
	}
	/**
	 * @author  kutbuddin.compounder
	 * To click on Agent -> Threshold
	 * @creation date 12/11/2018
	 */
	public void clickOnAgentsThreshold(){
		clickOnAgentMenu();
		clickOnElement(agentThreshold);
	}
	/**
	 * @author  kutbuddin.compounder
	 * To click on Merchant -> Threshold
	 * @creation date 12/11/2018
	 */
	public void clickOnMerchantsThreshold(){
		clickOnMerchantMenu();
		clickOnElement(agentThreshold);
	}
	/**
	 * @author kutbuddin.compounder To click on Agent->Matrix directly
	 * @creation date 22/11/2018
	 */
	public AgentMatrixWeb clickOnAgentMatrix() {
		clickOnAgentMenu();
		clickOnElement(agentMatrix);
		clickOnAgentMenu(); 
		return new AgentMatrixWeb(driver); 
	}
	/**
	 * @author kutbuddin.compounder
	 * To click on Agent->External->Threshold directly
	 * @creation date 12/11/2018
	 */
	public AgentThresholdExternalWeb clickOnAgentThresholdExternal()
	{
		clickOnAgentsThreshold();
		clickOnElement(agentThreholdExternal);
		clickOnAgentMenu();
		return new AgentThresholdExternalWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder
	 * To click on Agent->Internal->Threshold directly
	 * @creation date 12/11/2018
	 */
	public AgentThresholdInternalWeb clickOnAgentThresholdInternal()
	{
		clickOnAgentsThreshold();
		clickOnElement(agentThreholdInternal);
		clickOnAgentMenu();
		return new AgentThresholdInternalWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder
	 * To click on Merchant->Internal->Threshold directly
	 * @creation date 12/11/2018
	 */
	public MerchantThresholdInternalWeb clickOnMerchantThresholdInternal()
	{
		clickOnMerchantsThreshold();
		clickOnElement(merchantThreholdInternal);
		//clickOnMerchantMenu();
		return new MerchantThresholdInternalWeb(driver);
	}
	/**
	 * @author shivani.patel To click on Reports
	 * @creation date 13/11/2018
	 */
	public void clickOnReportsMenu() {
		clickOnElement(reports);
	}

	/**
	 * @author shivani.patel To click on Report -> Transaction Detail
	 * @creation date 13/11/2018
	 */
	public void clickOnReportTransactionDetail() {
		clickOnReportsMenu();
		clickOnElement(reportsTransactionDetail);
	}

	/**
	 * @author shivani.patel To click on Report->Transaction Detail ->
	 *         InternalServiceReportDetail directly
	 * @creation date 13/11/2018
	 */
	public ReportsTransactionDetailInternalServiceDetailReportWeb clickOnReportsTransactionDetailInternalServiceDetailReport() {
		clickOnReportTransactionDetail();
		clickOnElement(reportsTransactionDetailInternalServiceDetailReport);
		return new ReportsTransactionDetailInternalServiceDetailReportWeb(driver);
	}

	/**
	 * @author shivani.patel To click on Agent -> Onboarding directly
	 * @creation date 03/10/2018
	 */
	public AgentOnboardingWeb clickOnAgentOnboarding() {
		clickOnAgentMenu();
		clickOnElement(agentOnboarding);
		return new AgentOnboardingWeb(driver);
	}
	
	/**
	 * @author dishant.doshi To click on Agent -> Assistant Onboarding directly
	 * @creation date 30/11/2018
	 */
	public AgentAssistantOnboardingWeb clickOnAgentAssistantOnboarding() {
		clickOnAgentMenu();
		clickOnElement(agentAssistantOnboarding);
		//clickOnAgentMenu();
		return new AgentAssistantOnboardingWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Agent -> Profile directly
	 * @creation date 12/11/2018
	 */
	public AgentProfileWeb clickOnAgentProfile() {
		clickOnAgentMenu();
		clickOnElement(agentProfile);
		clickOnAgentMenu();
		return new AgentProfileWeb(driver);
	}
	
	public void clickOnAgentTransfer(){
		clickOnAgentMenu();
		clickOnElement(agentTransfer);
	}
	
	/**
	 * @author dishant.doshi To click on Agent -> Profile directly
	 * @creation date 26/11/2018
	 */
	public AgentTransferWeb clickOnAgentNodeTransfer() {
		clickOnAgentTransfer();
		clickOnElement(agentNodeTransfer);
		return new AgentTransferWeb(driver);
	}

	/**
	 * @author dishant.doshi To click on Agent -> branch view directly
	 * @creation date 23/11/2018
	 */
	public AgentBranchViewWeb clickOnAgentBranchView() {
		clickOnAgentMenu();
		clickOnElement(agentBranchView);
		clickOnAgentMenu();
		return new AgentBranchViewWeb(driver);
	}

	/**
	 * @author shivani.patel To click on Enterprise -> Onboarding
	 * @creation date 16/11/2018
	 */
	public EnterpriseOnboardingWeb clickOnEnterpriseOnboarding() {
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseOnboarding);
		return new EnterpriseOnboardingWeb(driver);
	}

	/**
	 * @author  kutbuddin.compounder
	 * To click on Enterprise -> OnboardingUser
	 * @creation date 28/11/2018
	 */
	public EnterpriseOnboardingUserWeb clickOnEnterpriseOnboardingUser(){
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseOnboardingUser);
		return new EnterpriseOnboardingUserWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Onboarding
	 * @author  shivani.patel
	 * To click on Customer -> Onboarding
	 * @author shivani.patel To click on Customer -> Onboarding
	 * @creation date 16/11/2018
	 */
	public CustomerOnboardingWeb clickOnCustomerOnboarding() {
		clickOnCustomerMenu();
		clickOnElement(customerOnboarding);
		//clickOnCustomerMenu();
		return new CustomerOnboardingWeb(driver);
	}
	/**
	 * @author kutbuddin.compounder To click on Merchant->Matrix directly
	 * @creation date 21/11/2018
	 */
	public MerchantMatrixWeb clickOnMerchantMatrix() {
		clickOnMerchantMenu();
		clickOnElement(merchantMatrix);
		//clickOnMerchantMenu(); 
		return new MerchantMatrixWeb(driver); 
	}
	/**
	 * @author  shivani.patel
	 * To click on Trust Account -> TA Bank
	 * @creation date 27/11/2018
	 */
	public TABankWeb clickOnTrustAccountTABank(){
		clickOnTrustAccountMenu();
		clickOnElement(trustAccountTABank);
		return new TABankWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Trust Account -> TA User
	 * @creation date 27/11/2018
	 */
	public TAUserWeb clickOnTrustAccountTAUser(){
		clickOnTrustAccountMenu();
		clickOnElement(trustAccountTAUser);
		return new TAUserWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report
	 * @creation date 13/12/2018
	 */
	public void clickOnMerchantReport(){
		clickOnMerchantMenu();
		clickOnElement(merchantReport);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Transaction Detail
	 * @creation date 13/12/2018
	 */
	public MerchantReportTransactionDetailWeb clickOnMerchantReportTransactionDetail() {
		clickOnMerchantReport();
		clickOnElement(merchantReportTransactionDetail);
		return new MerchantReportTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Transaction Summary
	 * @creation date 18/12/2018
	 */
	public MerchantReportTransactionSummaryWeb clickOnMerchantReportTransactionSummary() {
		clickOnMerchantReport();
		clickOnElement(merchantReportTransactionSummary);
		return new MerchantReportTransactionSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Transaction Performance
	 * @creation date 18/12/2018
	 */
	public MerchantReportTransactionPerformanceWeb clickOnMerchantReportTransactionPerformance() {
		clickOnMerchantReport();
		clickOnElement(merchantReportTransactionPerformance);
		return new MerchantReportTransactionPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Transaction Drilldown
	 * @creation date 18/12/2018
	 */
	public MerchantReportTransactionDrilldownWeb clickOnMerchantReportTransactionDrilldown() {
		clickOnMerchantReport();
		clickOnElement(merchantReportTransactionDrillDown);
		return new MerchantReportTransactionDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Onboarding Detail
	 * @creation date 18/12/2018
	 */
	public MerchantReportOnboardingDetailWeb clickOnMerchantReportOnboardingDetail() {
		clickOnMerchantReport();
		clickOnElement(merchantReportOnboardingDetail);
		return new MerchantReportOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->TerminalOnboarding Detail
	 * @creation date 18/12/2018
	 */
	public MerchantReportTerminalOnboardingDetailWeb clickOnMerchantReportTerminalOnboardingDetail() {
		clickOnMerchantReport();
		clickOnElement(merchantReportTerminalOnboardingDetail);
		return new MerchantReportTerminalOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Onboarding Summary
	 * @creation date 18/12/2018
	 */
	public MerchantReportOnboardingSummaryWeb clickOnMerchantReportOnboardingSummary() {
		clickOnMerchantReport();
		clickOnElement(merchantReportOnboardingSummary);
		return new MerchantReportOnboardingSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Onboarding Performance
	 * @creation date 18/12/2018
	 */
	public MerchantReportOnboardingPerformanceWeb clickOnMerchantReportOnboardingPerformance() {
		clickOnMerchantReport();
		clickOnElement(merchantReportOnboardingPerformance);
		return new MerchantReportOnboardingPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report ->Onboarding Drilldown
	 * @creation date 18/12/2018
	 */
	public MerchantReportOnboardingDrilldownWeb clickOnMerchantReportOnboardingDrilldown() {
		clickOnMerchantReport();
		clickOnElement(merchantReportOnboardingDrilldown);
		return new MerchantReportOnboardingDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Merchant -> Report -> Activity Report
	 * @creation date 19/12/2018
	 */
	public MerchantReportActivityReportWeb clickOnMerchantReportActivityReport() {
		clickOnMerchantReport();
		clickOnElement(merchantReportActivityReport);
		return new MerchantReportActivityReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report
	 * @creation date 19/12/2018
	 */
	public void clickOnAgentReport(){
		clickOnAgentMenu();
		clickOnElement(agentReport);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Transaction Detail
	 * @creation date 19/12/2018
	 */
	public AgentReportTransactionDetailWeb clickOnAgentReportTransactionDetail() {
		clickOnAgentReport();
		clickOnElement(agentReportTransactionDetail);
		return new AgentReportTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Transaction Summary
	 * @creation date 19/12/2018
	 */
	public AgentReportTransactionSummaryWeb clickOnAgentReportTransactionSummary() {
		clickOnAgentReport();
		clickOnElement(agentReportTransactionSummary);
		return new AgentReportTransactionSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Transaction Performance
	 * @creation date 19/12/2018
	 */
	public AgentReportTransactionPerformanceWeb clickOnAgentReportTransactionPerformance() {
		clickOnAgentReport();
		clickOnElement(agentReportTransactionPerformance);
		return new AgentReportTransactionPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Transaction Drilldown
	 * @creation date 19/12/2018
	 */
	public AgentReportTransactionDrilldownWeb clickOnAgentReportTransactionDrilldown() {
		clickOnAgentReport();
		clickOnElement(agentReportTransactionDrillDown);
		return new AgentReportTransactionDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Onboarding Detail
	 * @creation date 19/12/2018
	 */
	public AgentReportOnboardingDetailWeb clickOnAgentReportOnboardingDetail() {
		clickOnAgentReport();
		clickOnElement(agentReportOnboardingDetail);
		return new AgentReportOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->AssistantOnboarding Detail
	 * @creation date 19/12/2018
	 */
	public AgentReportAssistantOnboardingDetailWeb clickOnAgentReportAssistantOnboardingDetail() {
		clickOnAgentReport();
		clickOnElement(agentReportAssistantOnboardingDetail);
		return new AgentReportAssistantOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Onboarding Summary
	 * @creation date 19/12/2018
	 */
	public AgentReportOnboardingSummaryWeb clickOnAgentReportOnboardingSummary() {
		clickOnAgentReport();
		clickOnElement(agentReportOnboardingSummary);
		return new AgentReportOnboardingSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Onboarding Performance
	 * @creation date 19/12/2018
	 */
	public AgentReportOnboardingPerformanceWeb clickOnAgentReportOnboardingPerformance() {
		clickOnAgentReport();
		clickOnElement(agentReportOnboardingPerformance);
		return new AgentReportOnboardingPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report ->Onboarding Drilldown
	 * @creation date 19/12/2018
	 */
	public AgentReportOnboardingDrilldownWeb clickOnAgentReportOnboardingDrilldown() {
		clickOnAgentReport();
		clickOnElement(agentReportOnboardingDrilldown);
		return new AgentReportOnboardingDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Agent -> Report -> Activity Report
	 * @creation date 19/12/2018
	 */
	public AgentReportActivityReportWeb clickOnAgentReportActivityReport() {
		clickOnAgentReport();
		clickOnElement(agentReportActivityReport);
		return new AgentReportActivityReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report
	 * @creation date 20/12/2018
	 */
	public void clickOnCustomerReport(){
		clickOnCustomerMenu();
		clickOnElement(customerReport);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Transaction Detail
	 * @creation date 20/12/2018
	 */
	public CustomerReportTransactionDetailWeb clickOnCustomerReportTransactionDetail() {
		clickOnCustomerReport();
		clickOnElement(customerReportTransactionDetail);
		return new CustomerReportTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Transaction Summary
	 * @creation date 20/12/2018
	 */
	public CustomerReportTransactionSummaryWeb clickOnCustomerReportTransactionSummary() {
		clickOnCustomerReport();
		clickOnElement(customerReportTransactionSummary);
		return new CustomerReportTransactionSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Transaction Performance
	 * @creation date 20/12/2018
	 */
	public CustomerReportTransactionPerformanceWeb clickOnCustomerReportTransactionPerformance() {
		clickOnCustomerReport();
		clickOnElement(customerReportTransactionPerformance);
		return new CustomerReportTransactionPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Transaction Drilldown
	 * @creation date 20/12/2018
	 */
	public CustomerReportTransactionDrilldownWeb clickOnCustomerReportTransactionDrilldown() {
		clickOnCustomerReport();
		clickOnElement(customerReportTransactionDrillDown);
		return new CustomerReportTransactionDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Onboarding Detail
	 * @creation date 20/12/2018
	 */
	public CustomerReportOnboardingDetailWeb clickOnCustomerReportOnboardingDetail() {
		clickOnCustomerReport();
		clickOnElement(customerReportOnboardingDetail);
		return new CustomerReportOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Onboarding Summary
	 * @creation date 20/12/2018
	 */
	public CustomerReportOnboardingSummaryWeb clickOnCustomerReportOnboardingSummary() {
		clickOnCustomerReport();
		clickOnElement(customerReportOnboardingSummary);
		return new CustomerReportOnboardingSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Onboarding Performance
	 * @creation date 20/12/2018
	 */
	public CustomerReportOnboardingPerformanceWeb clickOnCustomerReportOnboardingPerformance() {
		clickOnCustomerReport();
		clickOnElement(customerReportOnboardingPerformance);
		return new CustomerReportOnboardingPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report ->Onboarding Drilldown
	 * @creation date 20/12/2018
	 */
	public CustomerReportOnboardingDrilldownWeb clickOnCustomerReportOnboardingDrilldown() {
		clickOnCustomerReport();
		clickOnElement(customerReportOnboardingDrilldown);
		return new CustomerReportOnboardingDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Customer -> Report -> Activity Report
	 * @creation date 20/12/2018
	 */
	public CustomerReportActivityReportWeb clickOnCustomerReportActivityReport() {
		clickOnCustomerReport();
		clickOnElement(customerReportActivityReport);
		return new CustomerReportActivityReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report
	 * @creation date 21/12/2018
	 */
	public void clickOnEnterpriseReport(){
		clickOnEnterpriseMenu();
		clickOnElement(enterpriseReport);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Transaction Detail
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportTransactionDetailWeb clickOnEnterpriseReportTransactionDetail() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportTransactionDetail);
		return new EnterpriseReportTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Transaction Summary
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportTransactionSummaryWeb clickOnEnterpriseReportTransactionSummary() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportTransactionSummary);
		return new EnterpriseReportTransactionSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Transaction Performance
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportTransactionPerformanceWeb clickOnEnterpriseReportTransactionPerformance() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportTransactionPerformance);
		return new EnterpriseReportTransactionPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Transaction Drilldown
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportTransactionDrilldownWeb clickOnEnterpriseReportTransactionDrilldown() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportTransactionDrillDown);
		return new EnterpriseReportTransactionDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Onboarding Detail
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportOnboardingDetailWeb clickOnEnterpriseReportOnboardingDetail() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportOnboardingDetail);
		return new EnterpriseReportOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report -> User Onboarding Detail
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportUserOnboardingDetailWeb clickOnEnterpriseReportUserOnboardingDetail() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportUserOnboardingDetail);
		return new EnterpriseReportUserOnboardingDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Onboarding Summary
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportOnboardingSummaryWeb clickOnEnterpriseReportOnboardingSummary() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportOnboardingSummary);
		return new EnterpriseReportOnboardingSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Onboarding Performance
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportOnboardingPerformanceWeb clickOnEnterpriseReportOnboardingPerformance() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportOnboardingPerformance);
		return new EnterpriseReportOnboardingPerformanceWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report ->Onboarding Drilldown
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportOnboardingDrilldownWeb clickOnEnterpriseReportOnboardingDrilldown() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportOnboardingDrilldown);
		return new EnterpriseReportOnboardingDrilldownWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Enterprise -> Report -> Activity Report
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportActivityReportWeb clickOnEnterpriseReportActivityReport() {
		clickOnEnterpriseReport();
		clickOnElement(enterpriseReportActivityReport);
		return new EnterpriseReportActivityReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report
	 * @creation date 21/12/2018
	 */
	public void clickOnTrustAccountReport(){
		clickOnTrustAccountMenu();
		clickOnElement(trustAccountReport);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report ->Transaction Detail
	 * @creation date 21/12/2018
	 */
	public TrustAccountReportTransactionDetailWeb clickOnTrustAccountReportTransactionDetail() {
		clickOnTrustAccountReport();
		clickOnElement(trustAccountReportTransactionDetail);
		return new TrustAccountReportTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report ->Transaction Summary
	 * @creation date 21/12/2018
	 */
	public TrustAccountReportTransactionSummaryWeb clickOnTrustAccountReportTransactionSummary() {
		clickOnTrustAccountReport();
		clickOnElement(trustAccountReportTransactionSummary);
		return new TrustAccountReportTransactionSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report ->Emoney Detail
	 * @creation date 21/12/2018
	 */
	public TrustAccountReportEmoneyDetailWeb clickOnTrustAccountReportEmoneyDetail() {
		clickOnTrustAccountReport();
		clickOnElement(trustAccountReportEmoneyDetail);
		return new TrustAccountReportEmoneyDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report ->Emoney Summary
	 * @creation date 21/12/2018
	 */
	public TrustAccountReportEmoneySummaryWeb clickOnTrustAccountReportEmoneySummary() {
		clickOnTrustAccountReport();
		clickOnElement(trustAccountReportEmoneySummary);
		return new TrustAccountReportEmoneySummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on TrustAccount -> Report -> Activity Report
	 * @creation date 21/12/2018
	 */
	public TrustAccountReportActivityReportWeb clickOnTrustAccountReportActivityReport() {
		clickOnTrustAccountReport();
		clickOnElement(trustAccountReportActivityReport);
		return new TrustAccountReportActivityReportWeb(driver);
	}
	/**
	 * @author shivani.patel 
	 * To click on Report->Transaction Detail -> ExternalServiceReportDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsTransactionDetailExternalServiceDetailReportWeb clickOnReportsTransactionDetailExternalServiceDetailReport() {
		clickOnReportTransactionDetail();
		clickOnElement(reportsTransactionDetailExternalServiceDetailReport);
		return new ReportsTransactionDetailExternalServiceDetailReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Transaction Summary
	 * @creation date 24/12/2018
	 */
	public void clickOnReportTransactionSummary() {
		clickOnReportsMenu();
		clickOnElement(reportsTransactionSummary);
	}
	/**
	 * @author shivani.patel
	 * To click on Report->Transaction Summary -> InternalServiceReportSummary directly
	 * @creation date 24/12/2018
	 */
	public ReportsTransactionSummaryInternalServiceSummaryReportWeb clickOnReportsTransactionSummaryInternalServiceSummaryReport() {
		clickOnReportTransactionSummary();
		clickOnElement(reportsTransactionSummaryInternalServiceSummaryReport);
		return new ReportsTransactionSummaryInternalServiceSummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel 
	 * To click on Report->Transaction Summary -> ExternalServiceReportSummary directly
	 * @creation date 24/12/2018
	 */
	public ReportsTransactionSummaryExternalServiceSummaryReportWeb clickOnReportsTransactionSummaryExternalServiceSummaryReport() {
		clickOnReportTransactionSummary();
		clickOnElement(reportsTransactionSummaryExternalServiceSummaryReport);
		return new ReportsTransactionSummaryExternalServiceSummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Reversal Detail
	 * @creation date 24/12/2018
	 */
	public void clickOnReportReversalDetail() {
		clickOnReportsMenu();
		clickOnElement(reportsReversalDetail);
	}
	/**
	 * @author shivani.patel
	 * To click on Report->Reversal Detail -> InternalServiceReportDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsReversalDetailInternalServiceDetailReportWeb clickOnReportsReversalDetailInternalServiceDetailReport() {
		clickOnReportReversalDetail();
		clickOnElement(reportsReversalDetailInternalServiceDetailReport);
		return new ReportsReversalDetailInternalServiceDetailReportWeb(driver);
	}
	/**
	 * @author shivani.patel 
	 * To click on Report->Reversal Detail -> ExternalServiceReportDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsReversalDetailExternalServiceDetailReportWeb clickOnReportsReversalDetailExternalServiceDetailReport() {
		clickOnReportReversalDetail();
		clickOnElement(reportsReversalDetailExternalServiceDetailReport);
		return new ReportsReversalDetailExternalServiceDetailReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Reversal Summary
	 * @creation date 24/12/2018
	 */
	public void clickOnReportReversalSummary() {
		clickOnReportsMenu();
		clickOnElement(reportsReversalSummary);
	}
	/**
	 * @author shivani.patel
	 * To click on Report->Reversal Summary -> InternalServiceReportSummary directly
	 * @creation date 24/12/2018
	 */
	public ReportsReversalSummaryInternalServiceSummaryReportWeb clickOnReportsReversalSummaryInternalServiceSummaryReport() {
		clickOnReportReversalSummary();
		clickOnElement(reportsReversalSummaryInternalServiceSummaryReport);
		return new ReportsReversalSummaryInternalServiceSummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel 
	 * To click on Report->Reversal Summary -> ExternalServiceReportSummary directly
	 * @creation date 24/12/2018
	 */
	public ReportsReversalSummaryExternalServiceSummaryReportWeb clickOnReportsReversalSummaryExternalServiceSummaryReport() {
		clickOnReportReversalSummary();
		clickOnElement(reportsReversalSummaryExternalServiceSummaryReport);
		return new ReportsReversalSummaryExternalServiceSummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> System Wallet Detail
	 * @creation date 24/12/2018
	 */
	public void clickOnReportSystemWalletDetail() {
		clickOnReportsMenu();
		clickOnElement(reportsSystemWalletDetail);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> System Wallet Detail -> SurchargeDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsSystemWalletDetailSurchargeDetailWeb clickOnReportsSystemWalletDetailSurchargeDetail() {
		clickOnReportSystemWalletDetail();
		clickOnElement(reportsSystemWalletDetailSurchargeDetail);
		return new ReportsSystemWalletDetailSurchargeDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> System Wallet Detail -> CommisionDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsSystemWalletDetailCommisionDetailWeb clickOnReportsSystemWalletDetailCommisionDetail() {
		clickOnReportSystemWalletDetail();
		clickOnElement(reportsSystemWalletDetailCommisionDetail);
		return new ReportsSystemWalletDetailCommisionDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> System Wallet Detail -> SuspensAccountDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsSystemWalletDetailSuspenseAccountDetailWeb clickOnReportsSystemWalletDetailSuspenseAccountDetail() {
		clickOnReportSystemWalletDetail();
		clickOnElement(reportsSystemWalletDetailSuspenseAccountDetail);
		return new ReportsSystemWalletDetailSuspenseAccountDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> System Wallet Detail -> NonRegisterDetail directly
	 * @creation date 24/12/2018
	 */
	public ReportsSystemWalletDetailNonRegisterDetailWeb clickOnReportsSystemWalletDetailNonRegisterDetail() {
		clickOnReportSystemWalletDetail();
		clickOnElement(reportsSystemWalletDetailNonRegisterDetail);
		return new ReportsSystemWalletDetailNonRegisterDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Notification Detail
	 * @creation date 27/12/2018
	 */
	public void clickOnReportNotificationDetail() {
		clickOnReportsMenu();
		clickOnElement(reportsNotificationDetail);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationDetail Detail -> EmailDetail directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationDetailEmailDetailWeb clickOnReportsNotificationDetailEmailDetail() {
		clickOnReportNotificationDetail();
		clickOnElement(reportsNotificationDetailEmailDetail);
		return new ReportsNotificationDetailEmailDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationDetail Detail -> FCMDetail directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationDetailFCMDetailWeb clickOnReportsNotificationDetailFCMDetail() {
		clickOnReportNotificationDetail();
		clickOnElement(reportsNotificationDetailFCMDetail);
		return new ReportsNotificationDetailFCMDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationDetail Detail -> SMSDetail directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationDetailSMSDetailWeb clickOnReportsNotificationDetailSMSDetail() {
		clickOnReportNotificationDetail();
		clickOnElement(reportsNotificationDetailSMSDetail);
		return new ReportsNotificationDetailSMSDetailWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Notification Summary
	 * @creation date 27/12/2018
	 */
	public void clickOnReportNotificationSummary() {
		clickOnReportsMenu();
		clickOnElement(reportsNotificationSummary);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationSummary Summary -> EmailSummary directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationSummaryEmailSummaryWeb clickOnReportsNotificationSummaryEmailSummary() {
		clickOnReportNotificationSummary();
		clickOnElement(reportsNotificationSummaryEmailSummary);
		return new ReportsNotificationSummaryEmailSummaryWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationSummary Summary -> FCMSummary directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationSummaryFCMSummaryWeb clickOnReportsNotificationSummaryFCMSummary() {
		clickOnReportNotificationSummary();
		clickOnElement(reportsNotificationSummaryFCMSummary);
		return new ReportsNotificationSummaryFCMSummaryWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> NotificationSummary Summary -> SMSSummary directly
	 * @creation date 27/12/2018
	 */
	public ReportsNotificationSummarySMSSummaryWeb clickOnReportsNotificationSummarySMSSummary() {
		clickOnReportNotificationSummary();
		clickOnElement(reportsNotificationSummarySMSSummary);
		return new ReportsNotificationSummarySMSSummaryWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Report -> VendorTransactionDetail
	 * @creation date 27/12/2018
	 */
	public ReportsVendorTransactionDetailWeb clickOnVendorTransactionDetailReport() {
		clickOnReportsMenu();
		clickOnElement(reportsVendorTransactionDetail);
		return new ReportsVendorTransactionDetailWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Report -> UserBaseReport
	 * @creation date 27/12/2018
	 */
	public ReportsUserBaseReportWeb clickOnUserBaseReport() {
		clickOnReportsMenu();
		clickOnElement(reportsUserBaseReport);
		return new ReportsUserBaseReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Report -> UserBaseReport
	 * @creation date 27/12/2018
	 */
	public ReportsEmoneySummaryReportWeb clickOnEmoneySummaryReport() {
		clickOnReportsMenu();
		clickOnElement(reportsEmoneySummaryReport);
		return new ReportsEmoneySummaryReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Report -> ActivationInfo
	 * @creation date 27/12/2018
	 */
	public ReportsEmoneySummaryReportWeb clickOnActivationInfoReport() {
		clickOnReportsMenu();
		clickOnElement(reportsEmoneySummaryReport);
		return new ReportsEmoneySummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Support
	 * @creation date 28/12/2018
	 */
	public void clickOnReportSupport() {
		clickOnReportsMenu();
		clickOnElement(reportsSupport);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Support -> SupportActivityDetailReport directly
	 * @creation date 28/12/2018
	 */
	public ReportsSupportActivityDetailReportWeb clickOnReportsSupportActivityDetailReport() {
		clickOnReportSupport();
		clickOnElement(reportsSupportActivityDetailReport);
		return new ReportsSupportActivityDetailReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Support -> SupportActivitySummaryReport directly
	 * @creation date 28/12/2018
	 */
	public ReportsSupportActivitySummaryReportWeb clickOnReportsSupportActivitySummaryReport() {
		clickOnReportSupport();
		clickOnElement(reportsSupportActivitySummaryReport);
		return new ReportsSupportActivitySummaryReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Support -> PhoneNumberEditReport directly
	 * @creation date 28/12/2018
	 */
	public ReportsSupportPhoneNumberEditReportWeb clickOnReportsSupportPhoneNumberEditReport() {
		clickOnReportSupport();
		clickOnElement(reportsSupportPhoneNumberEditReport);
		return new ReportsSupportPhoneNumberEditReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report -> Pocket
	 * @creation date 28/12/2018
	 */
	public void clickOnReportPocket() {
		clickOnReportsMenu();
		clickOnElement(reportsPocket);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Pocket -> PocketCreation directly
	 * @creation date 28/12/2018
	 */
	public ReportsPocketCreationWeb clickOnReportsPocketCreationReport() {
		clickOnReportPocket();
		clickOnElement(reportsPocketCreation);
		return new ReportsPocketCreationWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Pocket -> PocketTransactionReport directly
	 * @creation date 28/12/2018
	 */
	public ReportsPocketTransactionReportWeb clickOnReportsPocketTransactionReport() {
		clickOnReportPocket();
		clickOnElement(reportsPocketTransactionReport);
		return new ReportsPocketTransactionReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Report-> Pocket -> PocketBalanceReport directly
	 * @creation date 28/12/2018
	 */
	public ReportsPocketBalanceReportWeb clickOnReportsPocketBalanceReport() {
		clickOnReportPocket();
		clickOnElement(reportsPocketBalanceReport);
		return new ReportsPocketBalanceReportWeb(driver);
	}
	/**
	 * @author  shivani.patel
	 * To click on Report -> UDIDetail Report
	 * @creation date 28/12/2018
	 */
	public ReportsUDIDetailReportWeb clickOnReportUDIDetailReport() {
		clickOnReportsMenu();
		clickOnElement(reportsUDIDetailReport);
		return new ReportsUDIDetailReportWeb(driver);
	}
	/**
	 * @author shivani.patel
	 * To click on Support
	 * @creation date 29/05/2019
	 */
	public void clickOnSupportMenu() {
		clickOnElement(support);
	}
	/**
	 * @author shivani.patel
	 * To click on Support-> Customer
	 * @creation date 29/05/2019
	 */
	public SupportCustomerWeb clickOnSupport() {
		clickOnSupportMenu();
		return new SupportCustomerWeb(driver);
	}
}
