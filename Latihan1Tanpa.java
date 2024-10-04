import java.util.Scanner;
public class Latihan1Tanpa {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        int bil1, bil2, bil3;

        System.out.print("Masukkan Bilangan Pertama  : ");
        bil1 = input03.nextInt();
        System.out.print("Masukkan Bilangan Kedua    : ");
        bil2 = input03.nextInt();
        System.out.print("Masukkan Bilangan Ketiga   : ");
        bil3 = input03.nextInt();

        if (bil1 >= bil2) {
        }   if (bil1 >= bil3) {
            System.out.print( bil1 + " merupakan bilangan terbesar");
        } 

        else if (bil2 >= bil1) {
        }   if (bil2 >= bil3) {
            System.out.print(bil2 + " merupakan bilangan terbesar");
        } 
        
        else if (bil3 >= bil1) {
        }   if (bil3 >= bil2) {
            System.out.print(bil3 + " merupakan bilangan terbesar");
        }
    }
}
