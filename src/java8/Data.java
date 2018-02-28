package java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	
	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(LocalDate.now().format(formatter));

	}

}
