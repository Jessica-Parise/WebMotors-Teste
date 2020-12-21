package com.everis.beca.testesWebMotors;

import java.io.IOException;

import org.junit.Test;

import WebMotors.WebMotors.Utils;

public class Ct_05 {
	@Test
	public void testCarrosMaisUsados() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
		String[] carros = {"CIVIC", "COROLLA", "FIT", "GOL", "GOLF", " JETTA", "S10", "PALIO", "HB20", "ECOSPORT"};

		for (String carro : carros) {
			Utils.driver.getPageSource().contains(carro);
		}

		utils.takeScreenshots();
		utils.quitDriver();
	}
}
