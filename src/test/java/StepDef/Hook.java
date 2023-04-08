package StepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hook extends BaseUtil {
    private BaseUtil base;
    // private BaseUtil horizon;

    public Hook(BaseUtil base)
    //, BaseUtil horizon)
    //this.horizon = horizon;
    {
        this.base = base;
    }

    @Before
    //  public class Hook extends BaseUtil {
    public void innitialize() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        DesiredCapabilities dp = new DesiredCapabilities();
        dp.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(dp);
        base.driver = new ChromeDriver(options);
        base.driver.manage().window().maximize();
        base.driver.get("https://hub-staging.tissl.com");
        base.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @After
    public void teardown() {
        base.driver.close();
        base.driver.quit();
    }

    private void takeScreenShoot() throws IOException {
        TakesScreenshot scrShot = ((TakesScreenshot) base.driver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File("target/screenshot" + System.currentTimeMillis() + ".png"));

    }
}