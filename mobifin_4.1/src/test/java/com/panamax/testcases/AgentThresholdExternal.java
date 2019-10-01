package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.AgentThresholdExternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - External Products -
 *         AgentThresholdExternal
 * @creation date 12/11/2018
 */
public class AgentThresholdExternal extends Common {
	HomeWeb homePage;
	AgentThresholdExternalWeb agentThresholdExternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Agent External Threshold - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentExternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddAgentThresholdExternal, Author: kutbuddin.compounder")
	public void addAgentThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdExternalWeb = homePage.clickOnAgentThresholdExternal();
			count++;
		}
		agentThresholdExternalWeb.addAgentThresholdExternal(map, getMapKeys(map));
		verifyTrue(agentThresholdExternalWeb.verifyAgentThresholdExternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent External Threshold - Edit
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentExternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAgentThresholdExternal, Author: kutbuddin.compounder")
	public void editAgentThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdExternalWeb = homePage.clickOnAgentThresholdExternal();
			count++;
		}
		agentThresholdExternalWeb.editAgentThresholdExternal(map, getMapKeys(map));
		verifyTrue(agentThresholdExternalWeb.verifyAgentThresholdExternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent External Threshold - Delete
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "AgentExternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteAgentThresholdExternal, Author: kutbuddin.compounder")
	public void deleteAgentThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdExternalWeb = homePage.clickOnAgentThresholdExternal();
			count++;
		}
		if (agentThresholdExternalWeb.deleteAgentThresholdExternal(map, getMapKeys(map)))
			verifyFalse(agentThresholdExternalWeb.verifyAgentExternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Agent External Threshold - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "AgentExternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogAgentThresholdExternal, Author: kutbuddin.compounder")
	public void agentExternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdExternalWeb = homePage.clickOnAgentThresholdExternal();
			count++;
		}
		verifyTrue(agentThresholdExternalWeb.verifyAgentExternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Agent - ExternalThreshold - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "AgentExternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortExternalThreshold, Author: dishant.doshi")
	public void sortExternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			agentThresholdExternalWeb = homePage.clickOnAgentThresholdExternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(agentThresholdExternalWeb.sortExternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
