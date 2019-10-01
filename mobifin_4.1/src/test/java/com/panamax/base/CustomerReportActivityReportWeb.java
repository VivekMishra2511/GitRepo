package com.panamax.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class CustomerReportActivityReportWeb extends Common{
	By txtStartDate = By.xpath(".//*[contains(@id,'StartDate')]");
	By txtendDate = By.xpath(".//*[contains(@id,'EndDate')]");
	By startDateLabel = By.xpath("//*[contains(@class,'control-label full text-left') and normalize-space(text())='Start Date']");
	By txtPhoneNumber = By.id("Phone");
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * @author shivani.doshi
	 * @param driver constructor
	 * @creation date 20/12/2018
	 */
	public CustomerReportActivityReportWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.doshi
	 * Use for clickOn StartDate Label 
	 * @creation date 20/12/2018
	 */
	public void clickOnStartDateLabel()
	{
		clickOnElement(startDateLabel);
	}
	/**
	 * @author shivani.doshi
	 * Use for set End Date in EndDate Field
	 * @creation date 20/12/2018
	 */
	public void sendTextInEndDate(){
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.MINUTE, -2);
		Date currentDatePlusOne = c.getTime();
		String endDate=dateFormat.format(currentDatePlusOne);
		sendTextWithRemoveReadOnlyProperty(endDate, txtendDate);
		clickOnStartDateLabel();
	}
	/**
	 * @author shivani.doshi
	 * Use for set Start Date in EndDate Field
	 * @creation date 20/12/2018
	 */
	public void sendTextInStartDate(){
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.DATE, -30);
		Date currentDatePlusOne = c.getTime();
		String startDate=dateFormat.format(currentDatePlusOne);
		sendTextWithRemoveReadOnlyProperty(startDate, txtStartDate);
		clickOnStartDateLabel();
	}
	/**
	 * @author shivani.patel 
	 * Send Text in PhonenNumber field
	 * @param PhonenNumber
	 * @creation date 20/12/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber){
		clearAndSendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}
	/**
	 * @author shivani.patel 
	 * Search last 30 days Activity Report
	 * @creation date 20/12/2018
	 */
	public void searchActivityReport(Map<Object, Object> map, List<Object> keys) {
		sendTextInPhoneNumber(map.get(getMapKeys(map).get(0)).toString());
		sendTextInStartDate();
		sendTextInEndDate();
		clickOnFilterSearchBtn();
		if(verifyToolTip()){
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel 
	 * Use for verify Report table
	 * @creation date 20/12/2018
	 */
	public boolean verifysearchActivityReport(Map<Object, Object> map, List<Object> keys){
		if(verifyReportTable()){
			if(verifyInnerDetailTable()){
				log("</br><b style='color:#02563d'>" + getInnerTableText() + "</b></br>");
				return true;
			}else if(!verifyInnerDetailTable()){
				return true;
			}
		}
		return false;
	}
}
