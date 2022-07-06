package revisaoPoo;

import contaBancaria.Account;

/*
A fim de representar funcion�rios em uma empresa, crie uma classe chamada Funcionario que inclui as tr�s informa��es a seguir 
como atributos:
a. um primeiro nome,
b. um sobrenome
c. um sal�rio mensal
Sua classe deve ter um construtor que inicializa os tr�s atributos. 
Forne�a os m�todos getters e setters para cada atributo. Se o sal�rio mensal n�o for positivo, configure-o como 0.0. 
Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas inst�ncias da classe e exiba o sal�rio anual de cada inst�ncia. 
Ent�o d� a cada empregado um aumento de 10% e exiba novamente o sal�rio anual de cada empregado.
 */
public class FuncionarioTest {
	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Patrick", "Estrela", 5300.00f);
		Funcionario funcionario2 = new Funcionario("Lula", "Molusco", 4350.00f);
		
		salarioAnual(funcionario1);
		salarioAnual(funcionario2);
		
	}
	
	public static void salarioAnual(Funcionario funcionario) {
		System.out.printf("%s%s%nSalario Anual: R$%.2f %n",funcionario.getNome(),funcionario.getSobrenome(), funcionario.getSalarioAnual());
	}
}
