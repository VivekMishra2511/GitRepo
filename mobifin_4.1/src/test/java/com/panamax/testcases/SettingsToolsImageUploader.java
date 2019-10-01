package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsToolsImageUploaderWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsToolsImageUploader extends Common{
	HomeWeb homePage;
	SettingsToolsImageUploaderWeb settingsToolsImageUploaderWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author shivani.patel
	 * For  Settings - Tools - ImageUploader - Add
	 * @creation date 26/10/2018
	 */
	@Test(dataProvider = "SettingsToolsImageUploader_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsToolsImageUploader, Author: Shivani Patel")
	public void addImageUploader(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsImageUploaderWeb = homePage.clickOnSettingsToolsImageUploaders();
			count++;
		}
		settingsToolsImageUploaderWeb.addImageUploader(map, getMapKeys(map));
		verifyTrue(settingsToolsImageUploaderWeb.verifyaddImageUploader(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Tools - ImageUploader - Edit
	 * @creation date 26/10/2018
	 */
	@Test(dataProvider = "SettingsToolsImageUploader_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsToolsImageUploader, Author: Shivani Patel")
	public void editImageUploader(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsImageUploaderWeb = homePage.clickOnSettingsToolsImageUploaders();
			count++;
		}
		settingsToolsImageUploaderWeb.editImageUploader(map, getMapKeys(map));
		verifyTrue(settingsToolsImageUploaderWeb.verifyeditImageUploader(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For Settings - Tools - ImageUploader - Delete
	 * @creation date 27/10/2018
	 */
	@Test(dataProvider = "SettingsToolsImageUploader_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsToolsImageUploader, Author: Shivani Patel")
	public void deleteImageUploader(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsImageUploaderWeb = homePage.clickOnSettingsToolsImageUploaders();
			count++;
		}
		if(settingsToolsImageUploaderWeb.deleteImageUploader(map, getMapKeys(map)))
		verifyFalse(settingsToolsImageUploaderWeb.verifyDeleteImageUploader(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Tools - imageUploader - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsToolsImageUploader_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortimageUploader, Author: Dishant Doshi")
	public void sortImageUploader(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsToolsImageUploaderWeb = homePage.clickOnSettingsToolsImageUploaders();
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
			verifyTrue(settingsToolsImageUploaderWeb.sortImageUploader(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
