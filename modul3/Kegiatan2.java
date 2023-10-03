public class Kegiatan2 {
    private String[] data;
    private int Depan;
    private int Blk;
    private int Ukr;

    public Kegiatan2(int kapasitas){
        data = new String[kapasitas];
        Depan = 0;
        Blk =-1;
        Ukr = 0;
    }

    public boolean isEmp(){
        return Ukr == 0;
    }

    public boolean isFul(){
        return Ukr == data.length;
    }

    //method pertama yang diminta dimodul
    public void Enqueue(String element){
        if(isFul()){
            throw new RuntimeException("penuh rek");
        }
        Blk = (Blk+1)% data.length;
        data[Blk] = element;
        Ukr ++;
    }

    //method kedua yang diminta dimodul
    public String Dequeue(){
        if(isEmp()){
            throw new RuntimeException("kosong gaes");
        }
        String element = data[Depan];
        Depan =(Depan + 1 ) % data.length;
        Ukr--;
        return element;
    }

    //method ketiga yang diminta dimodul
    public String Peek(){
        if(isEmp()){
            throw new RuntimeException("gak ada apa-apa");
        }
        return data[Depan];
    }

    //method keempat yang diminta dimodul
    public int Size(){
        return Ukr;
    }

//    class DataMebel{
//        String NamaMebel;
//        int LuasMebel;
//        String BahanMebel;
//
//        public DataMebel(String namaMebel, int luasMebel, String bahanMebel) {
//            this.NamaMebel = namaMebel;
//            this.LuasMebel = luasMebel;
//            this.BahanMebel = bahanMebel;
//        }
//    }





    public static void main(String[] args) {
//        Kegiatan2 k2 = new Kegiatan2(6);
//        k2.Enqueue("meja");
//        k2.Enqueue("kursi");
//        k2.Enqueue("lemari");
//        System.out.println(k2.Size());
//        System.out.println(k2.Peek());
//        k2.Dequeue();
//        System.out.println(k2.Size());
//        System.out.println(k2.Peek());

    }
}
