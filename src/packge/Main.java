package packge;

public class Main {

	public static void main(String[] args) {
		try {
			
		ListaSequencial lista = new ListaSequencial(10);
		
		lista.adicionarFinal(1);
		lista.adicionarFinal(2);
		lista.adicionarFinal(3);
		lista.adicionarFinal(4);
		lista.adicionarFinal(5);
		
		lista.imprimir();
		
		lista.removerInicio();
		
		lista.imprimir();
		
		lista.removerDoIndice(3);
		
		lista.imprimir();
		
		lista.removerFinal();
		
		lista.imprimir();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
