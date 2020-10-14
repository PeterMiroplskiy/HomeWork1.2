import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    private static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            byte a = 120;
            int b = 10;
            short c = 32000;
            long d = 1000000000;
            System.out.println(a + " " + b + " " + c + " " + d + " ");

            float e = 1.2f;
            double f = 0.233;
            System.out.println(e + " " + f + " ");
        }
        public static float void3 (float aa, float ba, float ca, float da) {
            return aa * (ba + (ca / da));
        }
        public static boolean void4 (int a, int b) {
            return 10 <= a + b && a + b <= 20;
        }
        public static void vod5(int a) {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if (number<0){
                System.out.println("Число отрицательное");
            }else{
                System.out.println("Число положительное");
            }

        }
        public static boolean void6(int i){
        return i < 0;
        }
        public static void void7(String name){
            System.out.printf("Hey,Peter");
        }
        public static void void8(int yea){
            Scanner scanner = new Scanner(System.in);
            int year = scanner.nextInt();
            if(year%4==0 && year%100 !=0 || year%400==0);
            System.out.println("Год висококсынй");
    }
}