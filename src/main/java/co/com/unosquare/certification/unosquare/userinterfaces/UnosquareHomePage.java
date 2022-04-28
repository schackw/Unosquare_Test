package co.com.unosquare.certification.unosquare.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UnosquareHomePage {
    public static final Target SERVICE_LIST = Target.the("MAPPING the option List service")
            .located(By.xpath("//a[@href='/Services'][1]"));
    public static final Target NDS_OPTION = Target.the("MAPPING the option Nearshore Development Services in the list")
            .located(By.xpath("//a[@href='/Services/DistributedAgileAugmentation'][1]"));
    public static final Target CONTACT_US_OPTION= Target.the("MAPPING the CONTACT us option")
            .located(By.xpath("//a[@href='/ContactUs'][1]"));
    public static final Target ABOUT_OPTION= Target.the("MAPPING the about option")
            .located(By.xpath("//a[@href='/About'][1]"));


}
