package sauce_demo_automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sauceautomation {

    WebDriver driver;
    WebDriverWait wait;
    String baseUrl = "https://www.saucedemo.com";

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 1)
    public void testFlow1_ValidLoginAndCheckout() {

        // ── Login ──────────────────────────────────────────────────────────
        driver.get(baseUrl);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement title = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Assert.assertEquals(title.getText(), "Products");

        // ── Add products to cart ───────────────────────────────────────────
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

        WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(badge.getText(), "2");

        // ── Open cart ──────────────────────────────────────────────────────
        driver.findElement(By.className("shopping_cart_link")).click();

        WebElement cartTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Assert.assertEquals(cartTitle.getText(), "Your Cart");

        Assert.assertTrue(
                driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).isDisplayed());
        Assert.assertTrue(
                driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).isDisplayed());

        // ── Checkout Step 1: Info ──────────────────────────────────────────
        driver.findElement(By.id("checkout")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));

        driver.findElement(By.id("first-name")).sendKeys("Rajesh");
        driver.findElement(By.id("last-name")).sendKeys("Kumar");
        driver.findElement(By.id("postal-code")).sendKeys("600001");
        driver.findElement(By.id("continue")).click();

        // ── Checkout Step 2: Overview ──────────────────────────────────────
        WebElement overviewTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Assert.assertEquals(overviewTitle.getText(), "Checkout: Overview");

        // ── Finish order ───────────────────────────────────────────────────
        driver.findElement(By.id("finish")).click();

        WebElement completeTitle = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        Assert.assertEquals(completeTitle.getText(), "Checkout: Complete!");

        WebElement successHeader = driver.findElement(By.className("complete-header"));
        Assert.assertEquals(successHeader.getText(), "Thank you for your order!");
    }

    @Test(priority = 2)
    public void testFlow2_LockedUserLogin() {

        driver.get(baseUrl);

        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement errorContainer = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("[data-test='error']")));

        String expectedError = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertTrue(errorContainer.getText().contains(expectedError));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}