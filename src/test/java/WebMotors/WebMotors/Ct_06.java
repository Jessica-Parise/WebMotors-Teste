package WebMotors.WebMotors;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

public class Ct_06 {
	@Test
	public void testMenuOptions() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		Utils.driver.findElement(By.xpath("//*[@id=\"root\"]/header/nav/div/ul/li[5]/div[1]")).click();
		Utils.driver.findElement(By.xpath("//*[@id=\"userLoginRegister\"]")).click();
		Utils.driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jessica.parise@hotmail.com");
		Utils.driver.findElement(By.xpath("//*[@id=\"senha\"]")).sendKeys("Senha@");
		Utils.driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]")).click(); 
    	Utils.driver.getPageSource().contains("Jéssica Parise");

//		Utils.driver.manage().window().maximize();
//		Utils.driver.get("https://login.webmotors.com.br/?r=https://www.webmotors.com.br/garagem/propostas/compra");
//
//		WebElement campoEmail = Utils.driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		campoEmail.sendKeys("jessica.parise@hotmail.com");
//
//		WebElement campoSenha = Utils.driver.findElement(By.xpath("//*[@id=\"senha\"]"));
//		campoSenha.sendKeys("Senha@");
//
//		WebElement botaoEnviar = Utils.driver.findElement(By.xpath("//*[@id=\"btnEntrar\"]"));
//		botaoEnviar.click();

		utils.takeScreenshots();
		utils.quitDriver();
	}

}
