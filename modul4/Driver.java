import java.util.Scanner;

public class Driver {
    DataPraktikan dp = new DataPraktikan();
    Scanner sc =new Scanner(System.in);

    public void Starter(){
        System.out.println("1. Registration");
        System.out.println("2. Login");
        System.out.print(" Enter your choose : ");
        int chosee = sc.nextInt();

        if (chosee == 1){
            Regis();
        }else {
            login();
        }
    }

    public void Regis(){

            System.out.print("Email : ");
            String email = sc.next();
            System.out.print("Password : ");
            String pass = sc.next();

            try {
                if (dp.register(email,pass)){
                    System.out.println("SUCCES");

                }
            }catch (Exception e ){
                System.out.println(e);
            }
        backpage();
    }
    public void login(){

        System.out.print("Email : ");
        String email = sc.next();
        System.out.print("Password : ");
        String pass = sc.next();

        try {
            if (dp.login(email,pass)){
               home();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void logout(){
        dp.logout();
        Starter();
    }

    private void back(){
        Scanner pil = new Scanner(System.in);

        System.out.print("\nwanna back ? (y/n): (choose 'n' for close all program)");
        char choose = pil.nextLine().charAt(0);

        if (choose =='y'){
            home();
        }else {
            System.exit(0);
        }
    }

    private void backpage(){
        Scanner pil = new Scanner(System.in);

        System.out.print("\nBack to first page? (y/t) : (choose 'n' for close all program)");
        char choose = pil.nextLine().charAt(0);

        if (choose == 'y') {
            Starter();
        } else {
            System.exit(0);
        }
    }

    public void home(){
        System.out.println("1. Add data ");
        System.out.println("2. Show list of participant");
        System.out.println("3. Show list of assistant");
        System.out.println("4. shows the number of participant data");
        System.out.println("5. Erase data");
        System.out.println("6. Edit data");
        System.out.println("7. Logout");
        System.out.println("-enter your chosee-");

        int chosee = sc.nextInt();

        menu(chosee);
    }

    private void menu(int chosee){
        switch (chosee){
            case 1 :
                System.out.println("Add data");
                System.out.print("enter participant NIM :");
                String NIMpraktikan = sc.next();
                System.out.print("enter assistant name : ");
                String NamaAsisten = sc.next();

                try {
                    if (dp.TambahData(NIMpraktikan,NamaAsisten)){
                        System.out.println("Data added");
                    }
                }catch (Exception e){
                    System.out.println(e);
                }
                back();

            case 2:
                System.out.println("Show list of participant");
                try {
                    dp.ListNimPraktikan();
                }catch (Exception e){
                    System.out.println(e);
                }
                back();
            case 3:
                System.out.println("Show list of assistant");
                try {
                    dp.ListNamAsisten();
                }catch (Exception e){
                    System.out.println(e);
                }
                back();
            case 4:
                System.out.println("Shows the total of participant data");
                System.out.println("jumlah praktikan = "+ dp.totalEmail());
                try {
                    dp.Tampil();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                back();
            case 5:
                System.out.println("Delete data");
                System.out.print("Enter NIM to Delete : ");
                String delNIM = sc.next();
                System.out.print("Enter assistant's name : ");
                String delNam = sc.next();

                if (!dp.HapusData(delNIM,delNam)){
                    System.out.println("Something went wrong");
                }else {
                    System.out.println("Delete succes");
                }
                back();
            case 6:
                System.out.println("Edit data");
                System.out.print("Enter NIM to edit :");
                String EditNIM =sc.next();
                System.out.print("Enter new asistant's name : ");
                String NewNam = sc.next();

                dp.EditData(EditNIM,NewNam);
                back();
            case 7:
                logout();
                break;
            default:
                home();
        }
    }
    public static void main(String[] args) {
        Driver dr = new Driver();
        dr.Starter();
    }
}
