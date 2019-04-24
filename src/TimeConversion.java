

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) {
		
		String a= "07:05:45PM" ;
		String c = "";
	       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
	       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
	       Date date;
		try {
			date = parseFormat.parse(a);
		    c =  displayFormat.format(date);
		    System.out.println(parseFormat.format(date) + " df= " + c );

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}




