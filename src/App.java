import models.*; 

public class App {
    public static void main(String[] args) throws Exception {
        Motor motor = new Motor("MTR123", "Toyota", 4, 150);
        motor.mostrarInformacion();
        motor.encenderMotor();

        System.out.println();
    
    }
}
