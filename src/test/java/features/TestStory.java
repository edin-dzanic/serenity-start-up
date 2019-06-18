package features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tasks.OpenTheApplication;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

@RunWith(SerenityRunner.class)
public class TestStory {

    @Managed
    WebDriver webBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    private Actor user;

    @Before
    public void userCanBrowseTheWeb() {
        this.user = Actor.named("User");
        user.can(BrowseTheWeb.with(webBrowser));
    }

    @Test
    public void testExample() {
        givenThat(user).wasAbleTo(openTheApplication);
    }
}
