public class laptop extends gadget{
    private String gpu;
    private int kipas;

    public void setMerkGPU(String newValue){
        gpu = newValue;
    }

    public void jmlKipas(int newValue){
        kipas = newValue;
    }

    public void cetakInformasi(){
        super.cetakInformasi();
        System.out.println("Merk GPU: " + gpu);
        System.out.println("Jumlah kipas: " + kipas);
    }
}
