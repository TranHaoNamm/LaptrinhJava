import java.util.Scanner;
public class Bai15_3 {
    public static void main(String[] args) {
        int tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int i;
        if(n%2 != 0){
            for(i=1;i<=n;i+=2){
                if(i==3){
                    continue;
                }else {
                    tong += i;
                }
            }
            System.out.println("Tổng các số lẻ từ 1 đến " +n+ " = "+tong);
        }
    }
}
