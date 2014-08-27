package com.wordpress.fatecode.tarefa0202;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemplosSimpleDateFormat {
	public static void main(String[] args) {
		//instancia do objeto SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("MM/yyyy");
	
		// bloco try usado para empacotar o c�digo que pode gerar uma exce��o.
		// Neste caso, se n�o for poss�vel transformar a String em Calendar,
		// ser� lan�ada a exce��o ParseException,
		// onde a mesma ser� capturada no bloco catch
		try {
			//metodo parse() retorna uma data caso seja poss�vel convertar a string em data
			Date data = format.parse("09/1992");
			//Obtem o objeto Calendar para manipular a data
			Calendar calendar = Calendar.getInstance(); // Class respons�vel por
			calendar.setTime(data);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
