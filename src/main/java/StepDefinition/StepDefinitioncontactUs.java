package StepDefinition;

import PageObjectModels._contactUs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class StepDefinitioncontactUs {
    private WebDriver driver;
    _contactUs _contactUs = new _contactUs();
    @Given("navigate to Website")
    public void navigateToWebsite() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("click on contact us button")
    public void clickOnContactUsButton() {
        _contactUs.clickContactUsButton();
    }

    @And("select Subject Heading")
    public void selectSubjectHeading() {
        _contactUs.selectFromDropdown();
    }

    @And("type Email")
    public void typeEmail() {
        _contactUs.typeEmail();
    }

    @And("type Order reference {string}")
    public void typeOrderReference(String arg0) {

        String order ="123";
        _contactUs.typeOrderReference(order);

    }

    @And("type a message")
    public void typeAMessage() {
        _contactUs.typeMessage();

    }

    @When("click on send button")
    public void clickOnSendButton() {
        _contactUs.clickOnSendButton();
    }

    @Then("verify success message")
    public void verifySuccessMessage() {
        _contactUs.assertMyMessage();
    }
}
