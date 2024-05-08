package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    //creating obj to user data from resources
     LoadProp loadProp = new LoadProp();
     private By _DOB = By.name("DateOfBirthDay");
    private By _MOB = By.name("DateOfBirthMonth");
    private By _YOB = By.name("DateOfBirthYear");
    private By _registerButton = By.id("register-button");
    private By _firstName = By.id("FirstName");
    private By _seondName = By.id("LastName");




//method to fill details on register page
public void fillRegistrationDetails() {
    //type first name
    typeText(_firstName, loadProp.getProperty("firstName"));

    //type second name
    typeText(_seondName, loadProp.getProperty("lastName"));

    //type DOB by value
    selectByValue(_DOB, loadProp.getProperty("dateOfBirth"));

    //type MOB by text
    selectByText(_MOB, loadProp.getProperty("monthOfBirth"));

    //type YOB by value
    selectByValue(_YOB, loadProp.getProperty("yearOfBirth"));

    //type email id using random date
    typeText(By.name("Email"), loadProp.getProperty("emailPart1")+randomDate()+loadProp.getProperty("emailPart2"));

    //type password
    typeText(By.name("Password"), loadProp.getProperty("password"));

    //confirm password
    typeText(By.id("ConfirmPassword"), loadProp.getProperty("confirmPassword"));

    //click on register submit button
    clickOnElement(_registerButton);


}

}
