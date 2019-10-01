package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertEmailTemplateWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi
 * Settings - User Management - EmailTemplate
 * @creation date 29/10/2018  
 */
public class SettingsAlertEmailTemplate extends Common{

	HomeWeb homePage;
	SettingsAlertEmailTemplateWeb settingsAlertEmailTemplateWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author dishant.doshi
	 * For User Management - EmailTemplate - Add
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailTemplate_Add", dataProviderClass = TestDataImport.class, description = "Id: AddEmailTemplate, Author: Dishant Doshi")
	public void addEmailTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailTemplateWeb = homePage.clickOnSettingsAlertEmailTemplate();
			count++;
		}
		settingsAlertEmailTemplateWeb.addEmailTemplate(map, getMapKeys(map));
		verifyTrue(settingsAlertEmailTemplateWeb.verifyEmailTemplateAdded(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi
	 * For Management - EmailTemplate - Edit
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailTemplate_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEmailTemplate, Author: Dishant Doshi")
	public void editEmailTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailTemplateWeb = homePage.clickOnSettingsAlertEmailTemplate();
			count++;
		}
		settingsAlertEmailTemplateWeb.editEmailTemplate(map, getMapKeys(map));
		verifyTrue(settingsAlertEmailTemplateWeb.verifyEmailTemplateEdited(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi
	 * For Management - EmailTemplate - Delete
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailTemplate_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteEmailTemplate, Author: Dishant Doshi")
	public void deleteEmailTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailTemplateWeb = homePage.clickOnSettingsAlertEmailTemplate();
			count++;
		}
		if(settingsAlertEmailTemplateWeb.deleteEmailTemplate(map, getMapKeys(map)))
			verifyFalse(settingsAlertEmailTemplateWeb.verifyEmailTemplateDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author Kutbuddin.compiunder
	 * For Management - EmailAccount - EditedLog
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailTemplate_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedLogEmailAccount, Author: Dishant Doshi")
	public void editedLogEmailTemplate(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailTemplateWeb = homePage.clickOnSettingsAlertEmailTemplate();
			count++;
		}
			verifyTrue(settingsAlertEmailTemplateWeb.verifyEmailAccountEditedLogd(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Alert - Email Template - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsAlertEmailTemplate_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortEmailTemplate, Author: Dishant Doshi")
	public void sortEmailTemplate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsAlertEmailTemplateWeb = homePage.clickOnSettingsAlertEmailTemplate();
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
			verifyTrue(settingsAlertEmailTemplateWeb.sortEmailTemplate(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
