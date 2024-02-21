import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
        System.out.println("Nhập giá trị các phần tử từ bàn phím và in ra giá trị các phần tử của mảng");
        System.out.println("Mời bạn nhập vào giá trị thứ nhất: ");
        arr[0]= sc.nextInt();
        System.out.println("Mời bạn nhập vào giá trị thứ hai: ");
        arr[1]= sc.nextInt();
        System.out.println("Mời bạn nhập vào giá trị thứ ba: ");
        arr[2]= sc.nextInt();
        System.out.println("Mời bạn nhập vào giá trị thứ bốn: ");
        arr[3]= sc.nextInt();
        System.out.println("Mời bạn nhập vào giá trị thứ năm: ");
        arr[4]= sc.nextInt();
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
