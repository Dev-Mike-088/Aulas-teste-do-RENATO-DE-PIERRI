/*
Exercício - Sistema de funcionários
Aplicação de classe abstrata, herança e polimorfismo
Implementar uma hierarquia para representar funcionários de uma empresa. A classe geral deverá 
concentrar os dados comuns e definir o cálculo de bônus como um comportamento obrigatório das 
subclasses.
Classe abstrata Funcionario
 Atributo privado nome, do tipo String.
 Atributo privado salario, do tipo double.
 Construtor recebendo nome e salario.
 Getters para nome e salario.
 Método concreto mostrarDados().
 Método abstrato calcularBonus(), com retorno double.
public abstract double calcularBonus();
Subclasse Gerente
 Herdar de Funcionario.
 Implementar calcularBonus().
 Bônus correspondente a 20% do salário.
Subclasse Desenvolvedor
 Herdar de Funcionario.
 Implementar calcularBonus().
 Bônus correspondente a 10% do salário.
Programa principal
1. Criar um gerente chamado Marcos, com salário de R$ 8.000,00.
2. Criar uma desenvolvedora chamada Ana, com salário de R$ 5.000,00.
3. Utilizar referências do tipo Funcionario para os dois objetos.
4. Exibir os dados e o bônus calculado de cada funcionário.
Funcionario funcionario1 = new Gerente("Marcos", 8000);
Funcionario funcionario2 = new Desenvolvedor("Ana", 5000);
Resultado esperado
Marcos: bônus de R$ 1.600,00.
Ana: bônus de R$ 500,00.

*/

public class Main {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Gerente("Marcos", 8000);
		Funcionario funcionario2 = new Desenvolvedor("Ana", 5000);

		funcionario1.mostrarDados();
		funcionario2.mostrarDados();
	}
}