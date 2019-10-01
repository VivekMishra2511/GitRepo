package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingSystempreferenceThresholdManagementWeb extends Common{
	By drpWalletType = By.id("WalletType");
	By txtMaxAmount = By.id("Max");
	By txtDailyIn = By.id("Daily_In");
	By txtDailyOut = By.id("Daily_Out");
	By txtDailyOverAll = By.id("Daily_Overall");
	By txtWeeklyIn = By.id("Weekly_In");
	By txtWeeklyOut = By.id("Weekly_Out");
	By txtWeeklyyOverAll = By.id("Weekly_Overall");
	By txtMonthlyIn = By.id("Monthly_In");
	By txtMonthlyOut = By.id("Monthly_Out");
	By txtMonthlyOverAll = By.id("Monthly_Overall");
	By drpWalletTypeInSearch = By.id("cmbWalletType");

	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 22/10/2018
	 */
	public SettingSystempreferenceThresholdManagementWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * select WalletType In DropDownBox
	 * @param WalletType
	 * @creation date 22/10/2018
	 */
	public void selectWalletType(String WalletType){
		selectFromDropdown(drpWalletType, WalletType);
	}
	
	/**
	 * @author shivani.patel
	 * send text in MaxAmount field
	 * @param MaxAmount
	 * @creation date 22/10/2018
	 */
	public void sendTextInMaxAmount(String MaxAmount){
		clearAndSendTextInTextBox(txtMaxAmount, MaxAmount);
	}
	/**
	 * @author shivani.patel
	 * send text in DailyIn field
	 * @param DailyIn
	 * @creation date 22/10/2018
	 */
	public void sendTextInDailyIn(String DailyIn){
		clearAndSendTextInTextBox(txtDailyIn, DailyIn);
	}
	
	/**
	 * @author shivani.patel
	 * send text in DailyOut field
	 * @param DailyOut
	 * @creation date 22/10/2018
	 */
	public void sendTextInDailyOut(String DailyOut){
		clearAndSendTextInTextBox(txtDailyOut, DailyOut);
	}
	
	/**
	 * @author shivani.patel
	 * send text in DailyOverAll field
	 * @param DailyOverAll
	 * @creation date 22/10/2018
	 */
	public void sendTextInDailyOverAll(String DailyOverAll){
		clearAndSendTextInTextBox(txtDailyOverAll, DailyOverAll);
	}
	
	/**
	 * @author shivani.patel
	 * send text in WeeklyIn field
	 * @param WeeklyIn
	 * @creation date 22/10/2018
	 */
	public void sendTextInWeeklyIn(String WeeklyIn){
		clearAndSendTextInTextBox(txtWeeklyIn, WeeklyIn);
	}
	
	/**
	 * @author shivani.patel
	 * send text in WeeklyOut field
	 * @param WeeklyOut
	 * @creation date 22/10/2018
	 */
	public void sendTextInWeeklyOut(String WeeklyOut){
		clearAndSendTextInTextBox(txtWeeklyOut, WeeklyOut);
	}
	
	/**
	 * @author shivani.patel
	 * send text in WeeklyOverAll field
	 * @param WeeklyOverAll
	 * @creation date 22/10/2018
	 */
	public void sendTextInWeeklyOverAll(String WeeklyOverAll){
		clearAndSendTextInTextBox(txtWeeklyyOverAll, WeeklyOverAll);
	}
	
	/**
	 * @author shivani.patel
	 * send text in MonthlyIn field
	 * @param MonthlyIn
	 * @creation date 22/10/2018
	 */
	public void sendTextInMonthlyIn(String MonthlyIn){
		clearAndSendTextInTextBox(txtMonthlyIn, MonthlyIn);
	}
	
	/**
	 * @author shivani.patel
	 * send text in MonthlyOut field
	 * @param MonthlyOut
	 * @creation date 22/10/2018
	 */
	public void sendTextInMonthlyOut(String MonthlyOut){
		clearAndSendTextInTextBox(txtMonthlyOut, MonthlyOut);
	}
	
	/**
	 * @author shivani.patel
	 * send text in MonthlyOverAll field
	 * @param MonthlyOverAll
	 * @creation date 22/10/2018
	 */
	public void sendTextInMonthlyOverAll(String MonthlyOverAll){
		clearAndSendTextInTextBox(txtMonthlyOverAll, MonthlyOverAll);
	}
	
	/**
	 * @author shivani.patel
	 * select WalletType In filter Search DropDownBox
	 * @param WalletType
	 * @creation date 22/10/2018
	 */
	public void selectWalletTypeInFilterSearch(String WalletType){
		selectFromDropdown(drpWalletTypeInSearch, WalletType);
	}
	/**
	 * @author shivani.patel
	 * use for send text in filter search fields 
	 * @param WalletType
	 * @creation date 22/10/2018
	 */
	public void filterSearch(String WalletType){
		commonFilterSearch();
		selectWalletTypeInFilterSearch(WalletType);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel
	 * to add ThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 */
	public void addThresholdManagement(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		selectWalletType(map.get(keys.get(0)).toString());
		sendTextInMaxAmount(map.get(keys.get(1)).toString());
		sendTextInDailyIn(map.get(keys.get(2)).toString());
		sendTextInDailyOut(map.get(keys.get(3)).toString());
		sendTextInDailyOverAll(map.get(keys.get(4)).toString());
		sendTextInWeeklyIn(map.get(keys.get(5)).toString());
		sendTextInWeeklyOut(map.get(keys.get(6)).toString());
		sendTextInWeeklyOverAll(map.get(keys.get(7)).toString());
		sendTextInMonthlyIn(map.get(keys.get(8)).toString());
		sendTextInMonthlyOut(map.get(keys.get(9)).toString());
		sendTextInMonthlyOverAll(map.get(keys.get(10)).toString());
		clickOnSaveBtn();
	}
	/**
	 * @author shivani.patel
	 * to verify AddThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018 
	 * @return true if ThresholdManagement add successfully Verified
	 */
	public boolean verifyaddThresholdManagement(Map<Object, Object> map, List<Object> keys) {
		By WalletType = By.xpath("//label[normalize-space(text())='Wallet Type']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(0)).toString()+"']");
		By MaxAmount = By.xpath("//*[normalize-space(text())='Max Amount']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(1)).toString()+"']");
		By DailyIn = By.xpath("//*[normalize-space(text())='Daily In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(2)).toString()+"']");
		By DailyOut = By.xpath("//*[normalize-space(text())='Daily Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(3)).toString()+"']");
		By DailyOverAll = By.xpath("//*[normalize-space(text())='Daily Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(4)).toString()+"']");
		By WeeklyIn = By.xpath("//*[normalize-space(text())='Weekly In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(5)).toString()+"']");
		By WeeklyOut = By.xpath("//*[normalize-space(text())='Weekly Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(6)).toString()+"']");
		By WeeklyOverAll = By.xpath("//*[normalize-space(text())='Weekly Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(7)).toString()+"']");
		By MonthlyIn = By.xpath("//*[normalize-space(text())='Monthly In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(8)).toString()+"']");
		By MonthlyOut = By.xpath("//*[normalize-space(text())='Monthly Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(9)).toString()+"']");
		By MonthlyOverAll = By.xpath("//*[normalize-space(text())='Monthly Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(10)).toString()+"']");
		
		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(keys.get(0)).toString());
		if(!verifyElement(WalletType, false))
			return false;
		if(!verifyElement(MaxAmount, false))
			return false;
		if(!verifyElement(DailyIn, false))
			return false;
		if(!verifyElement(DailyOut, false))
			return false;
		if(!verifyElement(DailyOverAll, false))
			return false;
		if(!verifyElement(WeeklyIn, false))
			return false;
		if(!verifyElement(WeeklyOut, false))
			return false;
		if(!verifyElement(WeeklyOverAll, false))
			return false;
		if(!verifyElement(MonthlyIn, false))
			return false;
		if(!verifyElement(MonthlyOut, false))
			return false;
		if(!verifyElement(MonthlyOverAll, false))
			return false;
		return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author shivani.patel
	 * to edit ThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 */
	public void editThresholdManagement(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			sendTextInMaxAmount(map.get(keys.get(1)).toString());
			sendTextInDailyIn(map.get(keys.get(2)).toString());
			sendTextInDailyOut(map.get(keys.get(3)).toString());
			sendTextInDailyOverAll(map.get(keys.get(4)).toString());
			sendTextInWeeklyIn(map.get(keys.get(5)).toString());
			sendTextInWeeklyOut(map.get(keys.get(6)).toString());
			sendTextInWeeklyOverAll(map.get(keys.get(7)).toString());
			sendTextInMonthlyIn(map.get(keys.get(8)).toString());
			sendTextInMonthlyOut(map.get(keys.get(9)).toString());
			sendTextInMonthlyOverAll(map.get(keys.get(10)).toString());
			clickOnSaveBtn();
		}else{
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel
	 * to verify EditThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 * @return true if ThresholdManagement edit successfully Verified
	 */
	public boolean verifyeditThresholdManagement(Map<Object, Object> map, List<Object> keys) {
		By MaxAmount = By.xpath("//*[normalize-space(text())='Max Amount']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(1)).toString()+"']");
		By DailyIn = By.xpath("//*[normalize-space(text())='Daily In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(2)).toString()+"']");
		By DailyOut = By.xpath("//*[normalize-space(text())='Daily Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(3)).toString()+"']");
		By DailyOverAll = By.xpath("//*[normalize-space(text())='Daily Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(4)).toString()+"']");
		By WeeklyIn = By.xpath("//*[normalize-space(text())='Weekly In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(5)).toString()+"']");
		By WeeklyOut = By.xpath("//*[normalize-space(text())='Weekly Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(6)).toString()+"']");
		By WeeklyOverAll = By.xpath("//*[normalize-space(text())='Weekly Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(7)).toString()+"']");
		By MonthlyIn = By.xpath("//*[normalize-space(text())='Monthly In Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(8)).toString()+"']");
		By MonthlyOut = By.xpath("//*[normalize-space(text())='Monthly Out Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(9)).toString()+"']");
		By MonthlyOverAll = By.xpath("//*[normalize-space(text())='Monthly Overall Limit']//following-sibling :: td[normalize-space(text()) = 'INR "+map.get(keys.get(10)).toString()+"']");
		
		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(MaxAmount, false))
				return false;
			if(!verifyElement(DailyIn, false))
				return false;
			if(!verifyElement(DailyOut, false))
				return false;
			if(!verifyElement(DailyOverAll, false))
				return false;
			if(!verifyElement(WeeklyIn, false))
				return false;
			if(!verifyElement(WeeklyOut, false))
				return false;
			if(!verifyElement(WeeklyOverAll, false))
				return false;
			if(!verifyElement(MonthlyIn, false))
				return false;
			if(!verifyElement(MonthlyOut, false))
				return false;
			if(!verifyElement(MonthlyOverAll, false))
				return false;
			return true;
		}else{
			return false;
		}
	}
	/**
	 * @author shivani.patel
	 * to delete ThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 */
	public boolean deleteThresholdManagement(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "Threshold Management already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return false;
	}
	/**
	 * @author shivani.patel
	 * to verify delete ThresholdManagement
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 * @return true if ThresholdManagement delete successfully Verified
	 */
	public boolean verifyDleteThresholdManagement(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(mapKeys.get(0)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify edit ThresholdManagement  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if  ThresholdManagement Log successfully Verified
	 */
	public boolean verifyEditLogThresholdManagement(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(getMapKeys(map).get(0)).toString());
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
	 * @author dishant.doshi to sort ThresholdManagement
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortThresholdManagement(Map<Object, Object> map, List<Object> mapKeys) {
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
