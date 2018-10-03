package com.orne.taismaven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
		public	void testSuma1() {
			Calculadora c = new Calculadora();
			int suma= c.suma(6, 140);
			assertEquals(146, suma);
		}

		@Test
		public	void testResta1() {
			Calculadora c = new Calculadora();
			int restando= c.resta(60, 14);
			assertEquals(46, restando);
		}
		@Test
		public	void testProducto1() {
			Calculadora c = new Calculadora();
			int multi= c.producto(6, 10);
			assertEquals(60, multi);
		}
		@Test
		public void testProducto2() {
			Calculadora c = new Calculadora();
			int multi=c.producto(5,10);
			assertEquals (10, multi);
			}
	}


