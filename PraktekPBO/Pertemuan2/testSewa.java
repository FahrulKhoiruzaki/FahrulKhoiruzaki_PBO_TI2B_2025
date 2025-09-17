package PraktekPBO.Pertemuan2;

public class testSewa {
    public static void main(String[] args) {
        sewa sw1 = new sewa();
        
        sw1.id = "101";
        sw1.nmMember = "Cici";
        sw1.namaGame = "GTA IV";
        sw1.lamaSw = 5;
        sw1.hargaSw = 10000;
        sw1.tampilData();
    }
}
