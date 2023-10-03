 import java.util.Scanner;

    public class tugas2 {

        public Node front,rear;
        public int cSize;
        public int count = 0;

        public tugas2(){
            front = null;
            rear = null;
            cSize = 0;
        }

        public void enqueue(DataMebel input){
            Node tmp = new Node(input, null);
            if(this.rear == null){
                this.front = this.rear = tmp;
                System.out.println("Data mebel = " + rear.data.nama);
                cSize++;
                return;
            }
            this.rear.next = tmp;
            this.rear = tmp;
            System.out.println("Data Penduduk berhasil ditambahkan "+rear.data.nama);
            cSize++;
        }

        public void dequeue(){
            if(this.front==null){
                System.out.println("Antrian kosong");
                return;
            }

            Node tmp = this.front;

            if(count >2){

                if(tmp.data.luas > 5 && tmp.data.luas < 60){
                    tmp = tmp.next;
                    System.out.println(this.front.data.nama);
                    this.front.next = null;
                    this.rear = this.front;
                    System.out.println("Data berhasil dikeluarkan, yaitu "+tmp.data.nama);
                    return;
                }
            }

            this.front = this.front.next;
            if(this.front == null){
                this.rear = null;
            }
            System.out.println("Data telah dihilankan, dengan jenis mebel "+tmp.data.nama);
            cSize--;
        }

        public void printList(){
            if(this.front != null){
                Node tmp = front;
                System.out.println("Isi antrian: ");
                int i = 0;
                while(tmp != null){
                    System.out.println((i+1)+". "+tmp.data.nama+" | "+tmp.data.luas +" | "+tmp.data.bahan);
                    tmp = tmp.next;
                    i++;
                }
            }else{
                System.out.println("kosong");
            }
        }

        public void peek(){

            if(!isEmpty()){
                System.out.println("Antrian pertama adalah "+this.front.data.nama+" luas mebel : "+this.front.data.luas +
                        " bahan : "+this.front.data.bahan);
            }else{
                System.out.println("Antrian kosong");
            }
        }

        public boolean isEmpty(){
            return rear == null && front == null;
        }

        public int size(){
            Node temp = front;
            int count = 0;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        public static void menu(){

            System.out.println("toko mebel entah apalah ");
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah antrian (enqueue)");
            System.out.println("2. Pemanggilan antrian (dequeue)");
            System.out.println("3. Cetak antrian (printList)" );
            System.out.println("4. Melihat antrian pertama (peek)");
            System.out.println("5. Total antrian (size)");
            System.out.println("6. Exit");
            System.out.println("-------------------------------");
        }

        public static void main(String[] args) {

            boolean exit = false;
            Scanner sc = new Scanner(System.in);
            tugas2 antrian = new tugas2();

            do{
                menu();
                System.out.print("Pilih menu :");
                int pilih = sc.nextInt();
                sc.nextLine();

                switch (pilih) {
                    case 1 -> {
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("bahan: ");
                        String bahan = sc.nextLine();
                        System.out.print("luas: ");
                        int luas = sc.nextInt();
                        DataMebel im = new DataMebel(nama, bahan, luas);
                        antrian.enqueue(im);
                    }
                    case 2 -> antrian.dequeue();
                    case 3 -> antrian.printList();
                    case 4 -> antrian.peek();
                    case 5 -> System.out.println("Jumlah antrian : " + antrian.size());
                    case 6 -> exit = true;
                }

            }while(!exit);
            sc.close();
        }
    }

    class Node{

        DataMebel data;
        Node next;

        public Node(DataMebel data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    class DataMebel {

        String nama;
        String bahan;
        int luas;


        public DataMebel(String nama, String bahan, int luas ){
            this.nama = nama;
            this.bahan= bahan;
            this.luas = luas;

        }
    }

