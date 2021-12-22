import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AndroidDriver capabilities() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        File appDir = new File("src");
        File app = new File(appDir,"General-Store.apk");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2 XL API 30");
        cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
