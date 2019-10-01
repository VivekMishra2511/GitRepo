package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SupportCustomerWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SupportCustomer extends Common{
	HomeWeb homePage;
	SupportCustomerWeb supportCustomerWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For support - Customer - CustomerDetail
	 * @creation date 29/05/2019
	 */
	@Test(dataProvider = "SuppportCustomerDetail", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerDetail, Author: Shivani Patel")
	public void customerDetail(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.customerDetail(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyCustomerDetail(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel For support - Customer - CustomerDetail
	 * @creation date 30/05/2019
	 */
	@Test(dataProvider = "SuppportCustomerEKYCUpdate", dataProviderClass = TestDataImport.class, description = "Id: SuppportCustomereKYCUpdate, Author: Shivani Patel")
	public void eKYCUpdate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.eKYCUpdate(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyEKYCUpdate(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel For support - Customer - ProfileUpgrade
	 * @creation date 30/05/2019
	 */
	@Test(dataProvider = "SuppportCustomerProfileUpgrade", dataProviderClass = TestDataImport.class, description = "Id: SuppportCustomereProfileUpgrade, Author: Shivani Patel")
	public void profileUpgrade(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.profileUpgrade(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyEKYCUpdate(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel For support - Customer - AccountBlock/Unblock
	 * @creation date 31/05/2019
	 */
	@Test(dataProvider = "SupportCustomerAccountBlockOrUnblock", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerAccountBlockOrUnblock, Author: Shivani Patel")
	public void accountBlockOrUnblock(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.accountBlockOrUnblock(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyAccountBlockOrUnblock(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - TerminateAccount
	 * @creation date 03/06/2019
	 */
	@Test(dataProvider = "SupportCustomerTerminateAccount", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerTerminateAccount, Author: Shivani Patel")
	public void terminateAccount(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.terminateAccount(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyTerminateAccount(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - loginPinReset
	 * @creation date 03/06/2019
	 */
	@Test(dataProvider = "SupportCustomerLoginPinReset", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerLoginPinReset, Author: Shivani Patel")
	public void loginPinReset(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.loginPinReset(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyLoginPinReset(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - statementOfAccount
	 * @creation date 03/06/2019
	 */
	@Test(dataProvider = "SupportCustomerStatementOfAccount", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerStatementOfAccount, Author: Shivani Patel")
	public void statementOfAccount(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.statementOfAccount(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyStatementOfAccount(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - phoneNumberEdit
	 * @creation date 05/06/2019
	 */
	@Test(dataProvider = "SupportCustomerPhoneNumberEdit", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerPhoneNumberEdit, Author: Shivani Patel")
	public void phoneNumberEdit(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.phoneNumberEdit(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyPhoneNumberEdit(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - resetSecurityQuestion
	 * @creation date 05/06/2019
	 */
	@Test(dataProvider = "SupportCustomerResetSecurityQuestion", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerResetSecurityQuestion, Author: Shivani Patel")
	public void resetSecurityQuestion(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.resetSecurityQuestion(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyResetSecurityQuestion(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - manageNominee
	 * @creation date 05/06/2019
	 */
	@Test(dataProvider = "SupportCustomerManageNominee", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerManageNominee, Author: Shivani Patel")
	public void manageNominee(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.manageNominee(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyManageNominee(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - deleteSubWallet
	 * @creation date 12/06/2019
	 */
	@Test(dataProvider = "SupportCustomerDeleteSubWallet", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerDeleteSubWallet, Author: Shivani Patel")
	public void deleteSubWallet(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.deleteSubWallet(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyDeleteSubWallet(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - forcePocketUnlock
	 * @creation date 12/06/2019
	 */
	@Test(dataProvider = "SupportCustomerForcePocketUnlock", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerForcePocketUnlock, Author: Shivani Patel")
	public void forcePocketUnlock(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.forcePocketUnlock(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyForcePocketUnlock(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - stopSchedulePayments
	 * @creation date 06/06/2019
	 */
	@Test(dataProvider = "SupportCustomerStopSchedulePayments", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerStopSchedulePayments, Author: Shivani Patel")
	public void stopSchedulePayments(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.stopSchedulePayments(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyStopSchedulePayments(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - transactionReversal
	 * @creation date 13/06/2019
	 */
	@Test(dataProvider = "SupportCustomerTransactionReversal", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerTransactionReversal, Author: Shivani Patel")
	public void transactionReversal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.transactionReversal(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyTransactionReversal(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - becomeAgent
	 * @creation date 13/06/2019
	 */
	@Test(dataProvider = "SupportCustomerBecomeAgent", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerBecomeAgent, Author: Shivani Patel")
	public void becomeAgent(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.becomeAgent(map, getMapKeys(map));
		verifyTrue(supportCustomerWeb.verifyBecomeAgent(map, getMapKeys(map)));
		clickOnClose();
	}
	/**
	 * @author shivani.patel For support - Customer - ResendNotification
	 * @creation date 13/06/2019
	 */
	@Test(dataProvider = "SupportCustomerResendNotification", dataProviderClass = TestDataImport.class, description = "Id: SupportCustomerResendNotification, Author: Shivani Patel")
	public void resendNotification(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			supportCustomerWeb = homePage.clickOnSupport();
			count++;
		}
		supportCustomerWeb.resendNotification(map, getMapKeys(map));
		clickOnClose();
	}
}
