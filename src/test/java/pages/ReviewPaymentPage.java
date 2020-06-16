package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewPaymentPage {
    static WebElement element = null;

    public static void review(WebDriverWait wait, String expectedMessage){
        element = wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//div[contains(text(),'The payment was successful')]")));
        String actualMessage = element.getText();
        System.out.println("actualMessage = " + actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);

    }
}
