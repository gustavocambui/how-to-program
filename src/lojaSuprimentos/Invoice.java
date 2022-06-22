package lojaSuprimentos;

/* Crie uma classe chamada Invoice para que uma loja de suprimentos de inform�tica a utilize para representar uma
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informa��es como vari�veis de inst�ncia � o
n�mero (tipo String), a descri��o (tipo String), a quantidade comprada de um item (tipo int) e o pre�o por item (double). Sua
classe deve ter um construtor que inicializa as quatro vari�veis de inst�ncia. Forne�a um m�todo set e um get para cada vari�vel de inst�ncia.
Al�m disso, forne�a um m�todo chamado getInvoiceAmount que calcula o valor de fatura (isto �, multiplica a quantidade pelo
pre�o por item) e depois retorna esse valor como double. Se a quantidade n�o for positiva, ela deve ser configurada como 0. Se o pre�o
por item n�o for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as
capacidades da classe Invoice. */

public class Invoice {
	
	

	private String numero;
	private String descricao;
	private int quantidade;
	private double valor;
	
	public Invoice (String numero, String descricao, int quantidade, double valor) {
		
		this.numero = numero;
		this.descricao = descricao;
		if (quantidade > 0 ) 
			this.quantidade = quantidade;
		if (valor > 0.0)
			this.valor = valor;
	}
	
	public double getInvoiceAmount() {
		
		double fatura = quantidade * valor;
		return fatura;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
