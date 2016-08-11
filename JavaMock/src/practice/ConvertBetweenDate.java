package mock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConvertBetweenDate {
	public static void main(String a[]) throws ParseException{
        
        String startDate = "22/05/2015 12:00:00";
        String endDate = "24/02/2016 12:00:00";
         
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       
            Date startDateObj = dateFormat.parse(startDate);
            Date endDateObj = dateFormat.parse(endDate);
           
            System.out.println("Time in milli seconds: "+startDateObj.getTime());
            
            long timeDiff = endDateObj.getTime() - startDateObj.getTime();
            System.out.println("Time difference in Milli seconds: "+timeDiff);
            
            long secondsDiff = (timeDiff/1000);
            System.out.println("Time difference in seconds: "+secondsDiff);
        
	}
}
