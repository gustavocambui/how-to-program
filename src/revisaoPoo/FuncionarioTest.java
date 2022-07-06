package revisaoPoo;

import contaBancaria.Account;

/*
A fim de representar funcionários em uma empresa, crie uma classe chamada Funcionario que inclui as três informações a seguir 
como atributos:
a. um primeiro nome,
b. um sobrenome
c. um salário mensal
Sua classe deve ter um construtor que inicializa os três atributos. 
Forneça os métodos getters e setters para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. 
Escreva um aplicativo de teste que demonstra as capacidades da classe. 
Crie duas instâncias da classe e exiba o salário anual de cada instância. 
Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.
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
