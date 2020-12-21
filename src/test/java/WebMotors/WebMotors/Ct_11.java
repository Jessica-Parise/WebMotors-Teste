package WebMotors.WebMotors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ct_11 {
	@Test
	public void ct03QueroVender() throws IOException {
		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		Utils.driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button")).click();
		
		Utils.driver.findElement(By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[1]/h2[2]/a")).click();
		
		List<String> abas = new ArrayList<>(Utils.driver.getWindowHandles());
		Utils.driver.switchTo().window(abas.get(1));
		
		WebElement pesquisa = Utils.driver.findElement(By.className("section__title"));
		String textoPesquisado = pesquisa.getText();
		
		System.out.println(textoPesquisado);
		if (textoPesquisado.contains("Anuncie na Webmotors e venda")) {
			assert(true);	
		}else {
			System.out.println("Referência não encontrada");
		}
		
		utils.takeScreenshots();
		utils.quitDriver();
		
	}
}
