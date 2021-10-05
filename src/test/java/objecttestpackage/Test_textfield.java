package objecttestpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.salesforceselen.core.Attribute;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.ObjectDriver;
import com.salesforceselen.core.SalesforceDriver;
import com.salesforceselen.core.SalesforceLex;

public class Test_textfield {
	
	public static void main(String []args){
		System.out.println("initializing driver..");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://brijesh-sl-dev-ed.my.salesforce.com/?ec=302&startURL=%2Fsetup%2FforcecomHomepage.apexp%3Fsetupid%3DForceCom");
		driver.manage().window().maximize();
	}
	
	public void test_method01(WebDriver driver) {
		// initialize Salesforce driver
		SalesforceDriver sdriver = new SalesforceLex(driver);
		ObjectDriver newdriver = sdriver.salesforce().pattern().getObjectDriver();
		try {
			newdriver.getObj(Obj.textfield("Username")).enter("brijesh9971@gmail.com");
			newdriver.getObj(Obj.textfield("Password")).enter("Anjli@1989B");
			newdriver.getObj(Obj.button("Login", 1, 3)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void test_method02(WebDriver driver) {
		// initialize Salesforce driver
		SalesforceDriver sdriver = new SalesforceLex(driver);
		ObjectDriver newdriver = sdriver.salesforce().pattern().getObjectDriver();
		try {
			String [] user_attribute = {Attribute.obj.id("username")};
			newdriver.getObj(Obj.textfield("Username",user_attribute)).enter("brijesh9971@gmail.com");
			newdriver.getObj(Obj.textfield("Password")).enter("Anjli@1989B");
			newdriver.getObj(Obj.button("Login", 1, 3)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
