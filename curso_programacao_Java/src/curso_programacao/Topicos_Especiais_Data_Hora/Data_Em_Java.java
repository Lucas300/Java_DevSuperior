package curso_programacao.Topicos_Especiais_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data_Em_Java {

	public static void main(String[] args) {
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	LocalDate d01 = LocalDate.now(); // 2024-03-08
	LocalDateTime d02 = LocalDateTime.now();// 2024-03-08T23:05:52.984257200
	Instant d03 = Instant.now();//2024-03-09T02:07:55.118411400Z horario de Londres
	
	LocalDate d04 = LocalDate.parse("2024-05-13");
	LocalDateTime d05 = LocalDateTime.parse("2024-05-13T14:22:13");
	Instant d06 = Instant.parse("2024-05-13T14:22:13z");
	Instant d07 = Instant.parse("2024-05-13T14:22:13-03:00");
	
	LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
	LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
		
	LocalDate d10 = LocalDate.of(2024, 7, 20);
	LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
	
	System.out.println("d01 = "+d01);
	System.out.println("d02 = "+d02);
	System.out.println("d03 = "+d03);
	System.out.println("d04 = "+d04);
	System.out.println("d05 = "+d05);
	System.out.println("d06 = "+d06.toString());
	System.out.println("d07 = "+d07.toString());
	System.out.println("d08 = "+d08.toString());
	System.out.println("d09 = "+d09.toString());
	System.out.println("d10 = "+d10.toString());
	System.out.println("d11 = "+d11.toString());
	
	}

}
