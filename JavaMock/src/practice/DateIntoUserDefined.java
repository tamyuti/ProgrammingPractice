//WJP to convert date into user defined format
package practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateIntoUserDefined {
	public static void main(String[] args) throws ParseException {
		DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		DateFormat userFormat = new SimpleDateFormat("MMM dd, yyyy");
		Date convertedDate = d.parse("2015-08-13");
		
		String output = userFormat.format(convertedDate);
		System.out.println(output);
	}

}
