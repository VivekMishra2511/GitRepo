package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsToolsImageUploaderWeb extends Common{
	By txtName = By.id("ImageName");
	By drpImageType = By.id("ImageType");
	By txtNameInSearch = By.id("txtImageName");
	By txtImage128 = By.id("Image_128_128");
	By txtImage64 = By.id("Image_64_64");
	By txtImage32 = By.id("Image_32_32");
	By txtImage16 = By.id("Image_16_16");
	
	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 26/10/2018
	 */
	public SettingsToolsImageUploaderWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * send text in Name field
	 * @param Name
	 * @creation date 26/10/2018
	 */
	public void sendTextInName(String Name){
		sendTextInTextBox(txtName, Name);
	}
	
	/**
	 * @author shivani.patel
	 * send text in Name field
	 * @param Name
	 * @creation date 26/10/2018
	 */
	public void sendTextInNameInFilterSearch(String Name){
		sendTextInTextBox(txtNameInSearch, Name);
	}
	
	/**
	 * @author shivani.patel
	 * select ImageType  in Dropdown
	 * @param ImageType
	 * @creation date 26/10/2018
	 */
	public void selectImageType(String ImageType){
		selectFromDropdown(drpImageType, ImageType);
	}
	
	/**
	 * @author shivani.patel
	 * send text in image128 field
	 * @param image1
	 * @creation date 26/10/2018
	 */
	public void sendTextImage128(String image1){
		sendTextInTextBox(txtImage128,resources_folder_path+image1);
	}
	
	/**
	 * @author shivani.patel
	 * send text in image64 field
	 * @param image64
	 * @creation date 26/10/2018
	 */
	public void sendTextImage64(String image64){
		sendTextInTextBox(txtImage64, resources_folder_path+image64);
	}
	
	/**
	 * @author shivani.patel
	 * send text in image32 field
	 * @param image32
	 * @creation date 26/10/2018
	 */
	public void sendTextImage32(String image32){
		sendTextInTextBox(txtImage32,resources_folder_path+image32);
	}
	
	/**
	 * @author shivani.patel
	 * send text in image16 field
	 * @param image16
	 * @creation date 26/10/2018
	 */
	public void sendTextImage16(String image16){
		sendTextInTextBox(txtImage16,resources_folder_path+image16);
	}
	/**
	 * @author shivani.patel
	 * use for send value in filter search fields
	 * @param Name
	 * @creation date 26/10/2018
	 */
	public void filterSearch(String Name){
		commonFilterSearch();
		sendTextInNameInFilterSearch(Name);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author shivani.patel
	 * to add ImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 26/10/2018
	 */
	public void addImageUploader(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInName(map.get(keys.get(0)).toString());
		selectImageType(map.get(keys.get(1)).toString());
		sendTextImage128(map.get(keys.get(2)).toString());
		sendTextImage64(map.get(keys.get(3)).toString());
		sendTextImage32(map.get(keys.get(4)).toString());
		sendTextImage16(map.get(keys.get(5)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel
	 * to verify AddImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 27/10/2018
	 * @return true if Imageuploader add successfully Verified
	 */
	public boolean verifyaddImageUploader(Map<Object, Object> map, List<Object> keys) {
		By Name = By.xpath("//label[normalize-space(text())='Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(0)).toString()+"']");
		By ImageType = By.xpath("//label[normalize-space(text())='Image Type']//following-sibling :: div[normalize-space(text()) = '"+map.get(keys.get(1)).toString().toLowerCase()+"']");
		By image128 = By.xpath("//label[normalize-space(text()) = 'Image 128 x 128']//parent :: div//following-sibling :: img[contains(@src,'128x128')]");
		By image64 = By.xpath("//label[normalize-space(text()) = 'Image 64 x 64']//parent :: div//following-sibling :: img[contains(@src,'64x64')]");
		By image32 = By.xpath("//label[normalize-space(text()) = 'Image 32 x 32']//parent :: div//following-sibling :: img[contains(@src,'32x32')]");
		By image16 = By.xpath("//label[normalize-space(text()) = 'Image 16 x 16']//parent :: div//following-sibling :: img[contains(@src,'16x16')]");

		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		pagination(500);
		clickOnInfoBtn(map.get(keys.get(0)).toString());
		if(!verifyElement(Name, false))
			return false;
		if(!verifyElement(ImageType, false))
			return false;
		if(!verifyElement(image128, false))
			return false;
		if(!verifyElement(image64, false))
			return false;
		if(!verifyElement(image32, false))
			return false;
		if(!verifyElement(image16, false))
			return false;
		return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author shivani.patel
	 * to edit ImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 27/10/2018
	 */
	public void editImageUploader(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(keys.get(0)).toString());
		clickOnEditBtn();
		sendTextImage128(map.get(keys.get(1)).toString());
		sendTextImage64(map.get(keys.get(2)).toString());
		sendTextImage32(map.get(keys.get(3)).toString());
		sendTextImage16(map.get(keys.get(4)).toString());
		clickOnSaveBtn();
		}else{
		verifyFalse(true);}
	}
	
	/**
	 * @author shivani.patel
	 * to verify EditImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 27/10/2018
	 * @return true if Imageuploader edit successfully Verified
	 */
	public boolean verifyeditImageUploader(Map<Object, Object> map, List<Object> keys) {
		By image128 = By.xpath("//label[normalize-space(text()) = 'Image 128 x 128']//parent :: div//following-sibling :: img[contains(@src,'128x128')]");
		By image64 = By.xpath("//label[normalize-space(text()) = 'Image 64 x 64']//parent :: div//following-sibling :: img[contains(@src,'64x64')]");
		By image32 = By.xpath("//label[normalize-space(text()) = 'Image 32 x 32']//parent :: div//following-sibling :: img[contains(@src,'32x32')]");
		By image16 = By.xpath("//label[normalize-space(text()) = 'Image 16 x 16']//parent :: div//following-sibling :: img[contains(@src,'16x16')]");

		filterSearch(map.get(keys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
		clickOnInfoBtn(map.get(keys.get(0)).toString());
		if(!verifyElement(image128, false))
			return false;
		if(!verifyElement(image64, false))
			return false;
		if(!verifyElement(image32, false))
			return false;
		if(!verifyElement(image16, false))
			return false;
		return true;
		}else{
		return false;}
	}
	/**
	 * @author shivani.patel
	 * to delete ImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 27/10/2018
	 */
	public boolean deleteImageUploader(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "Image Uploader already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return false;
	}
	/**
	 * @author shivani.patel
	 * to verify delete ImageUploader
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 27/10/2018
	 * @return true if Imageuploader delete successfully Verified
	 */
	public boolean verifyDeleteImageUploader(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(getMapKeys(map).get(0)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	
	/**
	 * @author dishant.doshi to sort imageUploader
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortImageUploader(Map<Object, Object> map, List<Object> mapKeys) {
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
