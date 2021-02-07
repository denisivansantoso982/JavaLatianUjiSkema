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
        try {
            System.out.println("Nama \t: " + this.nama);
            System.out.println("Kelas\t: " + this.kelas);
            System.out.println("NIP  \t: " + this.NIP);
            System.out.println("Mapel\t: " + this.namaMapel);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        }
    }
    
    public String getNamaMapel() {
        return namaMapel;
    }
    
    public String getNamaKelas() {
        return kelas;
    }
        
}
