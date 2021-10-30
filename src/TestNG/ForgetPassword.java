package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners (TestNG.Listener.class)
public class ForgetPassword extends Astractclass {
	
	//khai bao du lieu
	private static final String path_file = "D:\\HK1 2021 -2022\\Automation Testing\\DoAn\\Team08\\data.xlsx";
	private static final String sheet_name_cp = "Check_Password";
	public static final String url_quenmk = "https://hoanghamobile.com/Account/ForgotPassword";
	private static int COL_DATA = 2;
	private static int COL_MONGDOI = 4;
	private static int COL_KETQUA = 5;
	
	
	//khai bao cho excel file
	@Test (priority = 8)
	public void check_run() throws Exception {
		ExcelUtils.setExcelFile(path_file, sheet_name_cp);
	}
	@Test (priority = 9)
	public static void FP_01() throws Exception {
		driver.get(url_quenmk);
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class='just-center'][2]//input[2]"));
		WebElement error = driver.findElement(By.xpath("//div[@class=\"form-erros\"]/p/strong"));
		nhap_email.clear();
		for(int i = 1; i<=ExcelUtils.getRowUsed(); i++)
		{
			String data_1 = ExcelUtils.getCellData(i,COL_DATA);
			String mongdoi = ExcelUtils.getCellData(i, COL_MONGDOI);
			//Step 1: input email
			nhap_email.sendKeys(data_1);
			//Step 2: get error
			String thucte = error.getText();
			//Step 3: click cap lai mk
			driver.findElement(By.xpath("//div[@class='just-center'][2]//button")).click();
			//Step 4: so sanh
			if(mongdoi.equals(thucte)==true) {
				ExcelUtils.setCellData(i, COL_KETQUA, "PASSED");
			}
			else {
				ExcelUtils.setCellData(i, COL_KETQUA, "Failure");
			}
		}
		System.out.println("Xong TC FP_01");
	}
	@Test (priority = 10,enabled = false) // chưa code xong
	public static void FP_02() {
		driver.get(url_quenmk);
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
	@Test (priority = 11,enabled = false) // chưa code xong
	public static void FP_03() {
		WebElement cl_quenmk = driver.findElement(By.xpath("//a[@class=\"ajax-content\"]"));
		cl_quenmk.click();
		WebElement nhap_email = driver.findElement(By.xpath("//div[@class=\"row\"]/input[@id=\"Email\"]"));
		nhap_email.clear();
		//nhap_email.sendKeys("chithien3203.vk.1718@gmail.com");
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
