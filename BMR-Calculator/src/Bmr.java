import java.util.Scanner;
public class Bmr {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Welcome to Metric BMR calculator\n ");
	System.out.println("--------------------------------");
	while (true) {
		System.out.println("Please Enter Your Gender");
		System.out.println("To quit the application type exit");
		String gend=input.nextLine();
		if (gend.equalsIgnoreCase("male")) {
			System.out.println("Enter your height in cm :");
			double height=input.nextDouble();
			System.out.println("Enter your weight in Kg : ");
			double weight=input.nextDouble();
			System.out.println("Enter your age :");
			int age=input.nextInt();
			double bmr=66.5 + ( 13.75* weight ) + ( 5.003 *height )-( 6.755 * age );
			System.out.printf("Your BMR is %f calories per day\n", bmr);
			
		}else if (gend.equalsIgnoreCase("female")) {
		    System.out.println("Enter your height in cm :");
			 double height=input.nextDouble();
			 System.out.println("Enter your weight in kg : ");
			 double weight=input.nextDouble();
			 System.out.println("Enter your age :");
			 int age=input.nextInt();
			 double bmr= 655.1 + ( 9.56* weight) + ( 1.850 * height)-( 4.676 * age );
			 System.out.printf("Your BMR is %f calories per day\n", bmr);
		}else if (gend.equalsIgnoreCase("exit")) {
			System.out.println("Have a nice day !");
			break;
		} else 
		{
			System.out.println("Invalid Entry !");
		}
		
	}
	}	
}