package Exercicio03;
import java.util.Scanner;

public class Exercicio03CalculeAreaRetangulo {

	public static void main(String[] args) {		
		System.out.println("cálculo Da Área DE Um Retangulo!");
		
		Scanner scanner = new Scanner(System.in);		
		System.out.print("Digite a Medida da Base(b): ");
		double valorBase = scanner.nextDouble();
		
		System.out.print("Digite a Medida da Altura(h): ");
		double valorAltura = scanner.nextDouble();
		
		double valorDaArea = valorBase * valorAltura;
		
		System.out.println("O Valor Da Área Desse Retângulo É: " + valorDaArea);

	}

}
