package homework_week_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class Project_5_Com_Utimateqa {

    static String browser = "chrome";
    //baseURL
    static String baseUrl = " https://courses.ultimateqa.com/";

    static WebDriver driver;

    public static void main(String[] args) {

        //setup browser
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        // Open URL
        driver.get(baseUrl);

        // Print the title of the page.
        System.out.println("The title of page is : " + driver.getTitle());

        // Print the current url.
        System.out.println("Current URL is : " + driver.getCurrentUrl());

        // Print the page source.
        System.out.println("The source of the page is : " + driver.getPageSource());

        // Click on ‘Sign In’ link
        driver.findElement(By.className("header__nav-sign-in")).click();

        // Print the current url
        System.out.println("After clicking the sign in button, current URL is : " + driver.getCurrentUrl());

        // Enter the email to email field.
        driver.findElement(By.id("user[email]")).sendKeys("testNG123@gmail.com");

        // Enter the password to password field.
        driver.findElement(By.id("user[password]")).sendKeys("TestNG123");

        // Click on Login Button.
        driver.findElement(By.className("g-recaptcha")).click();

        // Navigate to baseUrl.
        driver.get(baseUrl);

        // Navigate forward to Homepage.
        driver.navigate().forward();

        // Navigate back to baseUrl.
        driver.navigate().back();

        // Refresh the page.
        driver.navigate().refresh();

        // Close the browser.
        driver.quit();
        System.out.println("im out");
    }
}