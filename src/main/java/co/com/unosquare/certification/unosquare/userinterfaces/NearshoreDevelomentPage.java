package co.com.unosquare.certification.unosquare.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NearshoreDevelomentPage {
    public static final Target CENTER_EXCELLENCE_TEXT= Target.the("MAPPING the center excellente text tittle")
            .located(By.xpath("//*[contains(text(),'Centers of Excellence')][1]"));

    public static final Target FIRST_P= Target.the("MAPPING the text of the first paragraf")
            .located(By.xpath("//div[@id='agile']/div[2]/div/div[5]/p[1]"));

}
