package models;

public class Chasis extends ComponenteVehicular {
    String tipo;
    double peso;

    public Chasis(String codigo, String fabricante, String tipo, double peso) {
        super(codigo, fabricante);
        this.tipo = tipo;
        this.peso = peso;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);
        System.out.println("Peso: " + peso + " kg");
    } 
    public void calcularCargaMaxima() {
        double cargaMaxima = peso * 3.5; 
        System.out.println("La carga máxima estimada: " + cargaMaxima + " kg");
    }

}
