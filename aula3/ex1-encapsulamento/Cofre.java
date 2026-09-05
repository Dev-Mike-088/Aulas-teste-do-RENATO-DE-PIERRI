public class Cofre {
    private String objetivo;
    private Double valor;

    public Cofre(String objetivo, Double valor){
        this.objetivo = objetivo;
        this.valor = valor;
    }

    public String getObjetivo(){
        return objetivo;
    }
    public Double getSaldo(){
        return valor;
    }

    public void depositar(Double deposito){
        if (deposito > 0){
            valor = valor + deposito;
            System.out.println("Depósito realizado com sucesso, seu novo saldo é: " + valor);
        } else{
            System.out.println("O Depósito só poderá ser realizado se o saldo for maior que zero!!!");
        }
    }
    public void retirar(Double retirada){
        if(retirada > 0 && retirada <= valor){
            valor = valor - retirada;
            System.out.println("Retirada realizada com sucesso!!! O seu cofre agr tem o valor de " + valor);
        }else{
            System.out.println("A retirada não pode ser realzada se o valor pedido for maior do que o existente no cofre e deve ser maior que zero!!!");
        }
    }
    public void mostrarDados(){
        System.out.println("Seu Cofre tem este status:");
        System.out.println("Objetivo - " + objetivo);
        System.out.println("Saldo - " + valor);
    }
}