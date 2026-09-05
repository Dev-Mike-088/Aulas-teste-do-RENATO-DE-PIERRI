public class Aluno{
    String nome;
    int nota1;
    int nota2;

    public double calcularMedia(){
        return (nota1 + nota2) / 2.0;
    }

    public void mostrarDados(){
        System.out.println("===/==Ficha do Aluno " + nome + "==/===");
        System.out.println("Nome: " + nome);
        System.out.println("Primeira nota: " + nota1);
        System.out.println("Segunda nota: " + nota2);
        System.out.println("Média final: " + calcularMedia());
    }

}