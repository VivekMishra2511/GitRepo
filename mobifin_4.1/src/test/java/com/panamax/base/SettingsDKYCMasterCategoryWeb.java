package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author dishant.doshi Actions of Settings - DKYC Master - DKYC Category
 * @creation date 31/10/2018
 */
public class SettingsDKYCMasterCategoryWeb extends Common {
	By drpCategoryModule = By.id("CategoryModule");
	By txtCategoryName = By.id("CategoryName");
	By txtDescription = By.id("Description");
	By drpStatus = By.id("IsActive");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 31/10/2018
	 */
	public SettingsDKYCMasterCategoryWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi to select text in category module
	 * @param categoryModule
	 * @creation date 31/10/2018
	 */
	public void selectTextInCategoryModule(String categoryModule) {
		selectFromDropdown(drpCategoryModule, categoryModule);
	}

	/**
	 * @author dishant.doshi to send text in category name
	 * @param categoryName
	 * @creation date 31/10/2018
	 */
	public void sendTextInCategoryName(String categoryName) {
		clearAndSendTextInTextBox(txtCategoryName, categoryName);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 31/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in description
	 * @param description
	 * @creation date 31/10/2018
	 */
	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	public void navigation(String navigationMenu) {
		clickOnElement(By.xpath(".//*[@id='editWiz']//a[text()='" + navigationMenu.trim() + "']"));
	}

	public void clickOnInfoBtn(String name) {
		By xpath = By.xpath(
				"(//td[normalize-space(text())='" + name + "']//preceding-sibling::td[contains(@class,'sorting')])[1]");
		clickOnElement(xpath);
	}

	/**
	 * @author dishant.doshi to add dkyc category
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/10/2018
	 */
	public void addCategory(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectTextInCategoryModule(map.get(mapKeys.get(0)).toString());
		sendTextInCategoryName(map.get(mapKeys.get(1)).toString());
		sendTextInDescription(map.get(mapKeys.get(2)).toString());
		selectTextInStatus(map.get(mapKeys.get(3)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify dkyc category added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/10/2018
	 * @return true if dkyc category added successfully
	 */
	public boolean verifyCategoryAdded(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			By categoryModule = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.CATEGORY_MODULE
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(0)).toString() + "']");
			By categoryName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.CATEGORY_NAME
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(1)).toString() + "']");
			By description = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DESCRIPTION
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(2)).toString() + "']");
			if (!verifyElement(categoryModule, false))
				return false;
			if (!verifyElement(categoryName, false))
				return false;
			if (!verifyElement(description, false))
				return false;
			return true;
		} else {
			return false;
		}

	}

	public void editCategory(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnEditBtn();
			sendTextInDescription(map.get(mapKeys.get(2)).toString());
			selectTextInStatus(map.get(mapKeys.get(3)).toString());
			clickOnSaveBtn();
		}
	}

	public boolean verifyCategoryEdited(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			By categoryModule = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.CATEGORY_MODULE
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(0)).toString() + "']");
			By categoryName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.CATEGORY_NAME
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(1)).toString() + "']");
			By description = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DESCRIPTION
					+ "']//following-sibling :: div[normalize-space(text()) = '"
					+ map.get(getMapKeys(map).get(2)).toString() + "']");
			if (!verifyElement(categoryModule, false))
				return false;
			if (!verifyElement(categoryName, false))
				return false;
			if (!verifyElement(description, false))
				return false;
			return true;
		} else {
			return false;
		}

	}

	public boolean deleteCategory(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			delete();
			return true;
		} else {
			String string = "Category already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyCategoryDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false);
	}
	/**
	 * @author kutbuddin.compounder
	 * to verify  edited Log?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 27/12/2018
	 * @return true if Category Verify Log SuccesFullly
	 */
	public boolean verifyCategoryEditLog(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(1)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	/**
	 * @author dishant.doshi to sort dkyc category
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 27/12/2018
	 */
	public boolean sortDKYCCategory(Map<Object, Object> map, List<Object> mapKeys) {
		navigation(map.get(getMapKeys(map).get(0)).toString());
		Map<String, List<String>> getBeforeSortTableData = getTableData(map.get(getMapKeys(map).get(3)).toString());
		clickOnSortBtn(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString());
		List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(1)).toString());
		List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
		sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(2)).toString());
		if (!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
			return false;
		Map<String, List<String>> getAfterSortTableData = getTableData(map.get(getMapKeys(map).get(3)).toString());
		if (!getBeforeSortTableData.equals(getAfterSortTableData))
			return false;
		return true;
	}
}
