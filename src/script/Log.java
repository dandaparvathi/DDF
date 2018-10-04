package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log {
	@FindBy(name="email")
	private WebElement usernametb;

	@FindBy(id="pLogin")
	private WebElement passwordtb;

	@FindBy(xpath="//button[text()='Login']")
	private WebElement loginbtn;
	
	public Log(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	public void username(String em)
	{
		usernametb.sendKeys(em);
	}

	public void password(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}

	public void logi( )
	{
		loginbtn.click();
	}

}
