//check if date is before specified date
package mock;

import java.util.Date;

public class CheckBeforeSpecifiedDate {
	public static void main(String[] args) {
		Date date = new Date();
		long dayBefore = System.currentTimeMillis() - 1000*60*60*24;
		Date date2 = new Date(dayBefore);
		if(date2.before(date)){
			System.out.println("The date is older than current day");
		} else {
			System.out.println("The date is future day");
		}
	}

}


