import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n, TplmRakam = 0, RkmSay = 0, rkmS = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lüten sayı giriniz : ");
        n = input.nextInt();

        while ( n != 0){
            rkmS = n % 10 ;
            n /= 10;
            RkmSay++;

            System.out.println("Sayının rakamları : " + rkmS);


            TplmRakam += rkmS;

        }
        System.out.println("Rakamların Toplamı : " + TplmRakam);
    }
}
