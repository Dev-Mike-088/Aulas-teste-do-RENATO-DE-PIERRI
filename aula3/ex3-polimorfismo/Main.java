public class Main {
    public static void main(String[] args){
        System.out.println(Calculadora.somar(10, 20));
        System.out.println(Calculadora.somar(2.5, 3.8));
        System.out.println(Calculadora.somar(1, 2, 3));
    }
}

class Calculadora{
    
    public static int somar(int a, int b){
        return a + b;
    }
    public static double somar(double a, double b){
        return a + b;
    }
    public static int somar(int a, int b, int c){
        return a + b + c;
    }
}