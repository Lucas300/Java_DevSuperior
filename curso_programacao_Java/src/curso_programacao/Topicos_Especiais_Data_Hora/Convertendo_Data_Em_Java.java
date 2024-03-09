package curso_programacao.Topicos_Especiais_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Convertendo_Data_Em_Java {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-05-13");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-13T14:22:13");
		//O instant não tem o metodo format
		Instant d06 = Instant.parse("2024-05-13T02:22:13z");
		//É obrigado formatar o Instant com um fuso horario se não não funciona
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Pegando a data do aparelho local do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		
		System.out.println("d04 = "+d04.format(fmt1));
		System.out.println("d04 = "+fmt1.format(d04));
		System.out.println("d04 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		System.out.println("d05 = "+d05.format(fmt2));
		System.out.println("d05 = "+d05.format(fmt1));
		
		//
		
		//tem que usar o format com o fmt3 ja que o Instant nao da pra usar o format
		System.out.println("d06 = "+fmt3.format(d06));
		System.out.println("d06 = "+fmt5.format(d06));
		System.out.println("d06 = "+d06.toString());
		
		
		

	}
}
