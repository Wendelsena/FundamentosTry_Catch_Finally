package application;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	// TRY-CATCH ---> É um bloco que contém código a ser executado independentemente
	// de erros
	public static void main(String[] args) {

		method1();
		situationFinally();

		System.out.println("End of program");

	}

	public static void method1() {
		System.out.println("--------------------------");
		System.out.println("***METHOD1 START***");

		method2();

		System.out.println("***METHOD1 END***");
		System.out.println("--------------------------");
	}

	public static void method2() {

		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("***METHOD2 START***");
		try {
			System.out.print("Entre com Strings: ");

			// vetor de string baseado no espaço em branco (um vect a cada espaço)
			String[] vect = sc.nextLine().split(" ");

			System.out.print("Entre a posição: ");

			int position = sc.nextInt();
			System.out.println(vect[position]); // imprimir a posição informada
		}
		// caso ocorra a excessão com apelidada de e mostra a mensagem:
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
		} catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}

		System.out.println("***METHOD2 END***");
		System.out.println("--------------------------");

		sc.close();
	}

	// Finally
	public static void situationFinally() {

		System.out.println("***SITUATIONFINALLY START***");
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("***SITUATIONFINALLY END***");
		System.out.println("--------------------------");
	}

}
