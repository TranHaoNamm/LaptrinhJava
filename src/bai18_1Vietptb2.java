import java.util.Scanner;
public class bai18_1Vietptb2 {
    public static void main(String[] args) {
        String kq = GiaiPTB2(1, 2, 3);
        String kq1 = GiaiPTB2(1, 2, 1);
        String kq2 = GiaiPTB2(1, 2, -3);
        Scanner sc = new Scanner(System.in);
        System.out.println(kq);
        System.out.println(kq1);
        System.out.println(kq2);
        System.out.println("Mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào c: ");
        double c = sc.nextDouble();
        String kq4 = GiaiPTB2(a,b,c);
        System.out.println(kq4);

    }

    public static String GiaiPTB2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Phương trình vô số nghiệm";
            } else if (b == 0 && c != 0) {
                return "Phương trình vô nghiệm";
            } else {
                return "Phương trình bậc nhất có nghiệm: " + (-c / b);
            }
        }else{
                double delta = Math.pow(b, 2) - (4 * a * c);
                if (delta < 0) {
                    return "Phương trình vô nghiệm";
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    return "Phương trình có nghiệm kép: " + x;
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    return "Phương trình có 2 nghiệm pb: x1 =  " + x1 + " ;x2 = " + x2;
                }
            }

        }

    }



