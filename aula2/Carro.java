public class Carro{
    String marca;
    String modelo;
    String cor;
    int velocidade;
    int ano;
    double combustivel;
    boolean ligado = false;

    public boolean ligar(){
        System.out.println("Ligando o Carro " + modelo);
        return ligado = true;
    }

    public boolean desligar(){
        System.out.println("Desligando o Carro " + modelo);
        return ligado = false;
    }

    public void acelerar(){
        if (ligado){
            System.out.println("Acelerando.......");
            velocidade = velocidade + 10;
            combustivel = combustivel - 8.5;
        } else{
            System.out.println("ligue o carro antes de acelerar, por favor");
        }
    }
    
    public void frear(){
        if (ligado){
            System.out.println("Freando.......");
            velocidade = velocidade - 10;
        } else{
            System.out.println("ligue o carro antes de executar qualquer açãop, por favor");
        }
    }

    public void mostrarDados(){
        System.out.println("======Dados do Veículo======");
        System.out.println("Marca: " + marca );
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Combustivel: " + combustivel + "L");
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Está ligado: " + ligado + "\n");
        System.out.println();        
    }
}