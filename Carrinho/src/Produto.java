
public abstract class Produto {
	
	private int codigo;
	private double precoCusto;
	
	public Produto(int codigo, double precoCusto) {
		super();
		this.codigo = codigo;
		this.precoCusto = precoCusto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", precoCusto=" + precoCusto + "]";
	}
	
	

}
