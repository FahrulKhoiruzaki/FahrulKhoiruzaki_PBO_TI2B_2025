package PraktekPBO.Pertemuan2;

public class barangTugas {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public barangTugas(String kode, String namaBarang, int hargaDasar, float diskonPersen) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskonPersen / 100;
    }


    public int hitungHargaJual() {
        return (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("===================================");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp " + hargaDasar);
        System.out.println("Diskon      : " + (diskon * 100) + "%");
        System.out.println("Harga Jual  : Rp " + hitungHargaJual());
        System.out.println("===================================");
    }
}
