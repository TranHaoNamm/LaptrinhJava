import java.util.Scanner;
public class Bai11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn chọn: ");
        System.out.println("1.Tìm theo tên.");
        System.out.println("2.Tìm theo tác giả.");
        System.out.println("3.Tìm nhà xuất bản.");
        System.out.println("4.Tìm theo tiêu đề.");
        int chon = sc.nextInt();
        switch (chon){
            case 1:
                System.out.println("Tìm theo tên.");
                break;
            case 2:
                System.out.println("Tìm theo tác giả.");
                break;
            case 3:
                System.out.println("Tìm nhà xuất bản.");
            case 4:
                System.out.println("Tìm theo tiêu đề.");
                break;
            default:
                System.out.println("Bạn chọn không đúng.");
                break;
        }
    }
}
