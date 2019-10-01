package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentTreeWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class AgentTree extends Common {

	HomeWeb homePage;
	AgentTreeWeb agentTreeWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For Agent - Tree - Add
	 * @creation date 03/10/2018
	 */
	@Test(dataProvider = "AgentTree_Add", dataProviderClass = TestDataImport.class, description = "Id: AddTree, Author: Shivani Patel")
	public void addTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentTreeWeb = homePage.clickOnAgentTree();
			count++;
		}

		agentTreeWeb.addTree(map, getMapKeys(map));
		verifyTrue(agentTreeWeb.verifyTreeAdded(map, getMapKeys(map)));

	}

	/**
	 * @author shivani.patel For Agent - Tree - Edit
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "AgentTree_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditTree, Author: shivani patel")
	public void editTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentTreeWeb = homePage.clickOnAgentTree();
			count++;
		}
		agentTreeWeb.editTree(map, getMapKeys(map));
		verifyTrue(agentTreeWeb.verifyTreeEdited(map, getMapKeys(map)));
	}

	/**
	 * @author shivani.patel For Agent - Tree - Delete
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "AgentTree_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteTree, Author: Shivani Patel")
	public void deleteTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentTreeWeb = homePage.clickOnAgentTree();
			count++;
		}
		if (agentTreeWeb.deleteTree(map, getMapKeys(map)))
			verifyFalse(agentTreeWeb.verifyTreeDelete(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - Tree - Sort
	 * @creation date 13/12/2018
	 */
	@Test(dataProvider = "AgentTree_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortTree, Author: Dishant Doshi")
	public void sortTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentTreeWeb = homePage.clickOnAgentTree();
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
			verifyTrue(agentTreeWeb.sortTree(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}

	/**
	 * @author kutbuddin.compounder For Agent - Tree - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "AgentTree_Log", dataProviderClass = TestDataImport.class, description = "Id: LogTree, Author: kutbuddin compoundr")
	public void agentTreeLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentTreeWeb = homePage.clickOnAgentTree();
			count++;
		}
		verifyTrue(agentTreeWeb.verifyAgentTreeLog(map, getMapKeys(map)));
	}
}
