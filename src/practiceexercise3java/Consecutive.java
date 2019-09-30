package practiceexercise3java;

import java.util.Arrays;
import java.util.Scanner;

public class Consecutive {
	public static boolean consecutive () {
		Scanner sc =  new Scanner(System.in);
		boolean is = true;
		System.out.println("Enter 7 numbers");
		int[] numbers  = new int[7];
		for(int i= 0;i<7;i++) {
		numbers[i] = sc.nextInt();
		}
		for(int i= 1;i<7;i++) {
			if(numbers[i]-numbers[i-1]!=1) {
				is = false;
			}
			else is=true;
	}
//		System.out.println(Arrays.toString(numbers));
		return is;
	}

}
