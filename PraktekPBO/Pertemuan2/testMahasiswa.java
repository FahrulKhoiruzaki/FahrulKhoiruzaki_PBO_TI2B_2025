package PraktekPBO.Pertemuan2;

public class testMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mahasiswa mhs2 = new mahasiswa();
        mahasiswa mhs3 = new mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        mhs2.nim = 102;
        mhs2.nama = "Cici Sabrina";
        mhs2.alamat = "Jl. Kenangan No 69";
        mhs2.kelas = "2C";
        mhs2.tampilBiodata();

        mhs3.nim = 103;
        mhs3.nama = "Fahrul";
        mhs3.alamat = "Jl. Bersama No 69A";
        mhs3.kelas = "2B";
        mhs3.tampilBiodata();
    }
}
