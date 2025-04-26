import org.example.models.Plot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PlotTests {
    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        acceptCookies();
    }

    private void acceptCookies(){
        driver.get("https://aruodas.lt/ideti-skelbima/?obj=11&offer_type=1");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void positiveTest(){
        Plot p = new Plot(driver, "Vilnius", "Vilniaus m.", "Šeškinė", "Dūkštų", "49", "4951-4747-1234:4951", "10",
                new int[]{1,10}, new int[]{1,3,5,8,9}, true, false, "sklypas prie juros", "plot by the sea", "иван петров",
                new String[]{"mountain bike 9.jpg"},"https://www.youtube.com/watch?v=kvy0JyAXKaw&ab_channel=Katarsis-Topic","tour3d.com","70000","61234567","bublik@one.lt",
                false,true,1,true);
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }






















}
