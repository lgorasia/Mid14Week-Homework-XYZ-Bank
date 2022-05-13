package com.bank.testsuite;


import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;



    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void inIt() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        openAccountPage = new OpenAccountPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();
//        accountPage = new AccountPage();


    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {
        homePage.clickOnBankManagerLogIn();
        bankManagerLoginPage.clickOnAddCustomer();
        //add customer details
        addCustomerPage.clickOnFirstName("Hermoine");
        addCustomerPage.clickOnLastName("Granger");
        addCustomerPage.clickOnPostCode("HA29AJ");
        addCustomerPage.clickOnAddCustomer();
        String popupAlert = getTextFromAlert();
        String actualText = popupAlert.substring(0, 27);
        String expectedText = "Customer added successfully";
        Assert.assertEquals(actualText, expectedText);
        acceptAlert();
    }

        @Test(groups = {"smoke","sanity","regression"})
        public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLogIn();
        bankManagerLoginPage.clickOnOpenAccout();
        //enter customer details and click on process
            Thread.sleep(1000);
        openAccountPage.clickOnCustomerName();
        Thread.sleep(1000);
        openAccountPage.clickOnCurrency("Pound");
        Thread.sleep(1000);
        openAccountPage.clickOnProcess();
        String popUpMessage = getTextFromAlert();
        String actualmessage = popUpMessage.substring(0,28);
        String expectedMessage= "Account created successfully";
        Assert.assertEquals(actualmessage,expectedMessage);
        acceptAlert();
        }
        @Test(groups = {"smoke","regression"})
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        homePage.clickOnCustomerLogin();
        //Select customer and click on login
            Thread.sleep(1000);
        customersPage.clickOnYourName("Hermoine Granger");
        Thread.sleep(1000);
        customersPage.clickOnLogin();
        //verify "Logout" Tab displayed. and click it
            Thread.sleep(1000);
            accountPage.logoutbuttondisplay();


            String actualText= accountPage.logoutbuttondisplay();
            String expectedText ="Logout";
            Assert.assertEquals(actualText,expectedText);
           accountPage.clickOnLogoutButton();
        //verify you name is displayed
           String actualText1= customersPage.yourNameText();
           String expectedText1 = "Your Name :";
           Assert.assertEquals(actualText1,expectedText1);





        }
        @Test(priority = 1,groups = {"smoke","regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        homePage.clickOnCustomerLogin();
        Thread.sleep(3000);
            customersPage.clickOnYourName("Hermoine Granger");
        Thread.sleep(1000);
        customersPage.clickOnLogin();
        Thread.sleep(2000);

        accountPage.clickOnDeposit();
        accountPage.clickOnAmountField("100");
        accountPage.clickOnDepositSubmit();
        String actualMessage = accountPage.depositSuccessful();
        String expectedMessage = "Deposit Successful";
        Assert.assertEquals(actualMessage,expectedMessage);

        }
        @Test(priority = 2,groups = {"smoke","regression"})
    public  void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
            homePage.clickOnCustomerLogin();
            Thread.sleep(3000);
            customersPage.clickOnYourName("Hermoine Granger");
            Thread.sleep(1000);
            customersPage.clickOnLogin();
            Thread.sleep(2000);
            accountPage.clickOnWithdrawl();
            accountPage.clickOnAmountField("50");
            accountPage.clickOnWithdrawSubmit();
            String actualMessage = accountPage.transactionSuccessful();
            String expectedMessage = "Transaction successful";
            Assert.assertEquals(actualMessage,expectedMessage);

        }
    }





        



