package co.com.unosquare.certification.unosquare.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutPage {

    public static final Target PROFESSIONAL_TITTLE_TEXT= Target.the("MAPPING professional tittle")
            .located(By.xpath("//*[@id='about']/div[2]/div/div[2]/h5"));
    public static final Target PERSONAL_TITTLE_TEXT= Target.the("MAPPING personal tittle")
            .located(By.xpath("//*[@id='about']/div[2]/div/div[1]/h5"));
    public static final Target SOCIAL_TITTLE_TEXT= Target.the("MAPPING social tittle")
            .located(By.xpath("//*[@id='about']/div[2]/div/div[3]/h5"));
}
