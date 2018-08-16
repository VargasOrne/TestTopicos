package TestTopicos;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import testTopicos.Calculadora;

public class Suma_Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void sumarTest()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(2, 2);
		assertEquals(4, resultado);
	}
	
@Test
	public void sumarMaximo()
	{
		Calculadora c = new Calculadora();
		int resultado = c.sumar(-1, 9);
		assertEquals(0, resultado);
		
	}
}
