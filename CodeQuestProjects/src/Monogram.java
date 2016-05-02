import java.util.Scanner;

public class Monogram
	{
		
		public static void main(String[] args)
			{
				AskForNames();
				
			}
	
		public static void AskForNames()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Tell me your full name including first, middle, and last name.");
			String name = userInput.nextLine();
			String [] monogram = name.split(" ");
			System.out.println(monogram[0].substring(0,1).toUpperCase()+monogram[1].substring(0,1).toUpperCase()+monogram[2].substring(0,1).toUpperCase());
			
		}

	}
