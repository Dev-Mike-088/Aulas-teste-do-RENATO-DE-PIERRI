# Aulas de Java

Exercicios de Java feitos durante as aulas de Renato de Pierri. O projeto
comeca com fundamentos da linguagem e avanca para classes e os primeiros
conceitos de programacao orientada a objetos.

## Requisitos

- JDK 8 ou superior
- Terminal ou prompt de comando
- Editor de codigo, como o Visual Studio Code

Nao ha bibliotecas externas nem Maven ou Gradle. Os exercicios usam apenas o
Java e suas classes padrao.

## Estrutura do projeto

```text
Aulas-teste-do-RENATO-DE-PIERRI/
├── aula1/
│   ├── README.md
│   ├── pergunta1/ ... pergunta26/
│   └── exercicios de fundamentos e POO basica
├── aula2/
│   ├── Carro.java
│   └── Main.java
└── aula3/
    ├── ex1-encapsulamento/
    ├── ex2-heranca/
    ├── ex3-polimorfismo/
    └── ex4-integracaoDosConceitos/
```

Cada exercicio e independente e pode ter seu proprio arquivo `Main.java`.
Por isso, a compilacao deve ser feita dentro da pasta do exercicio escolhido.

## Aula 1

A primeira aula reune exercicios curtos e independentes:

- Perguntas 1 a 20: variaveis, tipos de dados, calculos, condicionais,
  entrada com `Scanner` e manipulacao de textos.
- Perguntas 21 a 26: classes, objetos, metodos, encapsulamento e pequenos
  sistemas com `Produto`, `Aluno`, `Conta`, `Lampada` e `circulo`.

O arquivo [aula1/README.md](aula1/README.md) possui a lista detalhada das
perguntas.

As pastas `pergunta4` e `pergunta8` nao fazem parte do estado atual do
projeto.

### Executar uma pergunta

```bash
cd aula1/pergunta1
javac *.java
java Main
```

Troque `pergunta1` pela pasta desejada. Os exercicios que usam `Scanner`
aguardam dados digitados no terminal.

## Aula 2

O exercicio demonstra uma classe `Carro` com informacoes e comportamentos:

- marca, modelo, cor, velocidade e combustivel;
- ligar e desligar o carro;
- acelerar, frear e buzinar;
- mostrar o estado atual do carro.

```bash
cd aula2
javac *.java
java Main
```

## Aula 3

### Exercicio 1: encapsulamento

A classe `Cofre` protege seus dados e oferece metodos para depositar, retirar,
consultar o valor e exibir informacoes.

```bash
cd aula3/ex1-encapsulamento
javac *.java
java Main
```

### Exercicio 2: heranca

As classes `videoAula` e `podcast` herdam caracteristicas de `conteudo` e
possuem comportamentos especificos.

```bash
cd aula3/ex2-heranca
javac *.java
java Main
```

### Exercicio 3: polimorfismo

A classe `Calculadora` demonstra metodos `somar` com diferentes tipos e
quantidades de parametros.

```bash
cd aula3/ex3-polimorfismo
javac *.java
java Main
```

### Exercicio 4: integracao dos conceitos

O exercicio combina encapsulamento, heranca e polimorfismo com as classes
`Pagamento`, `PagamentoPix` e `PagamentoCartao`.

```bash
cd aula3/ex4-integracaoDosConceitos
javac *.java
java Main
```

O README especifico desse exercicio explica onde cada conceito aparece:
[aula3/ex4-integracaoDosConceitos/README.md](aula3/ex4-integracaoDosConceitos/README.md).

## Limpar arquivos compilados

Os comandos `javac` criam arquivos `.class` na pasta do exercicio. Para
remove-los depois de testar:

```bash
find . -name "*.class" -delete
```

## Objetivo

Praticar a escrita de programas simples em Java e entender, passo a passo,
como variaveis, metodos, classes, heranca e polimorfismo funcionam.