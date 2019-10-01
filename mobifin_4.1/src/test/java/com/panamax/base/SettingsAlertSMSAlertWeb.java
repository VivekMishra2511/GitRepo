package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsAlertSMSAlertWeb extends Common{
	By drpFrequency = By.id("Frequency");
	By txtRecepients = By.id("Recepients-tokenfield");
	By drpAlertParameter = By.id("AlertPararmeter");
	By drpFromSMSAccount = By.id("SMSAccountID");
	By drpDynamicVariables = By.id("VariableName");
	By txtSMSBody = By.id("Body");
	By drpStatus = By.id("IsActive");
	By drpStatusInSearch = By.id("cmbIsActive");

	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 30/10/2018
	 */
	public SettingsAlertSMSAlertWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * select Frequency in DropDownBox
	 * @param Frequency
	 * @creation date 31/10/2018
	 */
	public void selectFrequency(String Frequency){
		selectFromDropdown(drpFrequency, Frequency);
	}

	/**
	 * @author shivani.patel
	 * send Text In Recepients Field
	 * @param Frequency
	 * @creation date 31/10/2018
	 */
	public void sendTextInRecepients(String Recepients){
		sendTextInTextBox(txtRecepients, Recepients+Keys.ENTER);
	}

	/**
	 * @author shivani.patel
	 * select AlertParameter in DropDownBox
	 * @param AlertParameter
	 * @creation date 31/10/2018
	 */
	public void selectAlertParameter(String AlertParameter){
		selectFromDropdown(drpAlertParameter, AlertParameter);
	}

	/**
	 * @author shivani.patel
	 * select FromSMSAccount in DropDownBox
	 * @param FromSMSAccount
	 * @creation date 31/10/2018
	 */
	public void selectFromSMSAccount(String FromSMSAccount){
		selectFromDropdown(drpFromSMSAccount, FromSMSAccount);
	}

	/**
	 * @author shivani.patel
	 * select DynamicVariables in DropDownBox
	 * @param DynamicVariables
	 * @creation date 31/10/2018
	 */
	public void selectDynamicVariables(String DynamicVariables){
		selectFromDropdown(drpDynamicVariables, DynamicVariables);
	}

	/**
	 * @author shivani.patel
	 * send Text In SMSBody Field
	 * @param SMSBody
	 * @creation date 31/10/2018
	 */
	public void sendTextInSMSBody(String SMSBody){
		clearAndSendTextInTextBox(txtSMSBody, SMSBody);
	}

	/**
	 * @author shivani.patel
	 * select Status in DropDownBox
	 * @param Status
	 * @creation date 31/10/2018
	 */
	public void selectStatus(String Status){
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel
	 * select Status in FilterSearch DropDownBox
	 * @param Status
	 * @creation date 31/10/2018
	 */
	public void selectStatusInFilterSearch(String Status){
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author shivani.patel
	 * send Filter Search Field
	 * @param SMSAccountName,TemplateName,Status
	 * @creation date 31/10/2018
	 */
	public void filterSearch(String SMSAccountName,String TemplateName,String Status){
		commonFilterSearch();
		selectFromSMSAccount(SMSAccountName);
		selectAlertParameter(TemplateName);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel
	 * clickOn Remove Recepient 
	 * @param Status
	 * @creation date 31/10/2018
	 */
	public void RemaoveRecepients(String RemoveRecepients){
		clickOnElement(By.xpath(".//*[text()='"+RemoveRecepients+"']//following-sibling::a[text()='×']"));
	}
	/**
	 * @author shivani.patel
	 * to add SMSAlert
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public void addAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		commonFilterSearch();
		selectAlertParameter(map.get(getMapKeys(map).get(2)).toString());
		clickOnFilterSearchBtn();
		if (!verifyElement(By.xpath("//td[normalize-space(text())='" + map.get(mapKeys.get(2)).toString()
				+ "']"), false)) {
			clickOnAddBtn();
			selectFrequency(map.get(mapKeys.get(0)).toString());
			String[] recepient = map.get(mapKeys.get(1)).toString().trim().split(";");
			for (int i = 0; i < recepient.length; i++) {
				sendTextInRecepients(recepient[i]);
			}
			selectAlertParameter(map.get(mapKeys.get(2)).toString());
			selectFromSMSAccount(map.get(mapKeys.get(3)).toString());
			String[] dynamicvariable = map.get(mapKeys.get(4)).toString().trim().split(",");
			for (int i = 0; i < dynamicvariable.length; i++) {
				selectDynamicVariables(dynamicvariable[i]);
				clickOnAddBtn();
			}
			sendTextInSMSBody(map.get(mapKeys.get(5)).toString());
			selectStatus(map.get(mapKeys.get(6)).toString());
			clickOnSaveBtn();
		}else{
			
		}
	}

	/**
	 * @author shivani.patel
	 * to Verify Add SMSAlert
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public boolean verifyAddAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		By Frequency = By.xpath("//*[normalize-space(text()) = 'Frequency']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString()+"']");
		By FromSMSAccount = By.xpath("//*[normalize-space(text()) = 'SMS Account Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(3)).toString()+"']");
		By TemplateName = By.xpath("//*[normalize-space(text()) = 'Template Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString()+"']");
		By SMSBody = By.xpath("//*[normalize-space(text()) = 'SMS Body']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(5)).toString()+"']");
		By Status = By.xpath("//*[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(6)).toString()+"']");

		filterSearch(map.get(mapKeys.get(3)).toString(),map.get(mapKeys.get(2)).toString(),map.get(mapKeys.get(6)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(2)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(mapKeys.get(2)).toString());
			if(!verifyElement(Frequency, false))
				return false;
			if(!verifyElement(FromSMSAccount, false))
				return false;
			if(!verifyElement(TemplateName, false))
				return false;
			if(!verifyElement(SMSBody, false))
				return false;
			if(!verifyElement(Status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @author shivani.patel
	 * to Edit SMSAlert
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public void editAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(4)).toString(),map.get(mapKeys.get(3)).toString(),map.get(mapKeys.get(7)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(mapKeys.get(3)).toString());
			clickOnEditBtn();
			selectFrequency(map.get(mapKeys.get(0)).toString());
			if((map.get(mapKeys.get(1)).toString()).length()!=0){
				sendTextInRecepients(map.get(mapKeys.get(1)).toString());
			}
			if((map.get(mapKeys.get(2)).toString()).length()!=0){
				String[] removeRecepients = map.get(mapKeys.get(2)).toString().trim().split(";");
				for(int i=0;i<removeRecepients.length;i++){
					RemaoveRecepients(removeRecepients[i]);}
			}
			selectFromSMSAccount(map.get(mapKeys.get(4)).toString());
			sendTextInSMSBody(map.get(mapKeys.get(6)).toString());
			selectStatus(map.get(mapKeys.get(7)).toString());
			clickOnSaveBtn();
		}
		else{
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel
	 * to Verify Edit SMSAlert
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public boolean verifyEditAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		By Frequency = By.xpath("//*[normalize-space(text()) = 'Frequency']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString()+"']");
		By FromSMSAccount = By.xpath("//*[normalize-space(text()) = 'SMS Account Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(4)).toString()+"']");
		By SMSBody = By.xpath("//*[normalize-space(text()) = 'SMS Body']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(6)).toString()+"']");
		By Status = By.xpath("//*[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(7)).toString()+"']");

		filterSearch(map.get(mapKeys.get(4)).toString(),map.get(mapKeys.get(3)).toString(),map.get(mapKeys.get(7)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(mapKeys.get(3)).toString());
			if(!verifyElement(Frequency, false))
				return false;
			if(!verifyElement(FromSMSAccount, false))
				return false;
			if(!verifyElement(SMSBody, false))
				return false;
			if(!verifyElement(Status, false))
				return false;
			return true;
		}else{
			return false;
		}

	}

	/**
	 * @author shivani.patel
	 * to Delete SMSAlert
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public boolean DeleteAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(0)).toString(),map.get(mapKeys.get(2)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "SMS Alert already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return false;
	}

	public boolean verifyDeleteAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(0)).toString(),map.get(mapKeys.get(2)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify sms Alert  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if sms alert Log successfully Verified
	 */
	public boolean verifyEditLogAlertSMSAlert(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(4)).toString(),map.get(mapKeys.get(3)).toString(),map.get(mapKeys.get(7)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(mapKeys.get(3)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi to sort SMSAlert account
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortSMSAlert(Map<Object, Object> map, List<Object> mapKeys) {
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
