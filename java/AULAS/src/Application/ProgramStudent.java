package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Student student = new Student();
		
		student.name = leia.nextLine();
		student.grade1 = leia.nextDouble();
		student.grade2 = leia.nextDouble();
		student.grade3 = leia.nextDouble();
		
		System.out.println("FINAL GRADE = " + student.finalGrade()); 
		
		if (student.passFailed() == 0) {
			System.out.println("PASS");
		}
		else {
			System.out.println("MISSING " + student.passFailed() + " POINTS" );
		}
		
	}
}
