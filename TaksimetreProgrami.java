import java.util.Scanner;
public class TaksimetreProgrami {
    public static void main(String[] args) {

        /* Taksimetre açılış ücreti 10 Tl'dir.
        İndi-Bindi ücreti 20 Tl'dir.
        Km başına ücret 2.20 Tl'dir.
         */

        double km,perKm = 2.20,price,total;

        Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafe kaç km ?: ");
        km = input.nextDouble();

        price = km * perKm + 10;

        total = (price < 20) ? 20 : price;

        System.out.println("Ödemeniz gereken toplam tutar: " + total + "TL");



    }
}