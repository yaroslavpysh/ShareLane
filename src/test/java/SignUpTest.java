import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SignUpTest {

    public SignUpTest() {
    }

    @Test
    public void zipCode4Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("1234");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        String error = driver.findElement(By.cssSelector("[class=error_message]")).getText();
        assertEquals(error, "Oops, error on page. ZIP code should have 5 digits",
                "Zip Code Error message is not correct");
        driver.quit();
    }

    @Test
    public void zipCode5Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        boolean isOpened = driver.findElement(By.cssSelector("[value=Register]")).isDisplayed();
        assertTrue(isOpened, "Sign Up was not opened");
        driver.quit();
    }

    @Test
    public void zipCode6Digits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("123456");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        boolean isErrorShow = driver.findElement(By.cssSelector("[class=error_message]")).isDisplayed();
        assertTrue(isErrorShow, "Error message was not shown");
        driver.quit();
    }

    @Test
    public void FirstNameAlphabet() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isAccountCreated = driver.findElement(By.cssSelector("[class = confirmation_message]")).isDisplayed();
        assertTrue(isAccountCreated, "Account is not created with correct First Name");
        driver.quit();
    }

    @Test
    public void FirstNameDigits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("123");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String errorMessage = driver.findElement(By.cssSelector("[class=error_message]")).getText();
        assertEquals(errorMessage, "Oops, error on page. Some of your fields have invalid data or email was previously used",
                "Sign Up Error message is not correct");
        driver.quit();
    }


    @Test
    public void LastNameAlphabet() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("last_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isAccountCreated = driver.findElement(By.cssSelector("[class = confirmation_message]")).isDisplayed();
        assertTrue(isAccountCreated, "Account is not created with correct Last Name");
        driver.quit();
    }

    @Test
    public void LastNameDigits() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("last_name")).sendKeys("12345");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isErrorShow = driver.findElement(By.cssSelector("[class=error_message]")).isDisplayed();
        assertTrue(isErrorShow, "Sign Up Error message was not shown");
        driver.quit();
    }

    @Test
    public void CorrectEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isAccountCreated = driver.findElement(By.cssSelector("[class = confirmation_message]")).isDisplayed();
        assertTrue(isAccountCreated, "Account is not created with correct Email");
        driver.quit();
    }

    @Test
    public void IncorrectEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test.test@");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isErrorShow = driver.findElement(By.cssSelector("[class=error_message]")).isDisplayed();
        assertTrue(isErrorShow, "Sign Up Error message was not shown");
        driver.quit();
    }

    @Test
    public void PasswordEqualsPassword2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isAccountCreated = driver.findElement(By.cssSelector("[class = confirmation_message]")).isDisplayed();
        assertTrue(isAccountCreated, "Account is not created with correct Passwords");
        driver.quit();
    }

    @Test
    public void PasswordNotEqualsPassword2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("abcdef");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("test");
        driver.findElement(By.name("password2")).sendKeys("test1");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        boolean isErrorShow = driver.findElement(By.cssSelector("[class=error_message]")).isDisplayed();
        assertTrue(isErrorShow, "Error message Password1 not equals Password2 was not shown");
        driver.quit();
    }

    @Test
    public void PasswordFieldsHide() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        String passwordField1 = driver.findElement(By.name("password1")).getAttribute("type");
        String passwordField2 = driver.findElement(By.name("password2")).getAttribute("type");
        assertEquals(passwordField1, "password", "Password 1 is not used for password text fields");
        assertEquals(passwordField2, "password", "Password 2 is not used for password text fields");
        driver.quit();
    }

}
