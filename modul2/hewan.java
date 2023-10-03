import java.util.ArrayList;

import java.util.List;

public class hewan {
    public static void main(String[] args) {
        List <String> Hewan = new ArrayList<>();
        List <String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");

        System.out.println("Hewan :" + Hewan);
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("hewan yang dihapus :"+ DeleteHewan);

        Hewan.removeAll(DeleteHewan);
        System.out.println(Hewan);
    }


}
