package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TransferDetailsPage {
    static WebElement element = null;

    public static void confirm(WebDriverWait wait){
        element = wait.until(ExpectedConditions.presenceOfElementLocated(By
                .xpath("//div[contains(text(),'Confirm')]")));
        element.click();
    }
}
