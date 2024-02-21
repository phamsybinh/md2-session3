import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n**CACULATOR**\n" +
                "Tổng 2 số\n" +
                "Hiệu 2 số\n" +
                "Tích 2 số\n" +
                "Thương 2 số\n" +
                "Số dư trong phép chia 2 số\n" +
                "Ước chung lớn nhất\n" +
                "Bội chung nhỏ nhất\n");
        System.out.println(" Mời bạn nhập vào số thứ nhất ");
        int a = sc.nextInt();
        System.out.println(" Mời bạn nhập vào số thứ hai ");
        int b = sc.nextInt();
        do {
            System.out.println("\n**CACULATOR**\n" +
                    "1.Tổng 2 số\n" +
                    "2.Hiệu 2 số\n" +
                    "3.Tích 2 số\n" +
                    "4.Thương 2 số\n" +
                    "5.Số dư trong phép chia 2 số\n" +
                    "6.Ước chung lớn nhất\n" +
                    "7.Bội chung nhỏ nhất\n" +
                    "8.Thoát");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println(" Tổng hai số là " + (a + b));
                    break;
                case 2:
                    System.out.println(" Hiệu hai số là " + (a - b));
                    break;
                case 3:
                    System.out.println(" Tích hai số là " + (a * b));
                    break;
                case 4:
                    System.out.println(" Thương hai số là " + (a / b));
                    break;
                case 5:
                    System.out.println(" Số dư trong phép chia 2 số là " + (a % b));
                    break;
                case 6:
                    int ucln = 0;
                    if (a >= b) {
                        for (int i = 1; i <= a; i++) {
                            if (a % i == 0 && b % i == 0) {
                                ucln = i;
                            }
                        }
                        System.out.print(" Ước chung lớn nhất là " + ucln);
                    } else {
                        for (int i = 1; i <= b; i++) {
                            if (a % i == 0 && b % i == 0) {
                                ucln = i;
                            }
                        }
                        System.out.print(" Ước chung lớn nhất là " + ucln);
                    }
                    break;
                case 7:
                    int uoc = 0;
                    if (a >= b) {
                        for (int i = 1; i <= a; i++) {
                            if (a % i == 0 && b % i == 0) {
                                uoc = i;
                            }
                        }
                    } else {
                        for (int i = 1; i <= b; i++) {
                            if (a % i == 0 && b % i == 0) {
                                uoc = i;
                            }
                        }
                    }
                    System.out.println(" Bội chung nhỏ nhất hai số là " + (a*b)/uoc);
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println(" Giá trị bạn nhập sai vui lòng nhập lại ");
            }
        } while (true);
    }
}
