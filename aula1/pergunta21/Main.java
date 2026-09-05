// Produto: crie uma classe com os atributos nome, preço e quantidade. Implemente os métodos calcularValorEstoque() e mostrarDados(). No Main, crie dois objetos do tipo Produto.

import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        Produto tenis = new Produto();
        tenis.nome = "Tênis";
        tenis.preco = 240;
        tenis.quantidade = 20;

        Produto camisa = new Produto();
        camisa.nome = "Camisa";
        camisa.preco = 80;
        camisa.quantidade = 50;

        tenis.mostrarDados();
        camisa.mostrarDados();
    }
}