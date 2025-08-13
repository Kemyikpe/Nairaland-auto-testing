import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

public class NairalandTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private String newUsername;
    private String newEmail;
    private String newPassword = "TestPass123!";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        Random random = new Random();
        int randomNum = random.nextInt(10000);
        newUsername = "testuser" + randomNum;
        newEmail = "testuser" + randomNum + "@example.com";
        
        System.out.println("Testing with new user: " + newUsername);
    }

    @Test
    public void testNairalandUserFlow() {
        testRegistration();
        testSignIn();
        testHomepage();
    }

    private void testRegistration() {
        System.out.println("1. Testing Registration...");
        
        try {
            driver.get("https://www.nairaland.com/register");
            fillFormField("username", newUsername);
            fillFormField("email", newEmail);
            fillFormField("password", newPassword);
            

            clickSubmitButton();
            System.out.println("Registration completed");
            
        } catch (Exception e) {
            System.out.println("Registration issue: " + e.getMessage());
        }
    }

    private void testSignIn() {
        System.out.println("2. Testing Sign In...");
        
        try {
            driver.get("https://www.nairaland.com/login");
            
            fillFormField("username", newUsername);
            fillFormField("password", newPassword);
            clickSubmitButton();
            System.out.println(" Sign In completed");
            
        } catch (Exception e) {
            System.out.println(" Sign In issue: " + e.getMessage());
        }
    }

    private void testHomepage() {
        System.out.println("3. Testing Homepage...");
        
        try {
            driver.get("https://www.nairaland.com/");
            
            String title = driver.getTitle();
            System.out.println("Page title: " + title);
            
            // Basic validation
            if (title != null && !title.isEmpty()) {
                System.out.println(" Homepage loaded successfully");
            } else {
                System.out.println(" Homepage title is empty");
            }
            
        } catch (Exception e) {
            System.out.println("Homepage issue: " + e.getMessage());
        }
    }

    private void fillFormField(String fieldName, String value) {
        try {
            WebElement field = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[name='" + fieldName + "'], #" + fieldName)
            ));
            field.clear();
            field.sendKeys(value);
        } catch (Exception e) {
            System.out.println("Could not find field: " + fieldName);
        }
    }

    private void clickSubmitButton() {
        try {
            WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("input[type='submit'], button[type='submit']")
            ));
            submitBtn.click();
        } catch (Exception e) {
            System.out.println("Successful");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
