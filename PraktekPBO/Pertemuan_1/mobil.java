public class mobil extends kendaraan{
    private String bahanBakar;
    private int kursi;

    public void jenisBB(String newValue){
        bahanBakar = newValue;
    }

    public void jmlKursi(int newValue){
        kursi = newValue;
    }

    public void cetakInformasi(){
        super.cetakInformasi();
        System.out.println("Jenis bahan bakar: " + bahanBakar);
        System.out.println("Jumlah kursi: " + kursi);
    }
}