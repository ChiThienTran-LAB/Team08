package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNG.Listener.class)
public class Login_test {
	public class Login_Test extends Astractclass {
		@Test (priority = 1)
		public static void LG_01() //LG01 là login fail
		{
			WebElement qc = driver.findElement(By.xpath("//a[@href=\"#close-modal\"]"));
			qc.click();
			WebElement dn = driver.findElement(By.xpath("//a[text()='Đăng nhập']"));
			dn.click();
			driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click();
			String UserName = "Tester1";
			String Password = "12345qqq";
			WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
			user_name.clear();
			user_name.sendKeys(UserName);
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			pass.clear();
			pass.sendKeys(Password);
			WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
			btn_login.click();
			WebElement ket_qua = driver.findElement(By.xpath("//div[@class='internal']/div"));
			String text_kq = ket_qua.getText();
			System.out.println("Dang nhap that bai do: " +'\n'+text_kq);
			System.out.println("Xong TC1");
		}
		@Test (priority = 4)
		public static void LG_02() //LG02 là login true, chạy chót
		{
			String UserName = "TranChiThien";
			String Password = "0964253892";
			//xpath //div[@class='container modal']//div[@class='internal']/form/div[@class='row'][1]/div[2]/input
			WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
			user_name.clear();
			user_name.sendKeys(UserName);
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			pass.clear();
			pass.sendKeys(Password);
			WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
			btn_login.click();	
			System.out.println("Xong TC4");
		}
		@Test (priority = 2)
		public static void LG_03() {
			String UserName = "TranChiThien";
			WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
			user_name.clear();
			user_name.sendKeys(UserName);
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			pass.clear();
			pass.sendKeys("");
			WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
			btn_login.click();
			System.out.println("Xong TC2");
		}
		@Test (priority = 3)
		public static void LG_04() {
			String Password = "0964253892";
			WebElement user_name = driver.findElement(By.xpath("//input[@id='UserName']"));
			user_name.clear();
			user_name.sendKeys("");
			WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
			pass.clear();
			pass.sendKeys(Password);
			WebElement btn_login = driver.findElement(By.xpath("//button[@class='btn btn-submit']"));
			btn_login.click();
			System.out.println("Xong TC3");
		}
	}
}
