public class gadget {
    private String merk;
    private int baterai;

    public void setMerk(String newValue){
        merk = newValue;
    }

    public void kapasitasBaterai(int newValue){
        baterai = newValue;
    }

    public void cetakInformasi(){
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas baterai: " + baterai + " Wh");
    }
}
