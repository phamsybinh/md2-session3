import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử (n) của mảng 1 chiều, khai báo và nhập giá trị các phần tử của mảng một chiều số thực gồm n phần tử");
        System.out.println("Mời bạn nhập số phần tử của mảng ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i =1; i<= arr.length; i++){
            System.out.println(" Mời bạn nhập vào phần tử thứ "+i);
            arr[i-1] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Trung bình cộng các phần tử trong mảng là "+(sum/n));
    }
}
