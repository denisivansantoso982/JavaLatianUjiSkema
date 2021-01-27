package Person;

public class Guru extends Person {
    private int NIP;
    private String kelas;
    private String namaMapel;
    
    public void setDataGuru(String nama, int NIP, String mapel, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
        this.NIP = NIP;
        this.namaMapel = mapel;
    }
    
    @Override
    public void infoPerson() {
        System.out.println(this.nama + "\n" + this.kelas + "\n" + this.NIP + "\n" + this.namaMapel);
    }
    
    public String getNamaMapel() {
        return namaMapel;
    }
    
    public String getNamaKelas() {
        return kelas;
    }
        
}
