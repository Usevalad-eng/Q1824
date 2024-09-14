import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class AuthTest {

    @Test
    public void zipCodeShouldAccept5Digits(){
        WebDriver webDriver = new ChromeDriver();
        //open site https://www.sharelane.com/cgi-bin/register.py
        webDriver.get("https://www.sharelane.com/cgi-bin/register.py");

        //enter 12345 in zipcode field
        WebElement zipCode = webDriver.findElement(By.name("zip_code"));
        zipCode.sendKeys("12345");
        WebElement continueButton = webDriver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();
        //click continue button
        //expected result - can see Register button
        WebElement registerButton = webDriver.findElement(By.cssSelector("[value=Register]"));
        boolean displayed = registerButton.isDisplayed();
        assertTrue(displayed);
        //close browser
        webDriver.quit();

    }

    @Test
    public void userCanBeregisteredIfValidDataEntered(){
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");

        WebElement fnField = webDriver.findElement(By.name("first_name"));
        fnField.sendKeys("Ivan");
        WebElement lnField = webDriver.findElement(By.name("last_name"));
        fnField.sendKeys("Ivanov");
        WebElement email = webDriver.findElement(By.name("email"));
        fnField.sendKeys("Ivanov@mail.ru");
        WebElement pass = webDriver.findElement(By.name("password1"));
        fnField.sendKeys("password");
        WebElement confirmpass = webDriver.findElement(By.name("password2"));
        fnField.sendKeys("password");
        WebElement regButton = webDriver.findElement(By.cssSelector("[value=Register]"));
        regButton.click();
        String actualMessage = webDriver.findElement(By.cssSelector("[class=confirmation_massage]")).getText();
        String expectedMessage = "Account is created!";
        assertEquals(actualMessage,expectedMessage, "Text is not equal");
        webDriver.quit();

    }

    @Test
    public void test(){

    }

}
