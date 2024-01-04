import java.util.Scanner;
public class Bai15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số nguyên n: ");
        int n = sc.nextInt();
        int i;
        int giaiThua = 1;
        for(i=1;i<=n;i++){
            giaiThua = giaiThua * i;

        }
        System.out.println("Giai thừa = " +giaiThua);
        //while
       while (i>=n){
           i++;
       }
        System.out.println(n+ "! = " +giaiThua);

    }
}
