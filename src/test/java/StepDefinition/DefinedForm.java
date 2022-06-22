package StepDefinition;

import io.cucumber.java.en.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefinedForm {
    WebDriver driver;

    public DefinedForm() {
    }

    @Given("the URL http:\\/\\/sampleapp.tricentis.com\\/{int}\\/app.php is available")
    public void the_url_http_sampleapp_tricentis_com_app_php_is_available(Integer int1) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.navigate().to("http://sampleapp.tricentis.com/101/app.php");
        this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
    }

    @When("I enter the necessary information to the Vehicle Data Section to the form")
    public void i_enter_the_necessary_information_to_the_vehicle_data_section_to_the_form() {
        List<WebElement> elements = this.driver.findElements(By.id("make"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("model"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("cylindercapacity"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("engineperformance"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("dateofmanufacture"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("numberofseats"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("righthanddriveyes"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("numberofseatsmotorcycle"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("fuel"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("payload"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("totalweight"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("listprice"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("licenseplatenumber"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("annualmileage"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("nextenterinsurantdata"));

        assert elements.size() > 0;

        this.driver.findElement(By.id("make")).click();
        WebElement dropdown = this.driver.findElement(By.id("make"));
        dropdown.findElement(By.xpath("//option[. = 'Audi']")).click();
        this.driver.findElement(By.id("model")).click();
        dropdown = this.driver.findElement(By.id("model"));
        dropdown.findElement(By.xpath("//option[. = 'Moped']")).click();
        this.driver.findElement(By.id("cylindercapacity")).sendKeys(new CharSequence[]{"1000"});
        this.driver.findElement(By.id("engineperformance")).sendKeys(new CharSequence[]{"100"});
        this.driver.findElement(By.id("dateofmanufacture")).sendKeys(new CharSequence[]{"05/05/2015"});
        this.driver.findElement(By.id("numberofseats")).click();
        dropdown = this.driver.findElement(By.id("numberofseats"));
        dropdown.findElement(By.xpath("//option[. = '5']")).click();
        this.driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span")).click();
        this.driver.findElement(By.xpath("//*[@id=\"numberofseatsmotorcycle\"]")).click();
        dropdown = this.driver.findElement(By.xpath("//*[@id=\"numberofseatsmotorcycle\"]"));
        dropdown.findElement(By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]")).click();
        this.driver.findElement(By.id("fuel")).click();
        dropdown = this.driver.findElement(By.id("fuel"));
        dropdown.findElement(By.xpath("//option[. = 'Gas']")).click();
        this.driver.findElement(By.id("payload")).sendKeys(new CharSequence[]{"500"});
        this.driver.findElement(By.id("totalweight")).sendKeys(new CharSequence[]{"1500"});
        this.driver.findElement(By.id("listprice")).sendKeys(new CharSequence[]{"100000"});
        this.driver.findElement(By.id("licenseplatenumber")).sendKeys(new CharSequence[]{"nu22reg"});
        this.driver.findElement(By.id("annualmileage")).sendKeys(new CharSequence[]{"100000"});
        this.driver.findElement(By.id("nextenterinsurantdata")).click();
    }

    @And("I enter the necessary information to the Insurant Data Section to the form")
    public void i_enter_the_necessary_information_to_the_insurant_data_section_to_the_form() {
        List<WebElement> elements = this.driver.findElements(By.id("firstname"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("lastname"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("birthdate"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("gendermale"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("streetaddress"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("country"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("zipcode"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("city"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("occupation"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("speeding"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("website"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("picture"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("preventervehicledata"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("nextenterproductdata"));

        assert elements.size() > 0;

        this.driver.findElement(By.id("firstname")).sendKeys(new CharSequence[]{"Testname"});
        this.driver.findElement(By.id("lastname")).sendKeys(new CharSequence[]{"LastTestName"});
        this.driver.findElement(By.id("birthdate")).sendKeys(new CharSequence[]{"12/07/1992"});
        this.driver.findElement(By.cssSelector(".field:nth-child(4) .ideal-radiocheck-label:nth-child(2) > .ideal-radio")).click();
        this.driver.findElement(By.id("streetaddress")).sendKeys(new CharSequence[]{"Rua da casa"});
        this.driver.findElement(By.id("country")).click();
        WebElement dropdown = this.driver.findElement(By.id("country"));
        dropdown.findElement(By.xpath("//option[. = 'Ghana']")).click();
        this.driver.findElement(By.id("zipcode")).sendKeys(new CharSequence[]{"81050000"});
        this.driver.findElement(By.id("city")).sendKeys(new CharSequence[]{"Cidade Teste"});
        this.driver.findElement(By.id("occupation")).click();
        dropdown = this.driver.findElement(By.id("occupation"));
        dropdown.findElement(By.xpath("//option[. = 'Employee']")).click();
        this.driver.findElement(By.cssSelector(".field:nth-child(10) .ideal-radiocheck-label:nth-child(1) > .ideal-check")).click();
        this.driver.findElement(By.cssSelector(".valid .ideal-radiocheck-label:nth-child(2) > .ideal-check")).click();
        this.driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(3) > .ideal-check")).click();
        this.driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(4) > .ideal-check")).click();
        this.driver.findElement(By.cssSelector(".ideal-radiocheck-label:nth-child(5) > .ideal-check")).click();
        this.driver.findElement(By.id("website")).click();
        this.driver.findElement(By.id("website")).sendKeys(new CharSequence[]{"google.com"});
        this.driver.findElement(By.id("nextenterproductdata")).click();
    }

    @And("I enter the necessary information to the Product Data Section to the form")
    public void i_enter_the_necessary_information_to_the_product_data_section_to_the_form() {
        List<WebElement> elements = this.driver.findElements(By.id("startdate"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("insurancesum"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.xpath("//*[@id=\"meritrating\"]"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("damageinsurance"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("EuroProtection"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("courtesycar"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("nextselectpriceoption"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("prevententerproductdata"));

        assert elements.size() > 0;

        this.driver.findElement(By.id("startdate")).sendKeys(new CharSequence[]{"08/01/2022"});
        this.driver.findElement(By.xpath("//*[@id=\"insurancesum\"]")).click();
        WebElement dropdown = this.driver.findElement(By.xpath("//*[@id=\"insurancesum\"]"));
        dropdown.findElement(By.xpath("//*[@id=\"insurancesum\"]/option[6]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"meritrating\"]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"meritrating\"]/option[2]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"damageinsurance\"]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"damageinsurance\"]/option[4]")).click();
        this.driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span")).click();
        this.driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span")).click();
        this.driver.findElement(By.xpath("//*[@id=\"courtesycar\"]")).click();
        dropdown = this.driver.findElement(By.xpath("//*[@id=\"courtesycar\"]"));
        dropdown.findElement(By.xpath("//*[@id=\"courtesycar\"]/option[3]")).click();
        this.driver.findElement(By.id("nextselectpriceoption")).click();
    }

    @And("I select the price option")
    public void i_select_the_price_option() {
        List<WebElement> elements = this.driver.findElements(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]"));

        assert elements.size() > 0;

        this.driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
        this.driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
        elements = this.driver.findElements(By.id("preventerproductdata"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("nextsendquote"));

        assert elements.size() > 0;

        this.driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
        this.driver.findElement(By.id("nextsendquote")).click();
    }

    @And("I enter the necessary information to the send Quote section")
    public void i_enter_the_necessary_information_to_the_send_quote_section() {
        List<WebElement> elements = this.driver.findElements(By.id("email"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("phone"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("username"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("password"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("confirmpassword"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("Comments"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("prevselectpriceoption"));

        assert elements.size() > 0;

        elements = this.driver.findElements(By.id("sendemail"));

        assert elements.size() > 0;

        this.driver.findElement(By.id("email")).sendKeys(new CharSequence[]{"2107.kathy@gmail.com"});
        this.driver.findElement(By.id("phone")).sendKeys(new CharSequence[]{"5541998246129"});
        this.driver.findElement(By.id("username")).sendKeys(new CharSequence[]{"TestUser"});
        this.driver.findElement(By.id("password")).sendKeys(new CharSequence[]{"Admin123"});
        this.driver.findElement(By.id("confirmpassword")).sendKeys(new CharSequence[]{"Admin123"});
        this.driver.findElement(By.id("Comments")).sendKeys(new CharSequence[]{"No comments. Thank you"});
        this.driver.findElement(By.id("sendemail")).click();
    }

    @Then("the system shows me the sending success alert")
    public void the_system_shows_me_the_sending_success_alert() {
        this.driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
        String successText = this.driver.findElement(By.xpath("/html/body/div[4]/h2")).getText();
        Assert.assertEquals("Sending e-mail success!", successText);
    }
}
