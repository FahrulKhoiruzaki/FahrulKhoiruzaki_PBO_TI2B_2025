public class motor extends kendaraan{
    private String penggerak;
    private boolean statusKicStater = false;

    public void jenisPenggerak(String newValue){
        penggerak = newValue;
    }

    public void ada(){
        statusKicStater = true;
    }

    public void tidak(){
        statusKicStater = false;
    }

    public void cetakInformasi(){
        super.cetakInformasi();
        System.out.println("jenis penggerak: " + penggerak);
        String status = (statusKicStater) ? "Memili" : "Tidak Memiliki";
        System.out.println(status + " Kick Starter");
    }
}