package com.everis.beca.testesWebMotors;

import java.io.IOException;

import org.junit.Test;

import WebMotors.WebMotors.Utils;

public class Ct_03 {

	@Test
	public void testElementosCategoria() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		String[] categorias = {"Sedans", "SUVs", "Frontier 2020", "Carros para família", "Carros a diesel", "Carros de luxo", "Carros econômicos", "Carros antigos", "Conversíveis", "Carros híbridos"};

		for (String cat : categorias) {
			Utils.driver.getPageSource().contains(cat);
		}

		utils.takeScreenshots();
		utils.quitDriver();
	}
}
