public class Lampada {
    String cor;
    boolean estado;

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }

    public void mostrarEstado(){
        if(estado){
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }
}