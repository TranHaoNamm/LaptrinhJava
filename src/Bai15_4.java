import java.util.Scanner;
public class Bai15_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int i;
        for(i=10;i<=n;i++){
            if(i%3==0){
                System.out.printf(i+ " ");
            }
        }
    }
}
