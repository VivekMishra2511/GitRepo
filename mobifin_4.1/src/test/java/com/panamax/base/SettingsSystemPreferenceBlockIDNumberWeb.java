package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author shivani.patel
 * Actions of Settings - SystemPreference - BlockIDNumber
 * @creation date 12/10/2018
 */
public class SettingsSystemPreferenceBlockIDNumberWeb extends Common{
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpStatus = By.id("IsActive");
	By txtIDNumberInSearch = By.id("txtIDNumber");
	By drpStatusInSearch = By.id("cmbIsActive");

	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 12/10/2018
	 */
	public SettingsSystemPreferenceBlockIDNumberWeb(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @author shivani.patel
	 * select ID Proof Type in Dropdown
	 * @param ID_Proof_Type
	 * @creation date 12/10/2018
	 */
	public void selectIDProofType(String IDProofType){
		selectFromDropdown(drpIDProofType, IDProofType);
	}
	
	/**
	 * @author shivani.patel
	 * send Text ID Number Field
	 * @param IDNumber
	 * @creation date 12/10/2018
	 */
	public void sendTextInIDNumber(String IDNumber){
		sendTextInTextBox(txtIDNumber, IDNumber);
	}
	
	/**
	 * @author shivani.patel
	 * select Status in DropdownBox
	 * @param Status
	 * @creation date 12/10/2018
	 */
	public void selectStatus(String Status){
		selectFromDropdown(drpStatus, Status);
	}
	
	/**
	 * @author shivani.patel
	 * send text in Filter Search IDNumber Field
	 * @param Phone
	 * @creation date 12/10/2018
	 */
	public void sendTextIDNumberInFilterSearch(String IDNumber){
		clearAndSendTextInTextBox(txtIDNumberInSearch, IDNumber);
	}
	
	/**
	 * @author shivani.patel
	 * select Status in Filter Search DropdownBox
	 * @param Status
	 * @creation date 12/10/2018
	 */
	public void selectStatusInFilterSearch(String Status){
		selectFromDropdown(drpStatusInSearch, Status);
	}
	/**
	 * @author shivani.patel
	 * use for send text of filter search field  
	 * @param IDNumber, Status
	 * @creation date 12/10/2018
	 */
	public void filterSearch(String IDNumber,String Status){
		commonFilterSearch();
		sendTextIDNumberInFilterSearch(IDNumber);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel
	 * to add Block IDNumber
	 * @param map - excel values use for get Value
	 * @param keys - excel header use for to identify value
	 * @creation date 12/10/2018
	 */
	public void addBlockIDNumber(Map<Object, Object> map, List<Object> keys){
		clickOnAddBtn();
		selectIDProofType(map.get(keys.get(0)).toString());
		sendTextInIDNumber(map.get(keys.get(1)).toString());
		selectStatus(map.get(keys.get(2)).toString());
		clickOnSaveBtn();
		if(verifyToolTip()){
			clickOnCancelBtn();
			log("Given Profile Already Exits");
			}
	}
	
	/**
	 * @author shivani.patel
	 * to  verify add Block IDNumber
	 * @param map - excel values use for get Value
	 * @param keys - excel header use for to identify value
	 * @creation date 12/10/2018
	 * @return true if  BlockIDNumber add successfully Verified
	 */
	public boolean verifyaddBlockIDNumber(Map<Object, Object> map, List<Object> keys){
		By IDProofType = By.xpath("//label[text()='ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(0)).toString()+"']");
		By IDNumber  = By.xpath("//label[text()='ID Number']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(1)).toString()+"']");
		By Status  = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(2)).toString()+"']");

		filterSearch(map.get(keys.get(1)).toString(),map.get(keys.get(2)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
		if(!verifyElement(IDProofType,false))
			return false;
		if(!verifyElement(IDNumber,false))
			return false;
		if(!verifyElement(Status,false))
			return false;
		return true;
		}else{
			return false;
		}
	}
	/**
	 * @author shivani.patel
	 * to  Edit Block ID Number
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 16/10/2018
	 */
	public void editBlockIDNumber(Map<Object, Object> map, List<Object> keys){
		filterSearch(map.get(keys.get(0)).toString(),map.get(keys.get(1)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
		clickOnEditBtn();
		selectStatus(map.get(keys.get(2)).toString());
		clickOnSaveBtn();
		}else{
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel
	 * to  verify add Block IDNumber
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 16/10/2018
	 * 	 * @return true if  BlockIDNumber edit successfully Verified
	 */
	public boolean verifyEditBlockIDNumber(Map<Object, Object> map, List<Object> keys){
		By Status  = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(2)).toString()+"']");

		filterSearch(map.get(keys.get(0)).toString(),map.get(keys.get(2)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
		if(!verifyElement(Status,false))
			return false;
		return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author shivani.patel to delete Block IDNumber
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 */
	public boolean deleteBlockIDNumber(Map<Object, Object> map, List<Object> mapKeys) {
		
		filterSearch(map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(1)).toString());
			if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
				clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
				delete();
				return true;
			}else{
				String string = "Block IDNumber already deleted";
				log("</br><b style='color:#02563d'>"+string+"</b>");
			}
			return false;
	}
	/**
	 * @author shivani.patel
	 * to verify delete Block IDNumber
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 16/10/2018
	 * @return true if  BlockIDNumber delete successfully Verified
	 */
	public boolean verifyDeleteBlockIDNumber(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify edit BlockIDNumber  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if  BlockIDNumber Log successfully Verified
	 */
	public boolean verifyEditLogBlockIDNumber(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(2)).toString());
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
	 * @author dishant.doshi to sort BlockIDNumber
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortBlockIDNumber(Map<Object, Object> map, List<Object> mapKeys) {
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
