import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    String nama ,kelas ,matkulPraktikum;
    int nim;

    public Mahasiswa(String nm ,String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String,Mahasiswa>mhs = new HashMap<>();
        String input;
        Mahasiswa data;

        mhs.put("1",new Mahasiswa("putri","3H","Struktur data",2020000));
        mhs.put("2",new Mahasiswa("Agus","3A","Matematika",2021012));
        mhs.put("3",new Mahasiswa("Arro", "30", "Pemrograman",2020017));

        System.out.println("Masukan IO: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama +", Kelas : "+ data.kelas + ", mata kuliah praktikum : "+ data.matkulPraktikum + ", NIM : "+ data.nim);
        }
    }
}
