package day015;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");
		System.out.println(sdf.format(new Date()));
		
		System.out.println(localDate.plusDays(10));
		
	}

}
