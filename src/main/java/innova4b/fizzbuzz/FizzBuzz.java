package innova4b.fizzbuzz;

public class FizzBuzz {

	public String get(int i) {
		String resultado = String.valueOf(i);
		if (esMultiploDeTres(i) && esMultiploDeCinco(i))
			resultado = "FizzBuzz";
		else if (esMultiploDeTres(i))
			resultado = "Fizz";
		else if (esMultiploDeCinco(i))
			resultado = "Buzz";
		return resultado;
	}

	private boolean esMultiploDeCinco(int i) {
		return i%5==0;
	}

	private boolean esMultiploDeTres(int i) {
		return i%3==0;
	}

}
