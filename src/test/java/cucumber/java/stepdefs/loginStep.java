package cucumber.java.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.java.tekarch.sfdc.pom.HomePage;
import com.java.tekarch.sfdc.pom.LoginPage;

import io.cucumber.java.en.*;

public class loginStep {
	
	public HomePage homepage;
	public LoginPage loginpage;
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		loginpage=new LoginPage("firefox");
		try {
			homepage=loginpage.LoginApp("mspriyamohan106@agentforce.com", "1GlaksAd!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("user should see home page")
	public void user_should_see_home_page() {
		WebElement element = loginpage.driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td[2]/div[1]/div[1]/div/div[2]/span[1]/h1/a"));
		Assert.assertEquals(element.getText(), "Shanmugapriya M");
		homepage.driver.close();
	}
}
