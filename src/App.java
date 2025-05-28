import models.*; 

public class App {
    public static void main(String[] args) throws Exception {
        Motor motor = new Motor("MTR123", "Toyota", 4, 150);
        Transmision transmision = new Transmision("TRS456", "Honda", "Manual", 6);
        Neumatico neumatico = new Neumatico("N001", "Michelin", 17, 32.5);

        System.out.println("================= Motor =================");
        motor.mostrarInformacion();
        motor.encenderMotor();

        System.out.println("\n================= Transmisión =================");
        transmision.mostrarInformacion();
        transmision.cambiarMarcha(3);

        System.out.println("\n================= Neumático =================");
        neumatico.mostrarInformacion();
        neumatico.verificarPresion();   

    
    }
}
