
public class Exercicio01EscreverAlgoritimo {

	public static void main(String[] args) {
		int y = 99;
	    int z = 11;
	    
	    System.out.println("O Valor Inicial da Minha Vari�vel Y �: "+ y);
	    
	    System.out.println("O Valor Inicial Da Minha Vari�vel Z �: " + z);
	    
	    int aux = 0;
	    
	    aux = y;
	    y = z;
	    z = aux;
	    
	    System.out.println("O Valor Depois da Troca da Minha Vari�vel Y �: "+ y);
	    
	    System.out.println("O Valor Depois da Troca Da Minha Vari�vel Z �: " + z);	  

	}

}
