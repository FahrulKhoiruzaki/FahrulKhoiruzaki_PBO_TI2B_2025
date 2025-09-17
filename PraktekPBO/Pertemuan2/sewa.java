package PraktekPBO.Pertemuan2;

public class sewa {
    public String id;
    public String nmMember;
    public String namaGame;
    public int lamaSw;
    public double hargaSw;

    public double hitungHarga() {
        return lamaSw * hargaSw;
    }

    public void tampilData() {
        System.out.println("===============================================");
        System.out.println("ID Peminjaman           : " + id);
        System.out.println("Nama Member             : " + nmMember);
        System.out.println("Nama Game               : " + namaGame);
        System.out.println("Lama Sewa               : " + lamaSw + " hari");
        System.out.println("Harga per Hari          : Rp" + hargaSw);
        System.out.println("Total yang harus dibayar: Rp" + hitungHarga());
        System.out.println("===============================================");

    }
}
