import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.assertj.core.api.Assertions;
import java.time.Duration;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EPL {
    private static WebDriver driver;
    String sut = "http://e.pl";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
//        System.out.println("Sterownik rozwiązany.");
    }

    @BeforeEach
    void setup() {
        driver = WebDriverManager.chromedriver().create();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    // 1 - test otwarcia strony
    @Test
    @Order(1)
    public void otwarcieStrony() {
        driver.get(sut);
        System.out.println("Test 1 Zakonczony");

        String expectedUrl = "http://e.pl/";
        String currentUrl = driver.getCurrentUrl();
        Assertions.assertThat(currentUrl).as("blad adresu url").isEqualTo(expectedUrl);
    }

    // 2 - test przeklikania górnego menu strony

    @Test
    @Order(2)
    public void przeklikanieMenu() {
        driver.get(sut);
        WebElement przyciskEmail = driver.findElement(By.cssSelector("a[title='Email']"));
        przyciskEmail.click();
        System.out.println("Strona to: " + driver.getTitle());

        WebElement przyciskDomeny = driver.findElement(By.cssSelector("a[title='Domeny']"));
        przyciskDomeny.click();
        System.out.println("Strona to: " + driver.getTitle());

        WebElement przyciskHosting = driver.findElement(By.cssSelector("a[title='Hosting']"));
        przyciskHosting.click();
        System.out.println("Strona to: " + driver.getTitle());

        System.out.println("Test 2 Zakonczony");
    }

    @Test
    @Order(3)
    public void wyszukiwanieDomeny() {
        driver.get(sut);
        String[] domenyDoSprawdzenia = {"programowanie", "testowanie", "pisanieProgramow"};
        String expectedURL = "http://e.pl/";
        String currentURL = driver.getCurrentUrl();
        Assertions.assertThat(currentURL).as("blad adresu url").isEqualTo(expectedURL);

        WebElement przyciskStronyDomen = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr[1]/td[1]/table[2]/tbody/tr[4]/td/table/tbody/tr/td/table/tbody/tr[3]/td/input"));
        //WebElement przyciskStronyDomen = driver.findElement(By.xpath("//input[@name = 'image']"));// Za dużo name = image na stronie wiec nie działa - bierze pierwsze z góry
        przyciskStronyDomen.click();


        String expectedDomainURL = "http://e.pl/domain.html";
        String currentDomainURL = driver.getCurrentUrl();
        Assertions.assertThat(currentDomainURL).as("blad adresu url domeny").isEqualTo(expectedDomainURL);

        for (int i=0; i<domenyDoSprawdzenia.length; i++) {
            WebElement poleDomen = driver.findElement(By.name("DomainName"));
            poleDomen.sendKeys(domenyDoSprawdzenia[i]);
            WebElement checkboxPl = driver.findElement(By.name("Domain[1]"));
            if (!checkboxPl.isSelected()){
                checkboxPl.click();
            }

            WebElement przyciskSprawdz = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input"));
            przyciskSprawdz.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            //WebElement przyciskNoweWyszukiwanie = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td/table/tbody/tr/td[3]/table/tbody/tr[2]/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/input[2]"));
            WebElement przyciskNoweWyszukiwanie = driver.findElement(By.cssSelector("input[src = '/file/generated_02045fad7a6678ea127995bbb0a969b2.gif']"));
            przyciskNoweWyszukiwanie.click();
        }
    }
}














