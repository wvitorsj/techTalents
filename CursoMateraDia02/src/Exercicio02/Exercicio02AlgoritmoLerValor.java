package Exercicio02;
import java.util.Scanner;

public class Exercicio02AlgoritmoLerValor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Digite Um Valor Diremos Seu Antecessor: ");
		int valorDigitado = in.nextInt();
		
		int valorMostrado = valorDigitado - 1;
		
		System.out.println("O Antecessor de " + valorDigitado + " É: " + valorMostrado);
		
		in.close();	

	}

}
