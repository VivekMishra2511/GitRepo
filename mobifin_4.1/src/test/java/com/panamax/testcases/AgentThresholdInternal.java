package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentThresholdInternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder For Agent Internal Threshold
 * @creation date 12/11/2018
 */
public class AgentThresholdInternal extends Common {
	HomeWeb homePage;
	AgentThresholdInternalWeb agentThresholdInternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Agent Internal Threshold - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentInternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddAgentThresholdInternal, Author: kutbuddin.compounder")
	public void addAgentThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdInternalWeb = homePage.clickOnAgentThresholdInternal();
			count++;
		}
		agentThresholdInternalWeb.addAgentThresholdInternal(map, getMapKeys(map));
		verifyTrue(agentThresholdInternalWeb.verifyAgentThresholdInternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent Internal Threshold - Edit
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentInternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAgentThresholdInternal, Author: kutbuddin.compounder")
	public void editAgentThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdInternalWeb = homePage.clickOnAgentThresholdInternal();
			count++;
		}

		agentThresholdInternalWeb.editAgentThresholdInternal(map, getMapKeys(map));
		verifyTrue(agentThresholdInternalWeb.verifyAgentThresholdInternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent Internal Threshold - Delete
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentInternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteAgentThresholdInternal, Author: kutbuddin.compounder")
	public void deleteAgentThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdInternalWeb = homePage.clickOnAgentThresholdInternal();
			count++;
		}
		if (agentThresholdInternalWeb.deleteAgentThresholdInternal(map, getMapKeys(map)))
			verifyFalse(agentThresholdInternalWeb.verifyAgentInternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent Internal Threshold - Log
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "AgentInternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogAgentThresholdInternal, Author: kutbuddin.compounder")
	public void agentInternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdInternalWeb = homePage.clickOnAgentThresholdInternal();
			count++;
		}
		verifyTrue(agentThresholdInternalWeb.verifyAgentInternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - InternalThreshold - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "AgentInternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortInternalThreshold, Author: dishant.doshi")
	public void sortInternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdInternalWeb = homePage.clickOnAgentThresholdInternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(agentThresholdInternalWeb.sortInternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
