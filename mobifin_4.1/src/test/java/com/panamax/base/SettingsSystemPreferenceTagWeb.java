package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsSystemPreferenceTagWeb extends Common{
	By drpWalletType = By.id("WalletType");
	By selectColor = By.id("ColorCode");
	By txtDescription = By.id("Description");
	By txtName = By.id("TagName");
	By drpStatus = By.id("IsActive");
	By txtNameInSearch =By.id("txtTagName");
	By drpWallettypeInSearch = By.id("cmbWalletType");
	By drpStatusInSearch = By.id("cmbIsActive");
	By btnAddUser = By.name("btnAdd");
	By txtInSearchMember = By.id("Phone");
	By btnSearch = By.id("search");
	By btnAddSearchMember = By.id("Addgridbtn");
	By btnDeleteUser = By.xpath(".//*[text()='Delete User']");
	By btnAddUserSave = By.id("saveAddgr");
	By btnAddDeleteUser = By.xpath("(//*[normalize-space(text())='Delete'])[last()]");


	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 18/10/2018
	 */
	public SettingsSystemPreferenceTagWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * select WalletType In DropDownBox
	 * @param WalletType
	 * @creation date 18/10/2018
	 */
	public void selectWalletType(String WalletType){
		selectFromDropdown(drpWalletType, WalletType);
	}

	/**
	 * @author shivani.patel
	 * send text in Color Field
	 * @param Color
	 * @creation date 18/10/2018
	 */
	public void sendTextInColor(String Color){
		clearAndSendTextInTextBox(selectColor, Color);
	}

	/**
	 * @author shivani.patel
	 * send text in Description Field
	 * @param Description
	 * @creation date 18/10/2018
	 */
	public void sendTextInDescription(String Description){
		clearAndSendTextInTextBox(txtDescription, Description);
	}

	/**
	 * @author shivani.patel
	 * send text in Name Field
	 * @param Name
	 * @creation date 18/10/2018
	 */
	public void sendTextInName(String Name){
		sendTextInTextBox(txtName, Name);
	}

	/**
	 * @author shivani.patel
	 * select Status In DropDownBox
	 * @param Status
	 * @creation date 18/10/2018
	 */
	public void selectStatus(String Status){
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel
	 * send Name Text In Filter Search
	 * @param Name
	 * @creation date 18/10/2018
	 */
	public void sendTextINNameInFilterSearch(String Name){
		clearAndSendTextInTextBox(txtNameInSearch, Name);
	}
	/**
	 * @author shivani.patel
	 * select WalletType In Filter Search DropDownBox
	 * @param WalletType
	 * @creation date 18/10/2018
	 */
	public void selectWalletTypeInFilterSearch(String WalletType){
		selectFromDropdown(drpWallettypeInSearch, WalletType);
	}

	/**
	 * @author shivani.patel
	 * select Status In Filter Search DropDownBox
	 * @param Status
	 * @creation date 18/10/2018
	 */
	public void selectStatusInFilterSearch(String Status){
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author shivani.patel
	 * click On AddUser Button 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void clickOnAddUserButton(){
		clickOnElement(btnAddUser);
	}

	/**
	 * @author shivani.patel
	 * send SearchMember Text 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void sendTextInSearchMember(String SearchMember){
		clearAndSendTextInTextBox(txtInSearchMember, SearchMember);
	}

	/**
	 * @author shivani.patel
	 * click on Search Button 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void clickOnSearchButton(){
		clickOnElement(btnSearch);

	}

	/**
	 * @author shivani.patel
	 * click on UserDelete Button 
	 * @param UserDelete
	 * @creation date 22/10/2018
	 */
	public void clickOnUserDeleteButton(){
		clickOnElement(btnAddDeleteUser);

	}

	/**
	 * @author shivani.patel
	 * click  on Add SearchMember Button 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void clickOnAddSearchMember(){
		clickOnElement(btnAddSearchMember);

	}
	/**
	 * @author shivani.patel
	 * click On AddUser Button 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void clickOnSearchMemberSaveButton(){
		clickOnElement(btnAddUser);
	}

	/**
	 * @author shivani.patel
	 * click On AddUser Save Button 
	 * @creation date 22/10/2018
	 */
	public void clickOnAddUserSavebtn(){
		clickOnElement(btnAddUserSave);
	}
	/**
	 * @author shivani.patel
	 * click On AddUser Button 
	 * @param SearchMember
	 * @creation date 22/10/2018
	 */
	public void clickOnDeleteUserButton(){
		clickOnElement(btnDeleteUser);
	}
	/**
	 * @author shivani.patel
	 * use for send value of filter search fields
	 * @param Name,WalletType,Status
	 * @creation date 22/10/2018
	 */
	public void filterSearch(String Name,String WalletType,String Status){
		commonFilterSearch();
		sendTextINNameInFilterSearch(Name);
		selectWalletTypeInFilterSearch(WalletType);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel
	 * to add Tag
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 18/10/2018
	 */
	public void addTag(Map<Object, Object> map, List<Object> keys){
		clickOnAddBtn();
		selectWalletType(map.get(keys.get(0)).toString());
		sendTextInColor(map.get(keys.get(1)).toString());
		sendTextInDescription(map.get(keys.get(2)).toString());
		sendTextInName(map.get(keys.get(3)).toString());
		selectStatus(map.get(keys.get(4)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel
	 * to verify AddTag
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 18/10/2018
	 */
	public boolean verifyaddTag(Map<Object, Object> map, List<Object> keys){
		By WalletType = By.xpath("//label[normalize-space(text())='Wallet Type']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(0)).toString()+"']");
		By Color = By.xpath("//label[normalize-space(text())='Color']//parent :: div//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(1)).toString()+"']");
		By Description = By.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(2)).toString()+"']");
		By Name = By.xpath("//label[normalize-space(text())='Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(3)).toString()+"']");
		By Status = By.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(4)).toString()+"']");

		filterSearch(map.get(keys.get(3)).toString(),map.get(keys.get(0)).toString(),map.get(keys.get(4)).toString());
		clickOnInfoBtn(map.get(keys.get(3)).toString());
		if(!verifyElement(WalletType, false))
			return false;
		if(!verifyElement(Color, false))
			return false;
		if(!verifyElement(Description, false))
			return false;
		if(!verifyElement(Name, false))
			return false;
		if(!verifyElement(Status, false))
			return false;
		return true;
	}

	/**
	 * @author shivani.patel
	 * to Edit Tag
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 18/10/2018
	 */
	public void editTag(Map<Object, Object> map, List<Object> keys){

		filterSearch(map.get(keys.get(3)).toString(),map.get(keys.get(0)).toString(),map.get(keys.get(4)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(keys.get(3)).toString());
			clickOnEditBtn();
			sendTextInColor(map.get(keys.get(1)).toString());
			sendTextInDescription(map.get(keys.get(2)).toString());
			selectStatus(map.get(keys.get(4)).toString());
			clickOnSaveBtn();
		}else{
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel
	 * to verify EditTag
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 18/10/2018
	 */
	public boolean verifyEditedTag(Map<Object, Object> map, List<Object> keys){
		By Color = By.xpath("//label[normalize-space(text())='Color']//..//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(1)).toString()+"']");
		By Description = By.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(2)).toString()+"']");
		By Status = By.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(4)).toString()+"']");

		filterSearch(map.get(keys.get(3)).toString(),map.get(keys.get(0)).toString(),map.get(keys.get(4)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(keys.get(3)).toString());
			if(!verifyElement(Color, false))
				return false;
			if(!verifyElement(Description, false))
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
	 * to add User
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 23/10/2018
	 */
	public void addUser(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(1)).toString(),map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(2)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(1)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnAddUserButton();
			String[] addmember =map.get(keys.get(3)).toString().trim().split(";");
			for(int i=0;i<addmember.length;i++){
				sendTextInSearchMember(addmember[i].trim());
				clickOnSearchButton();
				if(verifyToolTip()){
					verifyFalse(true);
				}
				clickOnAddSearchMember();
			}
			clickOnAddUserSavebtn();
			getStriptText();
			clickOnBackBtn();
			clickOnBackBtn();
		}
		else{
			verifyFalse(true);
		}
	}
	/**
	 * @author shivani.patel
	 * to Delete User
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 23/10/2018
	 */
	public boolean deleteUser(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(1)).toString(),map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(2)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(1)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			String beforeUserCount=getUIText(By.xpath("(.//*[@id='ProfileChart']//*[normalize-space(text())='Total User']//following-sibling::*)[last()]"));
			int x=Integer.parseInt(beforeUserCount);
			clickOnDeleteUserButton();
			String[] deleteAddMember =map.get(keys.get(4)).toString().trim().split(";");
			for(int i=0;i<deleteAddMember.length;i++){
				sendTextInSearchMember(deleteAddMember[i].trim());
				clickOnSearchButton();
				if(verifyToolTip()){
					verifyFalse(true);
				}
				clickOnAddSearchMember();
			}
			clickOnUserDeleteButton();
			getStriptText();
			clickOnBackBtn();
			String afterUserCount=getUIText(By.xpath("(.//*[@id='ProfileChart']//*[normalize-space(text())='Total User']//following-sibling::*)[last()]"));
			int y=Integer.parseInt(afterUserCount);
			if(x-y==deleteAddMember.length){
				return true;
			}
		}
		return false;

	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify edit Tag  log 
	 * @param map - excel values 
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if  Tag Log successfully Verified
	 */
	public boolean verifyEditLogTag(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(getMapKeys(map).get(3)).toString(),map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(4)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(3)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi to sort Tag
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortTag(Map<Object, Object> map, List<Object> mapKeys) {
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
