package Exercicio04;


//Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e 
//v�lidos. Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores..

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
		
		System.out.print("Informe A Quantidade De Votos V�lidos: ");
		int totalVotosValidos = scanner.nextInt();
		
		imprimirTraco();		
		
		System.out.println("A Quantidade Total de Votos �: " + totalDeVotos);
		
		System.out.println("A Quantidade Total de Votos Brancos �: " + totalVotosBrancos);
		
		System.out.println("A Quantidade Total de Votos Nulos �: " + totalVotosNulos);
		
		System.out.println("A Quantidade Total de Votos V�lidos �: " + totalVotosValidos);
		
		double percentualVotosBrancos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosBrancos);
		
		double percentualVotosNulos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosNulos);
		
		double percentualVotosValidos = Exercicio04NumeroDeEleitores.calculaPercentualX(totalDeVotos, totalVotosValidos);
		
		imprimirTraco();
		
		System.out.println("O Percentual de Votos Brancos �: " + String.format("%.0f", percentualVotosBrancos) + "%");
		
		System.out.println("O Percentual de Votos Nulos �: " + String.format("%.2f", percentualVotosNulos) + "%");
		
		System.out.println("O Percentual de Votos V�lidos �: " + String.format("%.3f", percentualVotosValidos) + "%");
		
		//System.out.println("O Percentual de Votos Brancos �: " + percentualVotosBrancos + " %");
		
		//System.out.println("O Percentual de Votos Nulos �: " + percentualVotosNulos + " %");
		
		//System.out.println("O Percentual de Votos V�lidos �: " + percentualVotosValidos + " %");
		
		
		scanner.close();
	}
	static void imprimirTraco() {
		System.out.println("----------------------------------");
	}

}
