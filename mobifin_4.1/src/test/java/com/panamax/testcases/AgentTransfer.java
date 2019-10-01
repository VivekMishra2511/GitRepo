package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentTransferWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi
 * Agent - AgentTransfer
 * @creation date 26/11/2018  
 */
public class AgentTransfer extends Common{

	HomeWeb homePage;
	AgentTransferWeb agentTransferWeb;
	int count = 0;
	
	/**
	 * @author dishant.doshi
	 * For Agent - AgentTransfer
	 * @creation date 26/11/2018
	 */
	@Test(dataProvider = "AgentTransfer", dataProviderClass = TestDataImport.class, description = "Id: AgentTransfer, Author: Dishant Doshi")
	public void agentTransferRequest(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentTransferWeb = homePage.clickOnAgentNodeTransfer();
			count++;
		}
		agentTransferWeb.agentTransfer(map, getMapKeys(map));
		verifyTrue(agentTransferWeb.verifyAgentTransferd(map, getMapKeys(map)));
	}
}
