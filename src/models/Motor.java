package models;

public class Motor extends ComponenteVehicular {
    int cilindros;
    int potencia;
    
    public Motor(String codigo, String fabricante, int cilindros, int potencia) {
        super(codigo, fabricante);
        this.cilindros = cilindros;
        this.potencia = potencia;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cilindrada: " + cilindros + " cilindros");
        System.out.println("Potencia: " + potencia + " HP");
    }

    public void encenderMotor() {
        System.out.println("El motor está encendido con: " + cilindros + " cilindros y " + potencia + " HP de potencia.");  
    }

    
}
