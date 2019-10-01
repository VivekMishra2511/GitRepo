package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentProfileWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Agent - Profile
 * @creation date 12/11/2018
 */
public class AgentProfile extends Common {

	HomeWeb homePage;
	AgentProfileWeb agentProfileWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For Agent - Profile - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentProfile_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProfile, Author: Dishant Doshi")
	public void addProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentProfileWeb = homePage.clickOnAgentProfile();
			count++;
		}
		agentProfileWeb.addProfile(map, getMapKeys(map));
		verifyTrue(agentProfileWeb.verifyProfileAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - Profile - Edit
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentProfile_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProfile, Author: Dishant Doshi")
	public void editProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentProfileWeb = homePage.clickOnAgentProfile();
			count++;
		}
		agentProfileWeb.editProfile(map, getMapKeys(map));
		verifyTrue(agentProfileWeb.verifyProfileEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - Profile - Delete
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentProfile_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProfile, Author: Dishant Doshi")
	public void deleteProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentProfileWeb = homePage.clickOnAgentProfile();
			count++;
		}
		if (agentProfileWeb.deleteProfile(map, getMapKeys(map)))
			verifyFalse(agentProfileWeb.verifyProfileDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Agent - Profile - Edited Log
	 * @creation date 13/12/2018
	 */
	@Test(dataProvider = "AgentProfile_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedProfileLog, Author: Kutbuddin Compounder")
	public void editedLogProfile(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentProfileWeb = homePage.clickOnAgentProfile();
			count++;
		}
		verifyTrue(agentProfileWeb.verifyProfileEditLog(map, getMapKeys(map)));
	}
	

	/**
	 * @author dishant.doshi For Agent - Profile - Sort
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "AgentProfile_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProfile, Author: Dishant Doshi")
	public void sortProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentProfileWeb = homePage.clickOnAgentProfile();
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
			verifyTrue(agentProfileWeb.sortProfile(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
