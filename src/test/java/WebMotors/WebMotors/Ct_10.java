package com.everis.beca.testesWebMotors;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import WebMotors.WebMotors.Utils;

public class Ct_10 {
	@Test
	public void testVerOferta() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();

		Utils.driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[2]/div/div/a")).click();
		Utils.driver.getPageSource().contains("Carros Novos e Usados em Todo o Brasil");

		utils.takeScreenshots();
		utils.quitDriver();
	}
}
