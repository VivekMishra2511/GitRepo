package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentMatrixWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder
 * Agent-Matrix - Edit
 * @creation date 21/11/2018
 */
public class AgentMatrix extends Common{
	HomeWeb homePage;
	AgentMatrixWeb agentMatrixWeb;
	int count = 0;
	/**
	 * @author kutbuddin.compounder
	 * For Agent-Matrix - Edit
	 * @creation date 21/11/2018
	 */
	@Test(dataProvider = "AgentMatrix_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAgent Matrix, Author: kutbuddin.compounder")
	public void editAgentMatrix(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			agentMatrixWeb = homePage.clickOnAgentMatrix();
			count++;
		}
		agentMatrixWeb.editAgentMatrix(map, getMapKeys(map));
		verifyTrue(agentMatrixWeb.verifyAgentMatrixEdited(map, getMapKeys(map)));
		reloadCurrentPage();
	}
	
	/**
	 * @author dishant.doshi For Agent - Matrix - Sort
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "AgentMatrix_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortMatrix, Author: Dishant Doshi")
	public void sortMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentMatrixWeb = homePage.clickOnAgentMatrix();
			count++;
		}
		verifyTrue(agentMatrixWeb.sortMatrix(map, getMapKeys(map)));
	}
}
