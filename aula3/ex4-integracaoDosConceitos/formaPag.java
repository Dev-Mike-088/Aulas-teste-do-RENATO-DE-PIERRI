class Pagamento{
    private double valor;


    Pagamento(double valor){
       if(valor > 0){
            this.valor = valor;
       }
    }

    public double getValor(){
        return valor;
    }

    public double calcularTaxa(){
        return 0;
    }
    public double calcularValor(){
        return valor + calcularTaxa();
    }
    public void processar(){
        System.out.println("O valor total pago será de " + calcularValor());
    }

}
class PagamentoPix extends Pagamento{
    
    PagamentoPix(double valor){
        super(valor);
    }
    @Override 
    public double calcularTaxa(){
        return 0;
    }
    @Override 
    public void processar(){
        System.out.println("O pagamento via pix foi realizado com sucesso!!!");
        System.out.println("O valor foi de " + calcularValor());
    }
}
class PagamentoCartao extends Pagamento{
    private int parcelas;

    PagamentoCartao(double valor, int parcelas){
        super(valor);
        this.parcelas = parcelas;
    }

    @Override 
    public double calcularTaxa(){
        return (this.getValor() * 3 / 100);
    }    
    @Override 
    public void processar(){
        System.out.println("O pagamento via Cartão de Crédito foi realizado com sucesso!!!");
        System.out.println("O valor total foi de R$" + calcularValor() + " a quantidade de parcelas será de " + parcelas);
    }
}