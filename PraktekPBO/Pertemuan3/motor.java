package PraktekPBO.Pertemuan3;

public class motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int maks_kecepatan = 100;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn == true) {
            if (kecepatan < maks_kecepatan) {
                kecepatan += 10;
                if (kecepatan > maks_kecepatan) {
                    kecepatan = maks_kecepatan;
                }
            } else {
                System.out.println("Kecepatan sudah mencapai maksimal " + maks_kecepatan + " km/h \n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
    }
    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 10;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena mesin off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
