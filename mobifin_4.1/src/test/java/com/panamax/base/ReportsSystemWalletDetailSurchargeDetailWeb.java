package com.panamax.base;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ReportsSystemWalletDetailSurchargeDetailWeb extends Common{
	By txtStartDate = By.xpath(".//*[contains(@id,'StartDate')]");
	By txtendDate = By.xpath(".//*[contains(@id,'EndDate')]");
	By verifyInnerDetailTable= By.xpath(".//*[@id='moduleListTable']/tbody//td[contains(@class,'dataTables_empty')]");
	By startDateLabel = By.xpath("//*[contains(@class,'panel-title text-muted bottom') and normalize-space(text())='Start Date']");

	/**
	 * @author shivani.doshi
	 * @param driver constructor
	 * @creation date 27/12/2018
	 */
	public ReportsSystemWalletDetailSurchargeDetailWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.doshi
	 * Use for clickOn StartDate Label 
	 * @creation date 27/12/2018
	 */
	public void clickOnStartDateLabel()
	{
		clickOnElement(startDateLabel);
	}
	/**
	 * @author shivani.doshi
	 * Use for set End Date in EndDate Field
	 * @creation date 27/12/2018
	 */
	public void sendTextInEndDate(){
		String endDate=getCurrentDateTime();
		sendTextWithRemoveReadOnlyProperty(endDate, txtendDate);
		clickOnStartDateLabel();
	}
	/**
	 * @author shivani.doshi
	 * Use for set Start Date in EndDate Field
	 * @creation date 27/12/2018
	 */
	public void sendTextInStartDate(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
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
	 * Search last 30 days system wallet details SurchargeDetail report
	 * @creation date 27/12/2018
	 */
	public void searchSurchargeDetail() {
		sendTextInStartDate();
		sendTextInEndDate();
		clickOnFilterSearchBtn();
		if(verifyToolTip()){
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel 
	 * Use for verify SurchargeDetail table
	 * @creation date 27/12/2018
	 */
	public boolean verifysearchSurchargeDetail() {
		if(verifyReportTable()){
			if(verifyElement(verifyInnerDetailTable,false)){
				String tableText=getUIText(verifyInnerDetailTable);
				log("</br><b style='color:#02563d'>" + tableText + "</b></br>");
				return true;
			}else if(!verifyElement(verifyInnerDetailTable,false)){
				return true;
			}
		}
		return false;
	}
}
