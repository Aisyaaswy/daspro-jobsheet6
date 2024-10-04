import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        String hari, jenisBuku;
        int jumlahBuku;
        int diskon;
        int tambahanDiskon;
        int jumlahDiskon;

        System.out.print("Masukkan hari                : ");
        hari = input03.nextLine();
        System.out.print("Jenis buku yang akan dibeli  : ");
        jenisBuku = input03.nextLine();
        System.out.print("Jumlah buku yang akan dibeli : ");
        jumlahBuku = input03.nextInt();
        

        if (hari.equalsIgnoreCase("rabu") && (jenisBuku == "kamus") && (jumlahBuku <= 2)) {
            diskon = 10; {
            System.out.println("Jumlah diskon yang didapat   : " + diskon + "%");
            }
        } 
            if (jumlahBuku >2) {
                diskon = 10;
                tambahanDiskon = 2;
                jumlahDiskon = diskon + tambahanDiskon;
                System.out.println("Jumlah diskon yang didapat   : " + jumlahDiskon + "%");
            }
        else if (hari.equalsIgnoreCase("rabu") && (jenisBuku == "novel") && (jumlahBuku <= 3 )) {
            diskon = 7;
            tambahanDiskon = 1;
            jumlahDiskon = diskon + tambahanDiskon;
            System.out.print("Jumlah diskon yang didapat   : " + jumlahDiskon + "%");
        }
            if ((jenisBuku == "novel") && (jumlahBuku >3)) {
                diskon = 7;
                tambahanDiskon = 2;
                jumlahDiskon = diskon + tambahanDiskon;
                System.out.println("Jumlah diskon yang didapat   : " + jumlahDiskon + "%");
            }
        else if (hari.equalsIgnoreCase("rabu") && (jenisBuku != "kamus") && (jenisBuku != "novel") && (jumlahBuku > 3)) {
            diskon = 5;
            System.out.println("Jumlah diskon yang didapat   : " + diskon + "%");
        }
    }
}
