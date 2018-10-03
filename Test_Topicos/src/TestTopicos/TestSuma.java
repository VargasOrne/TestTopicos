package TestTopicos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSuma {

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
		int resultado = c.sumar(2000, 2);
		assertEquals(2002, resultado);
	}
	
//
//	@Test
//	public void sumarMaximo()
//	{
//		Calculadora c = new Calculadora();
//		int resultado = c.sumar(1, 3);
// assertEquals(0, resultado);
//} 
//
}
