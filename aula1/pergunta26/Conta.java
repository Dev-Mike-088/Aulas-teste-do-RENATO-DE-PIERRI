public class Conta{
    String titular;
    int numeroConta;
    double saldo;

    public double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    public double sacar(double valor){
        saldo -= valor;
        return saldo;
    }

    public double mostrarSaldo(){
        return saldo;
    }
    
}