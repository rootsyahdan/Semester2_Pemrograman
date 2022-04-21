import java.util.Scanner;
public class switch_case_3 {
    public static void main(String[] args) {
        //variabel
        int pilihan,angka,panjang,lebar,lp,alas,tinggi;
        double ls;
        String ket,nama;

        //instansi = Suatu objek yang diciptakan dari suatu kelas disebut instansi
        Scanner oke = new Scanner(System.in);

        //proses inputan
        System.out.println("\n1.Mencari Luas Persegi Panjang -> ");
        System.out.println("\n2.Mencari Luas Segitiga ->  \n");
        System.out.println("\nMasukan Pilihan Anda : "); pilihan = oke.nextInt();
        System.out.println("-----------------------------------------------------------");

        switch (pilihan){
            case 1:
                System.out.println("\n1.Mencari Luas Persegi : ");
                System.out.println("-----------------------------------------------------------");
                System.out.print("\nMasukan Nilai Panjang : "); panjang = oke.nextInt();
                System.out.print("\nMasukan Nilai Lebar : "); lebar = oke.nextInt();
                lp = panjang * lebar;
                System.out.println("\nLuas Persegi Panjang Adalah : " + lp);
                break;

            case 2 :
                System.out.println("\n1.Mencari Luas Segitiga : ");
                System.out.println("-----------------------------------------------------------");
                System.out.print("\nMasukan Nilai Alas : "); alas = oke.nextInt();
                System.out.print("\nMasukan Nilai Tinggi : "); tinggi = oke.nextInt();
                ls = 0.5 * alas * tinggi;
                System.out.println("\nLuas Persegi Panjang Adalah : " + ls);
                break;
        }
    }
}
