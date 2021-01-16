package Exercicio04;


//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e 
//válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores..

//Exercicio04NumeroDeEleitores

import java.util.Scanner;

public class Exercicio04NumeroDeEleitores {
	
	public static double calculaPercentualX(double totalDeEleitores, double totalX) {
	
		double percentual = totalX * 100 / totalDeEleitores;
		return percentual;
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe A Quantidade Total De Votos: ");
		int totalDeVotos = scanner.nextInt();
		
		System.out.print("Informe A Quantidade De Votos Brancos: ");
		int totalVotosBrancos = scanner.nextInt();
		
		System.out.print("Informe A Quantidade De Votos Nulos: ");
		int totalVotosNulos = scanner.nextInt();
		
		System.out.print("Informe A Quantidade De Votos Válidos: ");
		int totalVotosValidos = scanner.nextInt();
		
		imprimirTraco();		
		
		System.out.println("A Quantidade Total de Votos é: " + totalDeVotos);
		
		System.out.println("A Quantidade Total de Votos Brancos é: " + totalVotosBrancos);
		
		System.out.println("A Quantidade Total de Votos Nulos é: " + totalVotosNulos);
		
		System.out.println("A Quantidade Total de Votos Válidos é: " + totalVotosValidos);
		
		double percentualVotosBrancos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosBrancos);
		
		double percentualVotosNulos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosNulos);
		
		double percentualVotosValidos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosValidos);
		
		imprimirTraco();
		
		System.out.println("O Percentual de Votos Brancos é: " + String.format("%.0f", percentualVotosBrancos) + "%");
		
		System.out.println("O Percentual de Votos Nulos é: " + String.format("%.2f", percentualVotosNulos) + "%");
		
		System.out.println("O Percentual de Votos Válidos é: " + String.format("%.3f", percentualVotosValidos) + "%");
		
		//System.out.println("O Percentual de Votos Brancos É: " + percentualVotosBrancos + " %");
		
		//System.out.println("O Percentual de Votos Nulos É: " + percentualVotosNulos + " %");
		
		//System.out.println("O Percentual de Votos Válidos É: " + percentualVotosValidos + " %");
		
		
		scanner.close();
	}
	static void imprimirTraco() {
		System.out.println("----------------------------------");
	}

}
