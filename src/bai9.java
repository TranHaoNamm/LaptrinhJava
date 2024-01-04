import java.util.Scanner;
public class bai9 {//if và else

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào điểm tb: ");
        double diem = sc.nextDouble();
        if(diem >= 5){
            System.out.println("Bạn đã đổ");
            System.out.println("Chúc mừng bạn");
        }else{
            System.out.println("Bạn đã tạch");
        }
    }

}
