public class hp extends gadget {
    private boolean statusSidikJari = false;
    private int kamera;

    public void ada(){
        statusSidikJari = true;
    }

    public void tidak(){
        statusSidikJari = false;
    }

    public void kamera(int newValue){
        kamera = newValue;
    }

    public void cetakInformasi(){
        super.cetakInformasi();
        String status = (statusSidikJari) ? "Memiliki" : "Tidak Memiliki";
        System.out.println("HP " + status + " Sidik Jari");
        System.out.println("Kamera " + kamera + " MP");
    }
}