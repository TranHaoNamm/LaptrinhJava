import java.util.Scanner;
public class bai9_2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Mời nhập tổng của hai số: ");
        float tong = sc.nextFloat();
        System.out.println("Mời nhập hiệu của hai số: ");
        float hieu = sc.nextFloat();
        float x = (tong + hieu)/2;
        float y = tong - x;
        System.out.println("Giá trị x là: " +x);
        System.out.println("Giá trị y là: " +y);


    }
}
