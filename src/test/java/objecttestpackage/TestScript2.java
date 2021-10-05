package objecttestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.SalesforceDriver;
import com.salesforceselen.core.SalesforceLex;

public class TestScript2 {
	
	public static void main(String []args){
		//initialize Salesforce driver
		try{
			System.out.println("initializing driver..");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			// Initialize browser
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://brijesh-sl-dev-ed.my.salesforce.com/?ec=302&startURL=%2Fsetup%2FforcecomHomepage.apexp%3Fsetupid%3DForceCom");
			driver.manage().window().maximize();
			System.out.println("navigagted to application");
			
			SalesforceDriver ddriver = new SalesforceLex(driver);
			ddriver.salesforce().pattern().getObj(Obj.textfield("Username")).enter("brijesh9971@gmail.com");
			ddriver.salesforce().pattern().getObj(Obj.textfield("Password")).enter("Anjli@1989B");
			ddriver.salesforce().pattern().getObj(Obj.button("Login",1,3)).click();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
