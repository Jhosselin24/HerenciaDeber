import java.sql.SQLOutput;

public class Auto extends Transporte {
    String tipo;
    int cilindraje;

    public Auto() {
    }

    public Auto(int capacidad, double velocidad, String tipo, int cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //METODO PESONALIZADO
    public void prenderRadio() {
        System.out.println("El tipo es: " + tipo);
        System.out.println("El cilindraje es: " + cilindraje);
    }
}