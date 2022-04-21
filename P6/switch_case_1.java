import java.util.Scanner;

public class switch_case_1 {
    public static void main(String[] args) {
        //variabel
        char inputan;
        String nama,s;
        //instansi = Suatu objek yang diciptakan dari suatu kelas disebut instansi
        Scanner sc = new Scanner(System.in);

        //proses inputan
        System.out.println("\nMasukan Nama : "); nama = sc.nextLine();
        System.out.println("\nMasukan Nilai : "); s = sc.nextLine();
        inputan = s.charAt(0);
        System.out.println("\n");
        switch(inputan){
            case 'A': System.out.println(nama+" Nilai Anda memuaskan"); break;
            case 'B': System.out.println(nama+" Nilai Anda bagus"); break;
            case 'C': System.out.println(nama+" Nilai Anda cukup"); break;
            default : System.out.println(nama+" Ngulang Tahun depan");
        }
    }
}
