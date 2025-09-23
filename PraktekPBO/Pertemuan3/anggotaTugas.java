package PraktekPBO.Pertemuan3;

public class anggotaTugas {
    private String nik;
    private String nama;
    private double limit;
    private double jmlPinjaman;

    anggotaTugas(String nik, String nama, double limit) {
        this.nik = nik;
        this.nama = nama;
        this.limit = limit;
        this.jmlPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman(){
        return limit;
    }

    public double getJumlahPinjaman() {
        return jmlPinjaman;
    }

    public void pinjam(double jumlah) {
        if (jmlPinjaman + jumlah > limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            jmlPinjaman += jumlah;
        }
    }

    public void angsur(double bayar) {
        double minAngsuran = jmlPinjaman * 0.1;

        if (bayar < minAngsuran) {
            System.out.println("Maaf Angsuran harus 10% dari jumlah pinjaman");
        } else {
            jmlPinjaman -= bayar;
        }
    }
}
