import java.util.Scanner;

public class LeapYear
	{

		public static void main(String[] args)
			{
				LeapYear();

			}
		public static void LeapYear()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Enter a year and I'll tell you if its a leap year.");
				int year = userInput.nextInt();
				if(year % 4 == 0)
					{
						System.out.println("Yes");
					}
				else
					{
						System.out.println("No");
					}
				
			}
	}
