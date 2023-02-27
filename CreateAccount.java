package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAccount {


	public WebElement firstname(WebDriver driver) {

		WebElement firstname  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input"));
		String Fname  =  firstname.getText();
		System.out.println("this is your first name : " + Fname );
		return firstname;
	}
	public WebElement lastname(WebDriver driver) {
		WebElement lastname  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		String lname  =  lastname.getText();
		System.out.println("this is your last name : " + lname );
		return lastname;
	}
	public WebElement enteremail(WebDriver driver) {
		WebElement enteremail =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		String email  =  enteremail.getText();
		System.out.println("this is your email  : " + enteremail );
		return enteremail;
	}
		public WebElement reemail(WebDriver driver) {
			WebElement reemail  =driver.findElement(By.xpath("	/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[3]/div/div/div[1]/input"));
			String reemail2  =  reemail.getText();
			System.out.println("this is your email  : " + reemail2 );
			return reemail;
	}
	public WebElement password(WebDriver driver) {
		WebElement password  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		String passwordshow  =  password.getText();
		System.out.println("this is your email  : " + passwordshow );
		return password;
	}
	
	

	public WebElement day(WebDriver driver) {
		WebElement day  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		 Select list =new Select(day);
		 list.selectByVisibleText("26");
		 WebElement selectd = list.getFirstSelectedOption();
		System.out.println(selectd.getText());
		return day;
	}
	public WebElement month(WebDriver driver) {
		WebElement month  =driver.findElement(By.xpath("//*[@id=\"month\"]"));
		 Select list =new Select(month);
		 list.selectByVisibleText("Feb");
		 WebElement selectm = list.getFirstSelectedOption();
		System.out.println(selectm.getText());
		return month;
	}
	public WebElement Year(WebDriver driver) {
		WebElement Year  =driver.findElement(By.xpath("//*[@id=\"year\"]"));
		 Select list =new Select(Year);
		 list.selectByVisibleText("1990");
		 WebElement selecty = list.getFirstSelectedOption();
		System.out.println(selecty.getText());
		return Year;
	}
	
	public WebElement gender(WebDriver driver) {
		WebElement gender  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label"));
		String passwordshow  =  gender.getText();
		System.out.println("this is your email  : " + gender );
		return gender;
	}
	public WebElement signin(WebDriver driver) {
		WebElement signin  =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button"));
		return signin;
	}
	
@Test
	public void signuppage(WebDriver driver) {
		firstname(driver).sendKeys("pradeep");
		lastname(driver).sendKeys("kumar");
		enteremail(driver).sendKeys("Test1234554321@gmail.com");
		reemail(driver).sendKeys("Test1234554321@gmail.com");
		password(driver).sendKeys("Pradeepkumar@123");
		day(driver).click();
		month(driver).click();
		Year(driver).click();
		gender(driver).click();
		signin(driver).click();
	}

}
