package com.panamax.base;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ProductExternalVendorProductManagerWeb extends Common {
	By drpVendorName = By.id("VendorID");
	By drpModuleName = By.id("SystemModuleID");
	By drpSystemName = By.id("SystemServiceID");
	By txtProductCode = By.id("ProductCode");
	By txtProductName = By.id("ProductName");
	By drpRechargeCountry = By.id("RechargeCountryID");
	By txtDescription = By.id("Description");
	By drpServiceChargeType = By.id("CommissionType");
	By drpStatus = By.id("IsActive");
	By txtMinAmount = By.xpath("(//input[contains(@id,'MinAmount')])[1]");
	By txtMaxAmount = By.xpath("(//input[contains(@id,'MaxAmount')])[1]");
	By radioSelectServiceFreeTypePercantage = By.xpath("(//label[contains(@id,'lblSurchargeType')])[1]");
	By radioSelectServiceFreeTypeAmount = By.xpath("(//label[contains(@id,'lblSurchargeType')])[2]");
	By txtServiceFreeValue = By.xpath("(//input[contains(@id,'SurchargeValue')])[1]");
	By txtStartDate = By.xpath("(//input[contains(@id,'StartTime_')])[1]");
	By txtEndDate = By.xpath("(//input[contains(@id,'EndTime_')])[1]");
	By addbtn = By.xpath("(//*[contains(@id,'btnDiscountAdd')])[last()]");
	By txtStartDateYes = By.xpath("(//input[contains(@id,'ComStartTime')])[1]");
	By txtendDateYes = By.xpath("(//input[contains(@id,'ComEndTime')])[1]");
	By txtCommisionValueYes = By.xpath("(//input[contains(@id,'Commission')])[1]");
	By drpStatusSearch = By.id("cmbIsActive");
	By drpModuleSerach = By.id("cmbSystemModuleID");
	By drpServiceSearch = By.id("cmbSystemServiceID");
	By drpVendorSerach = By.id("cmbVendorID");
	By txtSearchProductcode = By.id("txtProductCode");
	By btnProduPanel = By.id("btnCProdPanel");
	By selectAllowRefund = By.xpath(
			"//label[normalize-space(text())='Allow Refund']//following :: *[contains(@class,'bootstrap-switch-id-AllowRefund')]");
	By selectCommonDiscount = By.xpath(
			"//label[normalize-space(text())='Common Discount']//following :: *[contains(@class,'bootstrap-switch-id-CommonDiscount')]");
	String IsYes = "Yes";
	String IsPercentage = "Percentage";
	String IsFix = "Fix";
	By buttonEditProductInfo = By.id("editVendorProductInfo");
	By buttonEditProductInfoSave = By.id("editVendorProductInfoSave");
	By denomSave = By.id("denomSave_1");
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 16/10/2018
	 */

	public ProductExternalVendorProductManagerWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         vendorName drop down
	 * @param vendorName
	 * @creation date 16/10/2018
	 */
	public void selectVendorName(String vendorName) {
		selectFromDropdown(drpVendorName, vendorName);
	}

	public static String startDate() {
		Date currentDate = new Date();
		String currentdate1 = dateFormat.format(currentDate);
		return currentdate1;
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         moduleName drop down
	 * @param moduleName
	 * @creation date 16/10/2018
	 */
	public void selectModuleName(String moduleName) {
		selectFromDropdown(drpModuleName, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         serviceName drop down
	 * @param serviceName
	 * @creation date 16/10/2018
	 */
	public void selectServiceName(String serviceName) {
		selectFromDropdown(drpSystemName, serviceName);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         productCode field
	 * @param productCode
	 * @creation date 16/10/2018
	 */
	public void sendTextInProductCode(String productCode) {
		clearAndSendTextInTextBox(txtProductCode, productCode);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         productName field
	 * @param productName
	 * @creation date 16/10/2018
	 */

	public void sendTextInProductName(String productName) {
		clearAndSendTextInTextBox(txtProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         productType from radio button click
	 * @param productType
	 * @creation date 16/10/2018
	 */
	public void selectProductType(String productType) {
		clickOnElement(By.xpath("//label[normalize-space(text())='" + productType + "']"));
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         rechargeCountry drop down
	 * @param rechargeCountry
	 * @creation date 16/10/2018
	 */
	public void selectRechargeCountry(String rechargeCountry) {
		selectFromDropdown(drpRechargeCountry, rechargeCountry);
	}

	/**
	 * @author kutbuddin.compounder select value from radio button Vendor
	 *         Product Manager taxDetails
	 * @param taxDetails
	 * @creation date 16/10/2018
	 */
	public void selectTaxDetails(String taxDetails) {
		clickOnElement(By.xpath("//label[normalize-space(text())='Tax Details']//following :: span[contains(text(), '"
				+ taxDetails + "')]"));
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         description field
	 * @param description
	 * @creation date 16/10/2018
	 */

	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         serviceChrargeType drop down
	 * @param serviceChrargeType
	 * @creation date 16/10/2018
	 */
	public void selectServiceChrargeType(String serviceChrargeType) {
		selectFromDropdown(drpServiceChargeType, serviceChrargeType);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Vendor Product
	 *         Manager allowRefund
	 * @param allowRefund
	 * @creation date 16/10/2018
	 */
	public void selectAllowRefund(String allowRefund) {
		if (allowRefund.equalsIgnoreCase(IsYes)) {
			clickOnElement(selectAllowRefund);
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Vendor Product
	 *         Manager allowRefund
	 * @param allowRefund
	 * @creation date 16/10/2018
	 */
	public void selectCommonDiscount(String commonDiscount) {
		if (commonDiscount.equalsIgnoreCase(IsYes)) {
			clickOnElement(selectCommonDiscount);
		}
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         status drop down
	 * @param status
	 * @creation date 16/10/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         MinAmount field
	 * @param MinAmount
	 * @creation date 16/10/2018
	 */
	public void sendTextInMinAmount(String MinAmount) {
		clearAndSendTextInTextBox(txtMinAmount, MinAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         MaxAmount field
	 * @param MaxAmount
	 * @creation date 24/10/2018
	 */
	public void sendTextInMaxAmount(String MaxAmount) {
		clearAndSendTextInTextBox(txtMaxAmount, MaxAmount);
	}

	/**
	 * @author kutbuddin.compounder click value from Vendor Product Manager
	 *         serviceFreeType radio button
	 * @param serviceFreeType
	 * @creation date 24/10/2018
	 */
	public void selectServiceFreeTypePercantage() {
		clickOnElement(radioSelectServiceFreeTypePercantage);
	}

	/**
	 * @author kutbuddin.compounder click value from Vendor Product Manager
	 *         serviceFreeType radio button
	 * @param serviceFreeType
	 * @creation date 24/10/2018
	 */
	public void selectServiceFreeTypeAmount() {
		clickOnElement(radioSelectServiceFreeTypeAmount);
	}

	/**
	 * @author kutbuddin.compounder send text value from Vendor Product Manager
	 *         ServiceFreeValue
	 * @creation date 24/10/2018
	 */
	public void sendTextInServiceFreeValue(String ServiceFreeValue) {
		clearAndSendTextInTextBox(txtServiceFreeValue, ServiceFreeValue);
	}

	/**
	 * @author kutbuddin.compounder send text in start date if commissionValue
	 * @param commissionValue
	 * @creation date 24/10/2018
	 */
	public void sendTextInComminssion(String commissionValue, By webElement) {
		clearAndSendTextInTextBox(webElement, commissionValue);
	}

	/**
	 * @author kutbuddin.compounder send text in commissionValue if commision
	 *         YES
	 * @param commissionValue
	 * @creation date 24/10/2018
	 */
	public void sendTextInComminssionYes(String commissionValue) {
		clearAndSendTextInTextBox(txtCommisionValueYes, commissionValue);
	}

	/**
	 * @author kutbuddin.compounder send text in start date if commision YES
	 * @param startDate
	 * @creation date 24/10/2018
	 */
	public void setStartDateCommissionYes(String startDateYes) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(startDateYes);
			Calendar c = Calendar.getInstance();
			;
			c.setTime(date1);
			c.add(Calendar.MINUTE, 60);
			Date currentDatePlusOne = c.getTime();
			String date2 = dateFormat.format(currentDatePlusOne);
			sendTextWithRemoveReadOnlyProperty(date2, txtStartDateYes);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @author kutbuddin.compounder send text in end date if commision YES
	 * @param endDate
	 * @creation date 24/10/2018
	 */
	public void setEndDateCommissionYes() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, 90);
		Date currentDatePlusOne = c.getTime();
		String endDate = dateFormat.format(currentDatePlusOne);
		sendTextWithRemoveReadOnlyProperty(endDate, txtendDateYes);
	}

	/**
	 * @author kutbuddin.compounder click on denomation add button
	 * @creation date 24/10/2018
	 */
	public void clickOnAddBtnDate(By WebElement) {
		clickOnElement(WebElement);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager name
	 *         field
	 * @param VendorNameSearch
	 * @creation date 16/10/2018
	 */
	public void selectInVendorNameInFilterSearch(String VendorNameSearch) {
		selectFromDropdown(drpVendorSerach, VendorNameSearch);
	}

	/**
	 * @author kutbuddin.compounder select in Vendor Product Manager moduleName
	 *         field
	 * @param moduleName
	 * @creation date 16/10/2018
	 */
	public void selectModuleInFilterSearch(String moduleName) {
		selectFromDropdown(drpModuleSerach, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select value in Vendor Product Manager
	 *         serviceName from dropdown
	 * @param serviceName
	 * @creation date 16/10/2018
	 */
	public void selectServiceInFilterSearch(String serviceName) {
		selectFromDropdown(drpServiceSearch, serviceName);
	}

	/**
	 * @author kutbuddin.compounder send text in Vendor Product Manager
	 *         productCode from dropdown
	 * @param productCode
	 * @creation date 16/10/2018
	 */
	public void sendProductCodeTextInFilterSearch(String productCode) {
		clearAndSendTextInTextBox(txtSearchProductcode, productCode);
	}

	/**
	 * @author kutbuddin.compounder select value from Vendor Product Manager
	 *         status drop down
	 * @param statusSearch
	 * @creation date 16/10/2018
	 */
	public void selectStatusInFilterSearch(String statusSearch) {
		selectFromDropdown(drpStatusSearch, statusSearch);
	}

	/**
	 * @author kutbuddin.compounder click on productpanel button
	 * @param statusSearch
	 * @creation date 23/10/2018
	 */
	public void clickOnProductPanel() {
		clickOnElement(btnProduPanel);
	}

	public void clickOnDenomBtn(By WebElement) {
		clickOnElement(WebElement);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button info
	 * @creation date 16/10/2018
	 */
	public void clickOnEditBtnProductInfo() {
		clickOnElement(buttonEditProductInfo);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button info save
	 *         button
	 * @creation date 16/10/2018
	 */
	public void clickOnEditBtnProductInfoSave() {
		clickOnElement(buttonEditProductInfoSave);
		if (verifyToolTip())
			clickOnCancelBtn();
		else
			getStriptText();
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button denom info
	 * @param element
	 * @creation date 16/10/2018
	 */
	public void clickOnEditDenom(By element) {
		clickOnElement(element);
	}

	public void clickOndenomSave(By element) {
		clickOnElement(element);
	}

	public void sendTextinMinValueInEdit(String editMin, By element) {
		clearAndSendTextInTextBox(element, editMin);
	}

	public void sendTextinMaxValueInEdit(String editMax, By element) {
		clearAndSendTextInTextBox(element, editMax);
	}

	/**
	 * @author kutbuddin.compounder click value from Vendor Product Manager
	 *         serviceFreeType radio button
	 * @param serviceFreeType
	 * @creation date 24/10/2018
	 */
	public void selectServiceFreeTypePercantageEdit(By element) {
		clickOnElement(element);
	}

	/**
	 * @author kutbuddin.compounder click value from Vendor Product Manager
	 *         serviceFreeType radio button
	 * @param serviceFreeType
	 * @creation date 24/10/2018
	 */
	public void selectServiceFreeTypeAmountEdit(By element) {
		clickOnElement(element);
	}

	public void sendTextInServiceFreeValueInEdit(By element, String editFreevalue) {
		clearAndSendTextInTextBox(element, editFreevalue);
	}

	public void clickOndenomSave() {
		clickOnElement(denomSave);
		if (verifyToolTip())
			clickOnCancelBtn();
		else
			getStriptText();
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2,str3,str4,str5,str6
	 * @creation date 3/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4, String str5) {
		commonFilterSearch();
		selectModuleInFilterSearch(str1);
		selectServiceInFilterSearch(str2);
		selectInVendorNameInFilterSearch(str3);
		sendProductCodeTextInFilterSearch(str4);
		selectStatusInFilterSearch(str5);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to add Vendor Product Manager
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 16/10/2018
	 */

	public void addVendorProductManager(Map<Object, Object> map, List<Object> mapKeys, String startDate,
			String startTime1) {
		clickOnAddBtn();
		selectVendorName(map.get(mapKeys.get(0)).toString().trim());
		selectModuleName(map.get(mapKeys.get(1)).toString().trim());
		selectServiceName(map.get(mapKeys.get(2)).toString().trim());
		sendTextInProductCode(map.get(mapKeys.get(3)).toString().trim());
		sendTextInProductName(map.get(mapKeys.get(4)).toString().trim());
		selectProductType(map.get(mapKeys.get(5)).toString().trim());
		selectRechargeCountry(map.get(mapKeys.get(6)).toString().trim());
		sendTextInDescription(map.get(mapKeys.get(7)).toString().trim());
		selectServiceChrargeType(map.get(mapKeys.get(8)).toString().trim());
		selectAllowRefund(map.get(mapKeys.get(9)).toString().trim());
		selectStatus(map.get(mapKeys.get(10)).toString().trim());
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			int rows = Integer.parseInt(map.get(mapKeys.get(11)).toString().trim());
			if (map.get(mapKeys.get(5)).toString().trim().equalsIgnoreCase(IsFix)) {
				String[] min = map.get(mapKeys.get(12)).toString().trim().split(",");
				String[] surcharge_Type = map.get(mapKeys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(mapKeys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					sendTextInMinAmount(min[m]);
					if (surcharge_Type[m].equalsIgnoreCase(IsPercentage)) {
						selectServiceFreeTypePercantage();
					} else {
						selectServiceFreeTypeAmount();
					}
					sendTextInServiceFreeValue(surcharge_Value[m]);
					if (m < rows - 1) {
						clickOnAddBtn();
					}
				}
			} else {
				String[] min = map.get(mapKeys.get(12)).toString().trim().split(",");
				String[] max = map.get(mapKeys.get(13)).toString().trim().split(",");
				String[] surcharge_Type = map.get(mapKeys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(mapKeys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					if (m == 0) {
						sendTextInMinAmount(min[m]);
					}
					sendTextInMaxAmount(max[m]);
					if (surcharge_Type[m].equalsIgnoreCase(IsPercentage)) {
						selectServiceFreeTypePercantage();
					} else {
						selectServiceFreeTypeAmount();
					}
					sendTextInServiceFreeValue(surcharge_Value[m]);
					if (m < rows - 1) {
						clickOnAddBtn();
					}
				}
			}
			if (map.get(mapKeys.get(16)).toString().trim().equalsIgnoreCase(IsYes)) {
				selectCommonDiscount(map.get(mapKeys.get(16)).toString().trim());
				setStartDateCommissionYes(startDate + " " + startTime1);
				setEndDateCommissionYes();
				sendTextInComminssionYes(map.get(mapKeys.get(18)).toString().trim());
				clickOnSaveBtn();
			} else {
				clickOnNextBtn();
				if (map.get(mapKeys.get(19)).toString().trim() != null
						&& !map.get(mapKeys.get(19)).toString().trim().isEmpty()) {
					String[] startTime = map.get(mapKeys.get(19)).toString().trim().split(",");
//					String[] endTime = map.get(mapKeys.get(20)).toString().trim().split(",");
					String[] commission = map.get(mapKeys.get(18)).toString().trim().split(",");
					int newIndex = 1;
					List<Integer> l = new ArrayList<Integer>();
					for (int m = 0; m < startTime.length; m++) {
						String[] forIndex = startTime[m].split("|", 0);
						int index = Integer.parseInt(forIndex[0]);
						l.add(index);
					}
					for (int i = 0; i < l.size(); i++) {
						String[] strCommission = commission[i].split("|", 2);
						if (i != 0) {
							if (l.get(i) == l.get(i - 1)) {
								newIndex++;
								int count = 1;
								By addBtn = By.xpath(
										"//input[@id = 'DiscountCount_" + l.get(i) + "']/preceding-sibling:: button");
								By startdate = By.id("StartTime_" + l.get(i) + "_" + newIndex);
								By enddate = By.id("EndTime_" + l.get(i) + "_" + newIndex);
								clickOnAddBtnDate(addBtn);
								DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								Date currentDate = new Date();
								Calendar c = Calendar.getInstance();
								;
								c.setTime(currentDate);
								c.add(Calendar.DATE, 90 * count);
								c.add(Calendar.MINUTE, 10);
								Date currentDatePlusOne = c.getTime();
								String date2 = dateFormat.format(currentDatePlusOne);
								sendTextWithRemoveReadOnlyProperty(date2, startdate);
								DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								Date currentDate1 = new Date();
//								Calendar c1 = Calendar.getInstance();
								c.setTime(currentDate1);
								c.add(Calendar.DATE, 90 * (count + 1));
								Date currentDatePlusOne1 = c.getTime();
								String endDate = dateFormat1.format(currentDatePlusOne1);
								sendTextWithRemoveReadOnlyProperty(endDate, enddate);
								By Commisionvalue = By.id("Commission_" + l.get(i) + "_" + newIndex);
								sendTextInComminssion(strCommission[1].substring(1), Commisionvalue);
								count++;
							} else {
								By startdate = By.id("StartTime_" + l.get(i) + "_1");
								By enddate = By.id("EndTime_" + l.get(i) + "_1");
								DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								try {
									Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
											.parse(startDate + " " + startTime1);
									Calendar c = Calendar.getInstance();
									;
									c.setTime(date1);
									c.add(Calendar.MINUTE, 90);
									Date currentDatePlusOne = c.getTime();
									String date2 = dateFormat.format(currentDatePlusOne);
									sendTextWithRemoveReadOnlyProperty(date2, startdate);
								} catch (ParseException e) {
									e.printStackTrace();
								}
								DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
								Date currentDate = new Date();
								Calendar c = Calendar.getInstance();
								c.setTime(currentDate);
								c.add(Calendar.DATE, 90);
								Date currentDatePlusOne = c.getTime();
								String endDate = dateFormat1.format(currentDatePlusOne);
								sendTextWithRemoveReadOnlyProperty(endDate, enddate);
								By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
								sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
								newIndex = 1;
							}
						} else {
							By startdate = By.id("StartTime_" + l.get(i) + "_1");
							By enddate = By.id("EndTime_" + l.get(i) + "_1");
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							try {
								Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
										.parse(startDate + " " + startTime1);
								Calendar c = Calendar.getInstance();
								;
								c.setTime(date1);
								c.add(Calendar.MINUTE, 60);
								Date currentDatePlusOne = c.getTime();
								String date2 = dateFormat.format(currentDatePlusOne);
								sendTextWithRemoveReadOnlyProperty(date2, startdate);
							} catch (ParseException e) {
								e.printStackTrace();
							}
							DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate = new Date();
							Calendar c = Calendar.getInstance();
							c.setTime(currentDate);
							c.add(Calendar.DATE, 90);
							Date currentDatePlusOne = c.getTime();
							String endDate = dateFormat1.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(endDate, enddate);
							By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
							sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
						}
					}
					clickOnSaveBtn();
				} else {
					clickOnSaveBtn();
				}
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Vendor Product Manager
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 16/10/2018
	 */
	public void editVendorProductManager(Map<Object, Object> map, List<Object> keys, String startDate,
			String startTime1) {
		filterSearch(map.get(getMapKeys(map).get(1)).toString().trim(),
				map.get(getMapKeys(map).get(2)).toString().trim(), map.get(getMapKeys(map).get(0)).toString().trim(),
				map.get(getMapKeys(map).get(3)).toString().trim(), map.get(getMapKeys(map).get(10)).toString().trim());
		clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString().trim());
		clickOnProductPanel();
		clickOnEditBtnProductInfo();
		sendTextInDescription(map.get(keys.get(7)).toString().trim());
		selectServiceChrargeType(map.get(keys.get(8)).toString().trim());
		// selectAllowRefund(map.get(keys.get(9)).toString().trim());
		selectStatus(map.get(keys.get(10)).toString().trim());
		clickOnEditBtnProductInfoSave();
		int rows = Integer.parseInt(map.get(keys.get(11)).toString().trim());
		if (map.get(keys.get(5)).toString().trim().equalsIgnoreCase(IsFix)) {
			String[] min = map.get(keys.get(12)).toString().trim().split(",");
			String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
			String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
			for (int m = 0; m < rows; m++) {
				By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
				clickOnDenomBtn(btnDenom);
				By butttonEditDenom = By.id("denomEdit_" + (m + 1) + "");
				clickOnEditDenom(butttonEditDenom);
				By txtEditMinValue = By.id("MinAmount_" + (m + 1) + "");
				sendTextWithRemoveReadOnlyProperty(min[m], txtEditMinValue);
				if (surcharge_Type[m].equalsIgnoreCase(IsPercentage)) {
					By denomPecentage = By.xpath("(//label[contains(@id,'lblSurchargeType-0_" + (m + 1) + "')])");
					selectServiceFreeTypePercantageEdit(denomPecentage);
				} else {
					By denomPecentage = By.xpath("(//label[contains(@id,'lblSurchargeType-1_" + (m + 1) + "')])");
					selectServiceFreeTypeAmountEdit(denomPecentage);
				}
				By editFreevalue = By.xpath("(//input[contains(@id,'SurchargeValue_" + (m + 1) + "')])");
				sendTextInServiceFreeValueInEdit(editFreevalue, surcharge_Value[m]);
			}
			String[] startTime = map.get(keys.get(19)).toString().trim().split(",");
			if (map.get(keys.get(19)).toString().trim() != null && !map.get(keys.get(19)).toString().trim().isEmpty()) {
//				String[] endTime = map.get(keys.get(20)).toString().trim().split(",");
				String[] commission = map.get(keys.get(18)).toString().trim().split(",");
				int newIndex = 1;
				List<Integer> l = new ArrayList<Integer>();
				for (int j = 0; j < startTime.length; j++) {
					String[] forIndex = startTime[j].split("|", 2);
					int index = Integer.parseInt(forIndex[0]);
					l.add(index);
				}
				for (int i = 0; i < l.size(); i++) {
//					String[] strStart = startTime[i].split("|", 2);
//					String[] strEnd = endTime[i].split("|", 2);
					String[] strCommission = commission[i].split("|", 2);
					if (i != 0) {
						if (l.get(i) == l.get(i - 1)) {
							newIndex++;
							int count = 1;
							By addBtn = By.xpath("//li[@id='discountAdd_" + l.get(i) + "1']/a");
							By startdate = By.id("StartTime_" + l.get(i) + "_" + newIndex);
							By enddate = By.id("EndTime_" + l.get(i) + "_" + newIndex);
							clickOnAddBtnDate(addBtn);
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate = new Date();
							Calendar c = Calendar.getInstance();
							;
							c.setTime(currentDate);
							c.add(Calendar.DATE, 90 * count);
							c.add(Calendar.MINUTE, 10);
							Date currentDatePlusOne = c.getTime();
							String date2 = dateFormat.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(date2, startdate);
							DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate1 = new Date();
//							Calendar c1 = Calendar.getInstance();
							c.setTime(currentDate1);
							c.add(Calendar.DATE, 90 * (count + 1));
							Date currentDatePlusOne1 = c.getTime();
							String endDate = dateFormat1.format(currentDatePlusOne1);
							sendTextWithRemoveReadOnlyProperty(endDate, enddate);
							By Commisionvalue = By.id("Commission_" + l.get(i) + "_" + newIndex);
							sendTextInComminssion(strCommission[1].substring(1), Commisionvalue);
							count++;
						} else {
							By startdate = By.id("StartTime_" + l.get(i) + "_1");
							By enddate = By.id("EndTime_" + l.get(i) + "_1");
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							try {
								Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
										.parse(startDate + " " + startTime1);
								Calendar c = Calendar.getInstance();
								;
								c.setTime(date1);
								c.add(Calendar.MINUTE, 90);
								Date currentDatePlusOne = c.getTime();
								String date2 = dateFormat.format(currentDatePlusOne);
								sendTextWithRemoveReadOnlyProperty(date2, startdate);
							} catch (ParseException e) {
								e.printStackTrace();
							}
							DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate = new Date();
							Calendar c = Calendar.getInstance();
							c.setTime(currentDate);
							c.add(Calendar.DATE, 90);
							Date currentDatePlusOne = c.getTime();
							String endDate = dateFormat1.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(endDate, enddate);
							By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
							sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
							newIndex = 1;
						}
					} else {
						By startdate = By.id("StartTime_" + l.get(i) + "_1");
						By enddate = By.id("EndTime_" + l.get(i) + "_1");
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						try {
							Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
									.parse(startDate + " " + startTime1);
							Calendar c = Calendar.getInstance();
							;
							c.setTime(date1);
							c.add(Calendar.MINUTE, 60);
							Date currentDatePlusOne = c.getTime();
							String date2 = dateFormat.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(date2, startdate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date currentDate = new Date();
						Calendar c = Calendar.getInstance();
						c.setTime(currentDate);
						c.add(Calendar.DATE, 90);
						Date currentDatePlusOne = c.getTime();
						String endDate = dateFormat1.format(currentDatePlusOne);
						sendTextWithRemoveReadOnlyProperty(endDate, enddate);
						By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
						sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
					}
				}
			}
			clickOndenomSave();
			clickOnBackBtn();
		} else {
			String[] min = map.get(keys.get(12)).toString().trim().split(",");
			String[] max = map.get(keys.get(13)).toString().trim().split(",");
			String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
			String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
			for (int m = 0; m < rows; m++) {
				By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
				clickOnDenomBtn(btnDenom);
				By butttonEditDenom = By.id("denomEdit_" + (m + 1) + "");
				clickOnEditDenom(butttonEditDenom);
				By txtEditMinValue = By.id("MinAmount_" + (m + 1) + "");
				By txtEditMaxValue = By.id("MaxAmount_" + (m + 1) + "");
				sendTextWithRemoveReadOnlyProperty(min[m], txtEditMinValue);
				sendTextWithRemoveReadOnlyProperty(max[m], txtEditMaxValue);
				if (surcharge_Type[m].equalsIgnoreCase(IsPercentage)) {
					By denomPecentage = By.xpath("(//label[contains(@id,'lblSurchargeType-0_" + (m + 1) + "')])");
					selectServiceFreeTypePercantageEdit(denomPecentage);
				} else {
					By denomPecentage = By.xpath("(//label[contains(@id,'lblSurchargeType-1_" + (m + 1) + "')])");
					selectServiceFreeTypeAmountEdit(denomPecentage);
				}
				By editFreevalue = By.xpath("(//input[contains(@id,'SurchargeValue_" + (m + 1) + "')])");
				sendTextInServiceFreeValueInEdit(editFreevalue, surcharge_Value[m]);
			}
			if (map.get(keys.get(19)).toString().trim() != null && !map.get(keys.get(19)).toString().trim().isEmpty()) {
				String[] startTime = map.get(keys.get(19)).toString().trim().split(",");
//				String[] endTime = map.get(keys.get(20)).toString().trim().split(",");
				String[] commission = map.get(keys.get(18)).toString().trim().split(",");
				int newIndex = 1;
				List<Integer> l = new ArrayList<Integer>();
				for (int j = 0; j < startTime.length; j++) {
					String[] forIndex = startTime[j].split("|", 2);
					int index = Integer.parseInt(forIndex[0]);
					l.add(index);
				}
				for (int i = 0; i < l.size(); i++) {
//					String[] strStart = startTime[i].split("|", 2);
//					String[] strEnd = endTime[i].split("|", 2);
					String[] strCommission = commission[i].split("|", 2);
					if (i != 0) {
						if (l.get(i) == l.get(i - 1)) {
							newIndex++;
							int count = 1;
							By addBtn = By.xpath(
									"//input[@id = 'DiscountCount_" + l.get(i) + "']/preceding-sibling:: button");
							By startdate = By.id("StartTime_" + l.get(i) + "_" + newIndex);
							By enddate = By.id("EndTime_" + l.get(i) + "_" + newIndex);
							clickOnAddBtnDate(addBtn);
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate = new Date();
							Calendar c = Calendar.getInstance();
							;
							c.setTime(currentDate);
							c.add(Calendar.DATE, 90 * count);
							c.add(Calendar.MINUTE, 10);
							Date currentDatePlusOne = c.getTime();
							String date2 = dateFormat.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(date2, startdate);
							DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate1 = new Date();
							// Calendar c1 = Calendar.getInstance();
							c.setTime(currentDate1);
							c.add(Calendar.DATE, 90 * (count + 1));
							Date currentDatePlusOne1 = c.getTime();
							String endDate = dateFormat1.format(currentDatePlusOne1);
							sendTextWithRemoveReadOnlyProperty(endDate, enddate);
							By Commisionvalue = By.id("Commission_" + l.get(i) + "_" + newIndex);
							sendTextInComminssion(strCommission[1].substring(1), Commisionvalue);
							count++;
						} else {
							By startdate = By.id("StartTime_" + l.get(i) + "_1");
							By enddate = By.id("EndTime_" + l.get(i) + "_1");
							DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							try {
								Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
										.parse(startDate + " " + startTime1);
								Calendar c = Calendar.getInstance();
								;
								c.setTime(date1);
								c.add(Calendar.MINUTE, 90);
								Date currentDatePlusOne = c.getTime();
								String date2 = dateFormat.format(currentDatePlusOne);
								sendTextWithRemoveReadOnlyProperty(date2, startdate);
							} catch (ParseException e) {
								e.printStackTrace();
							}
							DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
							Date currentDate = new Date();
							Calendar c = Calendar.getInstance();
							c.setTime(currentDate);
							c.add(Calendar.DATE, 90);
							Date currentDatePlusOne = c.getTime();
							String endDate = dateFormat1.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(endDate, enddate);
							By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
							sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
							newIndex = 1;
						}
					} else {
						By startdate = By.id("StartTime_" + l.get(i) + "_1");
						By enddate = By.id("EndTime_" + l.get(i) + "_1");
						DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						try {
							Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
									.parse(startDate + " " + startTime1);
							Calendar c = Calendar.getInstance();
							;
							c.setTime(date1);
							c.add(Calendar.MINUTE, 60);
							Date currentDatePlusOne = c.getTime();
							String date2 = dateFormat.format(currentDatePlusOne);
							sendTextWithRemoveReadOnlyProperty(date2, startdate);
						} catch (ParseException e) {
							e.printStackTrace();
						}
						DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
						Date currentDate = new Date();
						Calendar c = Calendar.getInstance();
						c.setTime(currentDate);
						c.add(Calendar.DATE, 90);
						Date currentDatePlusOne = c.getTime();
						String endDate = dateFormat1.format(currentDatePlusOne);
						sendTextWithRemoveReadOnlyProperty(endDate, enddate);
						By CommisionValue = By.id("Commission_" + l.get(i) + "_1");
						sendTextInComminssion(strCommission[1].substring(1), CommisionValue);
					}
				}
			}
			clickOndenomSave();
			clickOnBackBtn();
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Vendor Product Manager added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 16/10/2018
	 * @return true if Vendor Product Manager added successfully
	 */
	public boolean verifyVendorProductManagerAdded(Map<Object, Object> map, List<Object> keys) {
		By productCode = By
				.xpath("//label[normalize-space(text())='Product Code']//following-sibling :: div[normalize-space(text())='"
						+ map.get(keys.get(3)).toString().trim() + "']");
		By productName = By
				.xpath("//label[normalize-space(text())='Product Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString().trim() + "']");
		By vendorName = By
				.xpath("//label[normalize-space(text())='Vendor Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString().trim() + "']");
		By productType = By
				.xpath("//label[normalize-space(text())='Product Type']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(5)).toString().trim() + "')]");
		By moduleName = By
				.xpath("//label[normalize-space(text())='Module Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString().trim() + "']");
		By serviceName = By
				.xpath("//label[normalize-space(text())='Service Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString().trim() + "']");
		By rechargeCountry = By
				.xpath("//label[normalize-space(text())='Recharge Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(6)).toString().trim() + "']");
		By Description = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(7)).toString().trim() + "'and @class='vendorNonEdit']");
		By serviceChargeType = By
				.xpath("//label[normalize-space(text())='Service Charge Type']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(8)).toString().trim() + "'and @class='vendorNonEdit']");
		By allowRefund = By
				.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(9)).toString().trim() + "'and @class='vendorNonEdit']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(10)).toString().trim() + "'and @class='vendorNonEdit']");
		filterSearch(map.get(getMapKeys(map).get(1)).toString().trim(),
				map.get(getMapKeys(map).get(2)).toString().trim(), map.get(getMapKeys(map).get(0)).toString().trim(),
				map.get(getMapKeys(map).get(3)).toString().trim(), map.get(getMapKeys(map).get(10)).toString().trim());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString().trim());
			clickOnProductPanel();
			if (!verifyElement(productCode, false))
				return false;
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(vendorName, false))
				return false;
			if (!verifyElement(productType, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(rechargeCountry, false))
				return false;
			if (!verifyElement(Description, false))
				return false;
			if (!verifyElement(serviceChargeType, false))
				return false;
			if (!verifyElement(allowRefund, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			int rows = Integer.parseInt(map.get(keys.get(11)).toString().trim());
			if (map.get(keys.get(5)).toString().trim().equalsIgnoreCase(IsFix)) {
				String[] min = map.get(keys.get(12)).toString().trim().split(",");
				String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
					clickOnDenomBtn(btnDenom);
					By minAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Min Amount' ]//following-sibling :: div[contains(text(),"
							+ min[m].trim() + ")]");
					By surchargeType = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Type' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Type[m].trim() + "')]");
					By surchargeValue = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Value' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Value[m].trim() + "')]");
					if (!verifyElement(minAmount, false))
						return false;
					if (!verifyElement(surchargeType, false))
						return false;
					if (!verifyElement(surchargeValue, false))
						return false;
				}
			} else {
				String[] min = map.get(keys.get(12)).toString().trim().split(",");
				String[] max = map.get(keys.get(13)).toString().trim().split(",");
				String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
					clickOnDenomBtn(btnDenom);
					By minAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Min Amount' ]//following-sibling :: div[contains(text(),'"
							+ min[m] + "')]");
					By maxAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Max Amount' ]//following-sibling :: div[contains(text(),"
							+ max[m] + ")]");
					By surchargeType = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Type' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Type[m] + "')]");
					By surchargeValue = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Value' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Value[m] + "')]");
					if (m == 0) {
						if (!verifyElement(minAmount, false))
							return false;
					}
					if (!verifyElement(maxAmount, false))
						return false;
					if (!verifyElement(surchargeType, false))
						return false;
					if (!verifyElement(surchargeValue, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @author kutbuddin.compounder to verify Vendor Product Manager edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 16/10/2018
	 * @return true if Vendor Product Manager edited successfully
	 */
	/**
	 * @author kutbuddin.compounder to verify Vendor Product Manager added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 16/10/2018
	 * @return true if Vendor Product Manager added successfully
	 */
	public boolean verifyVendorProductManagerEdited(Map<Object, Object> map, List<Object> keys) {
		By productCode = By
				.xpath("//label[normalize-space(text())='Product Code']//following-sibling :: div[normalize-space(text())='"
						+ map.get(keys.get(3)).toString().trim() + "']");
		By productName = By
				.xpath("//label[normalize-space(text())='Product Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString().trim() + "']");
		By vendorName = By
				.xpath("//label[normalize-space(text())='Vendor Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString().trim() + "']");
		By productType = By
				.xpath("//label[normalize-space(text())='Product Type']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(5)).toString().trim() + "')]");
		By moduleName = By
				.xpath("//label[normalize-space(text())='Module Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString().trim() + "']");
		By serviceName = By
				.xpath("//label[normalize-space(text())='Service Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString().trim() + "']");
		By rechargeCountry = By
				.xpath("//label[normalize-space(text())='Recharge Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(6)).toString().trim() + "']");
		By Description = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(7)).toString().trim() + "'and @class='vendorNonEdit']");
		By serviceChargeType = By
				.xpath("//label[normalize-space(text())='Service Charge Type']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(8)).toString().trim() + "'and @class='vendorNonEdit']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(10)).toString().trim() + "'and @class='vendorNonEdit']");
		filterSearch(map.get(getMapKeys(map).get(1)).toString().trim(),
				map.get(getMapKeys(map).get(2)).toString().trim(), map.get(getMapKeys(map).get(0)).toString().trim(),
				map.get(getMapKeys(map).get(3)).toString().trim(), map.get(getMapKeys(map).get(10)).toString().trim());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString().trim());
			clickOnProductPanel();
			if (!verifyElement(productCode, false))
				return false;
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(vendorName, false))
				return false;
			if (!verifyElement(productType, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(rechargeCountry, false))
				return false;
			if (!verifyElement(Description, false))
				return false;
			if (!verifyElement(serviceChargeType, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			int rows = Integer.parseInt(map.get(keys.get(11)).toString().trim());
			if (map.get(keys.get(5)).toString().trim().equalsIgnoreCase(IsFix)) {
				String[] min = map.get(keys.get(12)).toString().trim().split(",");
				String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
					clickOnDenomBtn(btnDenom);
					By minAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Min Amount' ]//following-sibling :: div[contains(text(),'"
							+ min[m].trim() + "')]");
					By surchargeType = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Type' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Type[m].trim() + "')]");
					By surchargeValue = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Value' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Value[m].trim() + "')]");
					if (!verifyElement(minAmount, false))
						return false;
					if (!verifyElement(surchargeType, false))
						return false;
					if (!verifyElement(surchargeValue, false))
						return false;
				}
			} else {
				String[] min = map.get(keys.get(12)).toString().trim().split(",");
				String[] max = map.get(keys.get(13)).toString().trim().split(",");
				String[] surcharge_Type = map.get(keys.get(14)).toString().trim().split(",");
				String[] surcharge_Value = map.get(keys.get(15)).toString().trim().split(",");
				for (int m = 0; m < rows; m++) {
					By btnDenom = By.id("denomMinimize_" + (m + 1) + "");
					clickOnDenomBtn(btnDenom);
					By minAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Min Amount' ]//following-sibling :: div[contains(text(),"
							+ min[m] + ")]");
					By maxAmount = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Max Amount' ]//following-sibling :: div[contains(text(),"
							+ max[m] + ")]");
					By surchargeType = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Type' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Type[m] + "')]");
					By surchargeValue = By.xpath("//div[@id='denom_row_" + (m + 1)
							+ "']//label[normalize-space(text())='Surcharge Value' ]//following-sibling :: div[contains(text(),'"
							+ surcharge_Value[m] + "')]");
					if (m == 0) {
						if (!verifyElement(minAmount, false))
							return false;
					}
					if (!verifyElement(maxAmount, false))
						return false;
					if (!verifyElement(surchargeType, false))
						return false;
					if (!verifyElement(surchargeValue, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @author Kutbuddin.compounder to verify Vendor Product Manager deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 16/10/2018
	 * @return true if Vendor Product Manager deleted successfully
	 */
	public boolean deleteVendorProductManager(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString().trim(),
				map.get(getMapKeys(map).get(1)).toString().trim(), map.get(getMapKeys(map).get(2)).toString().trim(),
				map.get(getMapKeys(map).get(3)).toString().trim(), map.get(getMapKeys(map).get(4)).toString().trim());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString().trim());
			delete();
			return true;
		} else {
			String string = "Vendor Product Manager already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyVendorProductManagerDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString().trim(),
					map.get(getMapKeys(map).get(1)).toString().trim(),
					map.get(getMapKeys(map).get(2)).toString().trim(),
					map.get(getMapKeys(map).get(3)).toString().trim(),
					map.get(getMapKeys(map).get(4)).toString().trim());
			return verifyElement(
					By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"), false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify vendor ProductManager log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if vendor ProductManager Log successfully Verified
	 */
	public boolean verifyVendorProductManagerLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(1)).toString().trim(),
				map.get(getMapKeys(map).get(2)).toString().trim(), map.get(getMapKeys(map).get(0)).toString().trim(),
				map.get(getMapKeys(map).get(3)).toString().trim(), map.get(getMapKeys(map).get(10)).toString().trim());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString().trim());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort product vendor product manager
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortVendorProductManager(Map<Object, Object> map, List<Object> mapKeys) {
		pagination();
		Map<String, List<String>> getBeforeSortTableData = getTableData(map.get(getMapKeys(map).get(2)).toString());
		clickOnSortBtn(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(0)).toString());
		List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
		sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(1)).toString());
		if (!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
			return false;
		Map<String, List<String>> getAfterSortTableData = getTableData(map.get(getMapKeys(map).get(2)).toString());
		if (!getBeforeSortTableData.equals(getAfterSortTableData))
			return false;
		return true;
	}
}
