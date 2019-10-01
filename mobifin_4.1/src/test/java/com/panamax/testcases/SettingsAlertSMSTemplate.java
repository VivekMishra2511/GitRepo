package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertSMSTemplateWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - User Management - SMS Template
 * @creation date 31/10/2018
 */
public class SettingsAlertSMSTemplate extends Common {

	HomeWeb homePage;
	SettingsAlertSMSTemplateWeb settingsAlertSMSTemplateWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For User Management - SMSTemplate - Add
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSTemplate_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSMSTemplate, Author: Dishant Doshi")
	public void addSMSTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSTemplateWeb = homePage.clickOnSettingsAlertSMSTemplate();
			count++;
		}
		settingsAlertSMSTemplateWeb.addSMSTemplate(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSTemplateWeb.verifySMSTemplateAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - SMSTemplate - Edit
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSTemplate_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSMSTemplate, Author: Dishant Doshi")
	public void editSMSTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSTemplateWeb = homePage.clickOnSettingsAlertSMSTemplate();
			count++;
		}
		settingsAlertSMSTemplateWeb.editSMSTemplate(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSTemplateWeb.verifySMSTemplateEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - SMSTemplate - Delete
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSTemplate_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSMSTemplate, Author: Dishant Doshi")
	public void deleteSMSTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSTemplateWeb = homePage.clickOnSettingsAlertSMSTemplate();
			count++;
		}
		if (settingsAlertSMSTemplateWeb.deleteSMSTemplate(map, getMapKeys(map)))
			verifyFalse(settingsAlertSMSTemplateWeb.verifySMSTemplateDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author Kutbuddin.compiunder For Management - SMSTemplate - EditedLog
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSTemplate_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedLogSMSTemplate, Author: kutbuddin compounder")
	public void editedLogSMSTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSTemplateWeb = homePage.clickOnSettingsAlertSMSTemplate();
			count++;
		}
		verifyTrue(settingsAlertSMSTemplateWeb.verifySMSTemplateEditedLogd(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Alert - SMS Template - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsAlertSMSTemplate_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortSMSTemplate, Author: Dishant Doshi")
	public void sortSMSTemplate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsAlertSMSTemplateWeb = homePage.clickOnSettingsAlertSMSTemplate();
			count++;
		}
		if(sortCounter==0)
		{
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(settingsAlertSMSTemplateWeb.sortSMSTemplate(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
