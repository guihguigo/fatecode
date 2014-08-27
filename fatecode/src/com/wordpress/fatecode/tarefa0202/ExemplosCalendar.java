package com.wordpress.fatecode.tarefa0202;

import java.util.Calendar;

public class ExemplosCalendar {
	public static void main(String[] args) {

		// instancia do objeto Calendar
		Calendar calendar = Calendar.getInstance();

		System.out.println("Data e Hora atual:" + calendar.getTime()); // mostr data atual
		// mostra dia do m�s atual
		System.out.println("dia do m�s atual: "
				+ calendar.get(Calendar.DAY_OF_MONTH));

		// mostra dia da semana atual
		System.out.println("dia da semana atual: "
				+ calendar.get(Calendar.DAY_OF_WEEK));

		// mostra semana atual
		System.out.println("semana atual: "
				+ calendar.get(Calendar.WEEK_OF_MONTH));

		// mostra total de dias no m�s
		System.out.println("total de dias do m�s atual: " + calendar.getMaximum(Calendar.DAY_OF_MONTH));

		// mostra maximo de dia da semana atual
		System.out.println("total de dias da semana atual: "
				+ calendar.getMaximum(Calendar.DAY_OF_WEEK));

		// mostra m�ximo de semana do m�s atual
		System.out.println("m�ximo de semana do m�s atual: "
				+ calendar.getMaximum(Calendar.WEEK_OF_MONTH));

		int quantidadeDias = 1;

		// adiciona dias a data atual
		calendar.add(Calendar.DAY_OF_MONTH, quantidadeDias);

		System.out.println("depois de chamar add(): "
				+ calendar.get(Calendar.DAY_OF_MONTH));
	}
}
