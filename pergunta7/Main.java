//Faça A = 10 e B = 20. Depois, troque os valores utilizando uma terceira variável.
public class Main{
    public static void main(String[] args){
        int A = 10;
        int B = 20;
        int C;

        System.out.println("Antes da troca: A = " + A + ", B = " + B);

        C = A;
        A = B;
        B = C;
        System.out.println("Depois da troca: A = " + A + ", B = " + B);
    }
}