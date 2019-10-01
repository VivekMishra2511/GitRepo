package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.DefaultWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

/**
 * @author dishant.doshi
 * Default Data
 * @creation date 31/12/2018 
 */
public class Default extends Common{

	HomeWeb homePage;
	DefaultWeb defaultWeb;
	
	/**
	 * @author dishant.doshi
	 * For Default Data
	 * @creation date 31/12/2018
	 */
	@Test(description = "Id: AddDefault, Author: Dishant Doshi")
	public void defaultData() {
		homePage = goToHome();
		defaultWeb = homePage.clickOnSettingsUserManagementRoleForDefault();
		defaultWeb.addDefaultData();
	}
}
