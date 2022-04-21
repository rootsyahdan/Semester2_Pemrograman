import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffer {
    public static void main(String[] args) throws Exception {
        //deklarasi variabel
        String nama;
        int angka_bulat;
        double pecahan;

        //instansi kelas buffered
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //perintah input data
        System.out.println("\nMasukan Nama : "); nama = br.readLine();
        System.out.println("\nmasukan angka bulat : "); angka_bulat = Integer.parseInt(br.readLine());
        System.out.println("\nmasukan angka pecahan : "); pecahan = Double.parseDouble(br.readLine());


        //output
        System.out.println("\nNama : " + nama);
        System.out.println("\nAngka Bulat : " + angka_bulat);
        System.out.println("\nAngka Pecahan : " + pecahan);



    }
}
