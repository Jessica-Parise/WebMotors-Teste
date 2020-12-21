package WebMotors.WebMotors;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ct_09 {
	@Test
	public void testBarraPesquisa() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();

		By locatorPesquisa = By.className("SearchBar__input");
		WebElement pesquisa = Utils.driver.findElement(locatorPesquisa);
		pesquisa.sendKeys("Jetta");

		if (Utils.driver.getPageSource().contains("Jetta")) {
			By locatorResultado = By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a");

			// Espera
			WebDriverWait wait = new WebDriverWait(Utils.driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(locatorResultado));

			WebElement resultado = Utils.driver.findElement(locatorResultado);
			resultado.click();

			utils.takeScreenshots();
			Utils.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			utils.quitDriver();

		}
	}
}
