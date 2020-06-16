package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayUserPage {
    public static WebElement element = null;

    public static void clickPayUser(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//a[@href='#banking.transactions.payment-user-to-user']")));
        element.click();
    }

    public static void clickContact(WebDriverWait wait){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//div[@class='checkableImageContainer'][2]")));
        element.click();
    }

    public static void selectContact(WebDriverWait wait) throws InterruptedException {
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//div[contains(text(),'Please, select an option')]")));
        element.click();
        Thread.sleep(2000);
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'The Coffee corner')]")));
        element.click();
    }

    public static void enterAmount(WebDriverWait wait, String amount){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//input[@class='inputField large rightAligned']")));
        element.sendKeys(amount);
    }

    public static void typeText(WebDriverWait wait, String text){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//textarea[@name='description']")));
        element.sendKeys(text);
    }

    public static void submit(WebDriverWait wait){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//div[contains(text(),'Submit')]")));
        element.click();
    }
}
