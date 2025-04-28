import org.example.models.Apartment;
import org.example.models.Plot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class ApartmentTest {
    public static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        acceptCookies();
    }

    private void acceptCookies(){
        driver.get("https://www.aruodas.lt/ideti-skelbima/?obj=1");
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @Test
    public void positiveTest(){
        Apartment p = new Apartment(driver, "Kaunas", "Kauno m.", "Senamiestis", "A. Jakšto", "15", "7", "4577-8566-4547:4411",
                "80", 4, 2, 2, false, "1909", false, "Mūrinis", "Dalinė apdaila", new int[]{1,8},
                "Butas", 0, new int[]{2,3}, new int[]{2,6,7,8,9,10}, new int[]{2,6,8},
                new int[]{1,8}, new int[]{1,2,3}, "A+",
                false, true, "butas miesto sirdyje", "apartment in the Old Town", "иван петров",
                new String[]{"mountain bike 9.jpg"}, "https://www.youtube.com/watch?v=kvy0JyAXKaw&ab_channel=Katarsis-Topic",
                "tour3d.com", "70000", "61234567", "bublik@one.lt", true, true, 1, true);
        p.fill();
        String actual = "";
        Assert.assertEquals(actual,"");
    }






}
