import java.util.Scanner;
public class Bai15_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong = 0;
        System.out.println("Mời nhập số nguyên n: ");
        int n = sc.nextInt();
        int i;
        if(n%2 !=0){
            System.out.println("tôi không tính số lẻ");
        }else{
            for(i=0;i<=n;i+=2){
                tong += i;
            }
            System.out.println("Tổng các số chẵn từ 0 đến " +n+ " = " +tong);
        }
    }
}
