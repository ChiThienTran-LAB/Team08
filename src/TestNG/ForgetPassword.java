package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNG.Listener.class)
public class ForgetPassword extends Astractclass {
	@Test (priority = 8)
	public static void FP_01() {
		String url = "https://hoanghamobile.com/Account/ForgotPassword";
		driver.get(url);
//		WebElement dn = driver.findElement(By.xpath("//a[text()='Đăng nhập']"));
//		dn.click();
//		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
//		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class='just-center'][2]//input[2]"));
		nhap_email.clear();
		nhap_email.sendKeys("Chuabietcode@gmail.com");
//		driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click();
		driver.findElement(By.xpath("//div[@class='just-center'][2]//button")).click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"form-erros\"]/p/strong"));
		String kq_mongdoi = "Email Chuabietcode@gmail.com chưa được đăng ký, vui lòng chọn email khác hoặc thực hiện đăng ký tài khoản";
		String kq_thucte = error.getText();
		boolean kq;
		kq = kq_thucte.equals(kq_mongdoi);
		System.out.println("Kết quả TC FP_01:"+kq);
	
	}
	@Test (priority = 9)
	public static void FP_02() {
		String url = "https://hoanghamobile.com/Account/ForgotPassword";
		driver.get(url);
		WebElement mail = driver.findElement(By.xpath("//div[@class='just-center'][2]//input[2]"));
		mail.clear();
		mail.sendKeys("");
		driver.findElement(By.xpath("//div[@class='just-center'][2]//button")).click(); // gửi y/c
		WebElement error = driver.findElement(By.xpath("//div[@class='form-erros']//strong"));
		boolean kq;
		String kq_thucte = error.getText();
		String kq_mongdoi = "Bạn phải nhập email";
		kq = kq_mongdoi.equals(kq_thucte);
		System.out.println("Kết quả TC FP_02: "+ kq);
		
	}
	@Test (priority = 10,enabled = false) // chưa code xong
	public static void FP_03() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		nhap_email.sendKeys("chithien3203.vk.1718@gmail.com");
		driver.findElement(By.xpath("//div[@id=\"close-button-1545222288830\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-block btn-primary\"]")).click();
		WebElement error = driver.findElement(By.xpath("//div[@class=\"block-content block-content-full block-content-narrow\"]/p"));
		boolean kq;
		String kq_thucte = error.getText();
		String kq_mongdoi = "Chúng tôi đã gửi cho bạn một email hướng dẫn khởi tạo lại mật khẩu truy cập. Bạn hãy kiểm tra email và làm theo hướng dẫn.";
		kq = kq_mongdoi.equals(kq_thucte);
		System.out.println("Kết quả TC FP_03: "+ kq);
	}
}
