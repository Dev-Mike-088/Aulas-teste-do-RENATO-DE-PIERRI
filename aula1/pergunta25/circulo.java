public class circulo{
    double raio;

    public double calcularArea(){
        return Math.PI * raio * raio;
    }
    public double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }
}