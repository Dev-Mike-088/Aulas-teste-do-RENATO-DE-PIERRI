public abstract class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public void mostrarDados() {
		System.out.printf("%s: salario de R$ %.2f, bonus de R$ %.2f.%n", nome, salario, calcularBonus());
	}

	public abstract double calcularBonus();
}

class Gerente extends Funcionario {
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.20;
	}
}

class Desenvolvedor extends Funcionario {
	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularBonus() {
		return getSalario() * 0.10;
	}
}
