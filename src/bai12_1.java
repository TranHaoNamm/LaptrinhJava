import java.util.Scanner;
public class bai12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên từ 1-99: ");
        int n = sc.nextInt();
        while(n < 1 || n > 99){
            System.out.println("bạn đã nhập sai mời nhập lại n");
            n = sc.nextInt();

        }
        System.out.println("Bạn đã nhập xong n = "+n);
    }
}
