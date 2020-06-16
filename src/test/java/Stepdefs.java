import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static pages.LoginPage.*;
import static pages.PayUserPage.*;
import static pages.ReviewPaymentPage.*;
import static pages.TransferDetailsPage.*;
import static pages.WelcomePage.*;

public class Stepdefs {
    static WebDriver driver;
    static WebDriverWait wait;

    @Before
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver .exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        }

    @Given("the user navigates to {string}")
    public void theUserNavigatesTo(String url) {
        navigate(driver, url);
    }

    @When("the user enters username {string}")
    public void theUserEntersUsername(String username) {
        enterUsername(wait, username);
    }

    @And("the user enters password {string}")
    public void theUserEntersPassword(String password) {
        enterPassword(wait, password);
    }

    @And("the user clicks sign in button")
    public void theUserClicksSignInButton() {
        clickSignIn(wait);
    }

    @And("the user clicks pay user")
    public void theUserClicksPayUser() {
        clickPayUser(wait);
    }

    @And("the user clicks Contact")
    public void theUserClicksContact() {
        clickContact(wait);
    }

    @And("the user selects {string} from contact")
    public void theUserSelectsFromContact(String arg0) throws InterruptedException {
        selectContact(wait);
    }

    @And("the user enters {string} to amount area")
    public void theUserEntersToAmountArea(String amount) {
        enterAmount(wait, amount);
    }

    @And("the user types {string} to description")
    public void theUserTypesToDescription(String text) {
        typeText(wait, text);
    }

    @And("the user clicks submit")
    public void theUserClicksSubmit() {
        submit(wait);
    }

    @And("the user clicks confirm")
    public void theUserClicksConfirm() {
        confirm(wait);
    }

    @Then("the user views {string} on transfer page")
    public void theUserViewsOnTransferPage(String expectedMessage) {
        review(wait, expectedMessage);
    }
}
