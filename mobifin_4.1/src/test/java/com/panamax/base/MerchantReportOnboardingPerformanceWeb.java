package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class MerchantReportOnboardingPerformanceWeb extends Common{
	By startDateLabel = By.xpath("//*[contains(@class,'panel-title text-muted bottom') and normalize-space(text())='Start Date']");
	By drpTreeName = By.id("cmbTreeID");
	By drpTreeLevel = By.id("cmbLevelID");
	By drpProfileName = By.id("TreeProfileID");
	By drpKYCStatus = By.id("cmbKycStatus");
	By drpState = By.id("cmbCountryStateID");
	By drpChannelOfRegistration = By.id("cmbChannelOfRegistration");
	By drpGroupBy = By.id("cmbGroupBy");
	
	/**
	 * @author shivani.doshi
	 * @param driver constructor
	 * @creation date 18/12/2018
	 */
	public MerchantReportOnboardingPerformanceWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.patel 
	 * Select in treeName In Filter Search
	 * @param treeName
	 * @creation date 18/12/2018
	 */
	public void selectTreeNameInFilterSearch(String treeName){
		selectFromDropdown(drpTreeName, treeName);	
	}
	/**
	 * @author shivani.patel 
	 * Select in merchantLevel In Filter Search
	 * @param merchantLevel
	 * @creation date 18/12/2018
	 */
	public void selectTreeLevelInFilterSearch(String merchantLevel){
		selectFromDropdown(drpTreeLevel, merchantLevel);	
	}
	/**
	 * @author shivani.patel 
	 * Select in profileName In Filter Search
	 * @param profileName
	 * @creation date 18/12/2018
	 */
	public void selectProfileNameInFilterSearch(String profileName){
		selectFromDropdown(drpProfileName, profileName);	
	}
	/**
	 * @author shivani.patel 
	 * Select in kYCStatus In Filter Search
	 * @param kYCStatus
	 * @creation date 18/12/2018
	 */
	public void selectKYCStatusInFilterSearch(String kYCStatus){
		selectFromDropdown(drpKYCStatus, kYCStatus);	
	}
	/**
	 * @author shivani.patel 
	 * Select in channelOfRegistration In Filter Search
	 * @param channelOfRegistration
	 * @creation date 18/12/2018
	 */
	public void selectchannelOfRegistrationInFilterSearch(String channelOfRegistration){
		selectFromDropdown(drpChannelOfRegistration, channelOfRegistration);	
	}
	/**
	 * @author shivani.patel 
	 * Select in groupBy In Filter Search
	 * @param groupBy
	 * @creation date 18/12/2018
	 */
	public void selectGroupByInFilterSearch(String groupBy){
		selectFromDropdown(drpGroupBy, groupBy);	
	}
	/**
	 * @author shivani.patel 
	 * Select in state In Filter Search
	 * @param state
	 * @creation date 18/12/2018
	 */
	public void selectStateInFilterSearch(String state){
		selectFromDropdown(drpState, state);	
	}
	/**
	 * @author shivani.patel 
	 * use for Filter Search Add Field
	 * @param treeName,MerchantLevel,ProfileName,KYCStatus,State,ChannelOfRegistration,GroupBy
	 * @creation date 18/12/2018
	 */
	public void filterSearch(String TreeName, String MerchantLevel, String ProfileName,String KYCStatus,String State,String ChannelOfRegistration,String GroupBy) {
		commonFilterSearch();
		if(!TreeName.equals(""))
		selectTreeNameInFilterSearch(TreeName);
		if(!MerchantLevel.equals(""))
		selectTreeLevelInFilterSearch(MerchantLevel);
		if(!ProfileName.equals(""))
		selectProfileNameInFilterSearch(ProfileName);
		if(!KYCStatus.equals(""))
		selectKYCStatusInFilterSearch(KYCStatus);
		if(!State.equals(""))
		selectStateInFilterSearch(State);
		if(!ChannelOfRegistration.equals(""))
		selectchannelOfRegistrationInFilterSearch(ChannelOfRegistration);
		if(!GroupBy.equals(""))
		selectGroupByInFilterSearch(GroupBy);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel 
	 * Search last 30 days Onboarding Performance
	 * @creation date 18/12/2018
	 */
	public void searchTransactionPerformance(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString(),map.get(getMapKeys(map).get(4)).toString(),map.get(getMapKeys(map).get(5)).toString(),map.get(getMapKeys(map).get(6)).toString());
		if(verifyToolTip()){
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel 
	 * Use for verify Report table
	 * @creation date 18/12/2018
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
