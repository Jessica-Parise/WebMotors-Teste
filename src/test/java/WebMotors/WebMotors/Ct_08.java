package WebMotors.WebMotors;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

public class Ct_08 {

	@Test
	public void testAceitarCookie() throws IOException {
		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		Utils.driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button")).click();
		
		utils.takeScreenshots();
		utils.quitDriver();
		
	}
}
