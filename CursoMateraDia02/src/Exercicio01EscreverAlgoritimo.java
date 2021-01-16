
public class Exercicio01EscreverAlgoritimo {

	public static void main(String[] args) {
		int y = 99;
	    int z = 11;
	    
	    System.out.println("O Valor Inicial da Minha Variável Y É: "+ y);
	    
	    System.out.println("O Valor Inicial Da Minha Variável Z É: " + z);
	    
	    int aux = 0;
	    
	    aux = y;
	    y = z;
	    z = aux;
	    
	    System.out.println("O Valor Depois da Troca da Minha Variável Y É: "+ y);
	    
	    System.out.println("O Valor Depois da Troca Da Minha Variável Z É: " + z);	  

	}

}
