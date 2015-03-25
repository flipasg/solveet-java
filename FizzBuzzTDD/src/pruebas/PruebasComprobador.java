package pruebas;

import org.junit.Before;
import org.junit.Test;

import comprobador.Comprobador;
import junit.framework.TestCase;

public class PruebasComprobador extends TestCase{
	
	private Comprobador c;
	
	@Before
	protected void setUp(){
		c = new Comprobador();
	}
	
	@Test
	public void testEsFizz(){
		assertEquals("Fizz", c.esFizz(3));
	}
	
	@Test
	public void testEsFizzOtroNumero(){
		assertEquals("Fizz", c.esFizz(33));
	}
	
	@Test
	public void testEsBuzz(){
		assertEquals("Buzz", c.esBuzz(5));
	}
	
	@Test
	public void testEsBuzzOtroNumero(){
		assertEquals("Buzz", c.esBuzz(55));
	}
}
