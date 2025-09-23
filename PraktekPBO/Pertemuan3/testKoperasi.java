package PraktekPBO.Pertemuan3;
import java.util.Scanner;

public class testKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        anggotaTugas donny = new anggotaTugas("111333444", "Donny", 5000000);

        System.out.println("\nNama Anggota: " + donny.getNama());
        System.out.println("limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.print("\nMasukkan jumlah pinjaman: ");
        double pinjaman = sc.nextDouble();
        donny.pinjam(pinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        while (true) {
            System.out.println("\n(Ketik 0 untuk keluar!!...)");
            System.out.print("Masukkan angsuran yang mau dibayar: ");
            double byr = sc.nextDouble();

            if (byr == 0) {
                System.out.println("Terimakasih:)");
                break;
            }
            donny.angsur(byr);
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        }
        sc.close();
    }
}
