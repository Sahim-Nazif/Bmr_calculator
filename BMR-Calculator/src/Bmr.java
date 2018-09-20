import java.util.Scanner;
public class Bmr {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Welcome to Metric BMR calculator ");
	System.out.println("--------------------------------");
	while (true) {
		System.out.println("Please Enter Your Gender");
		String gend=input.nextLine();
		if (gend.equalsIgnoreCase("male")) {
			System.out.println("Enter your height in centimeters :");
			double height=input.nextDouble();
			System.out.println("Enter your weight in Kilograms : ");
			double weight=input.nextDouble();
			System.out.println("Enter your age :");
			int age=input.nextInt();
			double bmr=66.5 + ( 13.75* weight ) + ( 5.003 *height )-( 6.755 * age );
			System.out.printf("Your BMR is %f calories per day", bmr);
			
		}
	}
	

	}

}
