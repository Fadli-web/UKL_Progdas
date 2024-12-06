import java.util.Scanner;
public class SoalSusah2 {
    public static void main(String[] args) {
        System.out.println("Selamat datang untuk mengecek bilangan negati");
        Scanner b = new Scanner(System.in);
        int[]angka = new int[12];
        //ini untuk menginputkan angka user nanti akan disaring hasilnya dibawah output
        for (int i = 0; i < 12; i++) {
            System.out.println("Masukkan angka ke " + i);
            angka[i] = b.nextInt();
            
            //ini untuk menghasilkan output elemen yang mengandung bilangan negatif/angka negatif dari hasil diinput user//
        }
        System.out.println("Elemen elemen yang mengandung angka angka negatif yaitu : ");
            for (int l = 0; l < angka.length; l++) {
            if (angka[l] < 0) {
                System.out.println(": " +angka[l]);
        
            }
            else{
                System.out.println("bilangan tidak negatif");
            }
            }
        }
    }