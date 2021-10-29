package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNG.Listener.class)
public class Register_test extends Astractclass {
	@Test (priority = 5)
	public static void RG02() {
		WebElement cl_regis = driver.findElement(By.xpath("//div[@class=\"button-group\"]/a[text()=\"ĐĂNG KÝ\"]"));
		cl_regis.click();
		//điền thông tin
		WebElement tk = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"UserName\"]"));
		tk.clear();
		tk.sendKeys("TesterVLU_1");
		WebElement ho_ten = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"Title\"]"));
		ho_ten.clear();
		ho_ten.sendKeys("ToiLaRobot01");
		WebElement mk = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"PasswordHash\"]"));
		mk.clear();
		mk.sendKeys("123456789*");
		WebElement mk_2 = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"SecurityStamp\"]"));
		mk_2.clear();
		mk_2.sendKeys("123456789*");
		WebElement email = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"Email\"]"));
		email.clear();
		email.sendKeys("chithientranvlu@gmail.com");
		WebElement phone = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"PhoneNumber\"]"));
		phone.clear();
		phone.sendKeys("0964253890");
		WebElement dc = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"Address\"]"));
		dc.clear();
		dc.sendKeys("01 Tran Hung Dao");
		WebElement dangky = driver.findElement(By.xpath("//button[text()=\"ĐĂNG KÝ TÀI KHOẢN\"]"));
		dangky.click();
		WebElement done = driver.findElement(By.xpath("//div[@class=\"center\"]/h2"));
		System.out.println("Xong TC"+ done.getText());
		
	}
	@Test (priority = 6)
	public static void RG01() {
		WebElement cl_regis = driver.findElement(By.xpath("//a[@class=\"btn btn-link ajax-content\"]"));
		cl_regis.click();
		driver.findElement(By.xpath("//form[@method='post']/child::div[6]//div[@class=\"controls\"]/label[1]/span[@class=\"checkmark\"]")).click(); //là nam
		WebElement namsinh = driver.findElement(By.xpath("//input[@id=\"UserBirthDate\"]"));
		namsinh.clear();
		namsinh.sendKeys("07/07/1999");
		WebElement tp_hcm = driver.findElement(By.xpath("//select/option[text()=\"TP HCM\"]"));
		tp_hcm.click();
		WebElement dangky = driver.findElement(By.xpath("//button[text()=\"ĐĂNG KÝ TÀI KHOẢN\"]"));
		dangky.click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"err-msg errors text-red\"]"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+error.getText());
		
	}
	@Test (priority = 7)
	public static void RG03() {
		WebElement cl_regis = driver.findElement(By.xpath("//div[@class=\"button-group\"]/a[text()=\"ĐĂNG KÝ\"]"));
		cl_regis.click();
		WebElement user_name = driver.findElement(By.xpath("//div[@class=\"controls\"]/input[@id=\"UserName\"]"));
		user_name.clear();
		user_name.sendKeys("TranChiThien");
		WebElement dangky = driver.findElement(By.xpath("//button[text()=\"ĐĂNG KÝ TÀI KHOẢN\"]"));
		dangky.click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"err-msg errors text-red\"]"));
		System.out.println("Xong TC"+"Lỗi ghi nhận: "+error.getText());	
	}
}
