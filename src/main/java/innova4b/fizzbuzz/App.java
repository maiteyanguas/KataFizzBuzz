package innova4b.fizzbuzz;

public class App 
{
    public static void main( String[] args )
    {
    	FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i=1; i<=100; i++)
        	System.out.println(fizzbuzz.get(i));

    }
}
