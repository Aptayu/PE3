package practiceexercise3java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMarks {
	public static int[] Studentmarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int numOfStudents = sc.nextInt();
		int[] stuGrade = new int[numOfStudents];
		System.out.println("Enter the grades");
		int x = 1;

		for (int i = 0; i < numOfStudents; i++) {

			try {
				System.out.println("Enter the student grade");
				int j = sc.nextInt();

				if (j < 0 || j > 100) {
					throw new Exception();
				} else
					stuGrade[i] = j;

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Enter correct grade");
				break;
			}
		}
		return stuGrade;
	}

}
