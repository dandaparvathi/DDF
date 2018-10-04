package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import generic.Auto_c;
import generic.Excel;

public class Nau implements Auto_c{
	static {
		System.setProperty(key, value);
	}
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Log l=new Log(driver);
		driver.findElement(By.id("login_Layer")).click();
		
		String em=Excel.abc(excelpath, "sheet1",0,0);
		String pwd=Excel.abc(excelpath, "sheet1",0,1);
		l.username(em);
		l.password(pwd);
		l.logi();
		driver.close();
		
		
	}

}
