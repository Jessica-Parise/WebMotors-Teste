package com.everis.beca.testesWebMotors;

import java.io.IOException;

import org.junit.Test;

import WebMotors.WebMotors.Utils;

public class Ct_07 {
	@Test
	public void testSecaoWebmotors() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		String[] webmotors = {"Financiamento", "Venda seu veículo", "Catálogo de 0KM", "Seguro", "Tabela Fipe"};

		for (String web : webmotors) {
			Utils.driver.getPageSource().contains(web);
		}

		utils.takeScreenshots();
		utils.quitDriver();
	}
}