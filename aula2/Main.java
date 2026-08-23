public class Main {
    public static void main(String[] args){
        Carro ferrari = new Carro();
        ferrari.marca = "Ferrari"; 
        ferrari.modelo = "LaFerrari";
        ferrari.cor = "Vermelho";
        ferrari.velocidade = 0;
        ferrari.combustivel = 46.0;

        System.out.println ("Estado Inicial: ");
        ferrari.mostrarDados();
        System.out.println("Acelerando...");

        ferrari.ligar();
        
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.acelerar();
        ferrari.buzinar();
        ferrari.mostrarDados();
        
        System.out.println ("Freando ...");
        ferrari.frear();
        ferrari.buzinar();
        
        ferrari.mostrarDados();

        ferrari.desligar();

        ferrari.mostrarDados();
    }
    
}