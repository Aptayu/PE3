package practiceexercise3java;
import java.util.*;
public class Vowels {

	public String vowels() { 
		Scanner sc =  new Scanner(System.in);;
		String s = sc.nextLine();
		String S = "";
//		System.out.println(Arrays.toString(s));
		for(char c:s.toCharArray()) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			break;
			default: S+=c;
			}
//			or you could have used string.
//			string = string.replaceAll("[AaEeIiOoUu]", "");
		
		}return S;

	}

}
