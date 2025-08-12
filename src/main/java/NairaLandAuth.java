import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NairaLandAuth {

    private static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();

        String chromeTitle = nairaLandTest("https://www.nairaland.com/");
        System.out.println(chromeTitle);

        registrationTest();
        loginTest();
        homepageTest();

        driver.quit();
    }

    private static String nairaLandTest(String url) {
        driver.get(url);
        return driver.getTitle();
    }

    private static void registrationTest() {
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("kemyikpe@gmail.com");
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();
    }
    private static void loginTest() {
        WebElement userNameInput = driver.findElement(By.name("username"));
        userNameInput.sendKeys("Ekeminiii");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("SMpVzX4jB.tqf&v");
        WebElement loginButton = driver.findElement(By.cssSelector("input[type='login']"));
        loginButton.click();
    }

    private static void homepageTest() {
        Assert.assertTrue(driver.getPageSource().contains("Welcome Ekeminiii"));

    }

}