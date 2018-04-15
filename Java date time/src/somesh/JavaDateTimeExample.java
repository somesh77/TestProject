package somesh;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class JavaDateTimeExample {

	public static void main(String[] args) {
		
		final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss";
		SimpleDateFormat simpleDateformatter = new SimpleDateFormat(DATE_FORMAT);
		DateTimeFormatter dateTimeformatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
		
       /* LocalDate localdate=LocalDate.now();
        System.out.println(localdate);
        
        LocalTime localtime=LocalTime.now();
        System.out.println(localtime);*/
		/*LocalDateTime localDateTime = LocalDateTime.now();
		
		ZoneId id = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, id);
		String zonedDateTimeString = dateTimeformatter.format(zonedDateTime);
		System.out.println(zonedDateTimeString);*/
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(System.currentTimeMillis());
		String timeString = simpleDateformatter.format(calendar.getTime());
		System.out.println(timeString);
		System.out.println("somesh77");
	}

}
