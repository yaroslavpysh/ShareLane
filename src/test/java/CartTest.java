import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest {

    @Test
    public void discount1Book() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "0", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount19Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("19");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "0", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount20Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("20");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "2", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount49Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("49");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "2", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount50Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("50");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "3", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount99Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("99");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "3", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount100Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("100");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "4", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount499Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("499");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "4", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount500Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("500");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "5", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "5", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount1000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("1000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "6", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount4999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("4999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "6", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount5000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("5000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "7", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount9999Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("9999");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "7", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount10000Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("10000");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "8", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

    @Test
    public void discount11111Books() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Continue]")).click();
        driver.findElement(By.name("first_name")).sendKeys("test");
        driver.findElement(By.name("email")).sendKeys("test@test.test");
        driver.findElement(By.name("password1")).sendKeys("12345");
        driver.findElement(By.name("password2")).sendKeys("12345");
        driver.findElement(By.cssSelector("[value=Register]")).click();
        String login = driver.findElement(By.xpath("(//table//b)[2]")).getText();
        driver.get("https://www.sharelane.com/cgi-bin/main.py");
        driver.findElement(By.name("email")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys("1111");
        driver.findElement(By.cssSelector("[value=Login]")).click();
        driver.get("https://www.sharelane.com/cgi-bin/show_book.py?book_id=4");
        driver.findElement(By.cssSelector("[href='./add_to_cart.py?book_id=4']")).click();
        driver.get("https://www.sharelane.com/cgi-bin/shopping_cart.py");
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("11111");
        driver.findElement(By.cssSelector("[value=Update]")).click();
        String price = driver.findElement(By.xpath("((//table)[3]//td)[11]")).getText();
        String discountPercent = driver.findElement(By.xpath("(//table)[3]//b")).getText();
        String discountCash = driver.findElement(By.xpath("((//table)[3]//td)[13]")).getText();
        String total = driver.findElement(By.xpath("((//table)[3]//td)[14]")).getText();
        double priceDouble = Double.parseDouble(price);
        double totalDouble = Double.parseDouble(total);
        double discountCashDouble = Double.parseDouble(discountCash);
        double discountPercentDouble = Double.parseDouble(discountPercent);
        double discountCashCheckDouble = discountPercentDouble / 100;
        double quantityDouble = Double.parseDouble(driver.findElement(By.name("q")).getAttribute("value"));
        double totalCheckDouble = (quantityDouble * priceDouble) - ((quantityDouble * priceDouble) * discountCashCheckDouble);
        assertEquals(discountPercent, "8", "Discount % for " + quantityDouble + " books is not correct");
        assertEquals(totalDouble, totalCheckDouble, "Total price for " + quantityDouble + " books is not correct");
        assertEquals(discountCashDouble, discountCashCheckDouble, "Discount $ for " + quantityDouble + "books is not correct");
        driver.quit();
    }

}
