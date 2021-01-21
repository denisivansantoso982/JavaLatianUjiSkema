package latianujiskema;
import java.util.*;

public class Main {

    public static void main( String[] args ) {
        Person person = new Person();
        Siswa siswa = new Siswa();
        boolean loop = true;
        List<Siswa> data = new ArrayList<Siswa>();
        
//        do {
            siswa.setDataSiswa(234543532, "Denis Ivan Santoso", 90, 95);
            data.add(siswa);
            siswa.setDataSiswa(234543532, "Indra Prasetyo", 90, 95);
            data.add(siswa);
//            loop = false;
//        } while(loop);
        System.out.println(data);
    }
    
}

// Masih belum selesai ya guys
