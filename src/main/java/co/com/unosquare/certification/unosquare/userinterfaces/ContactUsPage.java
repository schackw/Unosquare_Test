package co.com.unosquare.certification.unosquare.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactUsPage {

    public static final Target CONTACT_US_TEXT = Target.the("MAPPING the contact us text")
            .located(By.xpath("//*[contains(text(),'Contact us')][1]"));
    public static final Target SUBMIT_BOTTOM = Target.the("MAPPING the submit botton")
            .located(By.xpath("//*[@id='hsForm_2a32df81-981f-4329-b943-9f2e76efe5f0']/div[6]/div[2]/input"));
    public static final Target NAME_ERROR_MSG = Target.the("MAPPING error message about the field name")
            .located(By.xpath("//*[@id='hsForm_2a32df81-981f-4329-b943-9f2e76efe5f0']/div[1]/ul/li/label"));

    public static final Target EMAIL_ERROR_MSG = Target.the("MAPPING error message about the field EMAIL")
            .located(By.xpath("//*[@id='hsForm_2a32df81-981f-4329-b943-9f2e76efe5f0']/div[2]/ul/li/label"));

    public static final Target CNUMBER_LABEL = Target.the("MAPPING the field company number")
            .located(By.id("company-2a32df81-981f-4329-b943-9f2e76efe5f0"));

    public static final Target TNUMBER_LABEL = Target.the("MAPPING the field telephone number")
            .located(By.id("phone-2a32df81-981f-4329-b943-9f2e76efe5f0"));
}
