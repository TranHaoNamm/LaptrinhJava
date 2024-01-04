import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập 1 số nguyên: ");
        int n = sc.nextInt();
        int div = n%2;
        switch (div){
            case 0:
                System.out.println(n+ " là số chẵn");
                break;
            default:
                System.out.println(n+ " là số lẻ");
                break;
        }
    }
}
