public class Avion extends Transporte{
    String tipo;
    double alturaMaxima;

    public Avion() {
    }

    public Avion(int capacidad, double velocidad, String tipo, double alturaMaxima) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.alturaMaxima = alturaMaxima;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo() {
        this.tipo = tipo;
    }
    public double getAlturaMaxima() {
        return alturaMaxima;
    }
    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    //METODO PERSONALIZADO

    public void darAviso(){
        System.out.println("El tipo de avion es: " + tipo);
        System.out.println("El altura maxima es: " + alturaMaxima);
    }
}
