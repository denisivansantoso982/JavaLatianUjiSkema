package latianujiskema;
import java.util.*;

public class Siswa extends Person implements Statistical {
    private int NIS;    
    private int nilaiUTS;
    private int nilaiUAS;
    private double nilaiAkhir;
    private String nilaiHuruf;
    private double bbtUTS;
    private double bbtUAS;
    
    Scanner input = new Scanner(System.in);
    Siswa data[];

    public void setDataSiswa(int NIS, String nama, int nilUTS, int nilUAS) {
        this.nama = nama;
        this.NIS = NIS;
        this.nilaiUTS = nilUTS;
        this.nilaiUAS = nilUAS;
    }
    
    public void setDataSiswa() {
        System.out.print("Input nama : ");
        this.nama = input.next();
        System.out.print("\nInput NIS : ");
        this.NIS = input.nextInt();
        System.out.print("\nInput Nilai UTS : ");
        this.nilaiUTS = input.nextInt();
        System.out.print("\nInput Nilai UAS : ");
        this.nilaiUAS = input.nextInt();
        System.out.println();
    }
    
    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (this.nilaiUTS + this.nilaiUAS) / 2;
    }
    
    public double getNilaiAkhir() {
        return nilaiAkhir;
    }
    
    @Override
    public void infoPerson() {
        System.out.println("Nama \t\t: " + this.nama);
        System.out.println("NIS \t\t: " + this.NIS);
        System.out.println("Nilai UTS \t: " + this.nilaiUTS);
        System.out.println("Nilai UAS \t: " + this.nilaiUAS);
    }
    
    public String hitungNilaiHuruf() {
        if (this.nilaiAkhir == 100) {
            this.nilaiHuruf = "A++";
        } else if (this.nilaiAkhir < 100 && this.nilaiAkhir >= 95) {
            this.nilaiHuruf = "A+";
        } else if (this.nilaiAkhir < 95 && this.nilaiAkhir >= 90) {
            this.nilaiHuruf = "A";
        } else if (this.nilaiAkhir < 90 && this.nilaiAkhir >= 85) {
            this.nilaiHuruf = "A-";
        } else if (this.nilaiAkhir < 85 && this.nilaiAkhir >= 80) {
            this.nilaiHuruf = "B+";
        } else if (this.nilaiAkhir < 80 && this.nilaiAkhir >= 75) {
            this.nilaiHuruf = "B";
        } else if (this.nilaiAkhir < 75 && this.nilaiAkhir >= 60) {
            this.nilaiHuruf = "B-";
        } else if (this.nilaiAkhir < 60 && this.nilaiAkhir >= 50) {
            this.nilaiHuruf = "C";
        } else if (this.nilaiAkhir < 50 && this.nilaiAkhir >= 25) {
            this.nilaiHuruf = "D";
        } else if (this.nilaiAkhir < 25 && this.nilaiAkhir >= 0) {
            this.nilaiHuruf = "E";
        } 
        
        return nilaiHuruf;
    }

    @Override
    public double hitungRerata( Siswa[] data1 ) {
        return (nilaiUAS + nilaiUTS) / 2;
    }

    @Override
    public void sorting( Siswa[] data2 ) {
        Arrays.sort(data2);
        System.out.println(Arrays.toString(data2));
    }

    @Override
    public void searching( Siswa[] data3 ) {
        System.out.println("Not yet");
    }

}
