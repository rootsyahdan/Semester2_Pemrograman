package P5;

import javax.swing.JOptionPane;

public class sepuluh_R2P
{
    public static void main (String[]args){
        
        //Muhammad Nanda Ryan Saputra mendesain fitur, membuat komentar dan ide pdf;
        //variabel
        String nama,alamat,hp,paket;
        int validasi;
        
        //Raja Fathir Rakha Putra Menginput showMessageDialog, test program dan membuat pdf;
        //showMessageDialog() untuk menampilkan pesan/informasi;
        JOptionPane.showMessageDialog(null,"Selamat Datang Di Layanan Wifi Tercepat");
        
        //Elang Maulana Sidik Menginput Dialog dan membantu ide pdf;
        //showInputDialog() : untuk menampilkan dialog input;
        nama = JOptionPane.showInputDialog("Masukan Nama : ");
        JOptionPane.showMessageDialog(null,"Hello "+ nama +", Selamat Datang Di Layanan Wifi Tercepat"); 
        alamat = JOptionPane.showInputDialog("Alamat Anda : ");
        
        //showConfirmDialog() : untuk menampilkan dialog konfirmasi;
        hp = JOptionPane.showInputDialog("No Telepon Anda : ");
        validasi = JOptionPane.showConfirmDialog(null, "Apakah Data Anda Sudah Benar ?" + "\nNama : " + nama + "\nAlamat : " + alamat + "\nNo HP : " + hp);
        
        //Syahdan Fauzi Utama Menginput Percabangan If else, switch dan membuat pdf;
        switch(validasi){
        case JOptionPane.YES_OPTION: 
            JOptionPane.showMessageDialog(null,"Nama : " + nama + "\nAlamat : " + alamat + "\nNo HP : " + hp);
            JOptionPane.showMessageDialog(null,"<---------------PAKET WIFI------------------->\n Paket A 50MBPS 300.000 \n Paket B 75MBPS 400.000 \n Paket C 100MBPS 500.000 \n (silahkan pilih (A/B/C)");
            paket = JOptionPane.showInputDialog("Silahkan Ingin paket A/B/C : ");
            if(paket.equals("A")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket A dengan kecepatan 50MBPS \nTerima Kasih Telah Berlangganan Bersama Kami "+ nama);
            }else if(paket.equals("B")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket B dengan kecepatan 75MBPS \nTerima Kasih Telah Berlangganan Bersama Kami  "+ nama);
            }else if(paket.equals("C")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket C dengan kecepatan 100MBPS \nTerima Kasih Telah Berlangganan Bersama Kami "+ nama);
            }else { JOptionPane.showMessageDialog(null,"Anda Memasukan Inputan Yang Salah ! (A/B/C Huruf Besar)");
            };
            break;
        case JOptionPane.NO_OPTION:
            nama = JOptionPane.showInputDialog("Masukan nama : ");
            alamat = JOptionPane.showInputDialog("Alamat Anda : ");
            hp = JOptionPane.showInputDialog("No Telepon Anda : ");
            JOptionPane.showMessageDialog(null,"Nama : " + nama + "\nAlamat : " + alamat + "\nNo HP : " + hp);
             JOptionPane.showMessageDialog(null,"<---------------PAKET WIFI------------------->\n Paket A 50MBPS 300.000 \n Paket B 75MBPS 400.000 \n Paket C 100MB 500.000 \n (silahkan pilih (A/B/C)");
            paket = JOptionPane.showInputDialog("Silahkan Ingin paket A/B/C : ");
            if(paket.equals("A")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket A dengan kecepatan 50MBPS \nTerima Kasih Telah Berlangganan Bersama Kami "+ nama);    
            }else if(paket.equals("B")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket B dengan kecepatan 75MBPS \nTerima Kasih Telah Berlangganan Bersama Kami  "+ nama);
            }else if(paket.equals("C")){
                JOptionPane.showMessageDialog(null,"Anda Memilih Paket C dengan kecepatan 100MBPS \nTerima Kasih Telah Berlangganan Bersama Kami "+ nama);
            }else { JOptionPane.showMessageDialog(null,"Anda Memasukan Inputan Yang Salah ! (A/B/C Huruf Besar)");
            };
            break;
        case JOptionPane.CANCEL_OPTION:
            JOptionPane.showMessageDialog(null, "Kamu Membatalkan");
    }
        
        
    }
}
