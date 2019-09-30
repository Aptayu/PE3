package practiceexercise3java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {

	public static String files() {
		// TODO Auto-generated method stub
		File folder = new File("data/");
		String[] listOfFiles = folder.list();
		for(String file: listOfFiles) {
		if(file.endsWith(".php")) {
		File f = new File("data/final.php");
			System.out.println("legth of the file is "+f.length());
		}
		}
		try {
			Scanner x = new Scanner(new File("data/final.php"));
			
			while(x.hasNext()) {
				String a = x.nextLine();
				return a.toLowerCase();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			return null;
		

	}

}
