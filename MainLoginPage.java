package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MainLoginPage {

	@BeforeMethod
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Cb%7Cfb%20create%20account%7C&placement=&creative=589460569870&keyword=fb%20create%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-332264388364%26loc_physical_ms%3D9298970%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIxcumqJi1_QIVRDVyCh35sATDEAAYASAAEgK6YPD_BwE");
		driver.manage().window().maximize();
		 
		

		CreateAccount run = new CreateAccount();
		run.signuppage(driver);

	}
	@AfterMethod
	public void close(WebDriver driver) {
		driver.close();
	}

	}


