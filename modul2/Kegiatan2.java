import java.util.LinkedList;
import java.util.Scanner;

public class Kegiatan2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);
        System.out.println("Before : "+list);

        System.out.println("add an item : ");
        int usr = Sc.nextInt();
        list.add(usr);
        System.out.print(list);

        int n = list.size();
        for (int i =0 ;i<n;i++){
            for (int j =0 ; j < n-i-1; j++){
                if (list.get(j) > list.get(j+1)){
                    int sort = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,sort);
                }
            }
        }
        System.out.println("after : "+list);
        Sc.close();
    }
}
