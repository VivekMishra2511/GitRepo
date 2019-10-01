package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentBranchViewWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi
 * Agent - BranchView
 * @creation date 23/11/2018  
 */
public class AgentBranchView extends Common{

	HomeWeb homePage;
	AgentBranchViewWeb agentBranchViewWeb;
	int count = 0;
	
	/**
	 * @author dishant.doshi
	 * For Agent - BranchView - Add
	 * @creation date 23/11/2018
	 */
	@Test(dataProvider = "AgentBranchView_Add", dataProviderClass = TestDataImport.class, description = "Id: AddBranchView, Author: Dishant Doshi")
	public void addBranchView(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentBranchViewWeb = homePage.clickOnAgentBranchView();
			count++;
		}
		if(agentBranchViewWeb.addBranchView(map, getMapKeys(map)))
			verifyTrue(agentBranchViewWeb.verifyBranchViewAdded(map, getMapKeys(map)));
		else
			verifyFalse(true);
	}
	
	/**
	 * @author dishant.doshi
	 * For Agent - BranchView - Edit
	 * @creation date 23/11/2018
	 */
	@Test(dataProvider = "AgentBranchView_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditBranchView, Author: Dishant Doshi")
	public void editBranchView(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentBranchViewWeb = homePage.clickOnAgentBranchView();
			count++;
		}
		agentBranchViewWeb.editBranchView(map, getMapKeys(map));
		verifyTrue(agentBranchViewWeb.verifyBranchViewEdited(map, getMapKeys(map)));
	}
}
