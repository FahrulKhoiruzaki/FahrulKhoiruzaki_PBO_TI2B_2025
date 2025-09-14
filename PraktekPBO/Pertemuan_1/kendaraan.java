public class kendaraan {
    private String merk;
    private int ccMesin;

    public void setMerk(String newValue){
        merk = newValue;
    }

    public void kapasitasCC(int newValue){
        ccMesin = newValue;
    }

    public void cetakInformasi(){
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas: " + ccMesin + " cc");
    }
}
