package models;

public class SistemaFrenos extends ComponenteVehicular {
    boolean tieneABS;
    String tipoDisco;
    
    public SistemaFrenos(String codigo, String fabricante, boolean tieneABS, String tipoDisco) {
        super(codigo, fabricante);
        this.tieneABS = tieneABS;
        this.tipoDisco = tipoDisco;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Sistema ABS: " + (tieneABS ? "Sí" : "No"));
        System.out.println("Tipo de disco: " + tipoDisco);
    }
    public void verificarABS(){
        if (tieneABS) {
            System.out.println("Sistema ABS operativo.");
        } else {
            System.out.println("Este veiculo no tiene ABS.");
        }
    }
    
}
