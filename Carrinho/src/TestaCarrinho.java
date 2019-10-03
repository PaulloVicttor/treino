
public class TestaCarrinho {
	
	public static void main(String[] args) {
		
		Livro livro = new Livro(0, 0, null, null, null);
		
		livro.getCodigo();
		livro.getPrecoCusto();
		livro.getAutor();
		livro.getIsbn();
		livro.getNome();
		
		DVD dvd = new DVD(0, 0, null, null);
		
		dvd.getCodigo();
		dvd.getGravadora();
		dvd.getNome();
		dvd.getPrecoCusto();
		dvd.getValorVenda();
		
		Servico servico = new Servico(null, 0, 0, 0);
		
		servico.getDescricao();
		servico.getCodigo();
		servico.getQuantHoras();
		servico.getValorHora();
		
		Carrinho carrinho = new Carrinho();
		
		
		
		
	}

}
