package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentOnboardingWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class AgentOnboarding extends Common {
	HomeWeb homePage;
	AgentOnboardingWeb agentOnboardingWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For Agent - Onboarding - Add
	 * @creation date 15/11/2018
	 */
	@Test(dataProvider = "AgentOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddAgentOnboarding, Author: Shivani Patel")
	public void addOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentOnboardingWeb = homePage.clickOnAgentOnboarding();
			count++;
		}

		agentOnboardingWeb.addOnboarding(map, getMapKeys(map));
		verifyTrue(agentOnboardingWeb.verifyAddedOnboarding(map, getMapKeys(map)));

	}

	/**
	 * @author shivani.patel For Agent - Onboarding - Edit
	 * @creation date 19/11/2018
	 */
	@Test(dataProvider = "AgentOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAgentOnboarding, Author: Shivani Patel")
	public void editOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentOnboardingWeb = homePage.clickOnAgentOnboarding();
			count++;
		}

		agentOnboardingWeb.editOnboarding(map, getMapKeys(map));
		verifyTrue(agentOnboardingWeb.verifyEditedOnboarding(map, getMapKeys(map)));
	}

	/**
	 * @author shivani.patel For Agent - Onboarding - Delete
	 * @creation date 19/11/2018
	 */
	@Test(dataProvider = "AgentOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteOnboarding, Author: Shivani Patel")
	public void deleteOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentOnboardingWeb = homePage.clickOnAgentOnboarding();
			count++;
		}
		if(agentOnboardingWeb.deleteOnboarding(map, getMapKeys(map)))
			verifyFalse(agentOnboardingWeb.verifyOnboardingDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Agent OnBoarding - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "AgentOnBoarding_Log", dataProviderClass = TestDataImport.class, description = "Id: LogAgentOnBoarding, Author: kutbuddin.compounder")
	public void agentOnboardingLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentOnboardingWeb = homePage.clickOnAgentOnboarding();
			count++;
		}
			verifyTrue(agentOnboardingWeb.verifyAgentOnboardingLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - Onboarding - Sort
	 * @creation date 15/12/2018
	 */
	@Test(dataProvider = "AgentOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOnboarding, Author: Dishant Doshi")
	public void sortOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentOnboardingWeb = homePage.clickOnAgentOnboarding();
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
			verifyTrue(agentOnboardingWeb.sortOnboarding(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
