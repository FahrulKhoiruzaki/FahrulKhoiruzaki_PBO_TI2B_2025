package PraktekPBO.Pertemuan3;

public class motorDemo {
    public static void main(String[] args) {
        motor motor = new motor();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.tambahKecepatan();
        motor.printStatus();

        motor.tambahKecepatan();

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
