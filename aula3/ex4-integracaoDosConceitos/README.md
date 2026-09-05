# Integracao dos conceitos

## Encapsulamento

O atributo `valor` da classe `Pagamento` e `private`. O `Main` acessa esse
valor somente por meio de `getValor()` e dos metodos de calculo, sem modifica-lo
diretamente.

O atributo `parcelas` de `PagamentoCartao` tambem e privado.

## Heranca

As classes `PagamentoPix` e `PagamentoCartao` utilizam `extends Pagamento`.
Assim, ambas reutilizam os dados e comportamentos comuns da classe base.

## Polimorfismo

As variaveis `pagamentoPix` e `pagamentoCartao` possuem o tipo `Pagamento`,
mas apontam para objetos de classes diferentes. A chamada `processar()` executa
a implementacao sobrescrita conforme o objeto real: uma para Pix e outra para
cartao.