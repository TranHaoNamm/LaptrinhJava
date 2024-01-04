import java.util.Scanner;
public class bai18_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Mời bạn chọn phép tính: ");
        String chon = new Scanner(System.in).nextLine();
        switch (chon){
            case "+":
                cong(a,b);
                break;
            case "-":
                tru(a,b);
                break;
            case "*":
                nhan(a,b);
                break;
            case "/":
                chia(a,b);
                break;
            default:
                System.out.println("Bạn đã chọn sai");
                break;

        }

    }
    //hàm cộng
    public static void cong(double a,double b) {
        double kq = a + b;
        System.out.println("kq = " + kq);
    }
    //hàm trừ
    public static void tru(double a,double b){
        double kq = a - b;
        System.out.println("kq = " +kq);
    }
    //hàm nhân
    public static void nhan(double a, double b){
        double kq = a * b;
        System.out.println("kq = " +kq);
    }
    //hàm chia
    public static void chia(double a, double b){
        if(b==0){
            System.out.println("b = 0 thì làm sao chia");
        }else{
            double kq = a/b;
            System.out.println("kq = " +kq);
        }
    }
}
