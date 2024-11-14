public class Tren extends Transporte{
    int bagones;
    String tipo;

    public Tren() {
    }

    public Tren(int capacidad, double velocidad, int bagones, String tipo) {
        super(capacidad, velocidad);
        this.bagones = bagones;
        this.tipo = tipo;
    }
    public Tren(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public Tren(int bagones, String tipo) {
        this.bagones = bagones;
        this.tipo = tipo;
    }
    public int getBagones(){
        return bagones;
    }
    public String getTipo(){
        return tipo;
    }
    public void setBagones(int bagones){
        this.bagones = bagones;
    }
    public void setTpo(String tipo){
        this.tipo = tipo;
    }

    //METODO PERSONALIZADO
    public void arrastrarBagones(){
        System.out.println("El numero de bagones del tren es: "+ bagones);
        System.out.println("El tipo de Tren es: "+ tipo);
    }

}