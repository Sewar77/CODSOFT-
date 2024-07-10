import java.util.Scanner;
public class MarksCalculate {
	public static void main(String[] args) {
		//suppose there are 7 subjects. 
		Scanner read = new Scanner(System.in);
		float marks = 0;
		int counter = 0;
		for (int i=1; i <= 7;i++) {
			System.out.println("Enter the mark for subject number: " + i + " out of 7." );
			float mark = read.nextFloat();
			if (mark>0 && mark <= 100) {
				marks += mark;
				counter++;
			}
			else{
				System.out.prinln("Wrong mark input");
			}
			
		System.out.println("Total marks: " + (marks));
		float avrage = marks/counter;
		System.out.println("Average marks: " + avrage);
		System.out.println("marks in perc: " + (marks/counter) + "% ");
			if (avrage<50)
				System.out.println("Your final grade is F");
			else if (avrage >= 50 && avrage < 60)
				System.out.println("Your final grade is E");
			else if (avrage >= 60 && avrage < 70)
				System.out.println("Your final grade is D");
			else if (avrage >= 70 && avrage < 80)
				System.out.println("Your final grade is C ");
			else if (avrage >= 80 && avrage < 90)
				System.out.println("Your final grade is B");
			
			else if(avrage >= 90 && avrage <= 100)
				System.out.println("Your final grade is A");
			else {
				System.out.println("invalid input");
			}
		}	
	}
