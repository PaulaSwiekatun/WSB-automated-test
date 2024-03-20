import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StronaToolplate {

public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    String sut = "C://Users//pc//IdeaProjects//wsb//src//web-template/index.html";
            driver.get(sut);

    System.out.println("Tytul to: " + driver.getTitle());
    System.out.println("Biezacy url to: " + driver.getCurrentUrl());

    WebElement  elementDiv = driver.findElement(By.tagName("div"));
    System.out.println(elementDiv.getText());

    List<WebElement> obiektyDiv = driver.findElements(By.tagName("div"));

    int numerZnacznika = 1;
    for(WebElement konkretnydiv:obiektyDiv) {
        System.out.println("Znacznik: " + konkretnydiv.getTagName());
        System.out.println("Nazwa: " + konkretnydiv.getAttribute("name"));
        System.out.println("ID: " + konkretnydiv.getAttribute("id"));
        System.out.println("Klasa: " +konkretnydiv.getAttribute("class"));
        System.out.println("----------------------");
        numerZnacznika++;
    }



    driver.quit();

 }

}
