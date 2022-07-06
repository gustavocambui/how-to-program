package revisaoPoo;

public class Invoice {
	private int item;
	private String nome;
	private int qtd;
	private float valor;

	public Invoice(int item, String nome, int qtd, float valor) {
		
		this.setItem(item);
		this.setNome(nome);
		this.setQtd(qtd);
		this.setValor(valor);

	}
	
	public double getInvoiceAmount() {
		return qtd * valor;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		if(qtd < 0) {
			this.qtd = 0;
		}
		else {
			this.qtd = qtd;
		}
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		if(valor < 0) {
			this.valor = 0;
		}
		else {
			this.valor = valor;
		}
	}
	
}
