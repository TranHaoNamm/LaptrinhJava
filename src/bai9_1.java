import java.util.Scanner;
public class bai9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm tb: ");
        double diem = sc.nextDouble();


        if (diem > 10) {
            System.out.println("bạn đã nhập sai điểm");
        } else if (diem >= 8.0) {
            System.out.println("bạn đoạt loại giỏi");
        } else if (diem >= 6.5) {
            System.out.println("Bạn đạt loại khá");
        } else if (diem >= 5) {
            System.out.println("Bạn đạt loại tb");
        } else {
            System.out.println("Bạn đạt loại yếu");

        }
    }
}
