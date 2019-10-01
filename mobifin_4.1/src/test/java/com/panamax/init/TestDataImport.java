package com.panamax.init;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * @author dishant.doshi data provider class file read data from excel
 * @creation date 01/10/2018
 */
public class TestDataImport extends SetupInit {
	/*private static final String SETTINGS_FILE_PATH = test_data_folder_path + "Settings_BusinessData.xls";
	private static final String REPORT_FILE_PATH = test_data_folder_path + "Report.xls";
	private static final String PRODUCT_FILE_PATH = test_data_folder_path + "Product_BusinessData.xls";
	private static final String TRUSTACCOUNT_FILE_PATH = test_data_folder_path + "TrustAccount_BusinessData.xls";
	private static final String AGENT_FILE_PATH = test_data_folder_path + "Agent_BusinessData.xls";
	private static final String MERCHANT_FILE_PATH = test_data_folder_path + "Merchant.xls";
	private static final String ENTERPRISE_FILE_PATH = test_data_folder_path + "Enterprise.xls";
	private static final String CUSTOMER_FILE_PATH = test_data_folder_path + "Customer_BusinessData.xls";*/

	private static final String SETTINGS_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String REPORT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String PRODUCT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String TRUSTACCOUNT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String AGENT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String MERCHANT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String ENTERPRISE_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String CUSTOMER_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";
	private static final String SUPPORT_FILE_PATH = test_data_folder_path + "Mobifin_4.1.0_BusinessAndCRUDData.xls";

	/**
	 * @author dishant.doshi
	 * @param filepath-
	 *            excel file path
	 * @param sheetname-
	 *            excel sheet name
	 * @return excel data
	 * @creation date 01/10/2018
	 */
	public static Object[][] readExcelFileTo2D(String filepath, String sheetname) {
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(filepath));
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetname);
		int lastRowNum = sheet.getRows();
		Object[][] object = new Object[lastRowNum - 1][1];
		for (int i = 1; i<lastRowNum; i++) {
			Map<Object, Object> map = new LinkedHashMap<Object, Object>();
			for (int j = 0; j < sheet.getColumns(); j++) {
				map.put(removeExtraSpaces(sheet.getCell(j, 0).getContents().toString().trim().replaceAll("  ", " ")),
						removeExtraSpaces(sheet.getCell(j, i).getContents().toString().trim().replaceAll("  ", " ")));
			}
			object[i - 1][0] = map;
		}
		return object;
	}

	/**
	 * @author dishant.doshi
	 * to remove extra spaces in string
	 * @param string
	 * @return string with one space
	 * @creation date 28/12/2018
	 */
	public static String removeExtraSpaces(String string){
		return string.replaceAll("\\s+", " ");
	}

	public static int findRow(String fileName, String sheetName, String cellContent) {
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(fileName));
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetName);
		int rows = sheet.getRows();
		for (int i = 1; i < rows; i++) {
			Cell cell = sheet.getCell(0, i);
			if (cell.getContents().toString().equals(cellContent)) {
				return i;
			}
		}
		return 0;
	}

	public static Map<Object, Object> readExcelFileTo2D(String fileName, String sheetName, int rowNumber) {
		File inputWorkbook = new File(fileName);
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(inputWorkbook);
		} catch (BiffException | IOException e) {
			e.printStackTrace();
		}
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		Sheet sheet = workbook.getSheet(sheetName);
		int columns = sheet.getColumns();
		for (int j = 0; j < columns; j++) {
			map.put(sheet.getCell(j, 0).getContents().toString().trim().replaceAll("  ", " "),
					sheet.getCell(j, rowNumber).getContents().toString().trim().replaceAll("  ", " "));
		}
		return map;
	}

	// For Settings - Add Country
	/**
	 * @author dishant.doshi data provider for add country
	 * @return excel data
	 * @creation date 01/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterCountry_Add")
	public static Object[][] SettingsGISMasterCountry_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Country_Add");
	}

	// For Settings - Edit Country
	/**
	 * @author dishant.doshi data provider for edit country
	 * @return excel data
	 * @creation date 01/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterCountry_Edit")
	public static Object[][] SettingsGISMasterCountry_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Country_Edit");
	}
	// For Settings - Delete Country
	/**
	 * @author dishant.doshi data provider for delete country
	 * @return excel data
	 * @creation date 01/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterCountry_Delete")
	public static Object[][] SettingsGISMasterCountry_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Country_Delete");
	}

	// For Settings - Add State
	/**
	 * @author dishant.doshi data provider for add state
	 * @return excel data
	 * @creation date 11/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterState_Add")
	public static Object[][] SettingsGISMasterState_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_State_Add");
	}

	// For Settings - Edit State
	/**
	 * @author dishant.doshi data provider for edit state
	 * @return excel data
	 * @creation date 11/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterState_Edit")
	public static Object[][] SettingsGISMasterState_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_State_Edit");
	}

	// For Settings - Delete State
	/**
	 * @author dishant.doshi data provider for delete state
	 * @return excel data
	 * @creation date 11/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterState_Delete")
	public static Object[][] SettingsGISMasterState_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_State_Delete");
	}

	// For Settings - Add Map Code
	/**
	 * @author dishant.doshi data provider for add map code
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterMapcode_Add")
	public static Object[][] SettingsGISMasterMapcode_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Mapcode_Add");
	}

	// For Settings - Edit Map Code
	/**
	 * @author dishant.doshi data provider for edit map code
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterMapcode_Edit")
	public static Object[][] SettingsGISMasterMapcode_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Mapcode_Edit");
	}

	// For Settings - Delete Map Code
	/**
	 * @author dishant.doshi data provider for delete map code
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsGISMasterMapcode_Delete")
	public static Object[][] SettingsGISMasterMapcode_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "GISMaster_Mapcode_Delete");
	}

	// For Settings - Add DKYC Category
	/**
	 * @author dishant.doshi data provider for add dkyc category
	 * @return excel data
	 * @creation date 29/11/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterCategory_Add")
	public static Object[][] SettingsDKYCMasterCategory_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Category_Add");
	}

	// For Settings - Edit DKYC Category
	/**
	 * @author dishant.doshi data provider for edit dkyc category
	 * @return excel data
	 * @creation date 29/11/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterCategory_Edit")
	public static Object[][] SettingsDKYCMasterCategory_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Category_Edit");
	}

	// For Settings - Delete DKYC Category
	/**
	 * @author dishant.doshi data provider for edit dkyc category
	 * @return excel data
	 * @creation date 29/11/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterCategory_Delete")
	public static Object[][] SettingsDKYCMasterCategory_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Category_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for edit dkyc category
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterCategory_Log")
	public static Object[][] SettingsDKYCMasterCategory_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsDKYCMasterCategory_Log");
	}

	// For Settings - Add DKYC Field
	/**
	 * @author dishant.doshi data provider for add dkyc field
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterField_Add")
	public static Object[][] SettingsDKYCMasterField_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Field_Add");
	}

	// For Settings - Edit DKYC Field
	/**
	 * @author dishant.doshi data provider for edit dkyc field
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterField_Edit")
	public static Object[][] SettingsDKYCMasterField_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Field_Edit");
	}

	// For Settings - Delete DKYC Field
	/**
	 * @author dishant.doshi data provider for edit dkyc field
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterField_Delete")
	public static Object[][] SettingsDKYCMasterField_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "DKYCMaster_Field_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for log dkyc field
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterField_Log")
	public static Object[][] SettingsDKYCMasterField_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsDKYCMasterField_Log");
	}
	// For Settings - Add Department
	/**
	 * @author dishant.doshi data provider for add department
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDepartment_Add")
	public static Object[][] SettingsUserManagementDepartment_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Department_Add");
	}

	// For Settings - Edit Department
	/**
	 * @author dishant.doshi data provider for edit department
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDepartment_Edit")
	public static Object[][] SettingsUserManagementDepartment_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Department_Edit");
	}

	// For Settings - Delete Department
	/**
	 * @author dishant.doshi data provider for delete department
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDepartment_Delete")
	public static Object[][] SettingsUserManagementDepartment_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Department_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for log department
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementDepartment_Log")
	public static Object[][] SettingsUserManagementDepartment_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserManagementDepartment_Log");
	}
	// For Settings - Add Role
	/**
	 * @author dishant.doshi data provider for add role
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementRole_Add")
	public static Object[][] SettingsUserManagementRole_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Role_Add");
	}

	// For Settings - Edit Role
	/**
	 * @author dishant.doshi data provider for edit role
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementRole_Edit")
	public static Object[][] SettingsUserManagementRole_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Role_Edit");
	}
	// For Settings - Delete Role
	/**
	 * @author dishant.doshi data provider for delete role
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementRole_Delete")
	public static Object[][] SettingsUserManagementRole_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Role_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for log role
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementRole_Log")
	public static Object[][] SettingsUserManagementRole_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserManagementRole_Log");
	}
	// For Settings - Add Dashboard
	/**
	 * @author dishant.doshi data provider for add dashboard
	 * @return excel data
	 * @creation date 26/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDashboard_Add")
	public static Object[][] SettingsUserManagementDashboard_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Dashboard_Add");
	}

	// For Settings - Edit Dashboard
	/**
	 * @author dishant.doshi data provider for edit dashboard
	 * @return excel data
	 * @creation date 26/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDashboard_Edit")
	public static Object[][] SettingsUserManagementDashboard_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Dashboard_Edit");
	}

	// For Settings - Delete Dashboard
	/**
	 * @author dishant.doshi data provider for delete dashboard
	 * @return excel data
	 * @creation date 26/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementDashboard_Delete")
	public static Object[][] SettingsUserManagementDashboard_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Dashboard_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for log dashboard
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementDashboard_Log")
	public static Object[][] SettingsUserManagementDashboard_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserManagementDashboard_Log");
	}
	// For Settings - Add User
	/**
	 * @author dishant.doshi data provider for add user
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementUser_Add")
	public static Object[][] SettingsUserManagementUser_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_User_Add");
	}

	// For Settings - Edit User
	/**
	 * @author dishant.doshi data provider for edit user
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementUser_Edit")
	public static Object[][] SettingsUserManagementUser_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_User_Edit");
	}

	// For Settings - Delete User
	/**
	 * @author dishant.doshi data provider for delete user
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsUserManagementUser_Delete")
	public static Object[][] SettingsUserManagementUser_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_User_Delete");
	}

	/**
	 * @author kutbuddin.compounder data provider for log user
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementUser_Log")
	public static Object[][] SettingsUserManagementUser_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmtUser_Log");
	}
	// For Settings - Add SMS Account
	/**
	 * @author dishant.doshi data provider for add sms account
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAccount_Add")
	public static Object[][] SettingsAlertSMSAccount_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSAccount_Add");
	}

	// For Settings - Edit SMS Account
	/**
	 * @author dishant.doshi data provider for edit sms account
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAccount_Edit")
	public static Object[][] SettingsAlertSMSAccount_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSAccount_Edit");
	}

	// For Settings - Delete SMS Account
	/**
	 * @author dishant.doshi data provider for delete sms account
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAccount_Delete")
	public static Object[][] SettingsAlertSMSAccount_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSAccount_Delete");
	}

	// For Settings - Add Email Template
	/**
	 * @author dishant.doshi data provider for add email template
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailTemplate_Add")
	public static Object[][] SettingsAlertEmailTemplate_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_EmailTemplate_Add");
	}

	// For Settings - Edit Email Template
	/**
	 * @author dishant.doshi data provider for edit email template
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailTemplate_Edit")
	public static Object[][] SettingsAlertEmailTemplate_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_EmailTemplate_Edit");
	}

	// For Settings - Delete SMS Account
	/**
	 * @author dishant.doshi data provider for delete email template
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailTemplate_Delete")
	public static Object[][] SettingsAlertEmailTemplate_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_EmailTemplate_Delete");
	}

	// For Settings - Add SMS Template
	/**
	 * @author dishant.doshi data provider for add sms template
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSTemplate_Add")
	public static Object[][] SettingsAlertSMSTemplate_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSTemplate_Add");
	}

	// For Settings - Edit SMS Template
	/**
	 * @author dishant.doshi data provider for edit sms template
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSTemplate_Edit")
	public static Object[][] SettingsAlertSMSTemplate_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSTemplate_Edit");
	}

	// For Settings - Delete SMS Account
	/**
	 * @author dishant.doshi data provider for delete sms template
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSTemplate_Delete")
	public static Object[][] SettingsAlertSMSTemplate_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSTemplate_Delete");
	}

	// For Product - Add Operator

	/**
	 * @author dishant.doshi data provider for add operator
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductsOperator_Add")
	public static Object[][] ProductsExternalProductsOperator_Add() {
		return readExcelFileTo2D(PRODUCT_FILE_PATH, "ExternalProducts_Operator_Add");
	}

	// For Product - Edit Operator
	/**
	 * @author dishant.doshi data provider for edit operator
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductsOperator_Edit")
	public static Object[][] ProductsExternalProductsOperator_Edit() {
		return readExcelFileTo2D(PRODUCT_FILE_PATH, "ExternalProducts_Operator_Edit");
	}

	// For Product - Delete Operator
	/**
	 * @author dishant.doshi data provider for delete operator
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductsOperator_Delete")
	public static Object[][] ProductsExternalProductsOperator_Delete() {
		return readExcelFileTo2D(PRODUCT_FILE_PATH, "ExternalProducts_Operator_Delet");
	}
	/**
	 * @author dishant.doshi data provider for add operator
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductsOperator_Log")
	public static Object[][] ProductsExternalProductsOperator_Log() {
		return readExcelFileTo2D(PRODUCT_FILE_PATH, "ExternalProducts_Operator_Log");
	}

	// For Settings - Add Block Phone
	/**
	 * @author shivani.patel data provider for add BlockPhone
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockPhone_Add")
	public static Object[][] SettingsSystemPreferanceBlockPhone_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockPhone_Add");
	}

	// For Settings - Block Phone
	/**
	 * @author shivani.patel data provider for edit BlockPhone
	 * @return excel data
	 * @creation date 10/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockPhone_Edit")
	public static Object[][] SettingsSystemPreferanceBlockPhone_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockPhone_Edit");
	}

	// For Settings - Delete Block Phone
	/**
	 * @author shivani.patel data provider for delete BlockPhone
	 * @return excel data
	 * @creation date 10/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockPhone_Delete")
	public static Object[][] SettingsSystemPreferanceBlockPhone_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockPhone_Delete");
	}

	// For Settings - Add BlockIDNumber
	/**
	 * @author shivani.patel data provider for add BlockIDNumber
	 * @return excel data
	 * @creation date 12/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockIDNumber_Add")
	public static Object[][] SettingsSystemPreferanceBlockIDNumber_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockIDNumber_Add");
	}

	// For Settings - BlockIDNumber
	/**
	 * @author shivani.patel data provider for edit BlockIDNumber
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockIDNumber_Edit")
	public static Object[][] SettingsSystemPreferanceBlockIDNumber_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockIDNumber_Edit");
	}

	// For Settings - Delete BlockIDNumber
	/**
	 * @author shivani.patel data provider for delete BlockIDNumber
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockIDNumber_Delete")
	public static Object[][] SettingsSystemPreferanceBlockIDNumber_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockIDNumber_Delete");
	}

	// For Settings - Add OperationUser
	/**
	 * @author shivani.patel data provider for Add OperationUser
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceOperationUser_Add")
	public static Object[][] SettingsSystemPreferanceOperationUser_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingOperationUser_Add");
	}

	// For Settings - Edit OperationUser
	/**
	 * @author shivani.patel data provider for Edit OperationUser
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceOperationUser_Edit")
	public static Object[][] SettingsSystemPreferanceOperationUser_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingOperationUser_Edit");
	}

	// For Settings - Delete OperationUser
	/**
	 * @author shivani.patel data provider for Delete OperationUser
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceOperationUser_Delete")
	public static Object[][] SettingsSystemPreferanceOperationUser_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingOperationUser_Delete");
	}

	// For Settings - Add RetailSegment
	/**
	 * @author shivani.patel data provider for Add RetailSegment
	 * @return excel data
	 * @creation date 17/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceRetailSegment_Add")
	public static Object[][] SettingsSystemPreferanceRetailSegment_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingRetailSegment_Add");
	}

	// For Settings - Edit RetailSegment
	/**
	 * @author shivani.patel data provider for Edit RetailSegment
	 * @return excel data
	 * @creation date 17/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceRetailSegment_Edit")
	public static Object[][] SettingsSystemPreferanceRetailSegment_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingRetailSegment_Edit");
	}

	// For Settings - Delete RetailSegment
	/**
	 * @author shivani.patel data provider for Delete RetailSegment
	 * @return excel data
	 * @creation date 17/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceRetailSegment_Delete")
	public static Object[][] SettingsSystemPreferanceRetailSegment_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingRetailSegment_Delete");
	}

	// For Settings - Add Tag
	/**
	 * @author shivani.patel data provider for Add Tag
	 * @return excel data
	 * @creation date 18/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceTag_Add")
	public static Object[][] SettingsSystemPreferanceTag_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingTag_Add");
	}

	// For Settings - Edit Tag
	/**
	 * @author shivani.patel data provider for Edit Tag
	 * @return excel data
	 * @creation date 18/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceTag_Edit")
	public static Object[][] SettingsSystemPreferanceTag_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingTag_Edit");
	}

	// For Settings - Delete Tag
	/**
	 * @author shivani.patel data provider for Delete Tag
	 * @return excel data
	 * @creation date 18/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceTag_Delete")
	public static Object[][] SettingsSystemPreferanceTag_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingTag_Delete");
	}

	// For Settings - Add ThresholdManagement
	/**
	 * @author shivani.patel data provider for Add ThresholdManagement
	 * @return excel data
	 * @creation date 22/10/2018
	 */
	@DataProvider(name = "SettingSystempreferenceThresholdManagement_Add")
	public static Object[][] SettingSystempreferenceThresholdManagement_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingThresholdManagement_Add");
	}

	// For Settings - Edit ThresholdManagement
	/**
	 * @author shivani.patel data provider for Edit ThresholdManagement
	 * @return excel data
	 * @creation date 22/10/2018
	 */
	@DataProvider(name = "SettingSystempreferenceThresholdManagement_Edit")
	public static Object[][] SettingSystempreferenceThresholdManagement_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingThresholdManagement_Edit");
	}

	// For Settings - Delete ThresholdManagement
	/**
	 * @author shivani.patel data provider for Delete ThresholdManagement
	 * @return excel data
	 * @creation date 22/10/2018
	 */
	@DataProvider(name = "SettingSystempreferenceThresholdManagement_Delete")
	public static Object[][] SettingSystempreferenceThresholdManagement_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingThresholdManagement_Del");
	}

	// For Settings - Edit NonRegisterWalletThreshold
	/**
	 * @author shivani.patel data provider for Edit NonRegisterWalletThreshold
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingSystempreferenceNonRegisterWalletThreshold_Edit")
	public static Object[][] SettingSystempreferenceNonRegisterWalletThreshold_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingNonRegiThreshold_Edit");
	}

	// For Settings - Delete NonRegisterWalletThreshold
	/**
	 * @author shivani.patel data provider for Delete NonRegisterWalletThreshold
	 * @return excel data
	 * @creation date 23/10/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceNonRegisterWalletThreshold_Delete")
	public static Object[][] SettingsSystemPreferanceNonRegisterWalletThreshold_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingNonRegiThreshold_Delete");
	}

	// For Settings - Add ImageUploader
	/**
	 * @author shivani.patel data provider for Add ImageUploader
	 * @return excel data
	 * @creation date 26/10/2018
	 */
	@DataProvider(name = "SettingsToolsImageUploader_Add")
	public static Object[][] SettingsToolsImageUploader_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingImageUploader_Add");
	}

	// For Settings - Edit ImageUploader
	/**
	 * @author shivani.patel data provider for Edit ImageUploader
	 * @return excel data
	 * @creation date 27/10/2018
	 */
	@DataProvider(name = "SettingsToolsImageUploader_Edit")
	public static Object[][] SettingsToolsImageUploader_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingImageUploader_Edit");
	}

	// For Settings - Delete ImageUploader
	/**
	 * @author shivani.patel data provider for Delete ImageUploader
	 * @return excel data
	 * @creation date 27/10/2018
	 */
	@DataProvider(name = "SettingsToolsImageUploader_Delete")
	public static Object[][] SettingsToolsImageUploader_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingImageUploader_Delete");
	}

	// For Settings - Add ExchangeRate
	/**
	 * @author shivani.patel data provider for Add ExchangeRate
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsToolsExchangeRate_Add")
	public static Object[][] SettingsToolsExchangeRate_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingExchangeRate_Add");
	}

	// For Settings - Edit ExchangeRate
	/**
	 * @author shivani.patel data provider for Edit ExchangeRate
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsToolsExchangeRate_Edit")
	public static Object[][] SettingsToolsExchangeRate_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingExchangeRate_Edit");
	}

	// For Settings - Delete ExchangeRate
	/**
	 * @author shivani.patel data provider for Delete ExchangeRate
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsToolsExchangeRate_Delete")
	public static Object[][] SettingsToolsExchangeRate_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingExchangeRate_Delete");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log ExchangeRate
	 * @return excel data
	 * @creation date 29/10/2018
	 */
	@DataProvider(name = "SettingsToolsExchangeRate_Log")
	public static Object[][] SettingsToolsExchangeRate_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingExchangeRate_Log");
	}
	// For Settings - Add EmailAccount
	/**
	 * @author shivani.patel data provider for Add EmailAccount
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailAccount_Add")
	public static Object[][] SettingsAlertEmailAccount_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingEmailAccount_Add");
	}

	// For Settings - Edit EmailAccount
	/**
	 * @author shivani.patel data provider for Edit EmailAccount
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailAccount_Edit")
	public static Object[][] SettingsAlertEmailAccount_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingEmailAccount_Edit");
	}

	// For Settings - Delete EmailAccount
	/**
	 * @author shivani.patel data provider for Delete EmailAccount
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "SettingsAlertEmailAccount_Delete")
	public static Object[][] SettingsAlertEmailAccount_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingEmailAccount_Delete");
	}

	// Setting - Alert - Add SMSAlert
	/**
	 * @author shivani.patel data provider for Add SMSAlert
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAlert_Add")
	public static Object[][] SettingsAlertSMSAlert_Add() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingSMSAlert_Add");
	}

	// Setting - Alert - Edit SMSAlert
	/**
	 * @author shivani.patel data provider for Edit SMSAlert
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAlert_Edit")
	public static Object[][] SettingsAlertSMSAlert_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingSMSAlert_Edit");
	}

	// Setting - Alert - Delete SMSAlert
	/**
	 * @author shivani.patel data provider for Delete SMSAlert
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAlert_Delete")
	public static Object[][] SettingsAlertSMSAlert_Delete() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingSMSAlert_Delete");
	}

	// Setting - Alert - Edit FCMAccount
	/**
	 * @author shivani.patel data provider for Edit FCMAccount
	 * @return excel data
	 * @creation date 01/11/2018
	 */
	@DataProvider(name = "SettingsAlertFCMAccount_Edit")
	public static Object[][] SettingsAlertFCMAccount_Edit() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingFCMAccount_Edit");
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit VendorIntegration
	 * @return excel data
	 * @creation date 08/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorIntegration_Edit")
	public static Object[][] ProductsExternalVendorIntegration_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorIntegration_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete VendorIntegration
	 * @return excel data
	 * @creation date 08/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorIntegration_Delete")
	public static Object[][] ProductsExternalVendorIntegration_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorIntegration_Delete");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for addVendorProductManager
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorProductManager_Add")
	public static Object[][] ProductsExternalVendorProductManager_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorProductManager_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit VendorProductManager
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorProductManager_Edit")
	public static Object[][] ProductsExternalVendorProductManager_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorProductManager_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         VendorProductManager
	 * @return excel data
	 * @creation date 16/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorProductManager_Delete")
	public static Object[][] ProductsExternalVendorProductManager_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorProductManager_Delete");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for LogVendorProductManager
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "ProductsExternalVendorProductManager_Log")
	public static Object[][] ProductsExternalVendorProductManager_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorProductManager_Log");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for add taxation
	 * @return excel data
	 * @creation date 08/10/2018
	 */
	@DataProvider(name = "ProductsTaxation_Add")
	public static Object[][] ProductsTaxation_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "Taxation_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit taxation
	 * @return excel data
	 * @creation date 08/10/2018
	 */
	@DataProvider(name = "ProductsTaxation_Edit")
	public static Object[][] ProductsTaxation_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "Taxation_Edit");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for delete taxation
	 * @return excel data
	 * @creation date 08/10/2018
	 */
	@DataProvider(name = "ProductsTaxation_Delete")
	public static Object[][] ProductsTaxation_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "Taxation_Delete");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for log taxation
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "ProductsTaxation_Log")
	public static Object[][] ProductsTaxation_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "Taxation_Log");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for addProductManager
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductManager_Add")
	public static Object[][] ProductsExternalProductManager_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductManager_Add");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for LogProductManager
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "ProductsExternalProductManager_Log")
	public static Object[][] ProductsExternalProductManager_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductManager_Log");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for edit ProductManager
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductManager_Edit")
	public static Object[][] ProductsExternalProductManager_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductManager_Edit");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for delete ProductManager
	 * @return excel data
	 * @creation date 24/10/2018
	 */
	@DataProvider(name = "ProductsExternalProductManager_Delete")
	public static Object[][] ProductsExternalProductManager_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductManager_Delete");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for addProductInternal
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "ProductInternal_Add")
	public static Object[][] ProductInternal_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductInternal_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit ProductInternal
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "ProductInternal_Edit")
	public static Object[][] ProductInternal_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductInternal_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete ProductInternal
	 * @return excel data
	 * @creation date 30/10/2018
	 */
	@DataProvider(name = "ProductInternal_Delete")
	public static Object[][] ProductInternal_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductInternal_Delete");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for LogProductInternal
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "ProductInternal_Log")
	public static Object[][] ProductInternal_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductInternal_Log");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for addProductSubwallet
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "ProductSubwallet_Add")
	public static Object[][] ProductSubwallet_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductSubwallet_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit ProductSubwallet
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "ProductSubwallet_Edit")
	public static Object[][] ProductSubwallet_Edit() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductSubwallet_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete ProductSubwallet
	 * @return excel data
	 * @creation date 31/10/2018
	 */
	@DataProvider(name = "ProductSubwallet_Delete")
	public static Object[][] ProductSubwallet_Delete() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductSubwallet_Delete");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder data provider for logProductSubwallet
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "ProductSubwallet_Log")
	public static Object[][] ProductSubwallet_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductSubwallet_Log");
		return data;
	}
	// For Product - Add Operator

	/**
	 * @author Kutbuddin.Compounder data provider for addVendorIntegration
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorIntegration_Add")
	public static Object[][] ProductsExternalVendorIntegration_Add() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorIntegration_Add");
		return data;

	}
	/**
	 * @author Kutbuddin.Compounder data provider for LogVendorIntegration
	 * @return excel data
	 * @creation date 02/10/2018
	 */
	@DataProvider(name = "ProductsExternalVendorIntegration_Log")
	public static Object[][] ProductsExternalVendorIntegration_Log() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorIntegration_Log");
		return data;
	}
	//For Report - Search InternalServiceDetailReport


	//For Report - Search InternalServiceDetailReport



	// For Report - Search InternalServiceDetailReport

	/**
	 * @author shivani.patel data provider for Search
	 *         InternalServiceDetailReport
	 * @return excel data
	 * @creation date 13/11/2018
	 */
	@DataProvider(name = "ReportInternalServiceDetailReport_Search")
	public static Object[][] ReportInternalServiceDetailReport_Search() {
		Object[][] data = readExcelFileTo2D(REPORT_FILE_PATH, "InternalServiceDetailReport_Search");
		return data;
	}

	// For Merchant - Add Tree
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 03/10/2018
	 */
	@DataProvider(name = "MerchantTree_Add")
	public static Object[][] MerchantTree_Add() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTree_Add");
		return data;
	}

	// For Merchant - Edit Tree
	/**
	 * @author shivani.patel data provider for edit tree
	 * @return excel data
	 * @creation date 04/10/2018
	 */
	@DataProvider(name = "MerchantTree_Edit")
	public static Object[][] MerchantTree_Edit() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTree_Edit");
		return data;
	}

	// For Merchant - Delete Tree
	/**
	 * @author shivani.patel data provider for Delete tree
	 * @return excel data
	 * @creation date 04/10/2018
	 */
	@DataProvider(name = "MerchantTree_Delete")
	public static Object[][] MerchantTree_Delete() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTree_Delete");
		return data;
	}

	// For Merchant - Add Onboarding
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "MerchantOnboarding_Add")
	public static Object[][] MerchantOnboarding_Add() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnboarding_Add");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for add Onboarding
	 * @return excel data
	 * @creation date 30/11/2018
	 */
	@DataProvider(name = "MerchantOnboarding_Edit")
	public static Object[][] MerchantOnboarding_Edit() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnboarding_Edit");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for delete Onboarding
	 * @return excel data
	 * @creation date 30/11/2018
	 */
	@DataProvider(name = "MerchantOnboarding_Delete")
	public static Object[][] MerchantOnboarding_Delete() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnboarding_Delete");
		return data;
	}

	// For Merchant - Add TerminalOnboarding
	/**
	 * @author kutbuddin.compounder data provider for add TerminalOnboarding
	 * @return excel data
	 * @creation date 06/12/2018
	 */
	@DataProvider(name = "MerchantTerminalOnboarding_Add")
	public static Object[][] MerchantTerminalOnboarding_Add() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "TerminalOnboarding_Add");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for add TerminalOnboarding
	 * @return excel data
	 * @creation date 06/12/2018
	 */
	@DataProvider(name = "MerchantTerminalOnboarding_Edit")
	public static Object[][] MerchantTerminalOnboarding_Edit() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "TerminalOnboarding_Edit");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for delete TerminalOnboarding
	 * @return excel data
	 * @creation date 06/12/2018
	 */
	@DataProvider(name = "MerchantTerminalOnboarding_Delete")
	public static Object[][] MerchantTerminalOnboarding_Delete() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "TerminalOnboarding_Delete");
		return data;
	}

	// For Agent - Add Tree
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 03/10/2018
	 */
	@DataProvider(name = "AgentTree_Add")
	public static Object[][] AgentTree_Add() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentTree_Add");
		return data;
	}

	// For Agent - Edit Tree
	/**
	 * @author shivani.patel data provider for edit tree
	 * @return excel data
	 * @creation date 04/10/2018
	 */
	@DataProvider(name = "AgentTree_Edit")
	public static Object[][] AgentTree_Edit() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentTree_Edit");
		return data;
	}

	// For Agent - Delete Tree
	/**
	 * @author shivani.patel data provider for Delete tree
	 * @return excel data
	 * @creation date 04/10/2018
	 */
	@DataProvider(name = "AgentTree_Delete")
	public static Object[][] AgentTree_Delete() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentTree_Delete");
		return data;
	}

	// For Agent - Sort Tree
	/**
	 * @author Dishant Doshi data provider for sort tree
	 * @return excel data
	 * @creation date 13/12/2018
	 */
	@DataProvider(name = "AgentTree_Sort")
	public static Object[][] AgentTree_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentTree_Sort");
		return data;
	}

	/**
	 * @author kutbuddin.compounder
	 * data provider for Log tree
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "AgentTree_Log")
	public static Object[][] AgentTree_Log(){
		Object[][] data=readExcelFileTo2D(AGENT_FILE_PATH, "AgentTree_Log");
		return data;
	}
	// Agent - Add Onboarding
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 15/11/2018
	 */
	@DataProvider(name = "AgentOnboarding_Add")
	public static Object[][] AgentOnboarding_Add() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnboarding_Add");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for  Agent Onboarding log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "AgentOnBoarding_Log")
	public static Object[][] AgentOnBoarding_Log() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnBoarding_Log");
	}

	// For Agent - Add Profile
	/**
	 * @author dishant.doshi data provider for add agent profile
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentProfile_Add")
	public static Object[][] AgentProfile_Add() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentProfile_Add");
	}

	// For Agent - Edit Profile
	/**
	 * @author dishant.doshi data provider for add agent profile
	 * @return excel data
	 * @creation date 20/11/2018
	 */
	@DataProvider(name = "AgentProfile_Edit")
	public static Object[][] AgentProfile_Edit() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentProfile_Edit");
	}

	// For Agent - Delete Profile
	/**
	 * @author dishant.doshi data provider for delete agent profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "AgentProfile_Delete")
	public static Object[][] AgentProfile_Delete() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentProfile_Delete");
	}

	/**
	 * @author dishant.doshi data provider for Log merchant profile
	 * @return excel data
	 * @creation date 15/11/2018
	 */
	@DataProvider(name = "AgentProfile_Log")
	public static Object[][] AgentProfile_Log() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentProfile_Log");
	}



	// For Agent - Sort Profile
	/**
	 * @author dishant.doshi data provider for sort agent profile
	 * @return excel data
	 * @creation date 14/12/2018
	 */
	@DataProvider(name = "AgentProfile_Sort")
	public static Object[][] AgentProfile_Sort() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentProfile_Sort");
	}


	// For Agent - Add Branch View
	/**
	 * @author dishant.doshi data provider for add agent branch view
	 * @return excel data
	 * @creation date 27/11/2018
	 */
	@DataProvider(name = "AgentBranchView_Add")
	public static Object[][] AgentBranchView_Add() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentBranchView_Add");
	}

	// For Agent - Edit Branch View
	/**
	 * @author dishant.doshi data provider for edit agent branch view
	 * @return excel data
	 * @creation date 29/11/2018
	 */
	@DataProvider(name = "AgentBranchView_Edit")
	public static Object[][] AgentBranchView_Edit() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentBranchView_Edit");
	}

	// For Agent - Add Assistant Onboarding
	/**
	 * @author dishant.doshi data provider for add agent assistant onboarding
	 * @return excel data
	 * @creation date 30/11/2018
	 */
	@DataProvider(name = "AgentAssistantOnboarding_Add")
	public static Object[][] AgentAssistantOnboarding_Add() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentAssistant_Add");
	}

	// For Agent - Edit Assistant Onboarding
	/**
	 * @author dishant.doshi data provider for edit agent assistant onboarding
	 * @return excel data
	 * @creation date 30/11/2018
	 */
	@DataProvider(name = "AgentAssistantOnboarding_Edit")
	public static Object[][] AgentAssistantOnboarding_Edit() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentAssistant_Edit");
	}

	// For Agent - Delete Assistant Onboarding
	/**
	 * @author dishant.doshi data provider for delete agent assistant onboarding
	 * @return excel data
	 * @creation date 30/11/2018
	 */
	@DataProvider(name = "AgentAssistantOnboarding_Delete")
	public static Object[][] AgentAssistantOnboarding_Delete() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentAssistant_Delete");
	}

	/**
	 * @author kutbuddin.compounder data provider for  Agent Onboarding log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "AgentAssitantOnBoarding_Log")
	public static Object[][] AgentAssitantOnBoarding_Log() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentAssitantOnBoarding_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  External Threshold log
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "AgentExternalThreshold_Log")
	public static Object[][] AgentExternalThreshold_Log() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentExternalThreshold_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Internal Threshold log
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "AgentInternalThreshold_Log")
	public static Object[][] AgentInternalThreshold_Log() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentInternalThreshold_Log");
	}

	// For Agent - Node Transfer
	/**
	 * @author dishant.doshi data provider for agent node transfer
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "AgentTransfer")
	public static Object[][] AgentTransfer() {
		return readExcelFileTo2D(AGENT_FILE_PATH, "AgentTransfer");
	}

	/**
	 * @author kutbuddin.compounder data provider for  Merchant Onboarding log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "MerchantOnBoarding_Log")
	public static Object[][] MerchantOnBoarding_Log() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnBoarding_Log");
	}

	// For Merchant - Add Profile
	/**
	 * @author dishant.doshi data provider for add merchant profile
	 * @return excel data
	 * @creation date 15/11/2018
	 */
	@DataProvider(name = "MerchantProfile_Add")
	public static Object[][] MerchantProfile_Add() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantProfile_Add");
	}

	// For Merchant - Add Profile
	/**
	 * @author dishant.doshi data provider for edit merchant profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "MerchantProfile_Edit")
	public static Object[][] MerchantProfile_Edit() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantProfile_Edit");
	}

	/**
	 * @author kutbuddin.compounder
	 * data provider for Log tree
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "MerchantTree_Log")
	public static Object[][] MerchantTree_Log(){
		Object[][] data=readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTree_Log");
		return data;
	}
	/**
	 * @author dishant.doshi data provider for Log merchant profile
	 * @return excel data
	 * @creation date 15/11/2018
	 */
	@DataProvider(name = "MerchantProfile_Log")
	public static Object[][] MerchantProfile_Log() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantProfile_Log");
	}


	// For Merchant - Delete Profile
	/**
	 * @author dishant.doshi data provider for delete merchant profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "MerchantProfile_Delete")
	public static Object[][] MerchantProfile_Delete() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantProfile_Delete");
	}

	/**
	 * @author kutbuddin.compounder data provider for  Internal Threshold log
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "MerchantInternalThreshold_Log")
	public static Object[][] MerchantInternalThreshold_Log() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantInternalThreshold_Log");
	}

	// For Enterprise - Add Profile
	/**
	 * @author dishant.doshi data provider for add enterprise profile
	 * @return excel data
	 * @creation date 16/11/2018
	 */
	@DataProvider(name = "EnterpriseProfile_Add")
	public static Object[][] EnterpriseProfile_Add() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseProfile_Add");
	}

	// For Enterprise - Edit Profile
	/**
	 * @author dishant.doshi data provider for edit enterprise profile
	 * @return excel data
	 * @creation date 16/11/2018
	 */
	@DataProvider(name = "EnterpriseProfile_Edit")
	public static Object[][] EnterpriseProfile_Edit() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseProfile_Edit");
	}

	// For Enterprise - Delete Profile
	/**
	 * @author dishant.doshi data provider for delete enterprise profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "EnterpriseProfile_Delete")
	public static Object[][] EnterpriseProfile_Delete() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseProfile_Delete");
	}

	// For Customer - Add Profile
	/**
	 * @author dishant.doshi data provider for add customer profile
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "CustomerProfile_Add")
	public static Object[][] CustomerProfile_Add() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfile_Add");
	}

	// For Customer - Edit Profile
	/**
	 * @author dishant.doshi data provider for edit customer profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "CustomerProfile_Edit")
	public static Object[][] CustomerProfile_Edit() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfile_Edit");
	}

	// For Customer - Delete Profile
	/**
	 * @author dishant.doshi data provider for delete customer profile
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "CustomerProfile_Delete")
	public static Object[][] CustomerProfile_Delete() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfile_Delete");
	}

	// For Customer - Delete Profile
	/**
	 * @author dishant.doshi data provider for customer profile update
	 * @return excel data
	 * @creation date 23/11/2018
	 */
	@DataProvider(name = "CustomerProfileUpdate")
	public static Object[][] CustomerProfileUpdate() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfileUpdate");
	}

	// For Customer - Edite Profile Log
	/**
	 * @author kutbuddin.compounder data provider for  profile log
	 * @return excel data
	 * @creation date 13/12/2018
	 */
	@DataProvider(name = "CustomerProfile_Log")
	public static Object[][] CustomerProfile_Log() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfile_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  External Threshold log
	 * @return excel data
	 * @creation date 13/12/2018
	 */
	@DataProvider(name = "CustomerExternalThreshold_Log")
	public static Object[][] CustomerExternalThreshold_Log() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerExternalThreshold_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Internal Threshold log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "CustomerInternalThreshold_Log")
	public static Object[][] CustomerInternalThreshold_Log() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerInternalThreshold_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Onboarding log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "CustomerOnBoarding_Log")
	public static Object[][] CustomerOnBoarding_Log() {
		return readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboarding_Log");
	}


	// Enterprise - Add Onboarding
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 220/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboarding_Add")
	public static Object[][] EnterpriseOnboarding_Add() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboarding_Add");
		return data;
	}

	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 20/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboarding_Edit")
	public static Object[][] EnterpriseOnboarding_Edit() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboarding_Edit");
		return data;
	}

	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 20/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboarding_Delete")
	public static Object[][] EnterpriseOnboarding_Delete() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboarding_Delete");
		return data;
	}

	// Customer - Add Onboarding
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 16/11/2018
	 */
	@DataProvider(name = "CustomerOnboarding_Add")
	public static Object[][] CustomerOnboarding_Add() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboarding_Add");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for edit Onboarding
	 * @return excel data
	 * @creation date 26/11/2018
	 */
	@DataProvider(name = "CustomerOnboarding_Edit")
	public static Object[][] CustomerOnboarding_Edit() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboarding_Edit");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for delete Onboarding
	 * @return excel data
	 * @creation date 26/11/2018
	 */
	@DataProvider(name = "CustomerOnboarding_Delete")
	public static Object[][] CustomerOnboarding_Delete() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboarding_Delete");
		return data;
	}

	// Agent - Edit Onboarding
	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "AgentOnboarding_Edit")
	public static Object[][] AgentOnboarding_Edit() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnboarding_Edit");
		return data;
	}

	/**
	 * @author shivani.patel data provider for add tree
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "AgentOnboarding_Delete")
	public static Object[][] AgentOnboarding_Delete() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnboarding_Delete");
		return data;
	}

	// For Add TA bank
	/**
	 * @author shivani.patel data provider for add TABank
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "TABank_Add")
	public static Object[][] TABank_Add() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TABank_Add");
		return data;
	}

	// For Edit TA bank
	/**
	 * @author shivani.patel data provider for edit TABank
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "TABank_Edit")
	public static Object[][] TABank_Edit() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TABank_Edit");
		return data;
	}

	// For Delete TA bank
	/**
	 * @author shivani.patel data provider for delete TABank
	 * @return excel data
	 * @creation date 19/11/2018
	 */
	@DataProvider(name = "TABank_Delete")
	public static Object[][] TABank_Delete() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TABank_Delete");
		return data;
	}	
	/**
	 * @author kutbuddin.compounder
	 * data provider for Log TABank
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "TABank_Log")
	public static Object[][] TABank_Log(){
		Object[][] data=readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TABank_Log");
		return data;
	}	

	// For Add TA bank
	/**
	 * @author dishant.doshi data provider for add ta user
	 * @return excel data
	 * @creation date 03/12/2018
	 */
	@DataProvider(name = "TAUser_Add")
	public static Object[][] TAUser_Add() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAUser_Add");
		return data;
	}

	// For Edit TA bank
	/**
	 * @author sdishant.doshi data provider for edit ta user
	 * @return excel data
	 * @creation date 03/12/2018
	 */
	@DataProvider(name = "TAUser_Edit")
	public static Object[][] TAUser_Edit() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAUser_Edit");
		return data;
	}

	// For Delete TA bank
	/**
	 * @author dishant.doshi data provider for delete ta user
	 * @return excel data
	 * @creation date 03/12/2018
	 */
	@DataProvider(name = "TAUser_Delete")
	public static Object[][] TAUser_Delete() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAUser_Delete");
		return data;
	}
	/**
<<<<<<< .mine
	 * @author kutbuddin.compounder data provider for Log ta user
	 * @return excel data
	 * @creation date 21/12/2018
	 */
	@DataProvider(name = "TAUser_Log")
	public static Object[][] TAUser_Log() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAUser_Log");
		return data;
	}
	/**
	 * @author Kutbuddin.Compounder
	 * data provider for Edit Matrix
||||||| .r455
	 * @author Kutbuddin.Compounder
	 * data provider for Edit Matrix
=======
	 * @author Kutbuddin.Compounder data provider for Edit Matrix
>>>>>>> .r478
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerMatrix_Edit")
	public static Object[][] CustomerMatrix_Edit() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerMatrix_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for
	 *         addCustomerExternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerExternalThreshold_Add")
	public static Object[][] CustomerExternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerExternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         CustomerExternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerExternalThreshold_Edit")
	public static Object[][] CustomerExternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerExternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         CustomerExternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerExternalThreshold_Delete")
	public static Object[][] CustomerExternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerExternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for
	 *         addCustomerInternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerInternalThreshold_Add")
	public static Object[][] CustomerInternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerInternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         CustomerInternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerInternalThreshold_Edit")
	public static Object[][] CustomerInternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerInternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         CustomerInternalThreshold
	 * @return excel data
	 * @creation date 06/11/2018
	 */
	@DataProvider(name = "CustomerInternalThreshold_Delete")
	public static Object[][] CustomerInternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerInternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for Edit Matrix
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseMatrix_Edit")
	public static Object[][] EnterpriseMatrix_Edit() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseMatrix_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for
	 *         addEnterpriseExternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseExternalThreshold_Add")
	public static Object[][] EnterpriseExternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_ExternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         EnterpriseExternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseExternalThreshold_Edit")
	public static Object[][] EnterpriseExternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_ExternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         EnterpriseExternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseExternalThreshold_Delete")
	public static Object[][] EnterpriseExternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_ExternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for
	 *         addEnterpriseInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseInternalThreshold_Add")
	public static Object[][] EnterpriseInternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_InternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         EnterpriseInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseInternalThreshold_Edit")
	public static Object[][] EnterpriseInternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_InternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         EnterpriseInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "EnterpriseInternalThreshold_Delete")
	public static Object[][] EnterpriseInternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "Enterp_InternalThreshold_Delet");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for add OnboardingUser
	 * @return excel data
	 * @creation date 28/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboardingUser_Add")
	public static Object[][] EnterpriseOnboardingUser_Add() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "OnboardingUser_Add");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for edit OnboardingUser
	 * @return excel data
	 * @creation date 28/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboardingUser_Edit")
	public static Object[][] EnterpriseOnboardingUser_Edit() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "OnboardingUser_Edit");
		return data;
	}

	/**
	 * @author kutbuddin.compounder data provider for delete OnboardingUser
	 * @return excel data
	 * @creation date 28/11/2018
	 */
	@DataProvider(name = "EnterpriseOnboardingUser_Delete")
	public static Object[][] EnterpriseOnboardingUser_Delete() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "OnboardingUser_Delete");
		return data;
	}

	/**
<<<<<<< .mine
	 * @author kutbuddin.compounder data provider for  profile log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "EnterpriseProfile_Log")
	public static Object[][] EnterpriseProfile_Log() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseProfile_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  External Threshold log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "EnterpriseExternalThreshold_Log")
	public static Object[][] EnterpriseExternalThreshold_Log() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseExternalThreshold_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Internal Threshold log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "EnterpriseInternalThreshold_Log")
	public static Object[][] EnterpriseInternalThreshold_Log() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseInternalThreshold_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Onboarding User log
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "EnterpriseOnBoardingUser_Log")
	public static Object[][] EnterpriseOnboardingUser_Log() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboardingUser_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for  Onboarding log
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "EnterpriseOnBoarding_Log")
	public static Object[][] EnterpriseOnBoarding_Log() {
		return readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboarding_Log");
	}
	/**
	 * @author Kutbuddin.Compounder
	 * data provider for addAgentExternalThreshold
||||||| .r455
	 * @author Kutbuddin.Compounder
	 * data provider for addAgentExternalThreshold
=======
	 * @author Kutbuddin.Compounder data provider for addAgentExternalThreshold
>>>>>>> .r478
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentExternalThreshold_Add")
	public static Object[][] AgentExternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentExternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         AgentExternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentExternalThreshold_Edit")
	public static Object[][] AgentExternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentExternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         AgentExternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentExternalThreshold_Delete")
	public static Object[][] AgentExternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentExternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for addAgentInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentInternalThreshold_Add")
	public static Object[][] AgentInternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentInternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         AgentInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentInternalThreshold_Edit")
	public static Object[][] AgentInternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentInternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         AgentInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "AgentInternalThreshold_Delete")
	public static Object[][] AgentInternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentInternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for
	 *         addMerchantInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "MerchantInternalThreshold_Add")
	public static Object[][] MerchantInternalThreshold_Add() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantInternalThreshold_Add");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for edit
	 *         MerchantInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "MerchantInternalThreshold_Edit")
	public static Object[][] MerchantInternalThreshold_Edit() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantInternalThreshold_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for delete
	 *         MerchantInternalThreshold
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "MerchantInternalThreshold_Delete")
	public static Object[][] MerchantInternalThreshold_Delete() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantInternalThreshold_Delet");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for Edit Merchant Matrix
	 * @return excel data
	 * @creation date 12/11/2018
	 */
	@DataProvider(name = "MerchantMatrix_Edit")
	public static Object[][] MerchantMatrix_Edit() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantMatrix_Edit");
		return data;
	}

	/**
	 * @author Kutbuddin.Compounder data provider for Edit Agent Matrix
	 * @return excel data
	 * @creation date 22/11/2018
	 */
	@DataProvider(name = "AgentMatrix_Edit")
	public static Object[][] AgentMatrix_Edit() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentMatrix_Edit");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search merchant transaction performance report
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "MerchantReportTransactionPerformance_Search")
	public static Object[][] MerchantReportTransactionPerformance_Search() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTransactionPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search merchant onboarding performance report
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "MerchantReportOnboardingPerformance_Search")
	public static Object[][] MerchantReportOnboardingPerformance_Search() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnboardingPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search merchant activity report
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "MerchantReportActivityReport_Search")
	public static Object[][] MerchantReportActivityReport_Search() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantActivityReport_Search");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search agent transaction performance report
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentReportTransactionPerformance_Search")
	public static Object[][] AgentReportTransactionPerformance_Search() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentTransactionPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search agent onboarding performance report
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentReportOnboardingPerformance_Search")
	public static Object[][] AgentReportOnboardingPerformance_Search() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnboardingPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search agent activity report
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentReportActivityReport_Search")
	public static Object[][] AgentReportActivityReport_Search() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentActivityReport");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search customer transaction performance report
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "CustomerReportTransactionPerformance_Search")
	public static Object[][] CustomerReportTransactionPerformance_Search() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerTransactionPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search customer onboarding performance report
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "CustomerReportOnboardingPerformance_Search")
	public static Object[][] CustomerReportOnboardingPerformance_Search() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboardingPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search customer activity report
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "CustomerReportActivityReport_Search")
	public static Object[][] CustomerReportActivityReport_Search() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerActivityReport");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search enterprise transaction performance report
	 * @return excel data
	 * @creation date 21/12/2018
	 */
	@DataProvider(name = "EnterpriseReportTransactionPerformance_Search")
	public static Object[][] EnterpriseReportTransactionPerformance_Search() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseTransactionPerformanc");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search enterprise onboarding performance report
	 * @return excel data
	 * @creation date 21/12/2018
	 */
	@DataProvider(name = "EnterpriseReportOnboardingPerformance_Search")
	public static Object[][] EnterpriseReportOnboardingPerformance_Search() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboardingPerformance");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search enterprise activity report
	 * @return excel data
	 * @creation date 21/12/2018
	 */
	@DataProvider(name = "EnterpriseReportActivityReport_Search")
	public static Object[][] EnterpriseReportActivityReport_Search() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseActivityReport");
		return data;
	}
	/**
	 * @author shivani.patel
	 * data provider for search trustAccount activity report
	 * @return excel data
	 * @creation date 24/12/2018
	 */
	@DataProvider(name = "TrustAccountReportActivityReport_Search")
	public static Object[][] TrustAccountReportActivityReport_Search() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAActivityReport");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent Matrix
	 * @return excel data
	 * @creation date 18/12/2018
	 */
	@DataProvider(name = "AgentMatrix_Sort")
	public static Object[][] AgentMatrix_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentMatrix_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent Onboarding
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentOnboarding_Sort")
	public static Object[][] AgentOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentOnboarding_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent Assistant Onboarding
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentAssistantOnboarding_Sort")
	public static Object[][] AgentAssistantOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentAssistantOnboarding_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent External Threshold
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentExternalThreshold_Sort")
	public static Object[][] AgentExternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentExternalThreshold_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent External Threshold
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "AgentInternalThreshold_Sort")
	public static Object[][] AgentInternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(AGENT_FILE_PATH, "AgentInternalThreshold_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Agent External Threshold
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerProfile_Sort")
	public static Object[][] CustomerProfile_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfile_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Customer Matrix
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerMatrix_Sort")
	public static Object[][] CustomerMatrix_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerMatrix_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Customer Onboarding
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerOnboarding_Sort")
	public static Object[][] CustomerOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerOnboarding_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Customer External Threshold
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerExternalThreshold_Sort")
	public static Object[][] CustomerExternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerExternalThreshold_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Customer Internal Threshold
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerInternalThreshold_Sort")
	public static Object[][] CustomerInternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerInternalThreshold_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Customer Profile Update
	 * @return excel data
	 * @creation date 19/12/2018
	 */
	@DataProvider(name = "CustomerProfileUpdate_Sort")
	public static Object[][] CustomerProfileUpdate_Sort() {
		Object[][] data = readExcelFileTo2D(CUSTOMER_FILE_PATH, "CustomerProfileUpdate_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Merchant Matrix
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantMatrix_Sort")
	public static Object[][] MerchantMatrix_Sort() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantMatrix_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Merchant Onboarding
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantOnboarding_Sort")
	public static Object[][] MerchantOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantOnboarding_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Merchant Terminal Onboarding
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantTerminalOnboarding_Sort")
	public static Object[][] MerchantTerminalOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTerminalOnboarding_Sort");
		return data;
	}

	/**
	 * @author dishant.doshi data provider for Sort Merchant External Threshold
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantInternalThreshold_Sort")
	public static Object[][] MerchantInternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantInternalThreshold_Sort");
		return data;
	}

	// For Agent - Sort Profile
	/**
	 * @author dishant.doshi data provider for sort merchant profile
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantProfile_Sort")
	public static Object[][] MerchantProfile_Sort() {
		return readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantProfile_Sort");
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant tree
	 * @return excel data
	 * @creation date 20/12/2018
	 */
	@DataProvider(name = "MerchantTree_Sort")
	public static Object[][] MerchantTree_Sort() {
		Object[][] data = readExcelFileTo2D(MERCHANT_FILE_PATH, "MerchantTree_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant profile
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseProfile_Sort")
	public static Object[][] EnterpriseProfile_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseProfile_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant matrix
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseMatrix_Sort")
	public static Object[][] EnterpriseMatrix_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseMatrix_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant onboarding
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseOnboarding_Sort")
	public static Object[][] EnterpriseOnboarding_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboarding_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant onboarding user
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseOnboardingUser_Sort")
	public static Object[][] EnterpriseOnboardingUser_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterpriseOnboardingUser_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant external threshold
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseExternalThreshold_Sort")
	public static Object[][] EnterpriseExternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterprisExternalThreshold_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort merchant internal threshold
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "EnterpriseInternalThreshold_Sort")
	public static Object[][] EnterpriseInternalThreshold_Sort() {
		Object[][] data = readExcelFileTo2D(ENTERPRISE_FILE_PATH, "EnterprisInternalThreshold_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort ta internal threshold
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "TAUser_Sort")
	public static Object[][] TAUser_Sort() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TAUser_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort ta internal threshold
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "TABank_Sort")
	public static Object[][] TABank_Sort() {
		Object[][] data = readExcelFileTo2D(TRUSTACCOUNT_FILE_PATH, "TABank_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product vendor integration
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductsExternalVendorIntegration_Sort")
	public static Object[][] ProductsExternalVendorIntegration_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorIntegration_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product vendor product manager
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "VendorProductManager_Sort")
	public static Object[][] VendorProductManager_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "VendorProductManager_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product product manager
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductManager_Sort")
	public static Object[][] ProductManager_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductManager_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product internal product
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductInternal_Sort")
	public static Object[][] ProductInternal_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductInternal_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product operator
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductsExternalProductsOperator_Sort")
	public static Object[][] ProductsExternalProductsOperator_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "Operator_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product taxation
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductsTaxation_Sort")
	public static Object[][] ProductsTaxation_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductsTaxation_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort product taxation
	 * @return excel data
	 * @creation date 26/12/2018
	 */
	@DataProvider(name = "ProductSubWallet_Sort")
	public static Object[][] ProductSubWallet_Sort() {
		Object[][] data = readExcelFileTo2D(PRODUCT_FILE_PATH, "ProductSubWallet_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings country
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsGISMasterCountry_Sort")
	public static Object[][] SettingsGISMasterCountry_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsGISMasterCountry_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings state
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsGISMasterState_Sort")
	public static Object[][] SettingsGISMasterState_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsGISMasterState_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings map code
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsGISMasterMapCode_Sort")
	public static Object[][] SettingsGISMasterMapCode_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsGISMasterMapCode_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings dkyc category
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterDKYCCategory_Sort")
	public static Object[][] SettingsDKYCMasterDKYCCategory_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsDKYCMasterCategory_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings dkyc fields
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "SettingsDKYCMasterDKYCField_Sort")
	public static Object[][] SettingsDKYCMasterDKYCField_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsDKYCMasterField_Sort");
		return data;
	}
	/**
	 * @author kutbuddin.compounder data provider for EditedLog sms account
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAccount_Log")
	public static Object[][] SettingsAlertSMSAccount_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSAccount_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for EditedLog email template
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertEmailTemplate_Log")
	public static Object[][] SettingsAlertEmailTemplate_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_EmailTemplate_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for EditedLog sms template
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertSMSTemplate_Log")
	public static Object[][] SettingsAlertSMSTemplate_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "Alert_SMSTemplate_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log EmailAccount
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertEmailAccount_Log")
	public static Object[][] SettingsAlertEmailAccount_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingEmailAccount_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log SMSAlert
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertSMSAlert_Log")
	public static Object[][] SettingsAlertSMSAlert_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingSMSAlert_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log FCMAccount
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsAlertFCMAccount_Log")
	public static Object[][] SettingsAlertFCMAccount_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingFCMAccount_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log BlockPhone
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockPhone_Log")
	public static Object[][] SettingsSystemPreferanceBlockPhone_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockPhone_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log BlockIDNumber
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceBlockIDNumber_Log")
	public static Object[][] SettingsSystemPreferanceBlockIDNumber_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockIDNumber_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log OperationUser
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceOperationUser_Log")
	public static Object[][] SettingsSystemPreferanceOperationUser_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingOperationUser_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log RetailSegment
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceRetailSegment_Log")
	public static Object[][] SettingsSystemPreferanceRetailSegment_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingRetailSegment_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log Tag
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsSystemPreferanceTag_Log")
	public static Object[][] SettingsSystemPreferanceTag_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingTag_Log");
	}
	/**
	 * @author kutbuddin.compounder data provider for Log ThresholdManagement
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingSystempreferenceThresholdManagement_Log")
	public static Object[][] SettingSystempreferenceThresholdManagement_Log() {
		return readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingThresholdManagement_Log");
	}
	/**
	 * @author shivani.patel
	 * data provider for search report pocket balance report
	 * @return excel data
	 * @creation date 27/12/2018
	 */
	@DataProvider(name = "ReportsPocketBalanceReport_Search")
	public static Object[][] ReportsPocketBalanceReport_Search() {
		Object[][] data = readExcelFileTo2D(REPORT_FILE_PATH, "PocketBalanceReport_Search");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings department
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementDepartment_Sort")
	public static Object[][] SettingsUserManagementDepartment_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Department_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings department
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementRole_Sort")
	public static Object[][] SettingsUserManagementRole_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Role_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings department
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementDashboard_Sort")
	public static Object[][] SettingsUserManagementDashboard_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_Dashboard_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings department
	 * @return excel data
	 * @creation date 31/12/2018
	 */
	@DataProvider(name = "SettingsUserManagementUser_Sort")
	public static Object[][] SettingsUserManagementUser_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "UserMgmt_User_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings sms account
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsAlertSMSAccount_Sort")
	public static Object[][] SettingsAlertSMSAccount_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsAlertSMSAccount_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings email account
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsAlertEmailAccount_Sort")
	public static Object[][] SettingsAlertEmailAccount_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsAlertEmailAccount_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings sms alert
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsAlertSMSAlert_Sort")
	public static Object[][] SettingsAlertSMSAlert_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsAlertSMSAlert_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings email template
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsAlertEmailTemplate_Sort")
	public static Object[][] SettingsAlertEmailTemplate_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsAlertEmailTemplate_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings sms template
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsAlertSMSTemplate_Sort")
	public static Object[][] SettingsAlertSMSTemplate_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsAlertSMSTemplate_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings tag
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesTag_Sort")
	public static Object[][] SettingsSystemPreferencesTag_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsTag_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings operational user
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesOperationUser_Sort")
	public static Object[][] SettingsSystemPreferencesOperationUser_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsOperationUser_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings retail segment
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesRetailSegment_Sort")
	public static Object[][] SettingsSystemPreferencesRetailSegment_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsRetailSegment_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings block phone
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesBlockPhone_Sort")
	public static Object[][] SettingsSystemPreferencesBlockPhone_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockPhone_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings block id list
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesBlockIDNumber_Sort")
	public static Object[][] SettingsSystemPreferencesBlockIDNumber_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsBlockIDNumber_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings block id list
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsSystemPreferencesThresholdManagement_Sort")
	public static Object[][] SettingsSystemPreferencesThresholdManagement_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsThreshold_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings image uploader
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsToolsImageUploader_Sort")
	public static Object[][] SettingsToolsImageUploader_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsToolsImageUploader_Sort");
		return data;
	}

	/**
	 * @author Dishant Doshi data provider for sort settings image uploader
	 * @return excel data
	 * @creation date 07/01/2019
	 */
	@DataProvider(name = "SettingsToolsExchangeRate_Sort")
	public static Object[][] SettingsToolsExchangeRate_Sort() {
		Object[][] data = readExcelFileTo2D(SETTINGS_FILE_PATH, "SettingsToolsExchangeRate_Sort");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support customerDetails
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SuppportCustomerDetail")
	public static Object[][] SuppportCustomerDetail() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_CustomerDetail");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SuppportCustomerEKYCUpdate")
	public static Object[][] SuppportCustomerEKYCUpdate() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_EKYCUpdate");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerAccountBlockOrUnblock")
	public static Object[][] SupportCustomerAccountBlockOrUnblock() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_AccountBlockUnblock");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerTerminateAccount")
	public static Object[][] SupportCustomerTerminateAccount() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_TerminateAccount");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerLoginPinReset")
	public static Object[][] SupportCustomerLoginPinReset() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_LoginPinReset");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerStatementOfAccount")
	public static Object[][] SupportCustomerStatementOfAccount() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_StatementOfAccount");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerPhoneNumberEdit")
	public static Object[][] SupportCustomerPhoneNumberEdit() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_PhoneNumberEdit");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerResetSecurityQuestion")
	public static Object[][] SupportCustomerResetSecurityQuestion() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_ResetSecurityQuestion");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerManageNominee")
	public static Object[][] SupportCustomerManageNominee() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_ManageNominee");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerDeleteSubWallet")
	public static Object[][] SupportCustomerDeleteSubWallet() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_DeleteSubWallet");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerForcePocketUnlock")
	public static Object[][] SupportCustomerForcePocketUnlock() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_ForcePocketUnlock");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerStopSchedulePayments")
	public static Object[][] SupportCustomerStopSchedulePayments() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_StopSchedulePayments");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerTransactionReversal")
	public static Object[][] SupportCustomerTransactionReversal() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_TransactionReversal");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerBecomeAgent")
	public static Object[][] SupportCustomerBecomeAgent() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_BecomeAgent");
		return data;
	}
	/**
	 * @author shivani.patel data provider for support eKYCUpdate
	 * @return excel data
	 * @creation date 16/08/2019
	 */
	@DataProvider(name = "SupportCustomerResendNotification")
	public static Object[][] SupportCustomerResendNotification() {
		Object[][] data = readExcelFileTo2D(SUPPORT_FILE_PATH, "Cust_ResendNotification");
		return data;
	}
	
}
