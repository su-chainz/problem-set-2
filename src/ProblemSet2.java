/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;

public class ProblemSet2 {
	
	/**
	 * You need not modify the main method.
	 */
	
	Scanner in = new Scanner(System.in);
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Enter your name");
		String line = in.nextLine();
		System.out.println("Hello, " + line + "!");
	}
	
	public void gradeMe() {
		System.out.println("Enter your first homework grade");
		double homework1 = in.nextDouble();
		System.out.println("Enter your second homework grade");
		double homework2 = in.nextDouble();
		System.out.println("Enter your third homework grade");
		double homework3 = in.nextDouble();
		System.out.println("Enter your first quiz grade");
		double quiz1 = in.nextDouble();
		System.out.println("Enter your second quiz grade");
		double quiz2 = in.nextDouble();
		System.out.println("Enter your third quiz grade");
		double quiz3 = in.nextDouble();
		System.out.println("Enter your first test grade");
		double test1 = in.nextDouble();
		System.out.println("Enter your second test grade");
		double test2 = in.nextDouble();
		System.out.println("Enter your third test grade");
		double test3 = in.nextDouble();
		double fgrade = 0.15*(homework1 + homework2 + homework3)/3 + 0.3*(quiz1 + quiz2 + quiz3)/3 + 0.55*(test1 + test2 + test3)/3;
		fgrade = fgrade*100;
		fgrade = (double)((int) fgrade);
		fgrade = fgrade/100;
		
		System.out.println("Your final grade: "+fgrade+"%");
	} 
	
	public void groupUs() {
		System.out.println("Enter a number of students");
		int students = in.nextInt();
		System.out.println("Enter a number of teachers");
		int teachers = in.nextInt();
		in.nextLine();
		int total = students + teachers;
		int buses = total / 47;
		int extra = total % 47;
		if (students == 0 && teachers == 0) {
			System.out.println("Please enter at lease 1 student or teacher");
		}  else if (total % 47 == 0) {
			System.out.println("You need "+buses+" bus(es) with 48 people");	
		} else if (total < 47) {
			System.out.println("You need 1 bus with "+(total+1)+" people");
		} else {
			System.out.print("You need "+buses+" bus(es) with 48 people");
			System.out.println(" and 1 bus with "+(extra + 1)+" people");
		}
	} 
	
	public void info() {
		System.out.println("Enter your first name");
		String fname = in.nextLine();
		System.out.println("Enter your last name");
		String lname = in.nextLine();
		System.out.println("Enter your first current grade (1-12)");
		int grade = in.nextInt();
		in.nextLine();
		System.out.println("Enter your curent age");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Enter your hometown");
		String town = in.nextLine();
		
		System.out.println("NAME     : "+fname+" "+lname);
		System.out.println("GRADE    : "+grade);
		System.out.println("AGE      : "+age);
		System.out.println("HOMETOWN : "+town);
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		char a = in.nextLine().charAt(0);
		System.out.print("Please enter your middle name: ");
		char b = in.nextLine().charAt(0);
		System.out.print("Please enter your first name: ");
		char c = in.nextLine().charAt(0);
		System.out.println("Your intials are "+a + b + c);
	} 
	
}