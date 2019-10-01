package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi
 * Actions of Customer - ProfileUpdate
 * @creation date 19/11/2018
 */
public class AgentTransferWeb extends Common {
	By txtSearchFromParent = By.id("ParentPhone");
	By drpFromProfile = By.id("ProfileID");
	By drpToProfile = By.id("ToProfileID");
	By btnSearchAgent = By.id("go");
	By txtSearchToParent = By.id("ToParentPhone");
	By btnSearchFromAgent = By.id("searchparent");
	By btnSearchToAgent = By.id("tosearchparent");
	By importFile = By.id("WalletFile");
	By txtSearchAgent = By.id("AgentPhone");
	By btnDownloadAgentList = By.id("downloadagent");
	By drpTree = By.id("ToTree");
	By btnInitiateRequest = By.xpath("//*[@class='cludebutton']//button");
	
	/**
	 * @author dishant.doshi
	 * @param driver constructor
	 * @creation date 19/11/2018
	 */
	public AgentTransferWeb(WebDriver driver) {
		this.driver = driver;
	}
	
	public void sendTextInSearchFromParent(String searchFromParent){
		clearAndSendTextInTextBox(txtSearchFromParent, searchFromParent);
	}
	
	public void selectTextInFromProfile(String profile){
		selectFromDropdown(drpFromProfile, profile);
	}
	
	public void selectTextInToProfile(String profile){
		selectFromDropdown(drpToProfile, profile);
	}
	
	public void selectTextInTree(String tree){
		selectFromDropdown(drpTree, tree);
	}
	
	public void clickOnGoBtn(){
		clickOnElement(btnSearchAgent);
	}
	
	public void sendTextInSearchToParent(String searchToParent){
		clearAndSendTextInTextBox(txtSearchToParent, searchToParent);
	}
	
	public void clickOnFromSearchBtn(){
		clickOnElement(btnSearchFromAgent);
	}
	
	public void clickOnToSearchBtn(){
		clickOnElement(btnSearchToAgent);
	}
	
	/**
	 * @author dishant.doshi
	 * to upload file
	 * @param filePath
	 * @creation date 27/11/2018
	 */
	public void browseFile(String filePath){
		sendTextInTextBox(importFile, filePath);
	}
	
	/**
	 * @author dishant.doshi
	 * to select selection type
	 * @param selectionType
	 * @creation date 27/11/2018
	 */
	public void clickOnSelection(String selectionType) {
		clickOnElement(By.xpath("//a[normalize-space(text()) = '"+selectionType+"']"));
	}
	
	/**
	 * @author dishant.doshi
	 * to click on download agent list
	 * @creation date 27/11/2018
	 */
	public void clickOnDownloadAgentList(){
		clickOnElement(btnDownloadAgentList);
	}
	
	
	/**
	 * @author dishant.doshi
	 * to send text in agent phone
	 * @param agentPhone
	 * @creation date 23/11/2018
	 */
	public void sendTextInAgentPhone(String agentPhone){
		clearAndSendTextInTextBox(txtSearchAgent, agentPhone);
	}
	
	public void clickOnTransferAsRadioBtn(String radioValue){
		clickOnElement(By.xpath("//input[@type='radio']//following-sibling::label[normalize-space(text())='"+radioValue+"']"));
	}
	
	public void clickOnInitiateRequest(){
		clickOnElement(btnInitiateRequest);
	}
	
	/**
	 * @author dishant.doshi
	 * to profile update
	 * @param map - excel values
	 * @param keys - excel header
	 * @return 
	 * @return 
	 * @creation date 23/11/2018
	 */
	public void agentTransfer(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInSearchFromParent(map.get(mapKeys.get(0)).toString());
		clickOnFromSearchBtn();
		selectTextInFromProfile(map.get(mapKeys.get(1)).toString());
		clickOnGoBtn();
		clickOnSelection(map.get(mapKeys.get(2)).toString());
		if(map.get(mapKeys.get(2)).toString().equals("Import List")){
			clickOnDownloadAgentList();
			String downloadFileName = getFileName(DOWNLOADS_FOLDER);
			commonWait();
			browseFile(downloadFileName);
		}else if(map.get(mapKeys.get(2)).toString().equals("Multiple Select")){
			String[] searchAgent = map.get(mapKeys.get(3)).toString().split("-");
			for(int c=0;c<searchAgent.length;c++){
				sendTextInAgentPhone(searchAgent[c].trim());
				clickOnGoBtn();
			}
		}
		clickOnTransferAsRadioBtn(map.get(mapKeys.get(4)).toString());
		if(map.get(mapKeys.get(4)).toString().equals("Node"))
			sendTextInSearchToParent(map.get(mapKeys.get(5)).toString());
		else
			selectTextInTree(map.get(mapKeys.get(6)).toString());
		clickOnToSearchBtn();
		getStriptText();
		if (verifyToolTip()){
			clickOnCancelBtn();
		}
		
	}

	public boolean verifyProfileUpdated(Map<Object, Object> map, List<Object> mapKeys) {
		return logDefectAutomated;/*
		By fromProfile = By.xpath("//tr[1]//td[normalize-space(text())='"+map.get(mapKeys.get(0)).toString()+"' and @data-title='lbl_from_profile']");
		By fromKYC = By.xpath("//tr[1]//td[normalize-space(text())='"+map.get(mapKeys.get(1)).toString()+"' and @data-title='lbl_from_kyc']");
		By toProfile = By.xpath("//tr[1]//td[normalize-space(text())='"+map.get(mapKeys.get(5)).toString()+"' and @data-title='lbl_to_profile']");
		By toKYC = By.xpath("//tr[1]//td[normalize-space(text())='"+map.get(mapKeys.get(6)).toString()+"' and @data-title='lbl_to_kyc']");
		By executionStatus = By.xpath("//tr[1]//td[normalize-space(text())='"+map.get(mapKeys.get(0)).toString()+"' and @data-title='lbl_from_profile']//following-sibling::td[normalize-space(text())='Done' and @data-title='lbl_execution_status']");
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reloadCurrentPage();
		if(!verifyElement(fromProfile,false))
			return false;
		if(!verifyElement(fromKYC,false))
			return false;
		if(!verifyElement(toProfile,false))
			return false;
		if(!verifyElement(toKYC,false))
			return false;
		if(!verifyElement(executionStatus,false))
			return false;
		return true;
	*/}

	public boolean verifyAgentTransferd(Map<Object, Object> map, List<Object> mapKeys) {
		return false;
	}
}
