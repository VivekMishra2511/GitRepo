package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsAlertFCMAccountWeb extends Common{
	By drpStatus = By.id("IsActive");
	
	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 01/11/2018
	 */
	public SettingsAlertFCMAccountWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * select Status in DropDownBox
	 * @param Status
	 * @creation date 01/11/2018
	 */
	public void selectStatus(String Status){
		selectFromDropdown(drpStatus, Status);
	}
	
	/**
	 * @author shivani.patel
	 * sendText In AppKey in Field
	 * @param AppKey
	 * @creation date 01/11/2018
	 */
	public void sendTextInAppKey(By element, String AppKey) {
		clearAndSendTextInTextBox(element, AppKey);
	}
	
	/**
	 * @author shivani.patel
	 * sendText In Icon in Field
	 * @param Icon
	 * @creation date 01/11/2018
	 */
	public void sendTextInIcon(By element, String Icon) {
		clearAndSendTextInTextBox(element, Icon);
	}
	
	/**
	 * @author shivani.patel
	 * sendText In Title in Field
	 * @param Title
	 * @creation date 01/11/2018
	 */
	public void sendTextInTitle(By element, String Title) {
		clearAndSendTextInTextBox(element, Title);
	}
	
	/**
	 * @author shivani.patel
	 * select Priority 
	 * @param Priority
	 * @creation date 01/11/2018
	 */
	public void selectPriority(By element, String Priority) {
		selectFromDropdown(element, Priority);
	}
	
	/**
	 * @author shivani.patel
	 * sendText In TimeToLive in Field
	 * @param Title
	 * @creation date 01/11/2018
	 */
	public void sendTextInTimeToLive(By element, String TimeToLive) {
		clearAndSendTextInTextBox(element, TimeToLive);
	}
	
	/**
	 * @author shivani.patel
	 * sendText In CustomData in Field
	 * @param CustomData
	 * @creation date 01/11/2018
	 */
	public void sendTextInCustomData(By element, String CustomData) {
		clearAndSendTextInTextBox(element, CustomData);
	}
	/**
	 * @author shivani.patel
	 * to add FCMAccount
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 01/11/2018
	 */	
	public void EditAlertFCMAccount(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnEditBtn();
		selectStatus(map.get(mapKeys.get(1)).toString());
		String fcmUserType[] = map.get(mapKeys.get(3)).toString().trim().split(",");
		String fcmAppKey[] = map.get(mapKeys.get(2)).toString().trim().split(",");
		String fcmTitle[] = map.get(mapKeys.get(4)).toString().trim().split(",");
		String fcmIcon[] = map.get(mapKeys.get(5)).toString().trim().split(",");
		String fcmPriority[] = map.get(mapKeys.get(6)).toString().trim().split(",");
		String fcmtimeToLive[] = map.get(mapKeys.get(7)).toString().trim().split(",");
		String fcmCustomData[] = map.get(mapKeys.get(8)).toString().trim().split(",");

		for(int i=0;i<fcmUserType.length;i++){
		sendTextInAppKey(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//*[contains(@id,'AppKey')]"),fcmAppKey[i]);
		sendTextInTitle(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//*[contains(@id,'Title')]"),fcmTitle[i]);
		sendTextInIcon(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//*[contains(@id,'Icon')]"),fcmIcon[i]);
		selectPriority(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//select[contains(@id,'Priority')]"),fcmPriority[i]);
		sendTextInTimeToLive(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//*[contains(@id,'TTL')]"),fcmtimeToLive[i]);
		sendTextInCustomData(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//parent :: tr//*[contains(@id,'Data')]"),fcmCustomData[i]);
		}
		clickOnSaveBtn();
	}
	

	

	public boolean verifyEditAlertFCMAccount(Map<Object, Object> map, List<Object> mapKeys) {
		
		String fcmUserType[] = map.get(mapKeys.get(3)).toString().trim().split(",");
		String fcmAppKey[] = map.get(mapKeys.get(2)).toString().trim().split(",");
		String fcmTitle[] = map.get(mapKeys.get(4)).toString().trim().split(",");
		String fcmIcon[] = map.get(mapKeys.get(5)).toString().trim().split(",");
		String fcmPriority[] = map.get(mapKeys.get(6)).toString().trim().split(",");
		String fcmtimeToLive[] = map.get(mapKeys.get(7)).toString().trim().split(",");
		String fcmCustomData[] = map.get(mapKeys.get(8)).toString().trim().split(",");
		for(int i=0;i<fcmUserType.length;i++){
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmAppKey[i]+"']"), false))
			return false;
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmTitle[i]+"']"), false))
			return false;
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmIcon[i]+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmPriority[i]+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmtimeToLive[i]+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//td[contains(text(),'"+fcmUserType[i].trim()+"')]//following-sibling::td[normalize-space(text())='"+fcmCustomData[i]+"']"), false))
				return false;
		}
		return true;
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify FCM account  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if FCM account Log successfully Verified
	 */
	public boolean verifyFCMAccountEditedLogd(Map<Object, Object> map, List<Object> mapKeys){
		clickOnLogBtn();
		if(verifyLogPagination()) {
			return true;
		}
		else 
		{
			return false;
		}
	}
}
