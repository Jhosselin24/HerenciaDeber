public class Auto extends Transporte {
    String tipo;
    int cilindraje;

    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }


    //METODO PESONALIZADO
    public void prenderRadio() {
        System.out.println("El tipo es: " + tipo);
        System.out.println("El cilindraje es: " + cilindraje);
    }
}