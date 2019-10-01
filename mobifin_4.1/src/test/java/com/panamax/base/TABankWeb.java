package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TABankWeb extends BaseWeb {
	By bankName = By.id("BankName");
	By branchCode = By.id("BranchCode");
	By bankRegNo = By.id("BankRegNo");
	By bankAccNo = By.id("BankAccNo");
	By branchName = By.id("BranchName");
	By bankWebsite = By.id("BankWebsite");
	By branchPhone = By.id("BankPhone");
	By status = By.id("IsActive");
	By address1 = By.id("Address1");
	By address2 = By.id("Address2");
	By city = By.id("City");
	By landMark = By.id("LandMark");
	By country = By.id("CountryID");
	By state = By.id("CountryStateID");
	By mapcode = By.id("MapCodeID");
	By branchManager = By.id("BranchManager1");
	By branchmanagerPhone = By.id("BranchPhone1");
	By branchEmail = By.id("BranchEmail1");
	By managername = By.id("BranchManager2");
	By managerphoneno = By.id("BranchPhone2");
	By manageremail = By.id("BranchEmail2");
	By uploadbanklogo = By.id("BankLogo");
	By walletid = By.id("txtWalletNo");
	By bankNamesearch = By.id("txtBankName");
	By branchNamesearch = By.id("txtBranchName");
	By countrysearch = By.id("CountryID");
	By statesearch = By.id("CountryStateID");
	By branchPhonesearch = By.id("txtBankPhone");

	public TABankWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author gopal.gupta
	 * @param Account
	 *            Type to be selected
	 * @creation date 22/10/2018
	 */

	public void clickOnElementaccountType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Name to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbankNameField(String BankNametext) {
		clearTextFromTextBox(bankName);
		sendTextInTextBox(bankName, BankNametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Code to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchCodeField(String BranchCodetext) {
		clearTextFromTextBox(branchCode);
		sendTextInTextBox(branchCode, BranchCodetext);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Registration No to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbankregistrationnoField(String BankRegNotext) {
		clearTextFromTextBox(bankRegNo);
		sendTextInTextBox(bankRegNo, BankRegNotext);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Account Number to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbankaccountnoField(String bankAccNotext) {
		clearTextFromTextBox(bankAccNo);
		sendTextInTextBox(bankAccNo, bankAccNotext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Name to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchnameField(String branchnametext) {
		clearTextFromTextBox(branchName);
		sendTextInTextBox(branchName, branchnametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Name to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInBankWebsiteField(String BankWebsitetext) {
		clearTextFromTextBox(bankWebsite);
		sendTextInTextBox(bankWebsite, BankWebsitetext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Phone No to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchPhonenoField(String branchPhonetext) {
		clearTextFromTextBox(branchPhone);
		sendTextInTextBox(branchPhone, branchPhonetext);
	}

	/**
	 * @author gopal.gupta
	 * @param Mapcode
	 *            to be selected
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInstatusField(String Status) {
		selectFromDropdown(status, Status);
	}

	/**
	 * @author gopal.gupta
	 * @param Address1
	 *            to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInAddress1Field(String Address1txt) {
		clearTextFromTextBox(address1);
		sendTextInTextBox(address1, Address1txt);
	}

	/**
	 * @author gopal.gupta
	 * @param Address1
	 *            to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInAddress2Field(String Address2txt) {
		clearTextFromTextBox(address2);
		sendTextInTextBox(address2, Address2txt);
	}

	/**
	 * @author gopal.gupta
	 * @param City
	 *            to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextIncityField(String Citytxt) {
		clearTextFromTextBox(city);
		sendTextInTextBox(city, Citytxt);
	}

	/**
	 * @author gopal.gupta
	 * @param Land
	 *            Mark to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInLandmarkField(String landMarktxt) {
		clearTextFromTextBox(landMark);
		sendTextInTextBox(landMark, landMarktxt);
	}

	/**
	 * @author gopal.gupta
	 * @param country
	 *            to be selected
	 * @creation date 22/10/2018
	 */

	public void selectcountryField(String countrytxt) {
		selectFromDropdown(country, countrytxt);
	}

	/**
	 * @author gopal.gupta
	 * @param State
	 *            to be selected
	 * @creation date 22/10/2018
	 */
	public void selectStateField(String statetxt) {
		selectFromDropdown(state, statetxt);
	}

	/**
	 * @author gopal.gupta
	 * @param Mapcode
	 *            to be selected
	 * @creation date 22/10/2018
	 */
	public void selectMapCodeField(String mapcodetxt) {
		selectFromDropdown(mapcode, mapcodetxt);
	}

	/**
	 * @author gopal.gupta
	 * @param BranchManager
	 *            name to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchManagernameField(String branchManagertxt) {
		clearTextFromTextBox(branchManager);
		sendTextInTextBox(branchManager, branchManagertxt);
	}

	/**
	 * @author gopal.gupta
	 * @param branchmanagerphone
	 *            no to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchmanagerphonenoField(String branchmanagerPhonetxt) {
		clearTextFromTextBox(branchmanagerPhone);
		sendTextInTextBox(branchmanagerPhone, branchmanagerPhonetxt);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Manager Email to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchEmailField(String branchEmailtxt) {
		clearTextFromTextBox(branchEmail);
		sendTextInTextBox(branchEmail, branchEmailtxt);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Manager Email to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInmanagernameField(String Managernametext) {
		clearTextFromTextBox(managername);
		sendTextInTextBox(managername, Managernametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Manager Email to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInmanagerphonenoField(String Managerphoneno) {
		clearTextFromTextBox(managerphoneno);
		sendTextInTextBox(managerphoneno, Managerphoneno);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Manager Email to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInmanageremailField(String Manageremailtext) {
		clearTextFromTextBox(manageremail);
		sendTextInTextBox(manageremail, Manageremailtext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Manager Email to be send
	 * @creation date 30/10/2018
	 */
	public void clearAndSendTextInuploadbanklogoField(String Uploadbanklogoimage) {
		sendTextInTextBox(uploadbanklogo, resources_folder_path + Uploadbanklogoimage);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Name to be send to search
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbankNamesearchField(String BankNamesearch) {
		clearAndSendTextInTextBox(bankNamesearch, BankNamesearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Name to be send to search
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbankphonenosearchField(String BranchPhonesearch) {
		clearAndSendTextInTextBox(branchPhonesearch, BranchPhonesearch);
	}

	/**
	 * @author gopal.gupta
	 * @param country
	 *            to be selected
	 * @creation date 22/10/2018
	 */

	public void selectcountryFieldsearch(String countrytxt) {
		selectFromDropdown(countrysearch, countrytxt);
	}

	/**
	 * @author gopal.gupta
	 * @param State
	 *            to be selected
	 * @creation date 22/10/2018
	 */
	public void selectstateFieldsearch(String statetxt) {
		selectFromDropdown(statesearch, statetxt);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Name to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInbranchNamesearchField(String branchnametext) {
		clearAndSendTextInTextBox(branchNamesearch, branchnametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Branch
	 *            Name to be send
	 * @creation date 22/10/2018
	 */
	public void clearAndSendTextInwalletidsearchField(String walletidtext) {
		clearTextFromTextBox(walletid);
		sendTextInTextBox(walletid, walletidtext);
	}

	/**
	 * @author shivani.patel to pass filter search parameter
	 * @creation date 27/11/2018
	 */
	public void filterSearch(String BankName, String Branchphonenumber, String BranchName, String Country,
			String State) {
		commonFilterSearch();
		selectcountryFieldsearch(Country);
		clearAndSendTextInbankNamesearchField(BankName);
		clearAndSendTextInbankphonenosearchField(Branchphonenumber);
		clearAndSendTextInbranchNamesearchField(BranchName);
		selectstateFieldsearch(State);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel to add tabank
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public void addTABank(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		clickOnElementaccountType(By.xpath("//*[text()='" + map.get(keys.get(0)).toString() + "']"));
		clearAndSendTextInbankNameField(map.get(keys.get(1)).toString());
		clearAndSendTextInbranchCodeField(map.get(keys.get(2)).toString());
		clearAndSendTextInbankregistrationnoField(map.get(keys.get(3)).toString());
		clearAndSendTextInbankaccountnoField(map.get(keys.get(4)).toString());
		clearAndSendTextInbranchnameField(map.get(keys.get(5)).toString());
		clearAndSendTextInBankWebsiteField(map.get(keys.get(6)).toString());
		clearAndSendTextInbranchPhonenoField(map.get(keys.get(7)).toString());
		clearAndSendTextInstatusField(map.get(keys.get(22)).toString());
		selectcountryField(map.get(keys.get(12)).toString());
		clearAndSendTextInAddress1Field(map.get(keys.get(8)).toString());
		clearAndSendTextInAddress2Field(map.get(keys.get(9)).toString());
		clearAndSendTextIncityField(map.get(keys.get(10)).toString());
		selectStateField(map.get(keys.get(13)).toString());
		clearAndSendTextInLandmarkField(map.get(keys.get(11)).toString());
		selectMapCodeField(map.get(keys.get(14)).toString());
		clearAndSendTextInbranchManagernameField(map.get(keys.get(15)).toString());
		clearAndSendTextInbranchmanagerphonenoField(map.get(keys.get(16)).toString());
		clearAndSendTextInbranchEmailField(map.get(keys.get(17)).toString());
		clearAndSendTextInmanagernameField(map.get(keys.get(18)).toString());
		clearAndSendTextInmanagerphonenoField(map.get(keys.get(19)).toString());
		clearAndSendTextInmanageremailField(map.get(keys.get(20)).toString());
		clearAndSendTextInuploadbanklogoField(map.get(keys.get(21)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to verify tabank add data
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public boolean verifyTABank(Map<Object, Object> map, List<Object> keys) {
		By accountType = By
				.xpath("//label[text()='Account Type']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(0)).toString() + "']]");
		By bankName = By.xpath("//label[text()='Bank Name']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(1)).toString() + "']]");
		By branchCode = By.xpath("//label[text()='Branch Code']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(2)).toString() + "']]");
		By bankRegNo = By
				.xpath("//label[text()='Bank Registration No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(3)).toString() + "']]");
		By bankAccNo = By
				.xpath("//label[text()='Bank Account Number']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(4)).toString() + "']]");
		By branchName = By.xpath("//label[text()='Branch Name']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(5)).toString() + "']]");
		By bankWebsite = By
				.xpath("//label[text()='Bank Website']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(6)).toString() + "']]");
		By branchPhone = By
				.xpath("//label[text()='Branch Phone No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(7)).toString() + "']]");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(22)).toString() + "']]");
		By address1 = By.xpath("//label[text()='Address1']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(8)).toString() + "']]");
		By address2 = By.xpath("//label[text()='Address2']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(9)).toString() + "']]");
		By city = By.xpath("//label[text()='City']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(10)).toString() + "']]");
		By landMark = By.xpath("//label[text()='Land Mark']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(11)).toString() + "']]");
		By country = By.xpath("//label[text()='Country']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(12)).toString() + "']]");
		By state = By.xpath("//label[text()='State']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(13)).toString() + "']]");
		By mapcode = By.xpath("//label[text()='Map Code']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(14)).toString() + "']]");
		By branchManager = By
				.xpath("//label[text()='Branch Manager Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(15)).toString() + "']]");
		By branchmanagerPhone = By
				.xpath("//label[text()='Branch Phone No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(16)).toString() + "']]");
		By branchEmail = By
				.xpath("//label[text()='Branch Manager Email']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(17)).toString() + "']]");
		By managerName = By
				.xpath("//label[text()='Manager Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(18)).toString() + "']]");
		By managerPhone = By
				.xpath("//label[text()='Manager Phone No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(19)).toString() + "']]");
		By managerEmail = By
				.xpath("//label[text()='Manager Email']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(20)).toString() + "']]");
		By bankLogo = By.xpath("//label[text()='Bank Logo']//following-sibling :: div//img");

		filterSearch(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(7)).toString(),
				map.get(getMapKeys(map).get(5)).toString(), map.get(getMapKeys(map).get(12)).toString(),
				map.get(getMapKeys(map).get(13)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			if (!verifyElement(accountType, false))
				return false;
			if (!verifyElement(bankName, false))
				return false;
			if (!verifyElement(branchCode, false))
				return false;
			if (!verifyElement(bankRegNo, false))
				return false;
			if (!verifyElement(bankAccNo, false))
				return false;
			if (!verifyElement(bankWebsite, false))
				return false;
			if (!verifyElement(branchName, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(address1, false))
				return false;
			if (!verifyElement(address2, false))
				return false;
			if (!verifyElement(city, false))
				return false;
			if (!verifyElement(landMark, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(mapcode, false))
				return false;
			if (!verifyElement(branchManager, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(branchPhone, false))
					return false;
				if (!verifyElement(branchmanagerPhone, false))
					return false;
				if (!verifyElement(branchEmail, false))
					return false;
				if (!verifyElement(managerPhone, false))
					return false;
				if (!verifyElement(managerEmail, false))
					return false;
			}
			if (!verifyElement(managerName, false))
				return false;
			if (getAttributeValue(bankLogo, "src").equals(""))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to add tabank edit data
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public void editTABank(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(9)).toString(),
				map.get(getMapKeys(map).get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnEditBtn();
			selectcountryField(map.get(keys.get(10)).toString());
			clearAndSendTextInBankWebsiteField(map.get(keys.get(3)).toString());
			clearAndSendTextInstatusField(map.get(keys.get(4)).toString());
			clearAndSendTextInAddress1Field(map.get(keys.get(5)).toString());
			clearAndSendTextInAddress2Field(map.get(keys.get(6)).toString());
			clearAndSendTextIncityField(map.get(keys.get(7)).toString());
			clearAndSendTextInLandmarkField(map.get(keys.get(8)).toString());
			selectStateField(map.get(keys.get(12)).toString());
			clearAndSendTextInbranchManagernameField(map.get(keys.get(14)).toString());
			clearAndSendTextInbranchmanagerphonenoField(map.get(keys.get(15)).toString());
			selectMapCodeField(map.get(keys.get(13)).toString());
			clearAndSendTextInbranchEmailField(map.get(keys.get(16)).toString());
			clearAndSendTextInmanagernameField(map.get(keys.get(17)).toString());
			clearAndSendTextInmanagerphonenoField(map.get(keys.get(18)).toString());
			clearAndSendTextInmanageremailField(map.get(keys.get(19)).toString());
			clearAndSendTextInuploadbanklogoField(map.get(keys.get(20)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author shivani.patel to verify tabank edit data
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public boolean verifyTABankEdited(Map<Object, Object> map, List<Object> keys) {

		By bankWebsite = By
				.xpath("//label[text()='Bank Website']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(3)).toString() + "']]");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(4)).toString() + "']]");
		By address1 = By.xpath("//label[text()='Address1']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(5)).toString() + "']]");
		By address2 = By.xpath("//label[text()='Address2']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(6)).toString() + "']]");
		By city = By.xpath("//label[text()='City']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(7)).toString() + "']]");
		By landMark = By.xpath("//label[text()='Land Mark']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(8)).toString() + "']]");
		By country = By.xpath("//label[text()='Country']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(10)).toString() + "']]");
		By state = By.xpath("//label[text()='State']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(12)).toString() + "']]");
		By mapcode = By.xpath("//label[text()='Map Code']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(keys.get(13)).toString() + "']]");
		By branchManager = By
				.xpath("//label[text()='Branch Manager Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(14)).toString() + "']]");
		By branchmanagerPhone = By
				.xpath("//label[text()='Branch Phone No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(15)).toString() + "']]");
		By branchEmail = By
				.xpath("//label[text()='Branch Manager Email']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(16)).toString() + "']]");
		By managerName = By
				.xpath("//label[text()='Manager Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(17)).toString() + "']]");
		By managerPhone = By
				.xpath("//label[text()='Manager Phone No']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(18)).toString() + "']]");
		By managerEmail = By
				.xpath("//label[text()='Manager Email']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(19)).toString() + "']]");
		By bankLogo = By.xpath("//label[text()='Bank Logo']//following-sibling :: div//img");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(10)).toString(),
				map.get(getMapKeys(map).get(12)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			if (!map.get(getMapKeys(map).get(3)).equals("")) {
				if (!verifyElement(bankWebsite, false))
					return false;
			}
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(address1, false))
				return false;
			if (!map.get(getMapKeys(map).get(6)).equals("")) {
				if (!verifyElement(address2, false))
					return false;
			}
			if (!verifyElement(city, false))
				return false;
			if (!verifyElement(landMark, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(mapcode, false))
				return false;
			if (!verifyElement(branchManager, false))
				return false;
			if (!map.get(getMapKeys(map).get(17)).equals("")) {
				if (!verifyElement(managerName, false))
					return false;
			}
			if (maskingAllowed) {
				if (!verifyElement(branchmanagerPhone, false))
					return false;
				if (!verifyElement(branchEmail, false))
					return false;
				if (!verifyElement(managerPhone, false))
					return false;
				if (!verifyElement(managerEmail, false))
					return false;
			}
			if (getAttributeValue(bankLogo, "src").equals(""))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to delete tabank
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public boolean deleteTABank(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString(),
				map.get(getMapKeys(map).get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			if (verifyDeleteBtn())
				delete();
			else
				clickOnBackBtn();
			return true;
		} else {
			String string = "TA Bank already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author dishant.doshi to verify delete tabank
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 26/12/2018
	 */
	public boolean verifyTABankDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString(),
					map.get(getMapKeys(map).get(4)).toString());
			return !verifyElement(
					By.xpath("(//td[normalize-space(text())='" + map.get(getMapKeys(map).get(1)).toString()
							+ "']//following-sibling::td[@data-title='Status' and normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edited Log?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 21/12/2018
	 * @return true if Ta Bank Verify Log SuccesFullly
	 */
	public boolean verifyTABankLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(10)).toString(),
				map.get(getMapKeys(map).get(12)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort ta bank
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortBank(Map<Object, Object> map, List<Object> mapKeys) {
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