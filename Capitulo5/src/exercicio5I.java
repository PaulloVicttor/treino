
public class exercicio5I {
	
	public static void main(String[] args) {
		
		
		int atual = 0;
		int anterior = 0;
		int proximo = 0;
		
		while (atual < 500) {
			
			proximo = atual + anterior;
			
			atual++;
			
			System.out.println(anterior);
			
			anterior = atual;
			atual = proximo;
		}
		
	}

}
