import java.util.Scanner;
public class DongulerOdevFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("Sayı Giriniz:");
        //int sayi = input.nextInt();
        int i = 0;
        int j = 0, k = 1;
        for(int n=0; n<10; n++){
            i = j + k;
            j = k;
            k = i;
            System.out.print(i+ " ");
        }
    }
}
