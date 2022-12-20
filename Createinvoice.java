package com.crm.systemtestscripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ConstantPath;
import com.crm.genericutility.SheetName;

public class Createinvoice extends BaseClass{

	@Test
	
		public void main()
		{

		Random ran=new Random();
		int names = ran.nextInt(1000);
		String name= Integer.toString(names);
		String firstName = excel.getExcelData(ConstantPath.FILE_PATH,SheetName.CONTACTS.convertToString(), 1, 0);
		String lastName = excel.getExcelData(ConstantPath.FILE_PATH,SheetName.CONTACTS.convertToString(), 1, 1);
		String mobileNumber = excel.getExcelData(ConstantPath.FILE_PATH,SheetName.CONTACTS.convertToString(), 1, 2);
		String organization_name = excel.getExcelData(ConstantPath.FILE_PATH, SheetName.ORGANIZATION.convertToString(), 2, 1);
		String phone_number = excel.getExcelData(ConstantPath.FILE_PATH, SheetName.ORGANIZATION.convertToString(), 2, 6);
		String memberOf = excel.getExcelData(ConstantPath.FILE_PATH,SheetName.ORGANIZATION.convertToString(), 2, 5);
		commonAction.clickOnOraganization();
		createOrganizationPage.clickOnCreateOrganization();
		createOrganizationPage.enterDataIntoUsernameTextFiled(organization_name+name);
		createOrganizationPage.clickOnmember_ofButton(driver);
	
		OrganizationPopupPage.selectMemberOf(memberOf, driver);
		createOrganizationPage.switchDriverTOMainWindow(driver);
		createOrganizationPage.clickOnphonenumber_textField(phone_number);
		
		createOrganizationPage.clickOnSaveButton();
		String actraul_organizationaName = createOrganizationPage.getCreateOrganization_name();
		Assert.assertEquals(organization_name+name, actraul_organizationaName);
		commonAction.clickOncontactsTabs();
		CreateContactsPage.clickOnCreateContactsBuuton();
		CreateContactsPage.enterDateTofistNameTaextFields(firstName+name);
		CreateContactsPage.enterDataToLastNameTextField(lastName);
		CreateContactsPage.enterDataToMobileTextField(mobileNumber);
		CreateContactsPage.clickOnOrganizationBuuton();
		driverUtility.switchingDriverTochild("submit=false&fromlink=&recordid=");
		OrganizationPopupPage.searchOragnization(actraul_organizationaName);
		OrganizationPopupPage.clickOnsearchButton();
		OrganizationPopupPage.selectOrganization();
		driverUtility.switchDriverToMainBrowser(driver, "View&parenttab=Marketing");
		createOrganizationPage.clickOnSaveButton();
	}
	
	
	
	
}

