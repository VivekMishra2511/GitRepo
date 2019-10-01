package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ReportsPocketBalanceReportWeb extends Common{
	By txtMSISDN = By.id("msisdn");
	By startDateLabel = By.xpath("//*[contains(@class,'panel-title text-muted bottom') and normalize-space(text())='Start Date']");

	/**
	 * @author shivani.doshi
	 * @param driver constructor
	 * @creation date 28/12/2018
	 */
	public ReportsPocketBalanceReportWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.doshi
	 * send text in MSISDN field
	 * @param MSISDN
	 * @creation date 28/12/2018
	 */
	public void sendTextInMSISDN(String MSISDN){
		clearAndSendTextInTextBox(txtMSISDN, MSISDN);
	}
	/**
	 * @author shivani.patel 
	 * Search last 30 days pocket balance report
	 * @creation date 28/12/2018
	 */
	public void searchPocketBalanceReport(Map<Object, Object> map, List<Object> keys) {
		sendTextInMSISDN(map.get(getMapKeys(map).get(0)).toString());
		clickOnFilterSearchBtn();
		if(verifyToolTip()){
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel 
	 * Use for verify  pocket balance report table
	 * @creation date 28/12/2018
	 */
	public boolean verifySearchPocketBalanceReport(Map<Object, Object> map, List<Object> keys) {
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
