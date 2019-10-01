package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class EnterpriseReportTransactionPerformanceWeb extends Common{
	By startDateLabel = By.xpath("//*[contains(@class,'panel-title text-muted bottom') and normalize-space(text())='Start Date']");
	By drpProfileName = By.id("TreeProfileID");
	By drpKYCStatus = By.id("cmbKycStatus");
	By drpState = By.id("cmbCountryStateID");
	By drpProductName = By.id("txtProductName");
	By drpTransactionType = By.id("cmbTrnType");
	By drpGroupBy = By.id("cmbGroupBy");
	By drpViewType = By.id("cmbViewType");
	
	/**
	 * @author shivani.doshi
	 * @param driver constructor
	 * @creation date 21/12/2018
	 */
	public EnterpriseReportTransactionPerformanceWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.patel 
	 * Select in profileName In Filter Search
	 * @param profileName
	 * @creation date 21/12/2018
	 */
	public void selectProfileNameInFilterSearch(String profileName){
		selectFromDropdown(drpProfileName, profileName);	
	}
	/**
	 * @author shivani.patel 
	 * Select in kYCStatus In Filter Search
	 * @param kYCStatus
	 * @creation date 21/12/2018
	 */
	public void selectKYCStatusInFilterSearch(String kYCStatus){
		selectFromDropdown(drpKYCStatus, kYCStatus);	
	}
	/**
	 * @author shivani.patel 
	 * Select in state In Filter Search
	 * @param state
	 * @creation date 21/12/2018
	 */
	public void selectStateInFilterSearch(String state){
		selectFromDropdown(drpState, state);	
	}
	/**
	 * @author shivani.patel 
	 * Select in transactionType In Filter Search
	 * @param transactionType
	 * @creation date 21/12/2018
	 */
	public void selectTransactionTypeInFilterSearch(String transactionType){
		selectFromDropdown(drpTransactionType, transactionType);	
	}
	/**
	 * @author shivani.patel 
	 * Select in groupBy In Filter Search
	 * @param groupBy
	 * @creation date 21/12/2018
	 */
	public void selectGroupByInFilterSearch(String groupBy){
		selectFromDropdown(drpGroupBy, groupBy);	
	}
	/**
	 * @author shivani.patel 
	 * Select in viewType In Filter Search
	 * @param viewType
	 * @creation date 21/12/2018
	 */
	public void selectViewTypeInFilterSearch(String viewType){
		selectFromDropdown(drpViewType, viewType);	
	}
	/**
	 * @author shivani.patel 
	 * Send Text in productName Field In Filter Search
	 * @param productName
	 * @creation date 21/12/2018
	 */
	public void sendTextInProductNameInFilterSearch(String productName){
		clearAndSendTextInTextBox(drpProductName, productName);	
	}
	/**
	 * @author shivani.patel 
	 * use for Filter Search Add Field
	 * @param treeName,MerchantLevel,ProfileName,KYCStatus,State,ProductName,TransactionType,GroupBy,ViewType
	 * @creation date 21/12/2018
	 */
	public void filterSearch(String ProfileName,String KYCStatus,String ProductName,String TransactionType,String State,String GroupBy,String ViewType) {
		commonFilterSearch();
		if(!ProfileName.equals(""))
		selectProfileNameInFilterSearch(ProfileName);
		if(!KYCStatus.equals(""))
		selectKYCStatusInFilterSearch(KYCStatus);
		if(!TransactionType.equals(""))
		selectTransactionTypeInFilterSearch(TransactionType);
		if(!ProductName.equals(""))
		sendTextInProductNameInFilterSearch(ProductName);
		if(!State.equals(""))
		selectStateInFilterSearch(State);
		if(!GroupBy.equals(""))
		selectGroupByInFilterSearch(GroupBy);
		if(!ViewType.equals(""))
		selectViewTypeInFilterSearch(ViewType);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel 
	 * Search last 30 days Onboarding Performance
	 * @creation date 21/12/2018
	 */
	public void searchTransactionPerformance(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString(),map.get(getMapKeys(map).get(4)).toString(),map.get(getMapKeys(map).get(5)).toString(), map.get(getMapKeys(map).get(6)).toString());
		if(verifyToolTip()){
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel 
	 * Use for verify Report table
	 * @creation date 21/12/2018
	 */
	public boolean verifysearchTransactionPerformance(Map<Object, Object> map, List<Object> keys){
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
