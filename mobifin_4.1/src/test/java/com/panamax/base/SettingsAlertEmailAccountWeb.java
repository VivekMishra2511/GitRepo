package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsAlertEmailAccountWeb extends Common {
	By txtEmailAccount = By.id("MailAccountName");
	By txtEmailAccountInSearch = By.id("txtMailAccountName");
	By drpServerType = By.id("MailType");
	By txtReturnToAddress = By.id("ReturnMailAccountName");
	By txtRetryAttempt = By.id("RetryAttempt");
	By drpStatus = By.id("IsActive");
	By drpStatusInSearch = By.id("cmbIsActive");
	By txtServerName = By.id("ServerName");
	By txtPort = By.id("Port");
	By txtUserID = By.id("AccountAdminID");
	By txtPassword = By.id("AccountKey");
	By txtConfirmePassword = By.id("ConfirmAccountKey");
	By drpAuthenticationMethod = By.id("AuthenticationMethod");
	By drpAuthenticationSecurity = By.id("AuthenticationSecurity");

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 30/10/2018
	 */
	public SettingsAlertEmailAccountWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel send Text In EmailAccount Field
	 * @param EmailAccount
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailAccount(String EmailAccount) {
		sendTextInTextBox(txtEmailAccount, EmailAccount);
	}

	/**
	 * @author shivani.patel send Text EmailAccount In FilterSearch Field
	 * @param EmailAccount
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailAccountInFilterSearch(String EmailAccount) {
		clearAndSendTextInTextBox(txtEmailAccountInSearch, EmailAccount);
	}

	/**
	 * @author shivani.patel select ServerType In DropDownBox
	 * @param ServerType
	 * @creation date 30/10/2018
	 */
	public void selectServerType(String ServerType) {
		selectFromDropdown(drpServerType, ServerType);
	}

	/**
	 * @author shivani.patel send Text In ReturnToAddress Field
	 * @param ReturnToAddress
	 * @creation date 30/10/2018
	 */
	public void sendTextInReturnToAddress(String ReturnToAddress) {
		clearAndSendTextInTextBox(txtReturnToAddress, ReturnToAddress);
	}

	/**
	 * @author shivani.patel send Text In RetryAttempt Field
	 * @param RetryAttempt
	 * @creation date 30/10/2018
	 */
	public void sendTextInRetryAttempt(String RetryAttempt) {
		clearAndSendTextInTextBox(txtRetryAttempt, RetryAttempt);
	}

	/**
	 * @author shivani.patel select Status In DropDownBox
	 * @param Status
	 * @creation date 30/10/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel select Status In FilterSearch DropDownBox
	 * @param Status
	 * @creation date 30/10/2018
	 */
	public void selectStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author shivani.patel send Text In ServerName Field
	 * @param ServerName
	 * @creation date 30/10/2018
	 */
	public void sendTextInServerName(String ServerName) {
		clearAndSendTextInTextBox(txtServerName, ServerName);
	}

	/**
	 * @author shivani.patel send Text In Port Field
	 * @param Port
	 * @creation date 30/10/2018
	 */
	public void sendTextInPort(String Port) {
		clearAndSendTextInTextBox(txtPort, Port);
	}

	/**
	 * @author shivani.patel send Text In UserID Field
	 * @param UserID
	 * @creation date 30/10/2018
	 */
	public void sendTextInUserID(String UserID) {
		sendTextInTextBox(txtUserID, UserID);
	}

	/**
	 * @author shivani.patel send Text In UserID Field
	 * @param UserID
	 * @creation date 30/10/2018
	 */
	public void sendTextInUserIDForEdit(String UserID) {
		sendTextWithRemoveReadOnlyProperty(UserID, txtUserID);
		clearAndSendTextInTextBox(txtUserID, UserID);
	}

	/**
	 * @author shivani.patel send Text In Password Field
	 * @param Password
	 * @creation date 30/10/2018
	 */
	public void sendTextInPassword(String Password) {
		sendTextInTextBox(txtPassword, Password);
	}

	/**
	 * @author shivani.patel send Text In ConfirmPassword Field
	 * @param ConfirmPassword
	 * @creation date 30/10/2018
	 */
	public void sendTextInConfirmPassword(String ConfirmPassword) {
		sendTextInTextBox(txtConfirmePassword, ConfirmPassword);
	}

	/**
	 * @author shivani.patel select AuthenticationMethod In DropDownBox
	 * @param AuthenticationMethod
	 * @creation date 30/10/2018
	 */
	public void selectAuthenticationMethod(String AuthenticationMethod) {
		selectFromDropdown(drpAuthenticationMethod, AuthenticationMethod);
	}

	/**
	 * @author shivani.patel select AuthenticationSecurity In DropDownBox
	 * @param AuthenticationSecurity
	 * @creation date 30/10/2018
	 */
	public void selectAuthenticationSecurity(String AuthenticationSecurity) {
		selectFromDropdown(drpAuthenticationSecurity, AuthenticationSecurity);
	}

	/**
	 * @author shivani.patel Click On Authentication Radio Button
	 * @param Authentication
	 * @creation date 30/10/2018
	 */
	public void selectAuthentication(String Authentication) {
		clickOnElement(By.xpath(".//*[normalize-space(text())='" + Authentication + "']"));
	}

	/**
	 * @author shivani.patel EmailAccount filter Search
	 * @creation date 30/10/2018
	 */
	public void filterSearch(String str1, String str2) {
		filterSearch();
		sendTextInEmailAccountInFilterSearch(str1);
		selectStatusInFilterSearch(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel to add EmailAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void AddAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInEmailAccount(map.get(mapKeys.get(0)).toString());
		selectServerType(map.get(mapKeys.get(1)).toString());
		switch (map.get(mapKeys.get(1)).toString()) {
		case "SMTP":
			sendTextInReturnToAddress(map.get(mapKeys.get(2)).toString());
			sendTextInRetryAttempt(map.get(mapKeys.get(3)).toString());
			selectStatus(map.get(mapKeys.get(4)).toString());
			selectAuthentication(map.get(mapKeys.get(5)).toString());
			sendTextInServerName(map.get(mapKeys.get(6)).toString());
			sendTextInPort(map.get(mapKeys.get(7)).toString());
			if ((map.get(mapKeys.get(5)).toString()).equals("On")) {
				sendTextInUserID(map.get(mapKeys.get(8)).toString());
				sendTextInPassword(map.get(mapKeys.get(9)).toString());
				sendTextInConfirmPassword(map.get(mapKeys.get(9)).toString());
				selectAuthenticationMethod(map.get(mapKeys.get(10)).toString());
				selectAuthenticationSecurity(map.get(mapKeys.get(11)).toString());
			} else {
				sendTextInServerName(map.get(mapKeys.get(6)).toString());
				sendTextInPort(map.get(mapKeys.get(7)).toString());
			}
			break;
		case "Send Mail":
			sendTextInReturnToAddress(map.get(mapKeys.get(2)).toString());
			sendTextInRetryAttempt(map.get(mapKeys.get(3)).toString());
			selectStatus(map.get(mapKeys.get(4)).toString());
			break;

		}
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to VerifyAdd EmailAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public boolean verifyAddAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
		By EmailAccount = By
				.xpath("//*[normalize-space(text()) = 'Email Account']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By ServerType = By
				.xpath("//*[normalize-space(text()) = 'Server Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By ReturnToAddress = By
				.xpath("//*[normalize-space(text()) = 'Return To Address']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By RetryAttempt = By
				.xpath("//*[normalize-space(text()) = 'Retry Attempt']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By Status = By
				.xpath("//*[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Authentication = By
				.xpath("//*[normalize-space(text()) = 'Authentication']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By ServerName = By
				.xpath("//*[normalize-space(text()) = 'Server Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By Port = By.xpath("//*[normalize-space(text()) = 'Port']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(7)).toString() + "']");
		By UserID = By
				.xpath("//*[normalize-space(text()) = 'User ID']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By AuthenticationMethod = By
				.xpath("//*[normalize-space(text()) = 'Authentication Method']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By AuthenticationSecurity = By
				.xpath("//*[normalize-space(text()) = 'Authentication Security']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(EmailAccount, false))
				return false;
			if (!verifyElement(ServerType, false))
				return false;
			if (!verifyElement(ReturnToAddress, false))
				return false;
			if (!verifyElement(RetryAttempt, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			if ((map.get(mapKeys.get(5)).toString()).length() != 0) {
				if (!verifyElement(Authentication, false))
					return false;
				if (!verifyElement(ServerName, false))
					return false;
				if (!verifyElement(Port, false))
					return false;
			}
			if ((map.get(mapKeys.get(8)).toString()).length() != 0) {
				if (!verifyElement(UserID, false))
					return false;
				if (!verifyElement(AuthenticationMethod, false))
					return false;
				if (!verifyElement(AuthenticationSecurity, false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Edit EmailAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void EditAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			switch (map.get(mapKeys.get(1)).toString()) {
			case "SMTP":
				sendTextInReturnToAddress(map.get(mapKeys.get(2)).toString());
				sendTextInRetryAttempt(map.get(mapKeys.get(3)).toString());
				selectStatus(map.get(mapKeys.get(4)).toString());
				selectAuthentication(map.get(mapKeys.get(5)).toString());
				sendTextInServerName(map.get(mapKeys.get(6)).toString());
				sendTextInPort(map.get(mapKeys.get(7)).toString());
				if ((map.get(mapKeys.get(5)).toString()).equals("On")) {
					sendTextInUserIDForEdit(map.get(mapKeys.get(8)).toString());
					sendTextInPassword(map.get(mapKeys.get(9)).toString());
					sendTextInConfirmPassword(map.get(mapKeys.get(9)).toString());
					selectAuthenticationMethod(map.get(mapKeys.get(10)).toString());
					selectAuthenticationSecurity(map.get(mapKeys.get(11)).toString());
				} else {
					sendTextInServerName(map.get(mapKeys.get(6)).toString());
					sendTextInPort(map.get(mapKeys.get(7)).toString());
				}
				break;
			case "Send Mail":
				sendTextInReturnToAddress(map.get(mapKeys.get(2)).toString());
				sendTextInRetryAttempt(map.get(mapKeys.get(3)).toString());
				selectStatus(map.get(mapKeys.get(4)).toString());
				selectAuthentication(map.get(mapKeys.get(5)).toString());
				sendTextInServerName(map.get(mapKeys.get(6)).toString());
				sendTextInPort(map.get(mapKeys.get(7)).toString());
				if ((map.get(mapKeys.get(5)).toString()).equals("On")) {
					sendTextInUserIDForEdit(map.get(mapKeys.get(8)).toString());
					sendTextInPassword(map.get(mapKeys.get(9)).toString());
					sendTextInConfirmPassword(map.get(mapKeys.get(9)).toString());
					selectAuthenticationMethod(map.get(mapKeys.get(10)).toString());
					selectAuthenticationSecurity(map.get(mapKeys.get(11)).toString());
				} else {
					sendTextInServerName(map.get(mapKeys.get(6)).toString());
					sendTextInPort(map.get(mapKeys.get(7)).toString());
				}
				break;
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to VerifyEdit EmailAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public boolean verifyEditAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
		By ReturnToAddress = By
				.xpath("//*[normalize-space(text()) = 'Return To Address']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By RetryAttempt = By
				.xpath("//*[normalize-space(text()) = 'Retry Attempt']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By Status = By
				.xpath("//*[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Authentication = By
				.xpath("//*[normalize-space(text()) = 'Authentication']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By ServerName = By
				.xpath("//*[normalize-space(text()) = 'Server Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By Port = By.xpath("//*[normalize-space(text()) = 'Port']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(7)).toString() + "']");
		By UserID = By
				.xpath("//*[normalize-space(text()) = 'User ID']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By AuthenticationMethod = By
				.xpath("//*[normalize-space(text()) = 'Authentication Method']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By AuthenticationSecurity = By
				.xpath("//*[normalize-space(text()) = 'Authentication Security']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(ReturnToAddress, false))
				return false;
			if (!verifyElement(RetryAttempt, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			if (!verifyElement(Authentication, false))
				return false;
			if (!verifyElement(ServerName, false))
				return false;
			if (!verifyElement(Port, false))
				return false;
			if ((map.get(mapKeys.get(8)).toString()).length() != 0) {
				if (!verifyElement(UserID, false))
					return false;
				if (!verifyElement(AuthenticationMethod, false))
					return false;
				if (!verifyElement(AuthenticationSecurity, false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Delete EmailAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public boolean DeleteAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Email Account already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyDeleteAlertEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify Email account  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if Email account Log successfully Verified
	 */
	public boolean verifyEmailAccountEditedLogd(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(0)).toString(),map.get(mapKeys.get(4)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi to sort Email account
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortEmailAccount(Map<Object, Object> map, List<Object> mapKeys) {
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
