package locator.pom.org;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.org.Class1;

public class LoginPage extends Class1 {

public LoginPage() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement txtUserName;

@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@name='pass']")} )
private WebElement txtPassword;

@FindBy(name="login")
private WebElement btnLogin;

public WebElement getTxtUserName() {
	return txtUserName;
}

public WebElement getTxtPassword() {
	return txtPassword;
}

public WebElement getBtnLogin() {
	return btnLogin;
}

}
