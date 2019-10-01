package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class SettingsSystemPreferenceNonRegisterWalletThresholdWeb extends Common{
	By senderEdit = By.id("senderEdit");
	By receiverEdit = By.id("receiverEdit");
	By btnAddBusinessIDtype = By.xpath(".//*[normalize-space(text())='Add']");
	By drpstatus = By.id("SIsActive");
	By drpstatusReceiver = By.id("RIsActive");
	By txtDailyTransactionCount = By.xpath("(.//input[contains(@id,'DailyTrnCount')])[last()]");
	By txtDailyTransactionAmount = By.xpath("(.//input[contains(@id,'DailyTrnAmount')])[last()]");
	By txtWeeklyTransactionCount = By.xpath("(.//input[contains(@id,'WeeklyTrnCount')])[last()]");
	By txtWeeklyTransactionAmount = By.xpath("(.//input[contains(@id,'WeeklyTrnAmount')])[last()]");
	By txtMonthlyTransactionCount = By.xpath("(.//input[contains(@id,'MonthlyTrnCount')])[last()]");
	By txtMonthlyTransactionAmount = By.xpath("(.//input[contains(@id,'MonthlyTrnAmount')])[last()]");


	/**
	 * @author shivani.patel
	 * @param driver constructor
	 * @creation date 22/10/2018
	 */
	public SettingsSystemPreferenceNonRegisterWalletThresholdWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel
	 * select BusinessIDType In DropDownBox
	 * @param BusinessIDType
	 * @creation date 22/10/2018
	 */
	public void selectWalletType(By element,String BusinessIDType){
		selectFromDropdown(element, BusinessIDType);
	}
	/**
	 * @author shivani.patel
	 * ClickOn AddBusinessIDType Button
	 * @param BusinessIDType
	 * @creation date 22/10/2018
	 */
	public void clickOnAddBusinessIDType(){
		clickOnElement(btnAddBusinessIDtype);
	}
	/**
	 * @author shivani.patel
	 * select Status In DropDownBox
	 * @param Status
	 * @creation date 22/10/2018
	 */
	public void selectStatus(By element,String Status){
		selectFromDropdown(element, Status);
	}

	/**
	 * @author shivani.patel
	 * select Status In DropDownBox
	 * @param Status
	 * @creation date 22/10/2018
	 */
	public void selectStatusReceiver(String Status){
		selectFromDropdown(drpstatusReceiver, Status);
	}
	/**
	 * @author shivani.patel
	 * send DailyTransactionCount Text In DropDownBox
	 * @param DailyTransactionCount
	 * @creation date 22/10/2018
	 */
	public void sendTextInDailyTransactionCount(By element,String DailyTransactionCount){
		clearAndSendTextInTextBox(element, DailyTransactionCount);
	}
	/**
	 * @author shivani.patel
	 * send DailyTransactionAmount Text In DropDownBox
	 * @param DailyTransactionAmount
	 * @creation date 22/10/2018
	 */
	public void sendTextInDailyTransactionAmount(By element,String DailyTransactionAmount){
		clearAndSendTextInTextBox(element, DailyTransactionAmount);
	}
	/**
	 * @author shivani.patel
	 * send WeeklyTransactionCount Text In DropDownBox
	 * @param WeeklyTransactionCount
	 * @creation date 22/10/2018
	 */
	public void sendTextInWeeklyTransactionCount(By element,String WeeklyTransactionCount){
		clearAndSendTextInTextBox(element, WeeklyTransactionCount);
	}
	/**
	 * @author shivani.patel
	 * send WeeklyTransactionAmount Text In DropDownBox
	 * @param WeeklyTransactionAmount
	 * @creation date 22/10/2018
	 */
	public void sendTextInWeeklyTransactionAmount(By element,String WeeklyTransactionAmount){
		clearAndSendTextInTextBox(element, WeeklyTransactionAmount);
	}
	/**
	 * @author shivani.patel
	 * send MonthlyTransactionCount Text In DropDownBox
	 * @param MonthlyTransactionCount
	 * @creation date 22/10/2018
	 */
	public void sendTextInMonthlyTransactionCount(By element,String MonthlyTransactionCount){
		clearAndSendTextInTextBox(element, MonthlyTransactionCount);
	}
	/**
	 * @author shivani.patel
	 * send MonthlyTransactionAmount Text In DropDownBox
	 * @param MonthlyTransactionAmount
	 * @creation date 22/10/2018
	 */
	public void sendTextInMonthlyTransactionAmount(By element,String MonthlyTransactionAmount){
		clearAndSendTextInTextBox(element, MonthlyTransactionAmount);
	}
	/**
	 * @author shivani.patel
	 * click On SenderEdit
	 * @creation date 22/10/2018
	 */
	public void clickOnEdit(By element){
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel
	 * click On SenderSave
	 * @creation date 22/10/2018
	 */
	public void clickOnSave(By element){
		clickOnElement(element);
	}
	/**
	 * @author shivani.patel
	 * to edit NonRegisterWalletThreshold
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 22/10/2018
	 */
	public void editNonRegisterWalletThresholdSenderAndReceiver(Map<Object, Object> map, List<Object> keys) {
		String[] info=map.get(keys.get(0)).toString().trim().split("/");
		String[] businessType=map.get(keys.get(1)).toString().trim().split("/");
		String[] statusList=map.get(keys.get(2)).toString().trim().split("/");
		String[] dailyCount=map.get(keys.get(3)).toString().split("/");
		String[] dailyAmount=map.get(keys.get(4)).toString().split("/");
		String[] weeklyCount=map.get(keys.get(5)).toString().split("/");
		String[] weeklyAmount=map.get(keys.get(6)).toString().split("/");
		String[] monthlyCount=map.get(keys.get(7)).toString().split("/");
		String[] monthlyAmount=map.get(keys.get(8)).toString().split("/");
		for(int i=0;i<info.length;i++){
			String[] type = businessType[i].trim().split(";");
			clickOnEdit(By.xpath("(//li[contains(@id,'"+info[i].toLowerCase().trim()+"')]//i)[1]"));
			String[] status = statusList[i].trim().split(";");
			selectStatus(By.xpath("//*[contains(@id,'"+info[i].toLowerCase().trim()+"')]//select[contains(@id,'IsActive')]"),status[0].trim());

			String[] dailyCountValue= dailyCount[i].split(";");
			String[] dailyAmountValue = dailyAmount[i].split(";");
			String[] weeklyCountValue = weeklyCount[i].split(";");
			String[] weeklyAmountValue = weeklyAmount[i].split(";");
			String[] monthlyCountValue = monthlyCount[i].split(";");
			String[] monthlyAmountValue = monthlyAmount[i].split(";");

			///////// values to be set for default field ///////////////////

			sendTextInDailyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'DailyTrnCount')]"),dailyCountValue[0].trim());
			sendTextInDailyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'DailyTrnAmount')]"),dailyAmountValue[0].trim());
			sendTextInWeeklyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'WeeklyTrnCount')]"),weeklyCountValue[0].trim());
			sendTextInWeeklyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'WeeklyTrnAmount')]"),weeklyAmountValue[0].trim());
			sendTextInMonthlyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'MonthlyTrnCount')]"),monthlyCountValue[0].trim());
			sendTextInMonthlyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'MonthlyTrnAmount')]"),monthlyAmountValue[0].trim());

			for(int j=0;j<type.length;j++){
				selectWalletType(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//select[contains(@id,'IDProofTypeID')]"),type[j].trim());
				clickOnAddBusinessIDType();
				selectStatus(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//select[contains(@id,'IsActive')]"),status[j+1].trim());

				sendTextInDailyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'DailyTrnCount')]"),dailyCountValue[j+1].trim());
				sendTextInDailyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'DailyTrnAmount')]"),dailyAmountValue[j+1].trim());
				sendTextInWeeklyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'WeeklyTrnCount')]"),weeklyCountValue[j+1].trim());
				sendTextInWeeklyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'WeeklyTrnAmount')]"),weeklyAmountValue[j+1].trim());
				sendTextInMonthlyTransactionCount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'MonthlyTrnCount')]"),monthlyCountValue[j+1].trim());
				sendTextInMonthlyTransactionAmount(By.xpath("//*[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//input[contains(@id,'MonthlyTrnAmount')]"),monthlyAmountValue[j+1].trim());

			}
			clickOnSave(By.xpath("(//li[contains(@id,'"+info[i].toLowerCase().trim()+"')]//i)[2]"));
			if(verifyToolTip()){
			verifyFalse(true);
		}
		}
}


	/**
	 * @author shivani.patel
	 * to verify EditNonRegisterWalletThreshold
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 24/10/2018
	 */
	public boolean verifyeditNonRegisterWalletThresholdSenderAndReceiver(Map<Object, Object> map, List<Object> keys){ 
		
		String[] dailyCount=map.get(keys.get(3)).toString().split("/");
		String[] dailyAmount=map.get(keys.get(4)).toString().split("/");
		String[] weeklyCount=map.get(keys.get(5)).toString().split("/");
		String[] weeklyAmount=map.get(keys.get(6)).toString().split("/");
		String[] monthlyCount=map.get(keys.get(7)).toString().split("/");
		String[] monthlyAmount=map.get(keys.get(8)).toString().split("/");
		String[] info=map.get(keys.get(0)).toString().trim().split("/");
		String[] businessType=map.get(keys.get(1)).toString().trim().split("/");
		for(int i=0;i<info.length;i++){
			String[] type = businessType[i].trim().split(";");
			
			String[] dailyCountValue= dailyCount[i].split(";");
			String[] dailyAmountValue = dailyAmount[i].split(";");
			String[] weeklyCountValue = weeklyCount[i].split(";");
			String[] weeklyAmountValue = weeklyAmount[i].split(";");
			String[] monthlyCountValue = monthlyCount[i].split(";");
			String[] monthlyAmountValue = monthlyAmount[i].split(";");
			
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Daily']/..//following-sibling::td//*[normalize-space(text())='"+dailyCountValue[0].trim()+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Daily']/..//following-sibling::td//*[normalize-space(text())='"+dailyAmountValue[0].trim()+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Weekly']/..//following-sibling::td//*[normalize-space(text())='"+weeklyCountValue[0].trim()+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Weekly']/..//following-sibling::td//*[normalize-space(text())='"+weeklyAmountValue[0].trim()+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Monthly']/..//following-sibling::td//*[normalize-space(text())='"+monthlyCountValue[0].trim()+"']"), false))
				return false;
			if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Monthly']/..//following-sibling::td//*[normalize-space(text())='"+monthlyAmountValue[0].trim()+"']"), false))
				return false;
			
			for(int j=0;j<type.length;j++){
				clickOnElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[@role='tablist']//a[normalize-space(text()) = '"+type[j]+"']"));
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Daily']/..//following-sibling::td//*[normalize-space(text())='"+dailyCountValue[j+1].trim()+"']"), false))
					return false;
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Daily']/..//following-sibling::td//*[normalize-space(text())='"+dailyAmountValue[j+1].trim()+"']"), false))
					return false;
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Weekly']/..//following-sibling::td//*[normalize-space(text())='"+weeklyCountValue[j+1].trim()+"']"), false))
					return false;
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Weekly']/..//following-sibling::td//*[normalize-space(text())='"+weeklyAmountValue[j+1].trim()+"']"), false))
					return false;
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Monthly']/..//following-sibling::td//*[normalize-space(text())='"+monthlyCountValue[j+1].trim()+"']"), false))
					return false;
				if(!verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[contains(@class,'service-pane active')]//*[normalize-space(text())='Monthly']/..//following-sibling::td//*[normalize-space(text())='"+monthlyAmountValue[j+1].trim()+"']"), false))
					return false;
			}
		}
		return true;
		}

	/**
	 * @author shivani.patel
	 * DeleteNonRegisterWalletThreshold
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 25/10/2018
	 */
	public void deleteNonRegisterWalletThresholdSenderAndReceiver(Map<Object, Object> map, List<Object> keys) {
		String[] info=map.get(keys.get(0)).toString().trim().split("/");
		String[] businessType=map.get(keys.get(1)).toString().trim().split("/");
		for(int i=0;i<info.length;i++){
			String[] type = businessType[i].split(";");
			clickOnEdit(By.xpath("(//li[contains(@id,'"+info[i].toLowerCase().trim()+"')]//i)[1]"));
		for(int j=0;j<type.length;j++){
			clickOnElement(By.xpath(".//*[@role='tablist']//a[normalize-space(text()) = '"+type[j].trim()+"']//..//span"));
			}
			clickOnSave(By.xpath("(//li[contains(@id,'"+info[i].toLowerCase().trim()+"')]//i)[2]"));
		}	
	}

	/**
	 * @author shivani.patel
	 * to verify DeleteNonRegisterWalletThreshold
	 * @param map - excel values use for get value
	 * @param keys - excel header use for to identify value
	 * @creation date 25/10/2018
	 */
	public boolean verifyDeleteNonRegisterWalletThresholdSenderAndReceiver(Map<Object, Object> map, List<Object> keys) {
		String[] info=map.get(keys.get(0)).toString().trim().split("/");
		String[] businessType=map.get(keys.get(1)).toString().trim().split("/");
		for(int i=0;i<info.length;i++){
			String[] type = businessType[i].split(";");
		for(int j=0;j<type.length;j++){
			if(verifyElement(By.xpath("//div[contains(@id,'"+info[i].trim()+"')]//*[@role='tablist']//a[normalize-space(text()) = '"+type[j].trim()+"']"))){
				return false;
			}
		}
		}
		return true;
	}

}
