package practiceexercise3java;

import java.util.Arrays;
import java.util.Scanner;

public class CompiledPE3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		switch (p) {
		case 1:
			StudentMarks sm = new StudentMarks();
			sm.Studentmarks();
			break;
		case 2:
			MatrixAddition ma = new MatrixAddition();
			System.out.println(ma.MatrixAddition().toString());
			break;
		case 3:
			WeekDate wd = new WeekDate();
			wd.Weekdate();
			break;
		case 4 :
			Vowels vowels =  new Vowels();
			vowels.vowels();
			break;
			
		case 5:
			Chessboard.chess();
			break;
			
		case 6:
			System.out.println(Consecutive.consecutive());
			break;
		case 7:
			Exception.vote(13);
			break;
			
		case 9:
			Readfile.main(null);
			break;
			
		case 10:
			Files f = new Files();
			f.files();
			
		}

	}
}
