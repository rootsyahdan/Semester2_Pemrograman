import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //variabel
        String nama;
        int umur;
        double tinggi;

        //instansi class scanner
        //Suatu objek yang diciptakan dari suatu kelas disebut instansi dari kelas tersebut
        Scanner s = new Scanner(System.in);

        //proses inputan
        System.out.println("\nMasukan Nama : "); nama = s.nextLine();
        System.out.println("\nMasukan umur : "); umur = s.nextInt();
        System.out.println("\nMasukan tinggi : "); tinggi = s.nextDouble();

        //output
        System.out.println("\nNama : " + nama);
        System.out.println("\nUmur : " + umur);
        System.out.println("\nTinggi : " + tinggi);


    }
}