# Aulas - Testes do RENATO DE PIERRI

Coleção de exercícios de programação em **Java** com progressão gradual de dificuldade. Este projeto contém 26 problemas (perguntas) que cobrem desde conceitos básicos até programação orientada a objetos com classes e menus interativos.

## 📋 Estrutura do Projeto

O projeto está organizado em pastas numeradas de `pergunta1` até `pergunta26`, cada uma contendo um ou mais arquivos Java:

```
Aulas-teste-do-RENATO-DE-PIERRI/
├── pergunta1/
├── pergunta2/
├── ...
└── pergunta26/
```

Cada pasta contém:
- **Main.java**: Arquivo principal com o programa/exercício
- **Classe.java**: Arquivos de classe adicionais (quando necessário)

## 🎯 Listagem de Exercícios

### Nível 1: Fundamentos Básicos

| # | Descrição | Conceitos |
|---|-----------|-----------|
| **1** | Exibir nome e curso | `System.out.println()` |
| **2** | Exibir dados de um aluno (variáveis simples) | Tipos de dados, `String`, `int`, `double`, `boolean` |
| **3** | (Exercício adicional) | Variáveis e tipos |
| **5** | Declarar e exibir dados do aluno | `if/else`, condicionais |
| **6** | (Exercício adicional) | Estruturas de controle |
| **7** | (Exercício adicional) | Lógica e estruturas |
| **9** | (Exercício adicional) | Operadores e expressões |
| **10** | (Exercício adicional) | Controle de fluxo |

### Nível 2: Programação Intermediária

| # | Descrição | Conceitos |
|---|-----------|-----------|
| **11** | (Exercício intermediário) | Loops/repetições |
| **12** | (Exercício intermediário) | Arrays/Coleções |
| **13** | (Exercício intermediário) | Métodos |
| **14** | (Exercício intermediário) | Métodos com parâmetros |
| **15** | (Exercício intermediário) | Retorno de métodos |
| **16** | (Exercício intermediário) | Estruturas de dados |
| **17** | (Exercício intermediário) | Processamento de dados |
| **18** | (Exercício intermediário) | Manipulação de strings |
| **19** | (Exercício intermediário) | Algoritmos |
| **20** | (Exercício intermediário) | Lógica avançada |

### Nível 3: Programação Orientada a Objetos (POO)

| # | Descrição | Conceitos | Arquivos |
|---|-----------|-----------|----------|
| **21** | Classe `Produto` com cálculo de estoque | Classes, atributos, métodos | `Produto.java`, `Main.java` |
| **22** | Classe `Aluno` com cálculo de média | Classes, entrada de dados com `Scanner` | `Aluno.java`, `Main.java` |
| **23** | Classe `Conta` bancária | Operações bancárias, encapsulamento | `Conta.java`, `Main.java` |
| **24** | Classe `Lampada` com controle de estado | Estado de objetos, controle de ligado/desligado | `Lampada.java`, `Main.java` |
| **25** | Classe `Circulo` com cálculos de área | Geometria, cálculos matemáticos | `circulo.java`, `Main.java` |
| **26** | **Desafio** - Independência de objetos com duas contas | Múltiplos objetos, operações independentes, menu interativo | `Conta.java`, `Menu.java`, `Main.java` |

## 🔍 Detalhes dos Exercícios Principais

### Pergunta 21: Classe Produto
Implementa uma classe `Produto` com:
- Atributos: nome, preço, quantidade
- Método `calcularValorEstoque()`: calcula o valor total do estoque
- Método `mostrarDados()`: exibe informações do produto

### Pergunta 22: Classe Aluno
Implementa uma classe `Aluno` com:
- Atributos: nome, nota1, nota2
- Método `calcularMedia()`: calcula a média de notas
- Método `mostrarDados()`: exibe dados do aluno
- Entrada de dados via `Scanner`

### Pergunta 23: Classe Conta
Implementa operações bancárias básicas:
- Depósitos e saques
- Cálculo de saldo
- Demonstração de encapsulamento

### Pergunta 26: Desafio - Independência de Objetos ⭐
O exercício final demonstra:
- Criação de duas contas bancárias independentes
- Operações diferentes em cada conta
- Menu interativo para navegação
- Prova de que cada objeto mantém seu próprio estado (saldo)

## 🛠️ Requisitos

- **Java JDK 8** ou superior
- **Compilador Java** (javac)
- **Terminal/CMD** para executar os programas

## 💻 Como Compilar e Executar

### Opção 1: Compilar e executar por pasta

```bash
# Navegar até a pasta do exercício
cd pergunta1

# Compilar
javac Main.java

# Executar
java Main
```

### Opção 2: Compilar tudo de uma vez

```bash
# Navegar até a raiz do projeto
cd /home/mike/Projects/Aulas-teste-do-RENATO-DE-PIERRI

# Compilar todos os arquivos
find . -name "*.java" -exec javac {} \;
```

### Exemplo: Executar Pergunta 26 (com interação)

```bash
cd pergunta26
javac *.java
java Main
```

## 📝 Notas Importantes

- **Entrada de Dados**: Alguns exercícios (21+) utilizam `Scanner` para entrada interativa
- **Classes Auxiliares**: Algumas perguntas contêm arquivos de classe além do `Main.java`
- **Progressão**: Os exercícios aumentam em complexidade - comece pelo pergunta1 e siga a sequência
- **Independência de Objetos**: O exercício 26 é especialmente importante para entender como diferentes instâncias de uma classe mantêm seus próprios dados

## 🎓 Temas de Aprendizado

1. **Fundamentos** (Q1-10): Variáveis, tipos de dados, saída de dados
2. **Controle de Fluxo** (Q11-20): Loops, condicionais, métodos
3. **POO Básico** (Q21-25): Classes, atributos, métodos, instâncias
4. **POO Avançado** (Q26): Múltiplos objetos, menu interativo, independência

## 📚 Recursos Adicionais

- [Documentação Oracle Java](https://docs.oracle.com/javase/tutorial/)
- [Tutorial Java w3schools](https://www.w3schools.com/java/)
- Consulte os comentários em cada arquivo `Main.java` para entender o objetivo específico

## ✨ Autor

Exercícios preparados por **RENATO DE PIERRI** para fins educacionais.

---

**Última atualização**: 2026-08-15
