package modul1.tugas;

import java.util.Scanner;

public class Segitiga<T extends Number > {
    T alas;
    T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    int getResultAsInt(){
       return (int) (0.5 * alas.intValue()* tinggi.intValue());
    }
    Double getResultAsDouble(){
        return 0.5 * alas.doubleValue() * tinggi.doubleValue();
    }

    public static void main(String[] args)
     {
        Scanner Sc = new Scanner(System.in);
        System.out.print("1. Get integer result\n2. Get double result\nchosee your case :");
        int Case = Sc.nextInt();
        switch (Case) {
            case (1) -> {
                System.out.print("Masukan alas segitiga :");
                int alas = Sc.nextInt();
                System.out.print("Masukan tinggi segitiga :");
                int tinggi = Sc.nextInt();
                Segitiga<Integer> luasTipeInt = new Segitiga<>(alas, tinggi);
                System.out.println("the result is = "+luasTipeInt.getResultAsInt()); 
            }
            case (2) -> {
                System.out.print("Masukan alas segitiga :");
                double Alas = Sc.nextDouble();
                System.out.print("Masukan tinggi segitiga :");
                double Tinggi = Sc.nextDouble();
                Segitiga<Double> luasTipeDouble = new Segitiga<>(Alas, Tinggi);
                System.out.printf("the result is = %.2f", luasTipeDouble.getResultAsDouble());
            }
        }
        Sc.close();
    }
}
