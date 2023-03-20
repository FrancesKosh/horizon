package StepDef;

import base.BaseUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {
    private BaseUtil base;
   // private BaseUtil horizon;

    public Hook(BaseUtil base)
    //, BaseUtil horizon)
        //this.horizon = horizon;
    {this.base = base;}

    @Before
    public void innitialize(){
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
    }
    @After
    public void teardown(){
        base.driver.close();
        base.driver.quit();
    }

}
