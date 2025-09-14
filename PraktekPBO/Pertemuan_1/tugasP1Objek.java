public class tugasP1Objek {
    public static void main(String[] args) {
    laptop gt1 = new laptop();
    hp gt2 = new hp();
    gadget gt3 = new gadget();

    mobil kd1 = new mobil();
    motor kd2 = new motor();
    kendaraan kd3 = new kendaraan();

    kd2.setMerk("Honda Vario");
    kd2.kapasitasCC(125);
    kd2.jenisPenggerak("Vanbelt");
    kd2.tidak();
    kd2.cetakInformasi();
    }
}
