import java.util.Scanner;
public class Bai10 {// Toán tử 3 ngôi
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập 1 số nguyên: ");
        int n = sc.nextInt();
        String traloi = (n%2 == 0)?"Chẵn" : "lẻ";
        System.out.println("Số vừa nhập là số " +traloi);

    }
}
