public class Produto{
    String nome;
    double preco;
    int quantidade;
    
    public int calcularValorEstoque(){
        return (int) (preco * quantidade);
    }
    public void mostrarDados(){
        System.out.println("=====Ficha do Produto=====");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor do estoque: " + calcularValorEstoque() + " reais\n");
    }
}