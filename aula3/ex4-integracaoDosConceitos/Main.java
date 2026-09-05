public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoPix = new PagamentoPix(100.00);
        Pagamento pagamentoCartao = new PagamentoCartao(100.00, 3);

        pagamentoPix.processar();
        pagamentoCartao.processar();

        System.out.println("Pix - taxa: R$ " + pagamentoPix.calcularTaxa());
        System.out.println("Pix - total: R$ " + pagamentoPix.calcularValor());
        System.out.println("Cartao - taxa: R$ " + pagamentoCartao.calcularTaxa());
        System.out.println("Cartao - total: R$ " + pagamentoCartao.calcularValor());
    }
}