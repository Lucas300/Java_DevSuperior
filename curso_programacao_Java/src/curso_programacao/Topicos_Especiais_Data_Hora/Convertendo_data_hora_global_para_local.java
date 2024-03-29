package curso_programacao.Topicos_Especiais_Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Convertendo_data_hora_global_para_local {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-05-13");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-13T14:22:13");
		Instant d06 = Instant.parse("2022-07-20T02:01:30z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		
		System.out.println("R1 = "+r1);
		System.out.println("R2 = "+r2);
		System.out.println("R3 = "+r3);
		System.out.println("R4 = "+r4);
		
		//pegando dia, mes e ano separadamente 
		System.out.println("d04 dia = "+d04.getDayOfMonth());
		System.out.println("d04 mes = "+d04.getMonthValue());
		System.out.println("d04 ano = "+d04.getYear());
		
		//peganndo hora e minuto 
		System.out.println("d05 hora = "+d05.getHour());
		System.out.println("d05 hora = "+d05.getMinute());
		
		
	}

}
