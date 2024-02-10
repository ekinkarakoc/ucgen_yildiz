import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Basamak sayisi giriniz");

        int n = scanner.nextInt();

        for (int i = 1; i < 6; i++){
            for (int k = 1; k<= (n-i) ; k++){
                System.out.print(" ");
            }
            for (int s = 1; s<=(2*i)-1; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}