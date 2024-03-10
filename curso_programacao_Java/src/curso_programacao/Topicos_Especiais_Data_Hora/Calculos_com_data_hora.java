package curso_programacao.Topicos_Especiais_Data_Hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos_com_data_hora {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LocalDate d04 = LocalDate.parse("2024-05-13");
		LocalDateTime d05 = LocalDateTime.parse("2024-05-13T14:22:13");
		Instant d06 = Instant.parse("2022-07-20T02:01:30z");
		
		//Usando o LocalDate
		//criando uma nova data diminuindo 7 dias
		LocalDate pastWeekLocalDate = d04.minusDays(7);

		//criando uma nova data aumentando dias 7 dias 
		LocalDate nextWeekLocalDate = d04.plusDays(7);

		System.out.println("7 dias a menos que a data d04"+pastWeekLocalDate);
		System.out.println("7 dias a mais que a data d04"+nextWeekLocalDate);
		
		
		//usando o LocalDateTime
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("7 dias a menos que a data d05: "+pastWeekLocalDateTime);
		System.out.println("7 dias a mais que a data d05: "+nextWeekLocalDateTime);
		
		//Usando o Instant
		Instant pastWeekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);


		System.out.println(pastWeekInstant);
		System.out.println(nextWeekInstant);
		
		//duração entre duas datas
		//quando for LocalDate não tera horas , temos que converter para LocalDateTime usando o atTime e colocando o horario
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06,pastWeekInstant);
		
		System.out.println("T1 = "+t1.toDays());
		System.out.println("T2 = "+t2.toDays());
		System.out.println("T3 = "+t3.toDays());
		System.out.println("T4 = "+t4.toDays());
	}

}
