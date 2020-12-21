package com.everis.beca.testesWebMotors;

//import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import WebMotors.WebMotors.Utils;

public class Ct_01 {

	@Test
	public void testMenu() throws IOException {

		Utils utils = new Utils();
		utils.createDriver();
		utils.testHello();
		
//		assertTrue("Se existe a opção Comprar", Utils.driver.getPageSource().contains("Comprar"));
//		assertTrue("Se existe a opção Vender", Utils.driver.getPageSource().contains("Vender"));
//		assertTrue("Se existe a opção Comprar", Utils.driver.getPageSource().contains("Serviços"));
//		assertTrue("Se existe a opção Vender", Utils.driver.getPageSource().contains("Ajuda"));
//		assertTrue("Se existe a opção Comprar", Utils.driver.getPageSource().contains("Entrar"));
		
		String[] elementos = {"Comprar", "Vender", "Serviços", "Ajuda", "Entrar"};
		
		for (String palavra : elementos) {
			Utils.driver.getPageSource().contains(palavra);
		}

		utils.takeScreenshots();
		utils.quitDriver();
	}

}