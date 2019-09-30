package practiceexercise3java;
import java.util.*;
import java.time.*;
import java.text.*;

public class WeekDate {

	public static void Weekdate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		
		DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
		
		 
	       System.out.println(df.format(c.getTime()));
	        for (int i = 0; i <6; i++) {
	         c.add(Calendar.DATE, 1);
	           }
	        System.out.println(df.format(c.getTime()));
			
	     }
	

		
		
		
		

	}


