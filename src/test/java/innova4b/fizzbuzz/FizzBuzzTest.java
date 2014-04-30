package innova4b.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz;

	@Before
	public void setUp() throws Exception {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void uno_devuelve_uno() {
		
		String resultado = fizzBuzz.get(1);
		
		assertEquals("1",resultado);
	}
	
	@Test
	public void dos_devuelve_dos() {
		assertEquals("2",fizzBuzz.get(2));
	}
	
	@Test
	public void tres_devuelve_Fizz() {
		assertEquals("Fizz",fizzBuzz.get(3));
	}
	
	@Test
	public void seis_devuelve_Fizz() {
		assertEquals("Fizz",fizzBuzz.get(6));
	}
	
	@Test
	public void cinco_devuelve_Buzz() {
		assertEquals("Buzz",fizzBuzz.get(5));
	}
	
	@Test
	public void quince_devuelve_FizzBuzz() {
		assertEquals("FizzBuzz",fizzBuzz.get(15));
	}
	

}
