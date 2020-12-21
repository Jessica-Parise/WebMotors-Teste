package WebMotors.WebMotors;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;

public class Ct_04 {

	@Test
	public void testLinkFinanciar() throws IOException {
		
		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		Utils.driver.findElement(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[1]/h2[3]/a")).click();
		
		List<String> abas = new ArrayList<>(Utils.driver.getWindowHandles());
		Utils.driver.switchTo().window(abas.get(1));
		
	
		assertEquals(Utils.driver.getTitle(),"Financiamento de Veículos: Saiba + e veja parcelas | Webmotors");
		
		utils.takeScreenshots();
		utils.quitDriver();
	}
}
