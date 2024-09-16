import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AuthTest {
private static final String url = "https://www.sharelane.com/cgi-bin/register.py";
    @Test
    public void zipCodeShouldAccept5Digits(){
        WebDriver webDriver = new ChromeDriver();
        //open site https://www.sharelane.com/cgi-bin/register.py
        webDriver.get(url);

        //enter 12345 in zipcode field
        WebElement zipCode = webDriver.findElement(By.name("zip_code"));
        zipCode.sendKeys("12345");
        WebElement continueButton = webDriver.findElement(By.cssSelector("[value=Continue]"));
        continueButton.click();
        //click continue button
        //expected result - can see Register button
        WebElement registerButton = webDriver.findElement(By.cssSelector("[value=Register]"));
        boolean displayed = registerButton.isDisplayed();

        assertTrue("russian language", displayed);

        //close browser
        webDriver.quit();
    }

    @Test
    public void zipCodeShouldNotAcceptEmptyFields(){
        WebDriver webDriver = new ChromeDriver();

        webDriver.get(url);
        WebElement zipCode = webDriver.findElement(By.name("zip_code"));
        zipCode.sendKeys("");
        WebElement continueButton = webDriver.findElement(By.cssSelector("[value = Continue]"));
        continueButton.click();

        WebElement errorMessage = webDriver.findElement(By.cssSelector("[class = error_message]"));
        String actualErrorMessage = errorMessage.getText();
        String expectedErrorMessage = "Oops, error on page. ZIP code should have 5 digits";

        assertEquals("", actualErrorMessage,expectedErrorMessage);

        webDriver.quit();
    }


    @Test
    public void userCanBeregisteredIfValidDataEntered(){
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=12345");

        WebElement firstName = webDriver.findElement(By.name("first_name"));
        firstName.sendKeys("Ivann");
        WebElement lastName = webDriver.findElement(By.name("last_name"));
        lastName.sendKeys("Ivanovv");
        WebElement email = webDriver.findElement(By.name("email"));
        email.sendKeys("Ivan@mail.ru");
        WebElement pass = webDriver.findElement(By.name("password1"));
        pass.sendKeys("1111");
        WebElement confirmPass = webDriver.findElement(By.name("password2"));
        confirmPass.sendKeys("1111");
        WebElement registrationButton = webDriver.findElement(By.cssSelector("[value=Register]"));
        registrationButton.click();
        //String actualMessage = webDriver.findElement(By.cssSelector("[class=confirmation_massage]")).getText();
        String actualMessage =
                webDriver.findElement(By.xpath("/html/body/center/table/tbody/tr[4]/td/span")).getText();
        String expectedMessage = "Account is created!";

        assertEquals("Text is not equal", actualMessage,expectedMessage);

        webDriver.quit();
    }
}