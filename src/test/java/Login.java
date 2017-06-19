import com.codeborne.selenide.Configuration;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

//https://www-b.yellqatest.com/ - środowisko QA
//https://devpres10-vip.yellgroup.com/ - dev dla zespołu Reviews



public class Login {

    @Given("Go to the login page (.*)")
    public void goToLogInPage(String yell) throws Exception {
    Configuration.browser = "chrome";
        open(yell);
        $(By.linkText("My Account")).click();
    }
    @When("Enter in email (.*)")
    public void fillUsername(String username){
        $(By.id("username")).sendKeys(username);
    }
    @And("Enter password (.*)")
    public void fillPassword(String password) {
        $(By.id("password")).sendKeys(password);
    }
    @And("Click Login")
    public void clickLogin(){
        $(By.xpath("//button[@id='login']")).click();
    }
    @Then("Should be on the users home page (.*)")
    public void redirectToUsersHomePage(String homeUrl) {
        url().matches(homeUrl);
    }
    @Then("Should see Log Out")
    public void seeLogOut(){
        $(By.cssSelector(".userHero--menuItem")).shouldBe(visible);
    }
}
