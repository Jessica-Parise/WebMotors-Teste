package WebMotors.WebMotors;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ct_02 {
	@Test
	public void testMaisInformacoes() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();

		WebElement elemento = Utils.driver.findElement(By.xpath("/html/body/div[1]/footer/div/div[1]/div/span"));
		
		Utils.driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button")).click();
		
		elemento.click();

		assertTrue("Se existe a opção Buscar por regiões", Utils.driver.getPageSource().contains("Buscar por regiões"));
		assertTrue("Se existe a opção Marcas mais populares",
				Utils.driver.getPageSource().contains("Marcas mais populares"));
		assertTrue("Se existe a opção Modelos mais populares",
				Utils.driver.getPageSource().contains("Modelos mais populares"));

		utils.takeScreenshots();
		utils.quitDriver();
		
	}
}
