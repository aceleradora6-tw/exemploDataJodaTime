package br.com.aceleradora.main;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
		String dataHora;

		DateTime momentoCriacao = new DateTime();

		DateTimeFormatter formatadorData = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm");

		dataHora = formatadorData.print(momentoCriacao);
		
		System.out.println(dataHora);

	}

}
