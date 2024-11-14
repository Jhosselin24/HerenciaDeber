public class Barco extends Transporte{
    String tamano;
    int propulsion;

    public Barco() {
    }

    public Barco(int capacidad, double velocidad, String tamano, int propulsion) {
        super(capacidad, velocidad);
        this.tamano = tamano;
        this.propulsion = propulsion;
    }
    public Barco(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public Barco(String tamano, int propulsion) {
        this.tamano = tamano;
        this.propulsion = propulsion;
    }
    public String getTamano(){
        return tamano;
    }
    public int getPropulsion(){
        return propulsion;
    }
    public void setTamano(String tamano){
        this.tamano = tamano;
    }
    public void setPropulsion(int propulsion){
        this.propulsion = propulsion;
    }

    //METODO PERSONALIZADO
    public void arribar(){
        System.out.println("El tamaño del barco es: "+ tamano);
        System.out.println("La propulsion del barco es: "+ propulsion);
    }

}
