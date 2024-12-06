
import java.util.Scanner;

public class Soal2Sedang {

    public static void main(String[] args) {
        System.out.println("menghitung luas permukaan bola");
        System.out.println("--------------------------------");
        Scanner b = new Scanner(System.in);
        System.out.print("masukkan berapa jari jarinya : ");
        int jarijari = b.nextInt();
        luaspermukaanbola(jarijari);
        
    }

    public static void luaspermukaanbola(int jarijari) {
        double phi = 3.14;
        System.out.println("\nluas permukaan bola = " + phi + " " +jarijari + " x " + jarijari);
        double hitung = 4 * phi * jarijari * jarijari;
        System.out.println("\nluas permukaan bola  = " + hitung);
        double lingkaran = phi*jarijari*jarijari;
        System.out.println("luas permukaan lingkaran = "+lingkaran);

    
    }
}
