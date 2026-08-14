//Declare variáveis para representar nome, idade, altura, nota e situação de matrícula de um aluno. Mostre todos os valores.
public class Main {
    public static void main(String[] args) {
        String situacao;
        String nome = "Mikael Machado Souza";
        int idade = 18;
        double altura = 1.78;
        double nota = 9.5;
        boolean situacaoMatricula = true; // true para matriculado, false para não matriculado

        if (situacaoMatricula){
            situacao = "Matriculado";
        } else {
            situacao = "Não matriculado";
        }

        System.out.println("dados do aluno:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Nota: " + nota);
        System.out.println("Situação de matrícula: " + situacao);
    }
}
