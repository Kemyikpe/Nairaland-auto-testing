import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NairaLandAuth {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String chromeTitle = nairaLandTest("https://www.nairaland.com/");

        registrationTest();
        loginTest();
        homepageTest();

        driver.quit();
    }

    private static String nairaLandTest(String url) {
        driver.get(url);
        return driver.getTitle();
    }

    private static void registrationTest() throws InterruptedException {
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("kemyikpe@gmail.com");
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
        Thread.sleep(2000); // wait to see result
    }

    private static void loginTest() throws InterruptedException {
        driver.get("https://www.nairaland.com/login");
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("Ekeminiii");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("SMpVzX4jB.tqf&v");
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='submit']"));
        loginButton.click();
        Thread.sleep(2000);
    }

    private static void homepageTest() {
        Assert.assertTrue(driver.getPageSource().contains("Welcome Ekeminiii"));
    }
}
