package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentAssistantOnboardingWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi
 * Agent - AssistantOnboarding
 * @creation date 30/11/2018  
 */
public class AgentAssistantOnboarding extends Common{

	HomeWeb homePage;
	AgentAssistantOnboardingWeb agentAssistantOnboardingWeb;
	int count = 0;
	
	/**
	 * @author dishant.doshi
	 * For Agent - AssistantOnboarding - Add
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "AgentAssistantOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddAssistantOnboarding, Author: Dishant Doshi",groups= {"Add"},priority=0)
	public void addAssistantOnboarding(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentAssistantOnboardingWeb = homePage.clickOnAgentAssistantOnboarding();
			count++;
		}
		if(agentAssistantOnboardingWeb.addAssistantOnboarding(map, getMapKeys(map)))
			verifyTrue(agentAssistantOnboardingWeb.verifyAssistantOnboardingAdded(map, getMapKeys(map)));
		else
			verifyFalse(true);
	}
	
	/**
	 * @author dishant.doshi
	 * For Agent - AssistantOnboarding - Edit
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "AgentAssistantOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAssistantOnboarding, Author: Dishant Doshi",groups= {"Edit"},priority=1)
	public void editAssistantOnboarding(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentAssistantOnboardingWeb = homePage.clickOnAgentAssistantOnboarding();
			count++;
		}
		agentAssistantOnboardingWeb.editAssistantOnboarding(map, getMapKeys(map));
		verifyTrue(agentAssistantOnboardingWeb.verifyAssistantOnboardingEdited(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi
	 * For Agent - AssistantOnboarding - Delete
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "AgentAssistantOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteAssistantOnboarding, Author: Dishant Doshi",groups= {"Delete"},priority=2)
	public void deleteAssistantOnboarding(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentAssistantOnboardingWeb = homePage.clickOnAgentAssistantOnboarding();
			count++;
		}
		if(agentAssistantOnboardingWeb.deleteAssistantOnboarding(map, getMapKeys(map)))
			verifyFalse(agentAssistantOnboardingWeb.verifyAssistantOnboardingDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Agent AssitantOnBoarding - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "AgentAssitantOnBoarding_Log", dataProviderClass = TestDataImport.class, description = "Id: LogAgentAssitantOnBoarding, Author: kutbuddin.compounder")
	public void agentOnboardingLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentAssistantOnboardingWeb = homePage.clickOnAgentAssistantOnboarding();
			count++;
		}
		verifyTrue(agentAssistantOnboardingWeb.verifyAgentAssistantOnboardingLog(map, getMapKeys(map)));
	}
	/**
	 * @author dishant.doshi For Agent - AssistantOnboarding - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "AgentAssistantOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortAssistantOnboarding, Author: Dishant Doshi",groups={"Sort"},priority=3)
	public void sortAssistantOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentAssistantOnboardingWeb = homePage.clickOnAgentAssistantOnboarding();
			count++;
		}
		verifyTrue(agentAssistantOnboardingWeb.sortAssistantOnboarding(map, getMapKeys(map)));
	}
}
