package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class AccountPage extends Utility {
    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOutButton;
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement withdrawlField;

    public void clickOnWithdrawl() {
        clickOnElement(withdrawlField);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement amountField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositSubmitField;
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawSubmitField;
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositSuccessfulField;
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionSuccessfulField;

    public String logoutbuttondisplay() {

        CustomListeners.test.log(Status.PASS, "logoutbuttondisplay " + logOutButton);
        return getTextFromElement(logOutButton);
    }

    public void clickOnDeposit() {
        CustomListeners.test.log(Status.PASS, "clickOnDeposit " + depositField);

        clickOnElement(depositField);
    }


    public void clickOnAmountField(String money) {
        CustomListeners.test.log(Status.PASS, "clickOnAmountField " + amountField);

        clickOnElement(amountField);
        sendTextToElement(amountField, money);
    }

    public void clickOnDepositSubmit() {
        CustomListeners.test.log(Status.PASS, "clickOnDepositSubmit " + depositSubmitField);

        clickOnElement(depositSubmitField);
    }

    public void clickOnWithdrawSubmit() {
        CustomListeners.test.log(Status.PASS, "clickOnWithdrawSubmit " + withdrawSubmitField);

        clickOnElement(withdrawSubmitField);
    }

    public String depositSuccessful() {
        CustomListeners.test.log(Status.PASS, "depositSuccessful " + depositSuccessfulField);

        return getTextFromElement(depositSuccessfulField);
    }

    public String transactionSuccessful() {
        CustomListeners.test.log(Status.PASS, "transactionSuccessful " + transactionSuccessfulField);

        return getTextFromElement(transactionSuccessfulField);
    }

    public void clickOnLogoutButton() {
        CustomListeners.test.log(Status.PASS, "clickOnLogoutButton " + logOutButton);

        clickOnElement(logOutButton);
    }
}

