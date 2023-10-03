import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DataPraktikan {
    private HashMap<String,String> DataTable = new HashMap<>();
    private HashMap<String,String> loginTable = new HashMap<>();
    private List<String> currentUser = new ArrayList<>();

    public boolean TambahData(String NimPraktikan,String NamaAsisten) throws Exception{
        boolean succes = false;

        if (DataTable.containsKey(NimPraktikan)){
            succes = false ;
            throw new Exception("Already exist");
        }
        if (!NimPraktikan.startsWith("IF")){
            succes = false;
            throw new Exception("Should start by IF ");
        }
        if (NimPraktikan.length()!=9){
            succes = false;
            throw new Exception("must have nine characters");
        }
        succes =true;
        DataTable.put(NimPraktikan,NamaAsisten);

        return succes;
    }
    public void Tampil() throws Exception{
        if (DataTable.isEmpty()){
            throw new Exception("Data is empty");
        }
        int cnt = 0;

        System.out.println("-practicum participant data-");
        System.out.printf("%s\t%s\t\t%s\n", "No", "NIM", "Asisten");

        for (String key : DataTable.keySet()) {
            String value = DataTable.get(key);
            System.out.printf("%d.\t%s\t%s\n", ++cnt, key, value);
        }
    }

    public void ListNimPraktikan() throws Exception{
        if (DataTable.isEmpty()){
            throw new Exception("Data is empty");
        }
        int cnt = 0;

        for (String NimPraktikan : DataTable.keySet()){
            System.out.println(++cnt +"."+NimPraktikan);
        }
    }

    public void ListNamAsisten() throws Exception {
        if (DataTable.isEmpty()) {
            throw new Exception("Data is empty");
        }
        int cnt = 0 ;
        List<String> ListNamaAsisten = new ArrayList<>();

        for (String NamaAsisten:DataTable.values()){
            if(!ListNamaAsisten.contains(NamaAsisten)){
                ListNamaAsisten.add(NamaAsisten);
            }
        }
        for (String NamaAsisten : ListNamaAsisten){
            System.out.println(++cnt + "." + NamaAsisten);
        }
    }
    public int totalEmail(){
        int count = 0;
        for (String key : DataTable.keySet()){
            count++;
        }
        return count;
    }

    public boolean HapusData(String NimPraktikan, String NamaAsisten){
        if(DataTable.get(NimPraktikan)==null){
            return false;
        }DataTable.remove(NimPraktikan,NamaAsisten);
        return true;
    }

    public void EditData(String NimPraktikan,String NamaAsisten){
        DataTable.replace(NimPraktikan,NamaAsisten);
    }

    public Boolean register(String email, String password) throws Exception {
        Boolean success = false;

        if (loginTable.containsKey(email)) {
            success = false;
            throw new Exception("Data already exist");
        }
        if (!email.endsWith("@umm.ac.id")) {
            success = false;
            throw new Exception("Email should be end with '@umm.ac.id'");
        }
        if (!password.startsWith("IF")) {
            success = false;
            throw new Exception("Password sould start with 'IF'");
        }
        if (password.length() != 9) {
            success = false;
            throw new Exception("must have nine characters");
        }

        success = true;
        loginTable.put(email, password);

        return     success;

    }
    public Boolean login(String email, String password) throws Exception {
        Boolean success = false;

        if (!email.endsWith("@umm.ac.id")) {
            success = false;
            throw new Exception("Email should be end with '@umm.ac.id'");
        }
        if (!password.startsWith("IF")) {
            success = false;
            throw new Exception("Password sould start with 'IF'");
        }
        if (password.length() != 9) {
            success = false;
            throw new Exception("must have nine characters");
        }
        if (!loginTable.containsKey(email)) {
            success = false;
            throw new Exception("The email you entered has not been registered");
        }
        if (!password.equals(loginTable.get(email))) {
            success = false;
            throw new Exception("PThe password you entered is wrong");
        }

        success = true;
        currentUser.add(loginTable.get(email));

        return success;
    }
    public void logout(){
        currentUser.remove(0);
    }

}