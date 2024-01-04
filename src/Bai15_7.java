import java.util.Scanner;
public class Bai15_7 {
    public static void main(String[] args) {
      while(true){
          Scanner sc = new Scanner(System.in);
          System.out.println("Mời bạn nhập số nguyên a: ");
          int a = sc.nextInt();
          while (a <= 0) {
              System.out.println("Bạn đã nhập sai vui lòng nhập lại a: ");
              a = sc.nextInt();
          }
          System.out.println("a= " + a);
          int demUoc = 0;
          for (int i = 1; i <= a; i++) {
              if (a % i == 0) {
                  demUoc++;

              }
          }
          if (demUoc == 2) {
              System.out.println(a + " là số nguyên tố");
          } else {
              System.out.println(a + " Không phải là số nguyên tố");
          }
          System.out.println("Bạn có thoát không, bấm y để thoát");
          String traLoi = new Scanner(System.in).nextLine();
          if(traLoi.equals("y")|| traLoi.equals("Y")){
              break;
          }
      }
    }
}
