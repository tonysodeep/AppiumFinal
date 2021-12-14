import io.appium.java_client.android.AndroidDriver;
import io.netty.util.Timeout;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Basics extends Base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver driver = capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //xpath [tag Name]
        driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();

    }
}
