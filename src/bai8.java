import java.util.Scanner;
public class bai8 {//nhập dữ liệu từ bàn phím

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Mời nhâp mật khẩu cấp 1: ");
        String mk1 = sc.nextLine();
        System.out.println("Mật khẩu cấp 1 là: " +mk1);
        System.out.println("Mời nhập vào 1 số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("a = " +a);
        System.out.println("Mời nhập số thực x: ");
        float x = sc.nextFloat();
        System.out.println("x = " +x);
        System.out.println("Mời nhập mật khẩu cấp 2: ");
        String mk2 = new Scanner(System.in).nextLine();
        System.out.println("Mật khẩu cấp 2 là: " +mk2);

    }
}
