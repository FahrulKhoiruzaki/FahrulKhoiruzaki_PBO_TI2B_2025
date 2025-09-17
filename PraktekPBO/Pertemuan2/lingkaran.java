package PraktekPBO.Pertemuan2;

public class lingkaran {
    public double phi = 3.14;
    public double r;

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }

    public void tampilData(){
        System.out.println("=========================");
        System.out.println("Jari-jari lingkaran :" + r);
        System.out.println("Luas lingkaran      :" + hitungLuas());
        System.out.println("keliling lingkaran  :" + hitungKeliling());
        System.out.println("=========================");
    }
}
