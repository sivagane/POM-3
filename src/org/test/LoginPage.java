package org.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
public LoginPage(){
	PageFactory.initElements(d, this);
}
@FindBy(id="email")
private WebElement user;

@FindBy(id="pass")
private WebElement pass;

@FindBy(id="loginbutton")
private WebElement Btn;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

public WebElement getBtn() {
	return Btn;
}


}