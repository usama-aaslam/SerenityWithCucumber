package pages.Login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    /*public LoginPage() {
        open();
    }*/

    @Step
    public void enterCredentials(){
        $( By.id( "user-name" )).type( "standard_user" );
        $(By.id( "password" )).type( "secret_sauce" );

    }

    public void clickLoginButton(){
        $(By.id( "login-button" )).click();
    }

    @Step
    public  void verifyLogin(){
        String homePageURL = getDriver().getCurrentUrl();
        Assertions.assertEquals( "https://www.saucedemo.com/inventory.html", homePageURL );

    }
}
