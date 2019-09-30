package practiceexercise3java;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		Exception.vote(i);
		
	}
	
	public static void vote(int x) {
		try {
			if(x<18) {
				throw new ArithmeticException("Not valid age");
			}else 
				System.out.println("Please proceed to vote");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
