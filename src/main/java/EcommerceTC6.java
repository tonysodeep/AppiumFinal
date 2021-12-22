import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class EcommerceTC6 extends Base {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver driver = capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

        driver.hideKeyboard();

        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("android:id/text1")).click();

        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));

        //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));

        driver.findElement(By.xpath("//*[@text='Argentina']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();


        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(3000);

        TouchAction t=new TouchAction(driver);
        WebElement tc=driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));

        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(tc)).withDuration(Duration.ofSeconds(2))).release().perform();

        driver.findElement(By.id("android:id/button1")).click();

    }
}
