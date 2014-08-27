package com.wordpress.fatecode.tarefa0201;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OperacoesAritmeticas {

	public static double soma(double x, double y) {
		return x + y;
	}

	public static double subtracao(double x, double y) {
		return x - y;
	}

	public static double multiplicacao(double x, double y) {
		return x * y;
	}

	/**
	 * 
	 * @param x
	 *            , um n�mero real v�lido
	 * @param y
	 *            , um n�mero real v�lido
	 * @return resultado da divasao entra x e y
	 */
	public static double divisao(double x, double y) throws ArithmeticException {
		return x / y;
	}

	public int mostraMenu() {
		String mensagem = "1: soma\n" + "2: subtra��o\n" + "3: multiplica��o\n"
				+ "4: divis�o\n" + "5: sair\n";

		int opcao = 0;

		do {
			System.out.print(mensagem);

			try {
				opcao = (int) inputNumero();
			} catch (InputMismatchException ex) {
				System.err.println("Digite apenas n�meros inteiros!");
			}

		} while (opcao < 1 || opcao > 5);

		return opcao;
	}

	public static double inputNumero() throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);

		return scanner.nextDouble();
	}

	public static void main(String[] args) {
		OperacoesAritmeticas operacoes = new OperacoesAritmeticas();

		int opcao = operacoes.mostraMenu();

		if (opcao != 5) {
			System.out.println("Entre com dois n�meros reais v�lidos: ");
			double x = 0;
			double y = 0;
			
			try {
				x = inputNumero();
				y = inputNumero();
			} catch (InputMismatchException ex) {
				System.err.println("Apenas n�meros reais v�lidos! ");
			}

			switch (opcao) {
			case 1:
				System.out.println(soma(x, y));
				break;
			case 2:
				System.out.println(subtracao(x, y));
				break;
			case 3:
				System.out.println(multiplicacao(x, y));
				break;
			case 4:
				try {
					System.out.println(divisao(x, y));
				} catch (ArithmeticException ex) {
					System.err.println("N�o � poss�vel dividir por zero!s");
				}
				break;
			}
		}

		System.out.println("Fim");
	}

}
