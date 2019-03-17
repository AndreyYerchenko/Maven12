import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentsTest {
    @Test

    public void testMethod(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://37.59.228.229:3000/");
        driver.findElement(By.cssSelector("body > div.row > div.col.s3.blue.lighten-5.list-container > a > i")).click();
        driver.findElement(By.xpath("//*[@id=\"icon_prefix\"]")).sendKeys("andrey");
        driver.findElement(By.xpath("//*[@id=\"icon_prefix\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"icon_telephone\"]")).sendKeys("1");
        driver.findElement(By.xpath("//*[@id=\"icon_telephone\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//input[@class='select-dropdown']")).sendKeys("Student");
        driver.findElement(By.xpath("//input[@class='select-dropdown']")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/a")).click();

        }

    }

