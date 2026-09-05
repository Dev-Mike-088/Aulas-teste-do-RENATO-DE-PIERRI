public class Main {
	public static void main(String[] args) {
		Cofre cofre = new Cofre("Viagem", 0.0);

		cofre.depositar(500.0);
		cofre.depositar(200.0);
		cofre.retirar(150.0);
		cofre.retirar(1000.0);
		cofre.depositar(-50.0);

		cofre.mostrarDados();
	}
}
