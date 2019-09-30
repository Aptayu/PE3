package practiceexercise3java;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Readfile {
	public static void main(String[] args) {
		try {
			Scanner x = new Scanner(new File("data/Read file.txt"));
			File f = new File("data/Read file.txt");
			System.out.println("legth of the file is "+f.length());
			
			while(x.hasNext()) {
				String a = x.nextLine();
				System.out.println(a.toLowerCase());
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
