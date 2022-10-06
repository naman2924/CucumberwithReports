package stepDefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonFunctions;

/*public class HeaderSteps extends CommonFunctions {
    @Given("^I am on home page\"([^\"]*)\"$")
    public void i_am_on_home_page(String url) throws Throwable {
        driver.get(url);
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/button")).click();
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String footerLinkName) throws Throwable {
        driver.findElement(By.xpath("//a[text()='"+footerLinkName+"']")).click();
    }

    @Then("^I should be on page with text as \"([^\"]*)\"$")
    public void i_should_be_on_page_with_text_as(String expectedPageText) throws Throwable {
        String actualPageText = driver.findElement(By.xpath("//*[text()='"+expectedPageText+"']")).getText();
        Assert.assertEquals(expectedPageText, actualPageText);
       
    }
}
*/