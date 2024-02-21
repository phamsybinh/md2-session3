import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một số nguyên n, in menu và thực hiện các chức năng theo menu");
        System.out.println("nhập vào một số nguyên");
        int n = sc.nextInt();
        do {
            System.out.println("\n**PRACTICE**\n" +
                    "1.In dãy số chia hết cho 2 và giảm dần (n >= số >= 2)\n" +
                    "2.In các số nhỏ hơn n và tính tổng\n" +
                    "3.In ra các ước số chẵn của n\n" +
                    "4.In ra các ước số lẻ và số lượng các ước lẻ của n\n" +
                    "5.In ra ước số lẻ lớn nhất của n\n" +
                    "6.Thoát");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println();
                    if (n > 1) {
                        System.out.print("Dãy số chia hết cho 2 và giảm dần là ");
                        for (int i = n; i >= 2; i--) {
                            if (i % 2 == 0) {
                                System.out.print(i + " ");
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("các số nhỏ hơn " + n);
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print(i + " ");
                        sum += i;
                    }
                    System.out.println(" Tổng các số nhỏ hơn " + n + " là " + sum);
                    break;
                case 3:
                    System.out.println("ước số chẵn của " + n);
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break;
                case 4:
                    System.out.println("ước số lẻ của " + n);
                    int dem = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            System.out.print(i + " ");
                            dem += 1;
                        }
                    }
                    System.out.println("\nsố lượng các ước lẻ của " + n + " là " + dem);
                    break;
                case 5:
                    System.out.println("ước số lẻ của " + n);
                    int max = 0;
                    for (int i = 1; i <= n; i++) {
                        if (n % i == 0 && i % 2 != 0) {
                            max = i;
                        }
                    }
                    System.out.print(" ước số lẻ lớn nhất của " + n + " là " + max);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai định dạng");
            }
        } while (true);

    }
}
