package curso_programacao.Topicos_Especiais_Data_Hora;

	import java.time.LocalDate;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.Locale;

	public class TrabalhandoComDatas_date_Java7 {

	    @SuppressWarnings("deprecation")
		public static void main(String[] args) {
	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy", new Locale("pt", "BR"));
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy HH:mm:ss", new Locale("pt", "BR"));

	        LocalDate date1 = LocalDate.parse("09/03/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	        LocalDateTime date2 = LocalDateTime.parse("09/03/2024 23:44:07", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

	        System.out.println(date1.format(formatter1));
	        System.out.println(date2.format(formatter2));
	    }
	}

