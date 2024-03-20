import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("C:/Users/pc/Desktop/Stronaw/index.html");
        System.out.println("adres strony to " +  driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement Paragraf = driver.findElement(By.tagName("p"));

        List<WebElement> listaP = driver.findElements(By.tagName("p"));

        for (WebElement i:listaP) {
            System.out.println("ElementListy:" + i.getText());
        }
//        String zawartosc = Paragraf.getText(i.getText());
//
//        System.out.println(zawartosc);
        WebElement pierwszyParagraf = driver.findElement(By.name("pierwszyParagraf"));
        System.out.println("odnajdywanie po atrybucie name: " + pierwszyParagraf.getText());


        WebElement paragrafPoId = driver.findElement(By.id("pierwszyeId"));
        System.out.println("Odnajdywanie po atrybucie id " + paragrafPoId.getText());


        WebElement paragrafOdnalezionypoKlasie = driver.findElement(By.className("paragraf3"));
        System.out.println("odnalezione po adrybucie klass" + paragrafOdnalezionypoKlasie.getText());


        WebElement Xpath = driver.findElement(By.xpath("//h3[@class='Kl1']"));
        System.out.println("odnajdz po Xpath" + Xpath.getText());

        WebElement akapitPoWlasnymAtrybucie = driver.findElement(By.cssSelector("p['data-test-id=paragraphOne']"));
        System.out.println( "odnajdz po wlasnym atrybucie"+ akapitPoWlasnymAtrybucie.getText());


        driver.quit();



    }
}
