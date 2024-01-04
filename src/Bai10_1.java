import java.util.Scanner;
public class Bai10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm tb: ");
        double diem = sc.nextDouble();
        String traloi = (diem >= 8)? "Giỏi":
                (diem >= 6.5)? "Khá":
                        (diem >= 5 )? "Trung bình" : "Yếu";
        System.out.println(traloi);
    }
}
