import java.util.Scanner;

public class App
{
	private static Scanner Input;

	public static void main(String[] args)
	{
		// Init scanner
		App.Input = new Scanner(System.in);
		
		
		// Inputs
		System.out.println("Please input an operator. (+, -, *, /)");
		String opertation = Input.nextLine();
		
		System.out.println("Please input your first value.");
		float x = Input.nextFloat();

		System.out.println("Please input your second value.");
		float y = Input.nextFloat();


		System.out.println("");
		System.out.println("=================================================");
		System.out.println("");
		
		
		float result = 0;


		// Check all operators
		switch (opertation) {
			case "+" ->
			{
				result = x + y;
			}
			case "-" ->
			{
				result = x - y;
			}
			case "*" ->
			{
				result = x * y;
			}
			case "/" ->
			{
				result = x / y;
			}
			default ->
			{
				System.out.println(opertation + " is not a valid operator!");
				return;
			}
		}


		// Check if result is an int so it doesn't print 1.0
		if (Math.Is_Intager(result))
		{
			System.out.println((int)result);
		}
		else
		{
			System.out.println(result);
		}

		System.out.println("");


		// Close scanner
		App.Input.close();
	}
}
