package WebMotors.WebMotors;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	static WebDriver driver;
	
//	public Utils() {
//		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//	}

	// Antes de criar a classe, deve instanciar o seu navegador
	@BeforeClass
	public void createDriver() {
		// O sistema pega a propriedade chrome driver(chave) e depois o arquivo(valor)
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void testHello() {
		// Deixar em tela cheia
		driver.manage().window().maximize();
		driver.get("https://www.webmotors.com.br/");
		assertEquals(driver.getTitle(),"Webmotors | Compre, venda e financie carros usados, novos e motos");
	}

	@After
	public void takeScreenshots() throws IOException {
		SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyMMdd-HHmmss-SSSS");
		String fileName = formatoDeData.format(new Date());
		String shotName = String.format("%s.png", fileName);

		File finalShotFile = new File("C:\\WebMotors\\screenshot", shotName);
		File shotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(shotFile, finalShotFile);

	}

	// Quit fecha a janela do chrome e encerra o processo... Close fecha só a janela
	@AfterClass
	public void quitDriver() {
		driver.quit();
	}

}
