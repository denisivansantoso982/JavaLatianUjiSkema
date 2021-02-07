package Person;
import java.util.*;

public class Utama {
    Siswa siswa = new Siswa();
    Guru guru = new Guru();
    
    public static void main( String[] args ) {
        Utama utama = new Utama();
        Scanner input = new Scanner(System.in);
        int pilihan;
        boolean loop = false;
        
        System.out.println("************************************");
        System.out.println("Sistem Aplikasi Nilai".toUpperCase());
        System.out.println("By Denis Ivan Santoso\n");
        
        System.out.println(".::. SELAMAT DATANG!!! .::.");
        System.out.println("1. Masukkan Data Guru");
        System.out.println("2. Masukkan Data Nilai Siswa");
        System.out.println("3. Tampilkan Data Guru");
        System.out.println("4. Tampilkan Data Nilai");
        System.out.println("5. Pengurutan Data Siswa");
        System.out.println("6. Pencarian Data Siswa");
        System.out.println("7. Keluar");
        
//        try {  
            OUTER:
            do {
                System.out.println("====================================");
                System.out.print("Input : ");
                pilihan = input.nextInt();
                switch ( pilihan ) {
                    case 1:
                        utama.masukkanDataGuru();
                        loop = true;
                        break;
                    case 2:
                        break;
                    case 3:
                        utama.tampilkanDataGuru();
                        loop = true;
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break OUTER;
                    default:
                        System.out.println("Inputan tidak tersedia! \nPilih lagi!");
                        loop = true;
                        break;
                }
            } while ( loop );   
//        } catch (Exception ex) {
//            System.out.println("Error! Inputan tidak valid");
//        }
    }
    
    void masukkanDataGuru() {
        Scanner input = new Scanner(System.in);
        int NIP;
        String nama, mapel, kelas;
        try {
            System.out.print("Input nama : ");
            nama = input.next();
            System.out.print("\nInput NIP : ");
            NIP = input.nextInt();
            System.out.print("\nInput mapel : ");
            mapel = input.next();
            System.out.print("\nInput kelas : ");
            kelas = input.next();
            this.guru.setDataGuru( nama, NIP, mapel, kelas );
        } catch (NullPointerException ex) {
            System.out.println("Data tidak boleh kosong!");
        }
    }
    
    void tampilkanDataGuru() {
        try {
            this.guru.infoPerson();
        } catch (NullPointerException npe) {
            System.out.println(npe);
        }
    }
    
}

// Masih belum selesai ya guys
