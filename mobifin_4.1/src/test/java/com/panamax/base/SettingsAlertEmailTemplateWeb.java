package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi
 * Actions of Settings - User Management - Email Template
 * @creation date 30/10/2018
 */
public class SettingsAlertEmailTemplateWeb extends Common {
	By drpTemplateName = By.id("UserTemplateActiveID");
	By drpFromEmailAccount = By.id("MailAccountID");
	By txtSubject = By.id("Subject");
	By drpDynamicVariable = By.id("VariableName");
	By btnAddDynamicVariable = By.id("AddVariable");
	By txtEmailBody = By.xpath("//*[@class='note-editable panel-body']");
	By drpStatus = By.id("IsActive");
	By drpFromEmailAccountSearch = By.id("cmbMailAccountID");
	By txtTemplateNameSearch = By.id("txtSearchTemplateEmailActiveName");
	
	/**
	 * @author dishant.doshi
	 * @param driver constructor
	 * @creation date 30/10/2018
	 */
	public SettingsAlertEmailTemplateWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2){
		commonFilterSearch();
		selectTextInFromEmailAccountInSearch(str1);
		sendTextInTemplateNameInSearch(str2);
		clickOnFilterSearchBtn();
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in template name
	 * @param templateName
	 * @creation date 30/10/2018
	 */
	public void selectTextInTemplateName(String templateName){
		selectFromDropdown(drpTemplateName, templateName);
	}

	/**
	 * @author dishant.doshi
	 * to select text in from email account
	 * @param fromEmailAccount
	 * @creation date 30/10/2018
	 */
	public void selectTextInFromEmailAccount(String fromEmailAccount){
		selectFromDropdown(drpFromEmailAccount, fromEmailAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in subject
	 * @param subject
	 * @creation date 30/10/2018
	 */
	public void sendTextInSubject(String subject){
		clearAndSendTextInTextBox(txtSubject, subject);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in dynamic variable
	 * @param dynamicVariable
	 * @creation date 30/10/2018
	 */
	public void selectTextInDynamicVariable(String dynamicVariable){
		selectFromDropdown(drpDynamicVariable, dynamicVariable);
	}
	
	/**
	 * @author dishant.doshi
	 * to click on add  dynamic variable button
	 * @creation date 30/10/2018
	 */
	public void clickOnAddDynamicVariableButton(){
		clickOnElement(btnAddDynamicVariable);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in body
	 * @param body
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailTemplateBody(String body){
		removeReadOnlyProperty(txtEmailBody);
		clearAndSendTextInTextBox(txtEmailBody, body);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in status
	 * @param status
	 * @creation date 30/10/2018
	 */
	public void selectTextInStatus(String status){
		selectFromDropdown(drpStatus, status);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in from email account in filter search
	 * @param emailAccount
	 * @creation date 30/10/2018
	 */
	public void selectTextInFromEmailAccountInSearch(String emailAccount){
		selectFromDropdown(drpFromEmailAccountSearch, emailAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in template name in filter search
	 * @param templateName
	 * @creation date 30/10/2018
	 */
	public void sendTextInTemplateNameInSearch(String templateName){
		clearAndSendTextInTextBox(txtTemplateNameSearch, templateName);
	}
	
	/**
	 * @author dishant.doshi
	 * to add Email Template
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 30/10/2018
	 */
	public void addEmailTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		commonFilterSearch();
		sendTextInTemplateNameInSearch(map.get(getMapKeys(map).get(0)).toString());
		clickOnFilterSearchBtn();
		if(!verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnAddBtn();
			selectTextInTemplateName(map.get(mapKeys.get(0)).toString());
			selectTextInFromEmailAccount(map.get(mapKeys.get(1)).toString());
			sendTextInSubject(map.get(mapKeys.get(2)).toString());
			if(!map.get(mapKeys.get(3)).toString().equals("")){
				String[] dynamicVariable = map.get(mapKeys.get(3)).toString().split(",");
				for(int i=0;i<dynamicVariable.length;i++){
					selectTextInDynamicVariable(dynamicVariable[i]);
					clickOnAddDynamicVariableButton();
				}
			}
			sendTextInEmailTemplateBody(map.get(mapKeys.get(4)).toString());
			selectTextInStatus(map.get(mapKeys.get(5)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author dishant.doshi
	 * to verify Email Template added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 30/10/2018
	 * @return true if Email Template added successfully 
	 */
	public boolean verifyEmailTemplateAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By templateName = By.xpath("//label[normalize-space(text()) = 'Template Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By fromEmailAccount = By.xpath("//label[normalize-space(text()) = 'From Email Account']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(1)).toString().trim()+"']");
		By subject = By.xpath("//label[normalize-space(text()) = 'Subject']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(5)).toString().trim()+"']");
		By emailBody = By.xpath("//label[text()='Email Body']/..//div");
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(templateName, false))
				return false;
			if(!verifyElement(fromEmailAccount, false))
				return false;
			if(!verifyElement(subject, false))
				return false;
			String[] strings = StringUtils.substringsBetween(map.get(getMapKeys(map).get(4)).toString(), "{", "}");
			for(int i=0;i<strings.length;i++){
				String body = getUIText(emailBody);
				if(!body.contains(strings[i]))
					return false;
			}
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi
	 * to edit Email Template
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 30/10/2018
	 */
	public void editEmailTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			selectTextInFromEmailAccount(map.get(mapKeys.get(2)).toString());
			sendTextInSubject(map.get(mapKeys.get(3)).toString());
			if(!map.get(mapKeys.get(4)).toString().equals("")){
				String[] dynamicVariable = map.get(mapKeys.get(4)).toString().split(",");
				for(int i=0;i<dynamicVariable.length;i++){
					selectTextInDynamicVariable(dynamicVariable[i]);
					clickOnAddDynamicVariableButton();
				}
			}
			sendTextInEmailTemplateBody(map.get(mapKeys.get(5)).toString());
			selectTextInStatus(map.get(mapKeys.get(6)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author dishant.doshi
	 * to verify Email Template added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 30/10/2018
	 * @return true if Email Template added successfully 
	 */
	public boolean verifyEmailTemplateEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By templateName = By.xpath("//label[normalize-space(text()) = 'Template Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By fromEmailAccount = By.xpath("//label[normalize-space(text()) = 'From Email Account']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString().trim()+"']");
		By subject = By.xpath("//label[normalize-space(text()) = 'Subject']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(3)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(6)).toString().trim()+"']");
		By emailBody = By.xpath("//label[text()='Email Body']/..//div");
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(templateName, false))
				return false;
			if(!verifyElement(fromEmailAccount, false))
				return false;
			if(!verifyElement(subject, false))
				return false;
			String[] strings = StringUtils.substringsBetween(map.get(getMapKeys(map).get(5)).toString(), "{", "}");
			for(int i=0;i<strings.length;i++){
				String body = getUIText(emailBody);
				if(!body.contains(strings[i]))
					return false;
			}
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}

	public boolean deleteEmailTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "Email Template already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return false;
	}

	public boolean verifyEmailTemplateDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		
		if(verifyFilterBtn()){
			filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify email account  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if sms account Log successfully Verified
	 */
	public boolean verifyEmailAccountEditedLogd(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString());
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
	 * @author dishant.doshi to sort EmailTemplate account
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortEmailTemplate(Map<Object, Object> map, List<Object> mapKeys) {
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
