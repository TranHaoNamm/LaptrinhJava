import java.util.Scanner;
public class bai9_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0){
            System.out.println("phương trình vô nghiệm");
        }else if(delta == 0){
            double x = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép là: " +x);
        }else{
            double x1 = (- b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 *a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " +x1);
            System.out.println(" x2 = " +x2);
        }
    }
}
