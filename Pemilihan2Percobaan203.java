import java.util.Scanner ;
public class Pemilihan2Percobaan203 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        
        int pilihan_menu, potonganQris = 1000;
        String member, jenisPembayaran;
        double diskon = 0, harga = 0, total_bayar;

        System.out.println("------------------------");
        System.out.println("==== MENU KAFE JTI =====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang anda pilih = ");
        pilihan_menu = input03.nextInt();
        input03.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input03.nextLine();
        System.out.println("--------------------------------------");
        System.out.println("Pilih jenis pembayaran (cash/QRIS) : ");
        jenisPembayaran = input03.nextLine();
        potonganQris = input03.nextInt();

        // if (member.equalsIgnoreCase("y")) {
            if (member.equals("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
        }
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl =" + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
            }
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar = " + harga);

            
            // if (member.equalsIgnoreCase("n")) {
                if (member.equals("n")) {
                    if (pilihan_menu == 1) {
                        harga = 14000;
                        System.out.println("Harga ricebowl = " + harga);
                    } else if (pilihan_menu == 2) {
                        harga = 3000;
                        System.out.println("Harga ice tea = " + harga);
                    } else if (pilihan_menu == 3) {
                        harga = 15000;
                        System.out.println("Harga bundling = " + harga);
                    } else {       
                        System.out.println("Masukkan pilihan menu dengan benar");

                        System.out.println("Total bayar setelah diskon = " + total_bayar);

                if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                        total_bayar -= potonganQris;
                        System.out.println("Potongan yang didapat dari QRIS sebesar 1000");
                    }
                    return;
            }

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("----------------------------------------");
        
    }
}