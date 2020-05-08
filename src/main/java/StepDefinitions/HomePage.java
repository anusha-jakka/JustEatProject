package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class HomePage {

    public static WebDriver driver;
    WebDriverWait wait;

    By areSearchBar=By.xpath("//input[@name='postcode']");
    By listPageSortText = By.xpath("//*[contains(text(),'Sorted by')]");
    By openRestaurants = By.xpath("//*[@data-search-count='openrestaurants']");
    By login = By.xpath("//a[contains(@class,'nav-link')]//*[text()='Log in']");
    By emailId = By.id("Email");
    By password = By.id("Password");
    By loginButton = By.xpath("//input[@type=\"submit\" and @value=\"Log in\"]");
    By userAccount = By.xpath("//*[@class='nav-link user']//*[text()='just eat']");
    By recaptcha = By.id("recaptcha-anchor-label");
    By recaptchaCheckbox = By.id("recaptcha-anchor");
//    By recaptchaVerify = By.id("recaptcha-verify-button");

    @Given("Browser is launched")
    public void lauchBrowser() {

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        driver=new FirefoxDriver();
        wait= new WebDriverWait(driver,30);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

    }

    @And("Navigate to Just Eat home page")
    public void navigateToUrl()
    {
        driver.get("http://www.just-eat.co.uk/");
    }

    @And("Close the browser")
    public void close_the_browser() {

        driver.close();

    }

    @When("The user enters the area code {string} in the search bar")
    public void theUserEntersTheAreaCodeInTheSearchBar(String areaCode) {

        driver.findElement(areSearchBar).clear();
        driver.findElement(areSearchBar).sendKeys(areaCode,Keys.ENTER);
    }

    @Then("The user is navigated to restaurant listing page")
    public void theUserIsNavigatedToRestaurantListingPage() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(listPageSortText));
        Assert.assertTrue(driver.findElement(listPageSortText).isDisplayed());

        //Total restaurants after filter
        System.out.println("Total open restaurants in searched area :"+driver.findElement(openRestaurants).getAttribute("data-search-count-orig"));
    }

    @When("The user clicks on Login link")
    public void theUserClicksOnLoginLink() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(login));
        driver.findElement(login).click();
    }

    @And("The user enters valid username as {string} and password as {string}")
    public void theUserEntersValidUsernameAsAndPasswordAs(String email, String pswd) {

        if(driver.findElement(recaptcha).isDisplayed())
        {
            driver.findElement(recaptchaCheckbox).click();

        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(emailId));
        driver.findElement(emailId).sendKeys(email);
        driver.findElement(password).sendKeys(pswd);
        driver.findElement(loginButton).click();

    }

    @Then("The user has logged in to Just eat")
    public void theUserHasLoggedInToJustEat() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(userAccount));
        Assert.assertTrue(driver.findElement(userAccount).isDisplayed());
    }
}
