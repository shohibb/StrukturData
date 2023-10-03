import java.util.*;


public class Kegiatan1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList<String> NamaHewan = new ArrayList<>();

        NamaHewan.add("Angsa");
        NamaHewan.add("Bebek");
        NamaHewan.add("Cicak");
        NamaHewan.add("Domba");
        NamaHewan.add("Elang");
        NamaHewan.add("Gajah");

        ArrayList<String> Tambahan = new ArrayList<>(NamaHewan);
        Tambahan.add("Badak");
        Tambahan.add("Bebek");

        //menghitung frekuensi item
        int frekuensi = 0;
        for (String item : Tambahan){
            if(item.equals("Bebek")){
                frekuensi++;
            }
        }

        System.out.println(NamaHewan);
        System.out.println(Tambahan);
        System.out.println("Bebek = " + frekuensi);
        System.out.print("posisi Bebek =");

        //Mencari posisi "Bebek"
      //  String Lock = "Bebek";
        for (int i = 0; i < Tambahan.size();i++){
            if (Tambahan.get(i).equals("Bebek")){
                System.out.print(i+",");
            }
        }
        //Menghapus item sesuai index
        System.out.print("\nmasukan index yang ingin dihapus = ");
        int remove = Sc.nextInt();
        Tambahan.remove(remove);
        System.out.println(Tambahan);

        //Menampilkan item sesuai index dan hapus index ke -0
        System.out.println("Index ke -0:"+Tambahan.get(0));
        System.out.println("Index ke -2:"+Tambahan.get(2));
        Tambahan.remove(0);
        System.out.println(Tambahan);

        //mengubah value index
        System.out.print("pilih index yang ingin diubah : ");
        int change = Sc.nextInt();
        System.out.print("Masukan element baru : ");
        String Element = Sc.next();
        Tambahan.set(change,Element);
        System.out.println(Tambahan);

        //menambhakan item pada index yang ditentukan
        System.out.print("pilih letak sesuai index : ");
        int index = Sc.nextInt();
        System.out.print("masukan element baru : ");
        String NewItem = Sc.next();
        Tambahan.add(index,NewItem);
        System.out.println(Tambahan);

        //menghapus item antara index 1 dan 5
        Tambahan.subList(2,5).clear();
        System.out.println(Tambahan);

        //menampilkan element pada index pertama dan terakhir
        String FirstItem = Tambahan.get(0);
        String LastItem = Tambahan.get(Tambahan.size()-1);
        System.out.println("Item pada index pertama = "+FirstItem);
        System.out.println("Item pada index terakhir = "+ LastItem);

        //menampilkan jumlah item pada arraylist
        System.out.println("jumlah item pada ArrayList = "+Tambahan.size());

        //mencari posisi badak
        System.out.println("posisi badak adalah : "+Tambahan.indexOf("Badak"));

        Sc.close();
    }
}